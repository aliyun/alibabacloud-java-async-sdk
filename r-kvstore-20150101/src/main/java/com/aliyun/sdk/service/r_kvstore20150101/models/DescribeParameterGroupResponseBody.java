// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupResponseBody</p>
 */
public class DescribeParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroup")
    private ParameterGroup parameterGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupResponseBody(Builder builder) {
        this.parameterGroup = builder.parameterGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameterGroup
     */
    public ParameterGroup getParameterGroup() {
        return this.parameterGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ParameterGroup parameterGroup; 
        private String requestId; 

        /**
         * The information about the parameter template.
         */
        public Builder parameterGroup(ParameterGroup parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupResponseBody build() {
            return new DescribeParameterGroupResponseBody(this);
        } 

    } 

    public static class ParamGroupsDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private ParamGroupsDetails(Builder builder) {
            this.paramName = builder.paramName;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamGroupsDetails create() {
            return builder().build();
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String paramName; 
            private String paramValue; 

            /**
             * The name of the parameter.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public ParamGroupsDetails build() {
                return new ParamGroupsDetails(this);
            } 

        } 

    }
    public static class ParameterGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private Long category;

        @com.aliyun.core.annotation.NameInMap("Created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("ParamGroupId")
        private String paramGroupId;

        @com.aliyun.core.annotation.NameInMap("ParamGroupsDetails")
        private java.util.List < ParamGroupsDetails> paramGroupsDetails;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        private ParameterGroup(Builder builder) {
            this.category = builder.category;
            this.created = builder.created;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.modified = builder.modified;
            this.paramGroupId = builder.paramGroupId;
            this.paramGroupsDetails = builder.paramGroupsDetails;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupName = builder.parameterGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroup create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public Long getCategory() {
            return this.category;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return paramGroupId
         */
        public String getParamGroupId() {
            return this.paramGroupId;
        }

        /**
         * @return paramGroupsDetails
         */
        public java.util.List < ParamGroupsDetails> getParamGroupsDetails() {
            return this.paramGroupsDetails;
        }

        /**
         * @return parameterGroupDesc
         */
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        public static final class Builder {
            private Long category; 
            private String created; 
            private String engine; 
            private String engineVersion; 
            private String modified; 
            private String paramGroupId; 
            private java.util.List < ParamGroupsDetails> paramGroupsDetails; 
            private String parameterGroupDesc; 
            private String parameterGroupName; 

            /**
             * The service category. Valid values:
             * <p>
             * 
             * *   **0**: Community Edition
             * *   **1**: Enhanced Edition (Tair)
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the parameter template was created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The compatible engine version.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the parameter template was last modified.
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * The parameter template ID, which is globally unique.
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
                return this;
            }

            /**
             * The parameter details of the parameter template.
             */
            public Builder paramGroupsDetails(java.util.List < ParamGroupsDetails> paramGroupsDetails) {
                this.paramGroupsDetails = paramGroupsDetails;
                return this;
            }

            /**
             * The description of the parameter template.
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * The name of the parameter template.
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            public ParameterGroup build() {
                return new ParameterGroup(this);
            } 

        } 

    }
}
