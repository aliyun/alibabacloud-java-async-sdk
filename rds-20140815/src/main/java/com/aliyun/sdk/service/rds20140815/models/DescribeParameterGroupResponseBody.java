// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupResponseBody</p>
 */
public class DescribeParameterGroupResponseBody extends TeaModel {
    @NameInMap("ParamGroup")
    private ParamGroup paramGroup;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupResponseBody(Builder builder) {
        this.paramGroup = builder.paramGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return paramGroup
     */
    public ParamGroup getParamGroup() {
        return this.paramGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ParamGroup paramGroup; 
        private String requestId; 

        /**
         * ParamGroup.
         */
        public Builder paramGroup(ParamGroup paramGroup) {
            this.paramGroup = paramGroup;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeParameterGroupResponseBody build() {
            return new DescribeParameterGroupResponseBody(this);
        } 

    } 

    public static class ParameterDetail extends TeaModel {
        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ParamValue")
        private String paramValue;

        private ParameterDetail(Builder builder) {
            this.paramName = builder.paramName;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDetail create() {
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
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamValue.
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public ParameterDetail build() {
                return new ParameterDetail(this);
            } 

        } 

    }
    public static class ParamDetail extends TeaModel {
        @NameInMap("ParameterDetail")
        private java.util.List < ParameterDetail> parameterDetail;

        private ParamDetail(Builder builder) {
            this.parameterDetail = builder.parameterDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamDetail create() {
            return builder().build();
        }

        /**
         * @return parameterDetail
         */
        public java.util.List < ParameterDetail> getParameterDetail() {
            return this.parameterDetail;
        }

        public static final class Builder {
            private java.util.List < ParameterDetail> parameterDetail; 

            /**
             * ParameterDetail.
             */
            public Builder parameterDetail(java.util.List < ParameterDetail> parameterDetail) {
                this.parameterDetail = parameterDetail;
                return this;
            }

            public ParamDetail build() {
                return new ParamDetail(this);
            } 

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

        @NameInMap("ParamDetail")
        private ParamDetail paramDetail;

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
            this.paramDetail = builder.paramDetail;
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
         * @return paramDetail
         */
        public ParamDetail getParamDetail() {
            return this.paramDetail;
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
            private ParamDetail paramDetail; 
            private String parameterGroupDesc; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private Integer parameterGroupType; 
            private String updateTime; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * ForceRestart.
             */
            public Builder forceRestart(Integer forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * ParamCounts.
             */
            public Builder paramCounts(Integer paramCounts) {
                this.paramCounts = paramCounts;
                return this;
            }

            /**
             * ParamDetail.
             */
            public Builder paramDetail(ParamDetail paramDetail) {
                this.paramDetail = paramDetail;
                return this;
            }

            /**
             * ParameterGroupDesc.
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * ParameterGroupId.
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * ParameterGroupName.
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * ParameterGroupType.
             */
            public Builder parameterGroupType(Integer parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            /**
             * UpdateTime.
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
    public static class ParamGroup extends TeaModel {
        @NameInMap("ParameterGroup")
        private java.util.List < ParameterGroup> parameterGroup;

        private ParamGroup(Builder builder) {
            this.parameterGroup = builder.parameterGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamGroup create() {
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

            public ParamGroup build() {
                return new ParamGroup(this);
            } 

        } 

    }
}
