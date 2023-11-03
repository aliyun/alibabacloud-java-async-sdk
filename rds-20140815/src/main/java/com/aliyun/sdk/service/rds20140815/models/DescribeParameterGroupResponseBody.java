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

    @NameInMap("RelatedCustinsInfo")
    private RelatedCustinsInfo relatedCustinsInfo;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeParameterGroupResponseBody(Builder builder) {
        this.paramGroup = builder.paramGroup;
        this.relatedCustinsInfo = builder.relatedCustinsInfo;
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
     * @return relatedCustinsInfo
     */
    public RelatedCustinsInfo getRelatedCustinsInfo() {
        return this.relatedCustinsInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ParamGroup paramGroup; 
        private RelatedCustinsInfo relatedCustinsInfo; 
        private String requestId; 

        /**
         * The information about the parameter template.
         */
        public Builder paramGroup(ParamGroup paramGroup) {
            this.paramGroup = paramGroup;
            return this;
        }

        /**
         * The information about the instance to which the parameter template is applied.
         * <p>
         * 
         * >  This parameter is available only for ApsaraDB RDS for PostgreSQL instances.
         */
        public Builder relatedCustinsInfo(RelatedCustinsInfo relatedCustinsInfo) {
            this.relatedCustinsInfo = relatedCustinsInfo;
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
             * The time when the parameter template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The database engine of the instance.
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
             * *   **0**: A restart is not required.
             * *   **1**: A restart is required.
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
             * The details of the parameters.
             */
            public Builder paramDetail(ParamDetail paramDetail) {
                this.paramDetail = paramDetail;
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
             * *   **0**: the default parameter template.
             * *   **1**: a custom parameter template.
             * *   **2**: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.
             */
            public Builder parameterGroupType(Integer parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            /**
             * The time when the parameter template was last updated. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
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
    public static class RelatedCustinsInfoRelatedCustinsInfo extends TeaModel {
        @NameInMap("AppliedTime")
        private String appliedTime;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        private RelatedCustinsInfoRelatedCustinsInfo(Builder builder) {
            this.appliedTime = builder.appliedTime;
            this.DBInstanceName = builder.DBInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedCustinsInfoRelatedCustinsInfo create() {
            return builder().build();
        }

        /**
         * @return appliedTime
         */
        public String getAppliedTime() {
            return this.appliedTime;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public static final class Builder {
            private String appliedTime; 
            private String DBInstanceName; 

            /**
             * The time when the parameter template was applied.
             */
            public Builder appliedTime(String appliedTime) {
                this.appliedTime = appliedTime;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            public RelatedCustinsInfoRelatedCustinsInfo build() {
                return new RelatedCustinsInfoRelatedCustinsInfo(this);
            } 

        } 

    }
    public static class RelatedCustinsInfo extends TeaModel {
        @NameInMap("RelatedCustinsInfo")
        private java.util.List < RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo;

        private RelatedCustinsInfo(Builder builder) {
            this.relatedCustinsInfo = builder.relatedCustinsInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedCustinsInfo create() {
            return builder().build();
        }

        /**
         * @return relatedCustinsInfo
         */
        public java.util.List < RelatedCustinsInfoRelatedCustinsInfo> getRelatedCustinsInfo() {
            return this.relatedCustinsInfo;
        }

        public static final class Builder {
            private java.util.List < RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo; 

            /**
             * The information about the instance to which the parameter template is applied.
             * <p>
             * 
             * >  This parameter is available only for ApsaraDB RDS for PostgreSQL instances.
             */
            public Builder relatedCustinsInfo(java.util.List < RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo) {
                this.relatedCustinsInfo = relatedCustinsInfo;
                return this;
            }

            public RelatedCustinsInfo build() {
                return new RelatedCustinsInfo(this);
            } 

        } 

    }
}
