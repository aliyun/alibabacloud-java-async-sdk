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
 * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupResponseBody</p>
 */
public class DescribeParameterGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamGroup")
    private ParamGroup paramGroup;

    @com.aliyun.core.annotation.NameInMap("RelatedCustinsInfo")
    private RelatedCustinsInfo relatedCustinsInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the parameter template.</p>
         */
        public Builder paramGroup(ParamGroup paramGroup) {
            this.paramGroup = paramGroup;
            return this;
        }

        /**
         * <p>The information about the instance to which the parameter template is applied.</p>
         * <blockquote>
         * <p> This parameter is available only for ApsaraDB RDS for PostgreSQL instances.</p>
         * </blockquote>
         */
        public Builder relatedCustinsInfo(RelatedCustinsInfo relatedCustinsInfo) {
            this.relatedCustinsInfo = relatedCustinsInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>498AE8CA-8C81-4A01-AF37-2B902014ED30</p>
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
    public static class ParameterDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>back_log</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
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
    /**
     * 
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
    public static class ParamDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterDetail")
        private java.util.List<ParameterDetail> parameterDetail;

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
        public java.util.List<ParameterDetail> getParameterDetail() {
            return this.parameterDetail;
        }

        public static final class Builder {
            private java.util.List<ParameterDetail> parameterDetail; 

            /**
             * ParameterDetail.
             */
            public Builder parameterDetail(java.util.List<ParameterDetail> parameterDetail) {
                this.parameterDetail = parameterDetail;
                return this;
            }

            public ParamDetail build() {
                return new ParamDetail(this);
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

        @com.aliyun.core.annotation.NameInMap("ParamDetail")
        private ParamDetail paramDetail;

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
             * <p>The time when the parameter template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-22T06:02:53Z</p>
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
             * <p>The database engine version of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>Indicates whether the restart of an instance is required for the parameter template to take effect. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: A restart is not required.</li>
             * <li><strong>1</strong>: A restart is required.</li>
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
             * <p>The details of the parameters.</p>
             */
            public Builder paramDetail(ParamDetail paramDetail) {
                this.paramDetail = paramDetail;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>testGroup1</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The ID of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>rpg-dp****</p>
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>test123456</p>
             */
            public Builder parameterGroupName(String parameterGroupName) {
                this.parameterGroupName = parameterGroupName;
                return this;
            }

            /**
             * <p>The type of the parameter template. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: the default parameter template.</li>
             * <li><strong>1</strong>: a custom parameter template.</li>
             * <li><strong>2</strong>: an automatic backup parameter template. After you apply this type of template, the system automatically backs up the original parameter settings and saves the backup as a template.</li>
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
             * <p>The time when the parameter template was last updated. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-22T06:07:54Z</p>
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
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
    public static class ParamGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterGroup")
        private java.util.List<ParameterGroup> parameterGroup;

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
        public java.util.List<ParameterGroup> getParameterGroup() {
            return this.parameterGroup;
        }

        public static final class Builder {
            private java.util.List<ParameterGroup> parameterGroup; 

            /**
             * ParameterGroup.
             */
            public Builder parameterGroup(java.util.List<ParameterGroup> parameterGroup) {
                this.parameterGroup = parameterGroup;
                return this;
            }

            public ParamGroup build() {
                return new ParamGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
    public static class RelatedCustinsInfoRelatedCustinsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppliedTime")
        private String appliedTime;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
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
             * <p>The time when the parameter template was applied.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-10-17T03:19:02Z</p>
             */
            public Builder appliedTime(String appliedTime) {
                this.appliedTime = appliedTime;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp170****</p>
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
    /**
     * 
     * {@link DescribeParameterGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterGroupResponseBody</p>
     */
    public static class RelatedCustinsInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelatedCustinsInfo")
        private java.util.List<RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo;

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
        public java.util.List<RelatedCustinsInfoRelatedCustinsInfo> getRelatedCustinsInfo() {
            return this.relatedCustinsInfo;
        }

        public static final class Builder {
            private java.util.List<RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo; 

            /**
             * <p>The information about the instance to which the parameter template is applied.</p>
             * <blockquote>
             * <p> This parameter is available only for ApsaraDB RDS for PostgreSQL instances.</p>
             * </blockquote>
             */
            public Builder relatedCustinsInfo(java.util.List<RelatedCustinsInfoRelatedCustinsInfo> relatedCustinsInfo) {
                this.relatedCustinsInfo = relatedCustinsInfo;
                return this;
            }

            public RelatedCustinsInfo build() {
                return new RelatedCustinsInfo(this);
            } 

        } 

    }
}
