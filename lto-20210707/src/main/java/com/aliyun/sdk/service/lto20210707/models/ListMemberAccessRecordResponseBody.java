// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListMemberAccessRecordResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemberAccessRecordResponseBody</p>
 */
public class ListMemberAccessRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListMemberAccessRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemberAccessRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListMemberAccessRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public ListMemberAccessRecordResponseBody build() {
            return new ListMemberAccessRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemberAccessRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemberAccessRecordResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessDate")
        private Long accessDate;

        @com.aliyun.core.annotation.NameInMap("AccessStatus")
        private String accessStatus;

        @com.aliyun.core.annotation.NameInMap("AdminName")
        private String adminName;

        @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
        private Long authorizedCount;

        @com.aliyun.core.annotation.NameInMap("AuthorizedDeviceCount")
        private Integer authorizedDeviceCount;

        @com.aliyun.core.annotation.NameInMap("Contactor")
        private String contactor;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberResponseDate")
        private Long memberResponseDate;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Telephony")
        private String telephony;

        @com.aliyun.core.annotation.NameInMap("Uid")
        private String uid;

        private PageData(Builder builder) {
            this.accessDate = builder.accessDate;
            this.accessStatus = builder.accessStatus;
            this.adminName = builder.adminName;
            this.authorizedCount = builder.authorizedCount;
            this.authorizedDeviceCount = builder.authorizedDeviceCount;
            this.contactor = builder.contactor;
            this.memberId = builder.memberId;
            this.memberResponseDate = builder.memberResponseDate;
            this.name = builder.name;
            this.remark = builder.remark;
            this.status = builder.status;
            this.telephony = builder.telephony;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return accessDate
         */
        public Long getAccessDate() {
            return this.accessDate;
        }

        /**
         * @return accessStatus
         */
        public String getAccessStatus() {
            return this.accessStatus;
        }

        /**
         * @return adminName
         */
        public String getAdminName() {
            return this.adminName;
        }

        /**
         * @return authorizedCount
         */
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        /**
         * @return authorizedDeviceCount
         */
        public Integer getAuthorizedDeviceCount() {
            return this.authorizedDeviceCount;
        }

        /**
         * @return contactor
         */
        public String getContactor() {
            return this.contactor;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberResponseDate
         */
        public Long getMemberResponseDate() {
            return this.memberResponseDate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return telephony
         */
        public String getTelephony() {
            return this.telephony;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Long accessDate; 
            private String accessStatus; 
            private String adminName; 
            private Long authorizedCount; 
            private Integer authorizedDeviceCount; 
            private String contactor; 
            private String memberId; 
            private Long memberResponseDate; 
            private String name; 
            private String remark; 
            private String status; 
            private String telephony; 
            private String uid; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.accessDate = model.accessDate;
                this.accessStatus = model.accessStatus;
                this.adminName = model.adminName;
                this.authorizedCount = model.authorizedCount;
                this.authorizedDeviceCount = model.authorizedDeviceCount;
                this.contactor = model.contactor;
                this.memberId = model.memberId;
                this.memberResponseDate = model.memberResponseDate;
                this.name = model.name;
                this.remark = model.remark;
                this.status = model.status;
                this.telephony = model.telephony;
                this.uid = model.uid;
            } 

            /**
             * AccessDate.
             */
            public Builder accessDate(Long accessDate) {
                this.accessDate = accessDate;
                return this;
            }

            /**
             * AccessStatus.
             */
            public Builder accessStatus(String accessStatus) {
                this.accessStatus = accessStatus;
                return this;
            }

            /**
             * AdminName.
             */
            public Builder adminName(String adminName) {
                this.adminName = adminName;
                return this;
            }

            /**
             * AuthorizedCount.
             */
            public Builder authorizedCount(Long authorizedCount) {
                this.authorizedCount = authorizedCount;
                return this;
            }

            /**
             * AuthorizedDeviceCount.
             */
            public Builder authorizedDeviceCount(Integer authorizedDeviceCount) {
                this.authorizedDeviceCount = authorizedDeviceCount;
                return this;
            }

            /**
             * Contactor.
             */
            public Builder contactor(String contactor) {
                this.contactor = contactor;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberResponseDate.
             */
            public Builder memberResponseDate(Long memberResponseDate) {
                this.memberResponseDate = memberResponseDate;
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
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Telephony.
             */
            public Builder telephony(String telephony) {
                this.telephony = telephony;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMemberAccessRecordResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemberAccessRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Num")
        private Integer num;

        @com.aliyun.core.annotation.NameInMap("PageData")
        private java.util.List<PageData> pageData;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.num = builder.num;
            this.pageData = builder.pageData;
            this.size = builder.size;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return num
         */
        public Integer getNum() {
            return this.num;
        }

        /**
         * @return pageData
         */
        public java.util.List<PageData> getPageData() {
            return this.pageData;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer num; 
            private java.util.List<PageData> pageData; 
            private Integer size; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.num = model.num;
                this.pageData = model.pageData;
                this.size = model.size;
                this.total = model.total;
            } 

            /**
             * Num.
             */
            public Builder num(Integer num) {
                this.num = num;
                return this;
            }

            /**
             * PageData.
             */
            public Builder pageData(java.util.List<PageData> pageData) {
                this.pageData = pageData;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
