// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetTicketResponseBody</p>
 */
public class GetTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NotifyTimeRange")
    private String notifyTimeRange;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TicketId")
    private String ticketId;

    @com.aliyun.core.annotation.NameInMap("TicketStatus")
    private String ticketStatus;

    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private GetTicketResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.email = builder.email;
        this.list = builder.list;
        this.message = builder.message;
        this.notifyTimeRange = builder.notifyTimeRange;
        this.phone = builder.phone;
        this.productCode = builder.productCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.ticketId = builder.ticketId;
        this.ticketStatus = builder.ticketStatus;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
        return this.list;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return notifyTimeRange
     */
    public String getNotifyTimeRange() {
        return this.notifyTimeRange;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
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
     * @return ticketId
     */
    public String getTicketId() {
        return this.ticketId;
    }

    /**
     * @return ticketStatus
     */
    public String getTicketStatus() {
        return this.ticketStatus;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private String createTime; 
        private String email; 
        private java.util.List<List> list; 
        private String message; 
        private String notifyTimeRange; 
        private String phone; 
        private String productCode; 
        private String requestId; 
        private Boolean success; 
        private String ticketId; 
        private String ticketStatus; 
        private String title; 

        private Builder() {
        } 

        private Builder(GetTicketResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.createTime = model.createTime;
            this.email = model.email;
            this.list = model.list;
            this.message = model.message;
            this.notifyTimeRange = model.notifyTimeRange;
            this.phone = model.phone;
            this.productCode = model.productCode;
            this.requestId = model.requestId;
            this.success = model.success;
            this.ticketId = model.ticketId;
            this.ticketStatus = model.ticketStatus;
            this.title = model.title;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * List.
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NotifyTimeRange.
         */
        public Builder notifyTimeRange(String notifyTimeRange) {
            this.notifyTimeRange = notifyTimeRange;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TicketId.
         */
        public Builder ticketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        /**
         * TicketStatus.
         */
        public Builder ticketStatus(String ticketStatus) {
            this.ticketStatus = ticketStatus;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public GetTicketResponseBody build() {
            return new GetTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetTicketResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachList")
        private java.util.List<String> attachList;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("FromOfficial")
        private Boolean fromOfficial;

        @com.aliyun.core.annotation.NameInMap("GmtCreated")
        private String gmtCreated;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private String noteId;

        @com.aliyun.core.annotation.NameInMap("Special")
        private Boolean special;

        private List(Builder builder) {
            this.attachList = builder.attachList;
            this.content = builder.content;
            this.fromOfficial = builder.fromOfficial;
            this.gmtCreated = builder.gmtCreated;
            this.noteId = builder.noteId;
            this.special = builder.special;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return attachList
         */
        public java.util.List<String> getAttachList() {
            return this.attachList;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fromOfficial
         */
        public Boolean getFromOfficial() {
            return this.fromOfficial;
        }

        /**
         * @return gmtCreated
         */
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        /**
         * @return noteId
         */
        public String getNoteId() {
            return this.noteId;
        }

        /**
         * @return special
         */
        public Boolean getSpecial() {
            return this.special;
        }

        public static final class Builder {
            private java.util.List<String> attachList; 
            private String content; 
            private Boolean fromOfficial; 
            private String gmtCreated; 
            private String noteId; 
            private Boolean special; 

            private Builder() {
            } 

            private Builder(List model) {
                this.attachList = model.attachList;
                this.content = model.content;
                this.fromOfficial = model.fromOfficial;
                this.gmtCreated = model.gmtCreated;
                this.noteId = model.noteId;
                this.special = model.special;
            } 

            /**
             * AttachList.
             */
            public Builder attachList(java.util.List<String> attachList) {
                this.attachList = attachList;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * FromOfficial.
             */
            public Builder fromOfficial(Boolean fromOfficial) {
                this.fromOfficial = fromOfficial;
                return this;
            }

            /**
             * GmtCreated.
             */
            public Builder gmtCreated(String gmtCreated) {
                this.gmtCreated = gmtCreated;
                return this;
            }

            /**
             * NoteId.
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * Special.
             */
            public Builder special(Boolean special) {
                this.special = special;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
