// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHotlineTransferNumberResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineTransferNumberResponseBody</p>
 */
public class ListHotlineTransferNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the registered phone number.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6086693B-2250-17CE-A41F-06259AB6DB1B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHotlineTransferNumberResponseBody build() {
            return new ListHotlineTransferNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotlineTransferNumberResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineTransferNumberResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HotlineNumber")
        private String hotlineNumber;

        @com.aliyun.core.annotation.NameInMap("IdentityCard")
        private String identityCard;

        @com.aliyun.core.annotation.NameInMap("NumberOwnerName")
        private String numberOwnerName;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("QualificationId")
        private String qualificationId;

        @com.aliyun.core.annotation.NameInMap("ResUniqueCode")
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
             * <p>The China 400 number.</p>
             * 
             * <strong>example:</strong>
             * <p>400****</p>
             */
            public Builder hotlineNumber(String hotlineNumber) {
                this.hotlineNumber = hotlineNumber;
                return this;
            }

            /**
             * <p>The ID card number of the number owner.</p>
             * 
             * <strong>example:</strong>
             * <p>500***4119</p>
             */
            public Builder identityCard(String identityCard) {
                this.identityCard = identityCard;
                return this;
            }

            /**
             * <p>The real name of the number owner or the company name.</p>
             * 
             * <strong>example:</strong>
             * <p>A***</p>
             */
            public Builder numberOwnerName(String numberOwnerName) {
                this.numberOwnerName = numberOwnerName;
                return this;
            }

            /**
             * <p>The registered phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>1580000****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The qualification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100***</p>
             */
            public Builder qualificationId(String qualificationId) {
                this.qualificationId = qualificationId;
                return this;
            }

            /**
             * <p>The resource code.</p>
             * 
             * <strong>example:</strong>
             * <p>1***</p>
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
    /**
     * 
     * {@link ListHotlineTransferNumberResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineTransferNumberResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("Values")
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
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * <p>The phone numbers.</p>
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
