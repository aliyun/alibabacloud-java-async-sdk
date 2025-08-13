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
 * {@link DescribeVariableBindDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVariableBindDetailResponseBody</p>
 */
public class DescribeVariableBindDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeVariableBindDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableBindDetailResponseBody create() {
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

        private Builder(DescribeVariableBindDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVariableBindDetailResponseBody build() {
            return new DescribeVariableBindDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVariableBindDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVariableBindDetailResponseBody</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventFieldName")
        private String eventFieldName;

        @com.aliyun.core.annotation.NameInMap("required")
        private Boolean required;

        @com.aliyun.core.annotation.NameInMap("variableName")
        private String variableName;

        private Params(Builder builder) {
            this.eventFieldName = builder.eventFieldName;
            this.required = builder.required;
            this.variableName = builder.variableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return eventFieldName
         */
        public String getEventFieldName() {
            return this.eventFieldName;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        /**
         * @return variableName
         */
        public String getVariableName() {
            return this.variableName;
        }

        public static final class Builder {
            private String eventFieldName; 
            private Boolean required; 
            private String variableName; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.eventFieldName = model.eventFieldName;
                this.required = model.required;
                this.variableName = model.variableName;
            } 

            /**
             * <p>Event field name</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder eventFieldName(String eventFieldName) {
                this.eventFieldName = eventFieldName;
                return this;
            }

            /**
             * <p>Whether it is required, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * <p>Bound variable name</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder variableName(String variableName) {
                this.variableName = variableName;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVariableBindDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVariableBindDetailResponseBody</p>
     */
    public static class RelationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private RelationRules(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationRules create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(RelationRules model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>Policy rule ID</p>
             * 
             * <strong>example:</strong>
             * <p>104566</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Policy name</p>
             * 
             * <strong>example:</strong>
             * <p>营销风险识别</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public RelationRules build() {
                return new RelationRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVariableBindDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVariableBindDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowModify")
        private Boolean allowModify;

        @com.aliyun.core.annotation.NameInMap("defineId")
        private Long defineId;

        @com.aliyun.core.annotation.NameInMap("defineTitle")
        private String defineTitle;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("eventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("params")
        private java.util.List<Params> params;

        @com.aliyun.core.annotation.NameInMap("relationRules")
        private java.util.List<RelationRules> relationRules;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private ResultObject(Builder builder) {
            this.allowModify = builder.allowModify;
            this.defineId = builder.defineId;
            this.defineTitle = builder.defineTitle;
            this.description = builder.description;
            this.eventCode = builder.eventCode;
            this.id = builder.id;
            this.params = builder.params;
            this.relationRules = builder.relationRules;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return allowModify
         */
        public Boolean getAllowModify() {
            return this.allowModify;
        }

        /**
         * @return defineId
         */
        public Long getDefineId() {
            return this.defineId;
        }

        /**
         * @return defineTitle
         */
        public String getDefineTitle() {
            return this.defineTitle;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return params
         */
        public java.util.List<Params> getParams() {
            return this.params;
        }

        /**
         * @return relationRules
         */
        public java.util.List<RelationRules> getRelationRules() {
            return this.relationRules;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private Boolean allowModify; 
            private Long defineId; 
            private String defineTitle; 
            private String description; 
            private String eventCode; 
            private Long id; 
            private java.util.List<Params> params; 
            private java.util.List<RelationRules> relationRules; 
            private String title; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.allowModify = model.allowModify;
                this.defineId = model.defineId;
                this.defineTitle = model.defineTitle;
                this.description = model.description;
                this.eventCode = model.eventCode;
                this.id = model.id;
                this.params = model.params;
                this.relationRules = model.relationRules;
                this.title = model.title;
            } 

            /**
             * <p>Whether modification is allowed, default is false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowModify(Boolean allowModify) {
                this.allowModify = allowModify;
                return this;
            }

            /**
             * <p>Variable definition ID</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder defineId(Long defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * <p>Variable definition title</p>
             * 
             * <strong>example:</strong>
             * <p>IP所在地_城市Code</p>
             */
            public Builder defineTitle(String defineTitle) {
                this.defineTitle = defineTitle;
                return this;
            }

            /**
             * <p>Variable description information</p>
             * 
             * <strong>example:</strong>
             * <p>描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Event code</p>
             * 
             * <strong>example:</strong>
             * <p>de_aszbjb7236</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>Variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>497</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Bound parameters.</p>
             */
            public Builder params(java.util.List<Params> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>List of associated policies</p>
             */
            public Builder relationRules(java.util.List<RelationRules> relationRules) {
                this.relationRules = relationRules;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>变量title</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
