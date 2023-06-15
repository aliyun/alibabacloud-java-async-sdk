// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupsResponseBody</p>
 */
public class DescribeParameterGroupsResponseBody extends TeaModel {
    @NameInMap("ParameterGroups")
    private ParameterGroups parameterGroups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignalForOptimizeParams")
    private Boolean signalForOptimizeParams;

    private DescribeParameterGroupsResponseBody(Builder builder) {
        this.parameterGroups = builder.parameterGroups;
        this.requestId = builder.requestId;
        this.signalForOptimizeParams = builder.signalForOptimizeParams;
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
    public ParameterGroups getParameterGroups() {
        return this.parameterGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signalForOptimizeParams
     */
    public Boolean getSignalForOptimizeParams() {
        return this.signalForOptimizeParams;
    }

    public static final class Builder {
        private ParameterGroups parameterGroups; 
        private String requestId; 
        private Boolean signalForOptimizeParams; 

        /**
         * The details of parameter templates.
         */
        public Builder parameterGroups(ParameterGroups parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether parameter templates exist in the specified region. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder signalForOptimizeParams(Boolean signalForOptimizeParams) {
            this.signalForOptimizeParams = signalForOptimizeParams;
            return this;
        }

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    public static class ParameterGroup extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ForceRestart")
        private Integer forceRestart;

        @NameInMap("ParamCounts")
        private Integer paramCounts;

        @NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @NameInMap("ParameterGroupType")
        private Integer parameterGroupType;

        @NameInMap("UpdateTime")
        private String updateTime;

        private ParameterGroup(Builder builder) {
            this.createTime = builder.createTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.forceRestart = builder.forceRestart;
            this.paramCounts = builder.paramCounts;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupId = builder.parameterGroupId;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroup create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return forceRestart
         */
        public Integer getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return paramCounts
         */
        public Integer getParamCounts() {
            return this.paramCounts;
        }

        /**
         * @return parameterGroupDesc
         */
        public String getParameterGroupDesc() {
            return this.parameterGroupDesc;
        }

        /**
         * @return parameterGroupId
         */
        public String getParameterGroupId() {
            return this.parameterGroupId;
        }

        /**
         * @return parameterGroupName
         */
        public String getParameterGroupName() {
            return this.parameterGroupName;
        }

        /**
         * @return parameterGroupType
         */
        public Integer getParameterGroupType() {
            return this.parameterGroupType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String engine; 
            private String engineVersion; 
            private Integer forceRestart; 
            private Integer paramCounts; 
            private String parameterGroupDesc; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private Integer parameterGroupType; 
            private String updateTime; 

            /**
             * The time when the parameter template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The database engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * Indicates whether the restart of an instance is required for the parameter template to take effect. Valid values:
             * <p>
             * 
             * *   0: A restart is not required.
             * *   1: A restart is required.
             */
            public Builder forceRestart(Integer forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * The number of parameters in the parameter template.
             */
            public Builder paramCounts(Integer paramCounts) {
                this.paramCounts = paramCounts;
                return this;
            }

            /**
             * The type of the parameter template. Valid values:
             * <p>
             * 
             * *   0: the default parameter template.
             * *   1: a custom parameter template.
             * *   2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * The ID of the parameter template.
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * The name of the parameter template.
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * The type of the parameter template. Valid values:
             * <p>
             * 
             * *   0: the default parameter template.
             * *   1: a custom parameter template.
             * *   2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.
             */
            public Builder parameterGroupType(Integer parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            /**
             * The time when the parameter template was last updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ParameterGroup build() {
                return new ParameterGroup(this);
            } 

        } 

    }
    public static class ParameterGroups extends TeaModel {
        @NameInMap("ParameterGroup")
        private java.util.List < ParameterGroup> parameterGroup;

        private ParameterGroups(Builder builder) {
            this.parameterGroup = builder.parameterGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
            return builder().build();
        }

        /**
         * @return parameterGroup
         */
        public java.util.List < ParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

        public static final class Builder {
            private java.util.List < ParameterGroup> parameterGroup; 

            /**
             * ParameterGroup.
             */
            public Builder parameterGroup(java.util.List < ParameterGroup> parameterGroup) {
                this.parameterGroup = parameterGroup;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
