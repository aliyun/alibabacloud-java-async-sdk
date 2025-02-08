// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link GetQualityFollowerResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityFollowerResponseBody</p>
 */
public class GetQualityFollowerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetQualityFollowerResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityFollowerResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the subscription relationship.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Invalid.Tenant.ConnectionNotExists</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>You have no permission.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP return code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>38cbdef0-f6cf-49</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityFollowerResponseBody build() {
            return new GetQualityFollowerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityFollowerResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityFollowerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmMode")
        private Integer alarmMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("Follower")
        private String follower;

        @com.aliyun.core.annotation.NameInMap("FollowerAccountName")
        private String followerAccountName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Data(Builder builder) {
            this.alarmMode = builder.alarmMode;
            this.createTime = builder.createTime;
            this.entityId = builder.entityId;
            this.follower = builder.follower;
            this.followerAccountName = builder.followerAccountName;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.projectName = builder.projectName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alarmMode
         */
        public Integer getAlarmMode() {
            return this.alarmMode;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return follower
         */
        public String getFollower() {
            return this.follower;
        }

        /**
         * @return followerAccountName
         */
        public String getFollowerAccountName() {
            return this.followerAccountName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Integer alarmMode; 
            private Long createTime; 
            private String entityId; 
            private String follower; 
            private String followerAccountName; 
            private Long id; 
            private Long modifyTime; 
            private String projectName; 
            private String tableName; 

            /**
             * <p>The alert mode. The value is as follows:</p>
             * <ul>
             * <li>1 (Mail)</li>
             * <li>2 (email and SMS)</li>
             * <li>4 (DingTalk groups of robots or hook)</li>
             * <li>5 (DingTalk groups of robots @ ALL)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alarmMode(Integer alarmMode) {
                this.alarmMode = alarmMode;
                return this;
            }

            /**
             * <p>The time when the data quality rule subscription configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1541576644000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the partition expression.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The subscriber to receive alert information.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder follower(String follower) {
                this.follower = follower;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account name of the subscriber.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder followerAccountName(String followerAccountName) {
                this.followerAccountName = followerAccountName;
                return this;
            }

            /**
             * <p>The ID of the subscription relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The update time of the data quality rule subscription configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1541576644000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the engine or data source.</p>
             * 
             * <strong>example:</strong>
             * <p>autotest</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The name of the partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>dual</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
