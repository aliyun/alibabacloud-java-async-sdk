// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupsResponseBody</p>
 */
public class DescribeParameterGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParameterGroups")
    private ParameterGroups parameterGroups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SignalForOptimizeParams")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeParameterGroupsResponseBody model) {
            this.parameterGroups = model.parameterGroups;
            this.requestId = model.requestId;
            this.signalForOptimizeParams = model.signalForOptimizeParams;
        } 

        /**
         * <p>The details of the parameter templates.</p>
         */
        public Builder parameterGroups(ParameterGroups parameterGroups) {
            this.parameterGroups = parameterGroups;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D4A23265-C5B6-42E1-98A0-EFA1EB42E723</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether parameter templates exist in the specified region. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false<blockquote>
         * <p>Notice: This parameter is deprecated.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder signalForOptimizeParams(Boolean signalForOptimizeParams) {
            this.signalForOptimizeParams = signalForOptimizeParams;
            return this;
        }

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupsResponseBody</p>
     */
    public static class ParameterGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private Integer forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParamCounts")
        private Integer paramCounts;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
        private Integer parameterGroupType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(ParameterGroup model) {
                this.createTime = model.createTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.forceRestart = model.forceRestart;
                this.paramCounts = model.paramCounts;
                this.parameterGroupDesc = model.parameterGroupDesc;
                this.parameterGroupId = model.parameterGroupId;
                this.parameterGroupName = model.parameterGroupName;
                this.parameterGroupType = model.parameterGroupType;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the parameter template was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-21T01:48:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>Indicates whether the restart of an instance is required for the parameter template to take effect. Valid values:</p>
             * <ul>
             * <li>0: A restart is not required.</li>
             * <li>1: A restart is required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder forceRestart(Integer forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>The number of parameters in the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder paramCounts(Integer paramCounts) {
                this.paramCounts = paramCounts;
                return this;
            }

            /**
             * <p>The type of the parameter template. Valid values:</p>
             * <ul>
             * <li>0: the default parameter template.</li>
             * <li>1: a custom parameter template.</li>
             * <li>2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The ID of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>rpg-****</p>
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>test1234</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * <p>The type of the parameter template. Valid values:</p>
             * <ul>
             * <li>0: the default parameter template.</li>
             * <li>1: a custom parameter template.</li>
             * <li>2: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parameterGroupType(Integer parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            /**
             * <p>The time when the parameter template was last updated. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-21T02:21:35Z</p>
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
    /**
     * 
     * {@link DescribeParameterGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupsResponseBody</p>
     */
    public static class ParameterGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterGroup")
        private java.util.List<ParameterGroup> parameterGroup;

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
        public java.util.List<ParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

        public static final class Builder {
            private java.util.List<ParameterGroup> parameterGroup; 

            private Builder() {
            } 

            private Builder(ParameterGroups model) {
                this.parameterGroup = model.parameterGroup;
            } 

            /**
             * ParameterGroup.
             */
            public Builder parameterGroup(java.util.List<ParameterGroup> parameterGroup) {
                this.parameterGroup = parameterGroup;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
