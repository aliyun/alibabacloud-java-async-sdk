// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessagesResponseBody</p>
 */
public class ListMessagesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    private ListMessagesResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessagesResponseBody create() {
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
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Integer errorCode; 
        private String errorMessage; 
        private String requestId; 

        /**
         * 返回数据。
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * 错误码。
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息。
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMessagesResponseBody build() {
            return new ListMessagesResponseBody(this);
        } 

    } 

    public static class Messages extends TeaModel {
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Id")
        private String id;

        @NameInMap("OutId")
        private String outId;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("ScheduleId")
        private String scheduleId;

        @NameInMap("Signature")
        private String signature;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateParams")
        private String templateParams;

        @NameInMap("TemplateType")
        private Integer templateType;

        private Messages(Builder builder) {
            this.errorCode = builder.errorCode;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.outId = builder.outId;
            this.phoneNumber = builder.phoneNumber;
            this.scheduleId = builder.scheduleId;
            this.signature = builder.signature;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.templateParams = builder.templateParams;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return scheduleId
         */
        public String getScheduleId() {
            return this.scheduleId;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateParams
         */
        public String getTemplateParams() {
            return this.templateParams;
        }

        /**
         * @return templateType
         */
        public Integer getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String errorCode; 
            private String groupId; 
            private String id; 
            private String outId; 
            private String phoneNumber; 
            private String scheduleId; 
            private String signature; 
            private Integer status; 
            private String templateCode; 
            private String templateParams; 
            private Integer templateType; 

            /**
             * 短信错误码。
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * 关联人群Id，未关联则为空。
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * 短信序列号。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 外部拓展字段。
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * 手机号码。
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * 关联触达计划Id，未关联则为空。
             */
            public Builder scheduleId(String scheduleId) {
                this.scheduleId = scheduleId;
                return this;
            }

            /**
             * 签名名称。
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * 短信发送状态。
             * <p>
             * - 0 : 发送中。
             * - 1 : 发送成功。
             * - 2 : 发送失败。
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * 模板号。
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * 模板参数。
             */
            public Builder templateParams(String templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * 模板类型。
             * <p>
             * - 0 : 验证码。
             * - 1 : 短信通知。
             * - 2 : 推广短信。
             */
            public Builder templateType(Integer templateType) {
                this.templateType = templateType;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Messages")
        private java.util.List < Messages> messages;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.messages = builder.messages;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return messages
         */
        public java.util.List < Messages> getMessages() {
            return this.messages;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Messages> messages; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * 短信列表。
             */
            public Builder messages(java.util.List < Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * 分页数，从1开始，默认为1。
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * 分页大小，默认为10。
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * 短信数量。
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
