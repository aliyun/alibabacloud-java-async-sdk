// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
 *
 * <p>CompareCopyRuleVariableResponseBody</p>
 */
public class CompareCopyRuleVariableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private CompareCopyRuleVariableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CompareCopyRuleVariableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(CompareCopyRuleVariableResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Result object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public CompareCopyRuleVariableResponseBody build() {
            return new CompareCopyRuleVariableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class CustVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private CustVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(CustVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable ID</p>
             * 
             * <strong>example:</strong>
             * <p>1483</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>dxkkLw8fe18</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_VELOCITY</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>近1天账户登录设备数_bk4</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public CustVariableList build() {
                return new CustVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class EventVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private EventVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(EventVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable id</p>
             * 
             * <strong>example:</strong>
             * <p>375</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>NATIVE</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public EventVariableList build() {
                return new EventVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class ExpressionVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private ExpressionVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpressionVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(ExpressionVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable ID</p>
             * 
             * <strong>example:</strong>
             * <p>2540</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>ex_XheC9A382fe7</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable Type</p>
             * 
             * <strong>example:</strong>
             * <p>EXPRESSION</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>手机号前7位</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ExpressionVariableList build() {
                return new ExpressionVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class NameListVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private NameListVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NameListVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(NameListVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable id</p>
             * 
             * <strong>example:</strong>
             * <p>1987</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>nl_UN8otElLb490</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>NAME_LIST</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>白名单</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public NameListVariableList build() {
                return new NameListVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class QueryExpressionVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private QueryExpressionVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryExpressionVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(QueryExpressionVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable ID</p>
             * 
             * <strong>example:</strong>
             * <p>217</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable Name</p>
             * 
             * <strong>example:</strong>
             * <p>ex_vcaoii1697</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable Type</p>
             * 
             * <strong>example:</strong>
             * <p>QUERY_EXPRESSION</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>获取年龄</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public QueryExpressionVariableList build() {
                return new QueryExpressionVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class SystemVariableList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutType")
        private String outType;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private SystemVariableList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.outType = builder.outType;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemVariableList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outType
         */
        public String getOutType() {
            return this.outType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 
            private String outType; 
            private String title; 

            private Builder() {
            } 

            private Builder(SystemVariableList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
                this.outType = model.outType;
                this.title = model.title;
            } 

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Variable ID</p>
             * 
             * <strong>example:</strong>
             * <p>1003</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Variable name</p>
             * 
             * <strong>example:</strong>
             * <p>sl_S02sHLFT7818</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>SELF_BIND</p>
             */
            public Builder outType(String outType) {
                this.outType = outType;
                return this;
            }

            /**
             * <p>Title</p>
             * 
             * <strong>example:</strong>
             * <p>根据ip地址得到评分</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public SystemVariableList build() {
                return new SystemVariableList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CompareCopyRuleVariableResponseBody} extends {@link TeaModel}
     *
     * <p>CompareCopyRuleVariableResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustVariableList")
        private java.util.List<CustVariableList> custVariableList;

        @com.aliyun.core.annotation.NameInMap("EventVariableList")
        private java.util.List<EventVariableList> eventVariableList;

        @com.aliyun.core.annotation.NameInMap("ExpressionVariableList")
        private java.util.List<ExpressionVariableList> expressionVariableList;

        @com.aliyun.core.annotation.NameInMap("NameListVariableList")
        private java.util.List<NameListVariableList> nameListVariableList;

        @com.aliyun.core.annotation.NameInMap("QueryExpressionVariableList")
        private java.util.List<QueryExpressionVariableList> queryExpressionVariableList;

        @com.aliyun.core.annotation.NameInMap("SystemVariableList")
        private java.util.List<SystemVariableList> systemVariableList;

        private ResultObject(Builder builder) {
            this.custVariableList = builder.custVariableList;
            this.eventVariableList = builder.eventVariableList;
            this.expressionVariableList = builder.expressionVariableList;
            this.nameListVariableList = builder.nameListVariableList;
            this.queryExpressionVariableList = builder.queryExpressionVariableList;
            this.systemVariableList = builder.systemVariableList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return custVariableList
         */
        public java.util.List<CustVariableList> getCustVariableList() {
            return this.custVariableList;
        }

        /**
         * @return eventVariableList
         */
        public java.util.List<EventVariableList> getEventVariableList() {
            return this.eventVariableList;
        }

        /**
         * @return expressionVariableList
         */
        public java.util.List<ExpressionVariableList> getExpressionVariableList() {
            return this.expressionVariableList;
        }

        /**
         * @return nameListVariableList
         */
        public java.util.List<NameListVariableList> getNameListVariableList() {
            return this.nameListVariableList;
        }

        /**
         * @return queryExpressionVariableList
         */
        public java.util.List<QueryExpressionVariableList> getQueryExpressionVariableList() {
            return this.queryExpressionVariableList;
        }

        /**
         * @return systemVariableList
         */
        public java.util.List<SystemVariableList> getSystemVariableList() {
            return this.systemVariableList;
        }

        public static final class Builder {
            private java.util.List<CustVariableList> custVariableList; 
            private java.util.List<EventVariableList> eventVariableList; 
            private java.util.List<ExpressionVariableList> expressionVariableList; 
            private java.util.List<NameListVariableList> nameListVariableList; 
            private java.util.List<QueryExpressionVariableList> queryExpressionVariableList; 
            private java.util.List<SystemVariableList> systemVariableList; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.custVariableList = model.custVariableList;
                this.eventVariableList = model.eventVariableList;
                this.expressionVariableList = model.expressionVariableList;
                this.nameListVariableList = model.nameListVariableList;
                this.queryExpressionVariableList = model.queryExpressionVariableList;
                this.systemVariableList = model.systemVariableList;
            } 

            /**
             * <p>Cumulative variable list</p>
             */
            public Builder custVariableList(java.util.List<CustVariableList> custVariableList) {
                this.custVariableList = custVariableList;
                return this;
            }

            /**
             * <p>Event field variables</p>
             */
            public Builder eventVariableList(java.util.List<EventVariableList> eventVariableList) {
                this.eventVariableList = eventVariableList;
                return this;
            }

            /**
             * <p>Custom variable list</p>
             */
            public Builder expressionVariableList(java.util.List<ExpressionVariableList> expressionVariableList) {
                this.expressionVariableList = expressionVariableList;
                return this;
            }

            /**
             * <p>Name list variables</p>
             */
            public Builder nameListVariableList(java.util.List<NameListVariableList> nameListVariableList) {
                this.nameListVariableList = nameListVariableList;
                return this;
            }

            /**
             * <p>Custom Query Variable List</p>
             */
            public Builder queryExpressionVariableList(java.util.List<QueryExpressionVariableList> queryExpressionVariableList) {
                this.queryExpressionVariableList = queryExpressionVariableList;
                return this;
            }

            /**
             * <p>System variable list</p>
             */
            public Builder systemVariableList(java.util.List<SystemVariableList> systemVariableList) {
                this.systemVariableList = systemVariableList;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
