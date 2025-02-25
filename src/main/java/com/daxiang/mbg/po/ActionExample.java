package com.daxiang.mbg.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNull() {
            addCriterion("class_name is null");
            return (Criteria) this;
        }

        public Criteria andClassNameIsNotNull() {
            addCriterion("class_name is not null");
            return (Criteria) this;
        }

        public Criteria andClassNameEqualTo(String value) {
            addCriterion("class_name =", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotEqualTo(String value) {
            addCriterion("class_name <>", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThan(String value) {
            addCriterion("class_name >", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("class_name >=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThan(String value) {
            addCriterion("class_name <", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLessThanOrEqualTo(String value) {
            addCriterion("class_name <=", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameLike(String value) {
            addCriterion("class_name like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameIn(List<String> values) {
            addCriterion("class_name in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotIn(List<String> values) {
            addCriterion("class_name not in", values, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameBetween(String value1, String value2) {
            addCriterion("class_name between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andClassNameNotBetween(String value1, String value2) {
            addCriterion("class_name not between", value1, value2, "className");
            return (Criteria) this;
        }

        public Criteria andNeedDriverIsNull() {
            addCriterion("need_driver is null");
            return (Criteria) this;
        }

        public Criteria andNeedDriverIsNotNull() {
            addCriterion("need_driver is not null");
            return (Criteria) this;
        }

        public Criteria andNeedDriverEqualTo(Integer value) {
            addCriterion("need_driver =", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverNotEqualTo(Integer value) {
            addCriterion("need_driver <>", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverGreaterThan(Integer value) {
            addCriterion("need_driver >", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_driver >=", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverLessThan(Integer value) {
            addCriterion("need_driver <", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverLessThanOrEqualTo(Integer value) {
            addCriterion("need_driver <=", value, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverIn(List<Integer> values) {
            addCriterion("need_driver in", values, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverNotIn(List<Integer> values) {
            addCriterion("need_driver not in", values, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverBetween(Integer value1, Integer value2) {
            addCriterion("need_driver between", value1, value2, "needDriver");
            return (Criteria) this;
        }

        public Criteria andNeedDriverNotBetween(Integer value1, Integer value2) {
            addCriterion("need_driver not between", value1, value2, "needDriver");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueIsNull() {
            addCriterion("has_return_value is null");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueIsNotNull() {
            addCriterion("has_return_value is not null");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueEqualTo(Integer value) {
            addCriterion("has_return_value =", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueNotEqualTo(Integer value) {
            addCriterion("has_return_value <>", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueGreaterThan(Integer value) {
            addCriterion("has_return_value >", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_return_value >=", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueLessThan(Integer value) {
            addCriterion("has_return_value <", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueLessThanOrEqualTo(Integer value) {
            addCriterion("has_return_value <=", value, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueIn(List<Integer> values) {
            addCriterion("has_return_value in", values, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueNotIn(List<Integer> values) {
            addCriterion("has_return_value not in", values, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueBetween(Integer value1, Integer value2) {
            addCriterion("has_return_value between", value1, value2, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andHasReturnValueNotBetween(Integer value1, Integer value2) {
            addCriterion("has_return_value not between", value1, value2, "hasReturnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueIsNull() {
            addCriterion("return_value is null");
            return (Criteria) this;
        }

        public Criteria andReturnValueIsNotNull() {
            addCriterion("return_value is not null");
            return (Criteria) this;
        }

        public Criteria andReturnValueEqualTo(String value) {
            addCriterion("return_value =", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotEqualTo(String value) {
            addCriterion("return_value <>", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueGreaterThan(String value) {
            addCriterion("return_value >", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueGreaterThanOrEqualTo(String value) {
            addCriterion("return_value >=", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLessThan(String value) {
            addCriterion("return_value <", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLessThanOrEqualTo(String value) {
            addCriterion("return_value <=", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLike(String value) {
            addCriterion("return_value like", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotLike(String value) {
            addCriterion("return_value not like", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueIn(List<String> values) {
            addCriterion("return_value in", values, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotIn(List<String> values) {
            addCriterion("return_value not in", values, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueBetween(String value1, String value2) {
            addCriterion("return_value between", value1, value2, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotBetween(String value1, String value2) {
            addCriterion("return_value not between", value1, value2, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescIsNull() {
            addCriterion("return_value_desc is null");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescIsNotNull() {
            addCriterion("return_value_desc is not null");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescEqualTo(String value) {
            addCriterion("return_value_desc =", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescNotEqualTo(String value) {
            addCriterion("return_value_desc <>", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescGreaterThan(String value) {
            addCriterion("return_value_desc >", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescGreaterThanOrEqualTo(String value) {
            addCriterion("return_value_desc >=", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescLessThan(String value) {
            addCriterion("return_value_desc <", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescLessThanOrEqualTo(String value) {
            addCriterion("return_value_desc <=", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescLike(String value) {
            addCriterion("return_value_desc like", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescNotLike(String value) {
            addCriterion("return_value_desc not like", value, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescIn(List<String> values) {
            addCriterion("return_value_desc in", values, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescNotIn(List<String> values) {
            addCriterion("return_value_desc not in", values, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescBetween(String value1, String value2) {
            addCriterion("return_value_desc between", value1, value2, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andReturnValueDescNotBetween(String value1, String value2) {
            addCriterion("return_value_desc not between", value1, value2, "returnValueDesc");
            return (Criteria) this;
        }

        public Criteria andCreatorUidIsNull() {
            addCriterion("creator_uid is null");
            return (Criteria) this;
        }

        public Criteria andCreatorUidIsNotNull() {
            addCriterion("creator_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorUidEqualTo(Integer value) {
            addCriterion("creator_uid =", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidNotEqualTo(Integer value) {
            addCriterion("creator_uid <>", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidGreaterThan(Integer value) {
            addCriterion("creator_uid >", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("creator_uid >=", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidLessThan(Integer value) {
            addCriterion("creator_uid <", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidLessThanOrEqualTo(Integer value) {
            addCriterion("creator_uid <=", value, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidIn(List<Integer> values) {
            addCriterion("creator_uid in", values, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidNotIn(List<Integer> values) {
            addCriterion("creator_uid not in", values, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidBetween(Integer value1, Integer value2) {
            addCriterion("creator_uid between", value1, value2, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreatorUidNotBetween(Integer value1, Integer value2) {
            addCriterion("creator_uid not between", value1, value2, "creatorUid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidIsNull() {
            addCriterion("updator_uid is null");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidIsNotNull() {
            addCriterion("updator_uid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidEqualTo(Integer value) {
            addCriterion("updator_uid =", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidNotEqualTo(Integer value) {
            addCriterion("updator_uid <>", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidGreaterThan(Integer value) {
            addCriterion("updator_uid >", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("updator_uid >=", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidLessThan(Integer value) {
            addCriterion("updator_uid <", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidLessThanOrEqualTo(Integer value) {
            addCriterion("updator_uid <=", value, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidIn(List<Integer> values) {
            addCriterion("updator_uid in", values, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidNotIn(List<Integer> values) {
            addCriterion("updator_uid not in", values, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidBetween(Integer value1, Integer value2) {
            addCriterion("updator_uid between", value1, value2, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdatorUidNotBetween(Integer value1, Integer value2) {
            addCriterion("updator_uid not between", value1, value2, "updatorUid");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(Integer value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(Integer value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(Integer value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(Integer value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(Integer value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(Integer value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<Integer> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<Integer> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(Integer value1, Integer value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(Integer value1, Integer value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNull() {
            addCriterion("page_id is null");
            return (Criteria) this;
        }

        public Criteria andPageIdIsNotNull() {
            addCriterion("page_id is not null");
            return (Criteria) this;
        }

        public Criteria andPageIdEqualTo(Integer value) {
            addCriterion("page_id =", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotEqualTo(Integer value) {
            addCriterion("page_id <>", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThan(Integer value) {
            addCriterion("page_id >", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_id >=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThan(Integer value) {
            addCriterion("page_id <", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdLessThanOrEqualTo(Integer value) {
            addCriterion("page_id <=", value, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdIn(List<Integer> values) {
            addCriterion("page_id in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotIn(List<Integer> values) {
            addCriterion("page_id not in", values, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdBetween(Integer value1, Integer value2) {
            addCriterion("page_id between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andPageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("page_id not between", value1, value2, "pageId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdIsNull() {
            addCriterion("test_suite_id is null");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdIsNotNull() {
            addCriterion("test_suite_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdEqualTo(Integer value) {
            addCriterion("test_suite_id =", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdNotEqualTo(Integer value) {
            addCriterion("test_suite_id <>", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdGreaterThan(Integer value) {
            addCriterion("test_suite_id >", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_suite_id >=", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdLessThan(Integer value) {
            addCriterion("test_suite_id <", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("test_suite_id <=", value, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdIn(List<Integer> values) {
            addCriterion("test_suite_id in", values, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdNotIn(List<Integer> values) {
            addCriterion("test_suite_id not in", values, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdBetween(Integer value1, Integer value2) {
            addCriterion("test_suite_id between", value1, value2, "testSuiteId");
            return (Criteria) this;
        }

        public Criteria andTestSuiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("test_suite_id not between", value1, value2, "testSuiteId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}