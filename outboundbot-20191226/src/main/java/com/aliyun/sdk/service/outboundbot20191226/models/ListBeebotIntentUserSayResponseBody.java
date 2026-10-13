// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListBeebotIntentUserSayResponseBody} extends {@link TeaModel}
 *
 * <p>ListBeebotIntentUserSayResponseBody</p>
 */
public class ListBeebotIntentUserSayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BeebotRequestId")
    private String beebotRequestId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("UserSays")
    private java.util.List<UserSays> userSays;

    private ListBeebotIntentUserSayResponseBody(Builder builder) {
        this.beebotRequestId = builder.beebotRequestId;
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.userSays = builder.userSays;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBeebotIntentUserSayResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beebotRequestId
     */
    public String getBeebotRequestId() {
        return this.beebotRequestId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return userSays
     */
    public java.util.List<UserSays> getUserSays() {
        return this.userSays;
    }

    public static final class Builder {
        private String beebotRequestId; 
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List<UserSays> userSays; 

        private Builder() {
        } 

        private Builder(ListBeebotIntentUserSayResponseBody model) {
            this.beebotRequestId = model.beebotRequestId;
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.userSays = model.userSays;
        } 

        /**
         * <p>The internal request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7BBFCDF-59B0-1ADA-BCA3-4B77F642DDFB</p>
         */
        public Builder beebotRequestId(String beebotRequestId) {
            this.beebotRequestId = beebotRequestId;
            return this;
        }

        /**
         * <p>The API status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The API message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0956D5DA-0978-5DC9-94B0-C68527DA7475</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The list of user utterances.</p>
         */
        public Builder userSays(java.util.List<UserSays> userSays) {
            this.userSays = userSays;
            return this;
        }

        public ListBeebotIntentUserSayResponseBody build() {
            return new ListBeebotIntentUserSayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBeebotIntentUserSayResponseBody} extends {@link TeaModel}
     *
     * <p>ListBeebotIntentUserSayResponseBody</p>
     */
    public static class UserSays extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("UserSayId")
        private String userSayId;

        private UserSays(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.intentId = builder.intentId;
            this.modifyTime = builder.modifyTime;
            this.userSayId = builder.userSayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSays create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return userSayId
         */
        public String getUserSayId() {
            return this.userSayId;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private Long intentId; 
            private String modifyTime; 
            private String userSayId; 

            private Builder() {
            } 

            private Builder(UserSays model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.intentId = model.intentId;
                this.modifyTime = model.modifyTime;
                this.userSayId = model.userSayId;
            } 

            /**
             * <p>The utterance content.</p>
             * 
             * <strong>example:</strong>
             * <p>Do you know xxxx?</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time. The format is YYYY-MM-DD HH:mm:ss.+ZZZZ, where +ZZZZ indicates the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-21 14:16:05.+0800</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10717802</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>The modification time. The format is YYYY-MM-DD HH:mm:ss.+ZZZZ, where +ZZZZ indicates the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-21 14:16:05.+0800</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The utterance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>17448458</p>
             */
            public Builder userSayId(String userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            public UserSays build() {
                return new UserSays(this);
            } 

        } 

    }
}
