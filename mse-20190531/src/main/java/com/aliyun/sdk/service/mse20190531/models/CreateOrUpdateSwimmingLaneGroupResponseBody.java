// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSwimmingLaneGroupResponseBody</p>
 */
public class CreateOrUpdateSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateOrUpdateSwimmingLaneGroupResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSwimmingLaneGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The name of the MSE namespace.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * true: The request was successful. false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateOrUpdateSwimmingLaneGroupResponseBody build() {
            return new CreateOrUpdateSwimmingLaneGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppIds")
        private String appIds;

        @NameInMap("DbGrayEnable")
        private String dbGrayEnable;

        @NameInMap("Enable")
        private String enable;

        @NameInMap("EntryApp")
        private String entryApp;

        @NameInMap("Id")
        private Long id;

        @NameInMap("MessageQueueFilterSide")
        private String messageQueueFilterSide;

        @NameInMap("MessageQueueGrayEnable")
        private Boolean messageQueueGrayEnable;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("RecordCanaryDetail")
        private Boolean recordCanaryDetail;

        @NameInMap("Region")
        private String region;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.appIds = builder.appIds;
            this.dbGrayEnable = builder.dbGrayEnable;
            this.enable = builder.enable;
            this.entryApp = builder.entryApp;
            this.id = builder.id;
            this.messageQueueFilterSide = builder.messageQueueFilterSide;
            this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.recordCanaryDetail = builder.recordCanaryDetail;
            this.region = builder.region;
            this.source = builder.source;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appIds
         */
        public String getAppIds() {
            return this.appIds;
        }

        /**
         * @return dbGrayEnable
         */
        public String getDbGrayEnable() {
            return this.dbGrayEnable;
        }

        /**
         * @return enable
         */
        public String getEnable() {
            return this.enable;
        }

        /**
         * @return entryApp
         */
        public String getEntryApp() {
            return this.entryApp;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return messageQueueFilterSide
         */
        public String getMessageQueueFilterSide() {
            return this.messageQueueFilterSide;
        }

        /**
         * @return messageQueueGrayEnable
         */
        public Boolean getMessageQueueGrayEnable() {
            return this.messageQueueGrayEnable;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return recordCanaryDetail
         */
        public Boolean getRecordCanaryDetail() {
            return this.recordCanaryDetail;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appIds; 
            private String dbGrayEnable; 
            private String enable; 
            private String entryApp; 
            private Long id; 
            private String messageQueueFilterSide; 
            private Boolean messageQueueGrayEnable; 
            private String name; 
            private String namespace; 
            private Boolean recordCanaryDetail; 
            private String region; 
            private String source; 
            private Integer status; 
            private String userId; 

            /**
             * AppIds.
             */
            public Builder appIds(String appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * 是否开启数据库灰度
             */
            public Builder dbGrayEnable(String dbGrayEnable) {
                this.dbGrayEnable = dbGrayEnable;
                return this;
            }

            /**
             * Enable.
             */
            public Builder enable(String enable) {
                this.enable = enable;
                return this;
            }

            /**
             * EntryApp.
             */
            public Builder entryApp(String entryApp) {
                this.entryApp = entryApp;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 消息灰度过滤侧
             */
            public Builder messageQueueFilterSide(String messageQueueFilterSide) {
                this.messageQueueFilterSide = messageQueueFilterSide;
                return this;
            }

            /**
             * MessageQueueGrayEnable.
             */
            public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
                this.messageQueueGrayEnable = messageQueueGrayEnable;
                return this;
            }

            /**
             * 应用名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * MSE命名空间名字
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * RecordCanaryDetail.
             */
            public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
                this.recordCanaryDetail = recordCanaryDetail;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
