// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVariableBindDetailResponseBody build() {
            return new DescribeVariableBindDetailResponseBody(this);
        } 

    } 

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

            /**
             * eventFieldName.
             */
            public Builder eventFieldName(String eventFieldName) {
                this.eventFieldName = eventFieldName;
                return this;
            }

            /**
             * required.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            /**
             * variableName.
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

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
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
        private java.util.List < Params> params;

        @com.aliyun.core.annotation.NameInMap("relationRules")
        private java.util.List < RelationRules> relationRules;

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
        public java.util.List < Params> getParams() {
            return this.params;
        }

        /**
         * @return relationRules
         */
        public java.util.List < RelationRules> getRelationRules() {
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
            private java.util.List < Params> params; 
            private java.util.List < RelationRules> relationRules; 
            private String title; 

            /**
             * allowModify.
             */
            public Builder allowModify(Boolean allowModify) {
                this.allowModify = allowModify;
                return this;
            }

            /**
             * defineId.
             */
            public Builder defineId(Long defineId) {
                this.defineId = defineId;
                return this;
            }

            /**
             * defineTitle.
             */
            public Builder defineTitle(String defineTitle) {
                this.defineTitle = defineTitle;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * eventCode.
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * params.
             */
            public Builder params(java.util.List < Params> params) {
                this.params = params;
                return this;
            }

            /**
             * relationRules.
             */
            public Builder relationRules(java.util.List < RelationRules> relationRules) {
                this.relationRules = relationRules;
                return this;
            }

            /**
             * title.
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
