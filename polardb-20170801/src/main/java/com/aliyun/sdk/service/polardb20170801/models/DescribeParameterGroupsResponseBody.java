// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
    private java.util.List < ParameterGroups> parameterGroups;

    @NameInMap("RequestId")
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
         * The details of parameter templates.
         */
        public Builder parameterGroups(java.util.List < ParameterGroups> parameterGroups) {
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

        public DescribeParameterGroupsResponseBody build() {
            return new DescribeParameterGroupsResponseBody(this);
        } 

    } 

    public static class ParameterGroups extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("ForceRestart")
        private String forceRestart;

        @NameInMap("ParameterCounts")
        private Long parameterCounts;

        @NameInMap("ParameterGroupDesc")
        private String parameterGroupDesc;

        @NameInMap("ParameterGroupId")
        private String parameterGroupId;

        @NameInMap("ParameterGroupName")
        private String parameterGroupName;

        @NameInMap("ParameterGroupType")
        private String parameterGroupType;

        private ParameterGroups(Builder builder) {
            this.createTime = builder.createTime;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.forceRestart = builder.forceRestart;
            this.parameterCounts = builder.parameterCounts;
            this.parameterGroupDesc = builder.parameterGroupDesc;
            this.parameterGroupId = builder.parameterGroupId;
            this.parameterGroupName = builder.parameterGroupName;
            this.parameterGroupType = builder.parameterGroupType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterGroups create() {
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
        public Long getParameterCounts() {
            return this.parameterCounts;
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
            private Long parameterCounts; 
            private String parameterGroupDesc; 
            private String parameterGroupId; 
            private String parameterGroupName; 
            private String parameterGroupType; 

            /**
             * The time when the parameter template was created. The time is in the `yyyy-MM-ddTHH:mm:ssZ` format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The type of the engine.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * The version of the database engine
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * Indicates whether to restart the cluster when this parameter template is applied. Valid values:
             * <p>
             * 
             * *   **0**: A restart is not required.
             * *   **1**: A restart is required.
             */
            public Builder forceRestart(String forceRestart) {
                this.forceRestart = forceRestart;
                return this;
            }

            /**
             * The number of parameters in the parameter template.
             */
            public Builder parameterCounts(Long parameterCounts) {
                this.parameterCounts = parameterCounts;
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
            public Builder parameterGroupType(String parameterGroupType) {
                this.parameterGroupType = parameterGroupType;
                return this;
            }

            public ParameterGroups build() {
                return new ParameterGroups(this);
            } 

        } 

    }
}
