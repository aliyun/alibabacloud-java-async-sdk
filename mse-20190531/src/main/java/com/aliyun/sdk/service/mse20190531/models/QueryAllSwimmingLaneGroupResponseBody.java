// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneGroupResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneGroupResponseBody</p>
 */
public class QueryAllSwimmingLaneGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The returned message.
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
        @com.aliyun.core.annotation.NameInMap("AppIds")
        private String appIds;

        @com.aliyun.core.annotation.NameInMap("CanaryModel")
        private Integer canaryModel;

        @com.aliyun.core.annotation.NameInMap("EntryApp")
        private String entryApp;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("MessageQueueFilterSide")
        private String messageQueueFilterSide;

        @com.aliyun.core.annotation.NameInMap("MessageQueueGrayEnable")
        private Boolean messageQueueGrayEnable;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("Paths")
        private String paths;

        @com.aliyun.core.annotation.NameInMap("RecordCanaryDetail")
        private Boolean recordCanaryDetail;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("SwimVersion")
        private Integer swimVersion;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.appIds = builder.appIds;
            this.canaryModel = builder.canaryModel;
            this.entryApp = builder.entryApp;
            this.id = builder.id;
            this.messageQueueFilterSide = builder.messageQueueFilterSide;
            this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.paths = builder.paths;
            this.recordCanaryDetail = builder.recordCanaryDetail;
            this.region = builder.region;
            this.swimVersion = builder.swimVersion;
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
         * @return canaryModel
         */
        public Integer getCanaryModel() {
            return this.canaryModel;
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
         * @return paths
         */
        public String getPaths() {
            return this.paths;
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
         * @return swimVersion
         */
        public Integer getSwimVersion() {
            return this.swimVersion;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appIds; 
            private Integer canaryModel; 
            private String entryApp; 
            private Long id; 
            private String messageQueueFilterSide; 
            private Boolean messageQueueGrayEnable; 
            private String name; 
            private String namespace; 
            private String paths; 
            private Boolean recordCanaryDetail; 
            private String region; 
            private Integer swimVersion; 
            private String userId; 

            /**
             * AppIds.
             */
            public Builder appIds(String appIds) {
                this.appIds = appIds;
                return this;
            }

            /**
             * CanaryModel.
             */
            public Builder canaryModel(Integer canaryModel) {
                this.canaryModel = canaryModel;
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
             * MessageQueueFilterSide.
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * Paths.
             */
            public Builder paths(String paths) {
                this.paths = paths;
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
             * SwimVersion.
             */
            public Builder swimVersion(Integer swimVersion) {
                this.swimVersion = swimVersion;
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
