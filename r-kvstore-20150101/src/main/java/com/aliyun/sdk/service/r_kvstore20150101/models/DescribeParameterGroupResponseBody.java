// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about the parameter template.</p>
         */
        public Builder parameterGroup(ParameterGroup parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupResponseBody build() {
            return new DescribeParameterGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>timeout</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
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
    /**
     * 
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
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
             * <p>The service category. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Community Edition</li>
             * <li><strong>1</strong>: Enhanced Edition (Tair)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder category(Long category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The time when the parameter template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18 16:32:45</p>
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
             * <p>The compatible engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the parameter template was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-18 16:32:45</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The parameter template ID, which is globally unique.</p>
             * 
             * <strong>example:</strong>
             * <p>sys-001*****</p>
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
                return this;
            }

            /**
             * <p>The parameter details of the parameter template.</p>
             */
            public Builder paramGroupsDetails(java.util.List < ParamGroupsDetails> paramGroupsDetails) {
                this.paramGroupsDetails = paramGroupsDetails;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroupName</p>
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
