// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupsResponseBody</p>
 */
public class DescribeParameterGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroups")
    private java.util.List < ParameterGroups> parameterGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupsResponseBody(Builder builder) {
        this.parameterGroups = builder.parameterGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return parameterGroups
     */
    public java.util.List < ParameterGroups> getParameterGroups() {
        return this.parameterGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ParameterGroups> parameterGroups; 
        private String requestId; 

        /**
         * The list of parameter templates.
         */
        public Builder parameterGroups(java.util.List < ParameterGroups> parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    public static class ParameterGroups extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        private ParameterGroups(Builder builder) {
            this.category = builder.category;
            this.created = builder.created;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.modified = builder.modified;
            this.paramGroupId = builder.paramGroupId;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupName = builder.parameterGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
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
             * The engine type. Valid values:
             * <p>
             * 
             * *   **redis**: Redis or Tair DRAM-based instance
             * *   **tair_pena**: Tair persistent memory-optimized instance
             * *   **tair_pdb**: Tair ESSD-based instance
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
             * The parameter template ID.
             */
            public Builder paramGroupId(String paramGroupId) {
                this.paramGroupId = paramGroupId;
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

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
