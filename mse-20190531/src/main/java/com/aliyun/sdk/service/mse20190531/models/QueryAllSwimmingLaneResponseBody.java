// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneResponseBody</p>
 */
public class QueryAllSwimmingLaneResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAllSwimmingLaneResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAllSwimmingLaneResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private java.util.List < Data> data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The status code. A value of 200 is returned if the request is successful.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAllSwimmingLaneResponseBody build() {
            return new QueryAllSwimmingLaneResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
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

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Tag")
        private String tag;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("enableRules")
        private Boolean enableRules;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("groupId")
        private String groupId;

        private Data(Builder builder) {
            this.id = builder.id;
            this.messageQueueFilterSide = builder.messageQueueFilterSide;
            this.messageQueueGrayEnable = builder.messageQueueGrayEnable;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.recordCanaryDetail = builder.recordCanaryDetail;
            this.regionId = builder.regionId;
            this.tag = builder.tag;
            this.userId = builder.userId;
            this.enableRules = builder.enableRules;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return enableRules
         */
        public Boolean getEnableRules() {
            return this.enableRules;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        public static final class Builder {
            private Long id; 
            private String messageQueueFilterSide; 
            private Boolean messageQueueGrayEnable; 
            private String name; 
            private String namespace; 
            private Boolean recordCanaryDetail; 
            private String regionId; 
            private String tag; 
            private String userId; 
            private Boolean enableRules; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupId; 

            /**
             * 泳道组Id。
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 在哪一侧实现消息灰度。
             */
            public Builder messageQueueFilterSide(String messageQueueFilterSide) {
                this.messageQueueFilterSide = messageQueueFilterSide;
                return this;
            }

            /**
             * 是否开启消息灰度。
             */
            public Builder messageQueueGrayEnable(Boolean messageQueueGrayEnable) {
                this.messageQueueGrayEnable = messageQueueGrayEnable;
                return this;
            }

            /**
             * 泳道组名称。
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 泳道所属的MSE命名空间。
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * 是否记录请求详情（全链路灰度可观测）。
             */
            public Builder recordCanaryDetail(Boolean recordCanaryDetail) {
                this.recordCanaryDetail = recordCanaryDetail;
                return this;
            }

            /**
             * 所属地域。
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * 泳道对应的标签。
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            /**
             * 泳道所属的用户id。
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * 是否开启规则。
             */
            public Builder enableRules(Boolean enableRules) {
                this.enableRules = enableRules;
                return this;
            }

            /**
             * 泳道创建时间。
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 泳道更新时间。
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 泳道组Id。
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
