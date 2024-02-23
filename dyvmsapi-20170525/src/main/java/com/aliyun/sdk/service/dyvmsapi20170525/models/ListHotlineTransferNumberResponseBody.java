// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineTransferNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineTransferNumberResponseBody</p>
 */
public class ListHotlineTransferNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListHotlineTransferNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineTransferNumberResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   For more information about other response codes, see [API error codes](~~112502~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about the registered phone number.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHotlineTransferNumberResponseBody build() {
            return new ListHotlineTransferNumberResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("HotlineNumber")
        private String hotlineNumber;

        @NameInMap("IdentityCard")
        private String identityCard;

        @NameInMap("NumberOwnerName")
        private String numberOwnerName;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("QualificationId")
        private String qualificationId;

        @NameInMap("ResUniqueCode")
        private String resUniqueCode;

        private Values(Builder builder) {
            this.hotlineNumber = builder.hotlineNumber;
            this.identityCard = builder.identityCard;
            this.numberOwnerName = builder.numberOwnerName;
            this.phoneNumber = builder.phoneNumber;
            this.qualificationId = builder.qualificationId;
            this.resUniqueCode = builder.resUniqueCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Values create() {
            return builder().build();
        }

        /**
         * @return hotlineNumber
         */
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        /**
         * @return identityCard
         */
        public String getIdentityCard() {
            return this.identityCard;
        }

        /**
         * @return numberOwnerName
         */
        public String getNumberOwnerName() {
            return this.numberOwnerName;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return qualificationId
         */
        public String getQualificationId() {
            return this.qualificationId;
        }

        /**
         * @return resUniqueCode
         */
        public String getResUniqueCode() {
            return this.resUniqueCode;
        }

        public static final class Builder {
            private String hotlineNumber; 
            private String identityCard; 
            private String numberOwnerName; 
            private String phoneNumber; 
            private String qualificationId; 
            private String resUniqueCode; 

            /**
             * The China 400 number.
             */
            public Builder hotlineNumber(String hotlineNumber) {
                this.hotlineNumber = hotlineNumber;
                return this;
            }

            /**
             * The ID card number of the number owner.
             */
            public Builder identityCard(String identityCard) {
                this.identityCard = identityCard;
                return this;
            }

            /**
             * The real name of the number owner or the company name.
             */
            public Builder numberOwnerName(String numberOwnerName) {
                this.numberOwnerName = numberOwnerName;
                return this;
            }

            /**
             * The registered phone number.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The qualification ID.
             */
            public Builder qualificationId(String qualificationId) {
                this.qualificationId = qualificationId;
                return this;
            }

            /**
             * The resource code.
             */
            public Builder resUniqueCode(String resUniqueCode) {
                this.resUniqueCode = resUniqueCode;
                return this;
            }

            public Values build() {
                return new Values(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Long total;

        @NameInMap("Values")
        private java.util.List < Values> values;

        private Data(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return values
         */
        public java.util.List < Values> getValues() {
            return this.values;
        }

        public static final class Builder {
            private Integer pageNo; 
            private Integer pageSize; 
            private Long total; 
            private java.util.List < Values> values; 

            /**
             * The page number.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * The phone numbers.
             */
            public Builder values(java.util.List < Values> values) {
                this.values = values;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
