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
 * {@link DescribeAdminInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdminInfoResponseBody</p>
 */
public class DescribeAdminInfoResponseBody extends TeaModel {
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

    private DescribeAdminInfoResponseBody(Builder builder) {
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

    public static DescribeAdminInfoResponseBody create() {
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

        private Builder(DescribeAdminInfoResponseBody model) {
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

        public DescribeAdminInfoResponseBody build() {
            return new DescribeAdminInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdminInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdminInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessDate")
        private Long accessDate;

        @com.aliyun.core.annotation.NameInMap("AccessStatus")
        private String accessStatus;

        @com.aliyun.core.annotation.NameInMap("AuthorizedCount")
        private Long authorizedCount;

        @com.aliyun.core.annotation.NameInMap("AuthorizedDeviceCount")
        private Long authorizedDeviceCount;

        @com.aliyun.core.annotation.NameInMap("Contactor")
        private String contactor;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

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

        private Data(Builder builder) {
            this.accessDate = builder.accessDate;
            this.accessStatus = builder.accessStatus;
            this.authorizedCount = builder.authorizedCount;
            this.authorizedDeviceCount = builder.authorizedDeviceCount;
            this.contactor = builder.contactor;
            this.memberId = builder.memberId;
            this.name = builder.name;
            this.remark = builder.remark;
            this.status = builder.status;
            this.telephony = builder.telephony;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return authorizedCount
         */
        public Long getAuthorizedCount() {
            return this.authorizedCount;
        }

        /**
         * @return authorizedDeviceCount
         */
        public Long getAuthorizedDeviceCount() {
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
            private Long authorizedCount; 
            private Long authorizedDeviceCount; 
            private String contactor; 
            private String memberId; 
            private String name; 
            private String remark; 
            private String status; 
            private String telephony; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessDate = model.accessDate;
                this.accessStatus = model.accessStatus;
                this.authorizedCount = model.authorizedCount;
                this.authorizedDeviceCount = model.authorizedDeviceCount;
                this.contactor = model.contactor;
                this.memberId = model.memberId;
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
             * AuthorizedCount.
             */
            public Builder authorizedCount(Long authorizedCount) {
                this.authorizedCount = authorizedCount;
                return this;
            }

            /**
             * AuthorizedDeviceCount.
             */
            public Builder authorizedDeviceCount(Long authorizedDeviceCount) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
