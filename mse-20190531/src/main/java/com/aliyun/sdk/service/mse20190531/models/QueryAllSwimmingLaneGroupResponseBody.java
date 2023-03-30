// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneGroupResponseBody</p>
 */
public class QueryAllSwimmingLaneGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAllSwimmingLaneGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllSwimmingLaneGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer code; 
        private java.util.List < Data> data; 
        private String dynamicMessage; 
        private String errorCode; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code. A value of 200 is returned if the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic part in the error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
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
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         * <p>
         * 
         * *   If the request is successful, a success message is returned.
         * *   If the request fails, an error message is returned.
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
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAllSwimmingLaneGroupResponseBody build() {
            return new QueryAllSwimmingLaneGroupResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppIds")
        private String appIds;

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

        @NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.appIds = builder.appIds;
            this.entryApp = builder.entryApp;
            this.id = builder.id;
            this.messageQueueFilterSide = builder.messageQueueFilterSide;
            this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.recordCanaryDetail = builder.recordCanaryDetail;
            this.region = builder.region;
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
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appIds; 
            private String entryApp; 
            private Long id; 
            private String messageQueueFilterSide; 
            private Boolean messageQueueGrayEnable; 
            private String name; 
            private String namespace; 
            private Boolean recordCanaryDetail; 
            private String region; 
            private String userId; 

            /**
             * 应用Id列表
             */
            public Builder appIds(String appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * 入口应用类型+入口应用Id
             */
            public Builder entryApp(String entryApp) {
                this.entryApp = entryApp;
                return this;
            }

            /**
             * 泳道组Id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 在哪一侧实现消息灰度
             */
            public Builder messageQueueFilterSide(String messageQueueFilterSide) {
                this.messageQueueFilterSide = messageQueueFilterSide;
                return this;
            }

            /**
             * 是否开启消息灰度
             */
            public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
                this.messageQueueGrayEnable = messageQueueGrayEnable;
                return this;
            }

            /**
             * 泳道组名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 泳道所属的MSE命名空间
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 是否记录请求详情（全链路灰度可观测）
             */
            public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
                this.recordCanaryDetail = recordCanaryDetail;
                return this;
            }

            /**
             * 所属地域
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * 泳道所属的用户id
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
