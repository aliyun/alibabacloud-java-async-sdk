// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
    private java.util.List < ParameterGroup> parameterGroup;

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
    public java.util.List < ParameterGroup> getParameterGroup() {
        return this.parameterGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ParameterGroup> parameterGroup; 
        private String requestId; 

        /**
         * <p>Details about the parameter templates.</p>
         */
        public Builder parameterGroup(java.util.List < ParameterGroup> parameterGroup) {
            this.parameterGroup = parameterGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F1F16757-D31B-49CA-9BF4-305BAF******</p>
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
             * <p>3000</p>
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
    public static class ParameterGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("ForceRestart")
        private String forceRestart;

        @com.aliyun.core.annotation.NameInMap("ParameterCounts")
        private Integer parameterCounts;

        @com.aliyun.core.annotation.NameInMap("ParameterDetail")
        private java.util.List < ParameterDetail> parameterDetail;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @com.aliyun.core.annotation.NameInMap("ParameterGroupType")
        private String parameterGroupType;

        private ParameterGroup(Builder builder) {
            this.createTime = builder.createTime;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.forceRestart = builder.forceRestart;
            this.parameterCounts = builder.parameterCounts;
            this.parameterDetail = builder.parameterDetail;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupId = builder.parameterGroupId;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
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
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return forceRestart
         */
        public String getForceRestart() {
            return this.forceRestart;
        }

        /**
         * @return parameterCounts
         */
        public Integer getParameterCounts() {
            return this.parameterCounts;
        }

        /**
         * @return parameterDetail
         */
        public java.util.List < ParameterDetail> getParameterDetail() {
            return this.parameterDetail;
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
        public String getParameterGroupType() {
            return this.parameterGroupType;
        }

        public static final class Builder {
            private String createTime; 
            private String DBType; 
            private String DBVersion; 
            private String forceRestart; 
            private Integer parameterCounts; 
            private java.util.List < ParameterDetail> parameterDetail; 
            private String parameterGroupDesc; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private String parameterGroupType; 

            /**
             * <p>The time when the parameter template was created. The time is in the <code>yyyy-MM-ddTHH:mm:ssZ</code> format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-03-10T08:40:39Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The version of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>Indicates whether to restart the cluster when this parameter template is applied. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: A restart is not required.</li>
             * <li><strong>1</strong>: A restart is required.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * <p>The number of parameters in the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder parameterCounts(Integer parameterCounts) {
                this.parameterCounts = parameterCounts;
                return this;
            }

            /**
             * <p>Details about the parameters.</p>
             */
            public Builder parameterDetail(java.util.List < ParameterDetail> parameterDetail) {
                this.parameterDetail = parameterDetail;
                return this;
            }

            /**
             * <p>The description of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>testgroup</p>
             */
            public Builder parameterGroupDesc(String parameterGroupDesc) {
                this.parameterGroupDesc = parameterGroupDesc;
                return this;
            }

            /**
             * <p>The ID of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>pcpg-**************</p>
             */
            public Builder parameterGroupId(String parameterGroupId) {
                this.parameterGroupId = parameterGroupId;
                return this;
            }

            /**
             * <p>The name of the parameter template.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
            public Builder parameterGroupType(String parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            public ParameterGroup build() {
                return new ParameterGroup(this);
            } 

        } 

    }
}
