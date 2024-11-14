// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBClusterConfigChangeLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterConfigChangeLogsResponseBody</p>
 */
public class DescribeDBClusterConfigChangeLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterConfigChangeLogsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterConfigChangeLogsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic code. This parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>An error occurred while processing your request.</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterConfigChangeLogsResponseBody build() {
            return new DescribeDBClusterConfigChangeLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterConfigChangeLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterConfigChangeLogsResponseBody</p>
     */
    public static class ParamChangeLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsApplied")
        private Boolean isApplied;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewValue")
        private String newValue;

        @com.aliyun.core.annotation.NameInMap("OldValue")
        private String oldValue;

        private ParamChangeLogs(Builder builder) {
            this.gmtCreated = builder.gmtCreated;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isApplied = builder.isApplied;
            this.name = builder.name;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamChangeLogs create() {
            return builder().build();
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isApplied
         */
        public Boolean getIsApplied() {
            return this.isApplied;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newValue
         */
        public String getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public String getOldValue() {
            return this.oldValue;
        }

        public static final class Builder {
            private String gmtCreated; 
            private String gmtModified; 
            private Long id; 
            private Boolean isApplied; 
            private String name; 
            private String newValue; 
            private String oldValue; 

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the change log.</p>
             * 
             * <strong>example:</strong>
             * <p>617975</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the modification has taken effect.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isApplied(Boolean isApplied) {
                this.isApplied = isApplied;
                return this;
            }

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>cumulative_compaction_rounds_for_each_base_compaction_round</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewValue.
             */
            public Builder newValue(String newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * OldValue.
             */
            public Builder oldValue(String oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            public ParamChangeLogs build() {
                return new ParamChangeLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterConfigChangeLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterConfigChangeLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("ParamChangeLogs")
        private java.util.List < ParamChangeLogs> paramChangeLogs;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Data(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
            this.paramChangeLogs = builder.paramChangeLogs;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbClusterId
         */
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return dbInstanceName
         */
        public String getDbInstanceName() {
            return this.dbInstanceName;
        }

        /**
         * @return paramChangeLogs
         */
        public java.util.List < ParamChangeLogs> getParamChangeLogs() {
            return this.paramChangeLogs;
        }

        /**
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String dbInstanceId; 
            private String dbInstanceName; 
            private java.util.List < ParamChangeLogs> paramChangeLogs; 
            private Integer taskId; 

            /**
             * DbClusterId.
             */
            public Builder dbClusterId(String dbClusterId) {
                this.dbClusterId = dbClusterId;
                return this;
            }

            /**
             * DbInstanceId.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * DbInstanceName.
             */
            public Builder dbInstanceName(String dbInstanceName) {
                this.dbInstanceName = dbInstanceName;
                return this;
            }

            /**
             * <p>The parameter change logs.</p>
             */
            public Builder paramChangeLogs(java.util.List < ParamChangeLogs> paramChangeLogs) {
                this.paramChangeLogs = paramChangeLogs;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>107841167</p>
             */
            public Builder taskId(Integer taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
