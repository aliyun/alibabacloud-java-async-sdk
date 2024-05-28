// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVariableGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetVariableGroupResponseBody</p>
 */
public class GetVariableGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("variableGroup")
    private VariableGroup variableGroup;

    private GetVariableGroupResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.variableGroup = builder.variableGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVariableGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return variableGroup
     */
    public VariableGroup getVariableGroup() {
        return this.variableGroup;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private VariableGroup variableGroup; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * variableGroup.
         */
        public Builder variableGroup(VariableGroup variableGroup) {
            this.variableGroup = variableGroup;
            return this;
        }

        public GetVariableGroupResponseBody build() {
            return new GetVariableGroupResponseBody(this);
        } 

    } 

    public static class RelatedPipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private RelatedPipelines(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedPipelines create() {
            return builder().build();
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

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RelatedPipelines build() {
                return new RelatedPipelines(this);
            } 

        } 

    }
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("isEncrypted")
        private Boolean isEncrypted;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Variables(Builder builder) {
            this.isEncrypted = builder.isEncrypted;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return isEncrypted
         */
        public Boolean getIsEncrypted() {
            return this.isEncrypted;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean isEncrypted; 
            private String name; 
            private String value; 

            /**
             * isEncrypted.
             */
            public Builder isEncrypted(Boolean isEncrypted) {
                this.isEncrypted = isEncrypted;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    public static class VariableGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ccreatorAccountId")
        private String ccreatorAccountId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("modifierAccountId")
        private String modifierAccountId;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("relatedPipelines")
        private java.util.List < RelatedPipelines> relatedPipelines;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("variables")
        private java.util.List < Variables> variables;

        private VariableGroup(Builder builder) {
            this.ccreatorAccountId = builder.ccreatorAccountId;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.modifierAccountId = builder.modifierAccountId;
            this.name = builder.name;
            this.relatedPipelines = builder.relatedPipelines;
            this.updateTime = builder.updateTime;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariableGroup create() {
            return builder().build();
        }

        /**
         * @return ccreatorAccountId
         */
        public String getCcreatorAccountId() {
            return this.ccreatorAccountId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return relatedPipelines
         */
        public java.util.List < RelatedPipelines> getRelatedPipelines() {
            return this.relatedPipelines;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return variables
         */
        public java.util.List < Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private String ccreatorAccountId; 
            private Long createTime; 
            private String description; 
            private Long id; 
            private String modifierAccountId; 
            private String name; 
            private java.util.List < RelatedPipelines> relatedPipelines; 
            private Long updateTime; 
            private java.util.List < Variables> variables; 

            /**
             * ccreatorAccountId.
             */
            public Builder ccreatorAccountId(String ccreatorAccountId) {
                this.ccreatorAccountId = ccreatorAccountId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * relatedPipelines.
             */
            public Builder relatedPipelines(java.util.List < RelatedPipelines> relatedPipelines) {
                this.relatedPipelines = relatedPipelines;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * variables.
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public VariableGroup build() {
                return new VariableGroup(this);
            } 

        } 

    }
}
