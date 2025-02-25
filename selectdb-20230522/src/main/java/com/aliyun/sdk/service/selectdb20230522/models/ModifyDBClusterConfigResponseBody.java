// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
 * {@link ModifyDBClusterConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDBClusterConfigResponseBody</p>
 */
public class ModifyDBClusterConfigResponseBody extends TeaModel {
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

    private ModifyDBClusterConfigResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterConfigResponseBody create() {
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
         * Data.
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

        public ModifyDBClusterConfigResponseBody build() {
            return new ModifyDBClusterConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDBClusterConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDBClusterConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbClusterId")
        private String dbClusterId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("DbInstanceName")
        private String dbInstanceName;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Integer taskId;

        private Data(Builder builder) {
            this.dbClusterId = builder.dbClusterId;
            this.dbInstanceId = builder.dbInstanceId;
            this.dbInstanceName = builder.dbInstanceName;
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
         * @return taskId
         */
        public Integer getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String dbClusterId; 
            private String dbInstanceId; 
            private String dbInstanceName; 
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
             * TaskId.
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
