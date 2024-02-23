// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineTransferRegisterFileResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineTransferRegisterFileResponseBody</p>
 */
public class ListHotlineTransferRegisterFileResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListHotlineTransferRegisterFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineTransferRegisterFileResponseBody create() {
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
         * The response parameters.
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

        public ListHotlineTransferRegisterFileResponseBody build() {
            return new ListHotlineTransferRegisterFileResponseBody(this);
        } 

    } 

    public static class Values extends TeaModel {
        @NameInMap("Agree")
        private String agree;

        @NameInMap("CorpName")
        private String corpName;

        @NameInMap("HotlineNumber")
        private String hotlineNumber;

        @NameInMap("MngOpIdentityCard")
        private String mngOpIdentityCard;

        @NameInMap("MngOpMail")
        private String mngOpMail;

        @NameInMap("MngOpMobile")
        private String mngOpMobile;

        @NameInMap("MngOpName")
        private String mngOpName;

        @NameInMap("QualificationId")
        private String qualificationId;

        @NameInMap("ResUniqueCode")
        private Long resUniqueCode;

        private Values(Builder builder) {
            this.agree = builder.agree;
            this.corpName = builder.corpName;
            this.hotlineNumber = builder.hotlineNumber;
            this.mngOpIdentityCard = builder.mngOpIdentityCard;
            this.mngOpMail = builder.mngOpMail;
            this.mngOpMobile = builder.mngOpMobile;
            this.mngOpName = builder.mngOpName;
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
         * @return agree
         */
        public String getAgree() {
            return this.agree;
        }

        /**
         * @return corpName
         */
        public String getCorpName() {
            return this.corpName;
        }

        /**
         * @return hotlineNumber
         */
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        /**
         * @return mngOpIdentityCard
         */
        public String getMngOpIdentityCard() {
            return this.mngOpIdentityCard;
        }

        /**
         * @return mngOpMail
         */
        public String getMngOpMail() {
            return this.mngOpMail;
        }

        /**
         * @return mngOpMobile
         */
        public String getMngOpMobile() {
            return this.mngOpMobile;
        }

        /**
         * @return mngOpName
         */
        public String getMngOpName() {
            return this.mngOpName;
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
        public Long getResUniqueCode() {
            return this.resUniqueCode;
        }

        public static final class Builder {
            private String agree; 
            private String corpName; 
            private String hotlineNumber; 
            private String mngOpIdentityCard; 
            private String mngOpMail; 
            private String mngOpMobile; 
            private String mngOpName; 
            private String qualificationId; 
            private Long resUniqueCode; 

            /**
             * The authenticity of the commitment.
             */
            public Builder agree(String agree) {
                this.agree = agree;
                return this;
            }

            /**
             * The enterprise name.
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

            /**
             * The China 400 number.
             */
            public Builder hotlineNumber(String hotlineNumber) {
                this.hotlineNumber = hotlineNumber;
                return this;
            }

            /**
             * The ID card number of the handler.
             */
            public Builder mngOpIdentityCard(String mngOpIdentityCard) {
                this.mngOpIdentityCard = mngOpIdentityCard;
                return this;
            }

            /**
             * The email address of the handler.
             */
            public Builder mngOpMail(String mngOpMail) {
                this.mngOpMail = mngOpMail;
                return this;
            }

            /**
             * The mobile phone number of the handler.
             */
            public Builder mngOpMobile(String mngOpMobile) {
                this.mngOpMobile = mngOpMobile;
                return this;
            }

            /**
             * The name of the handler.
             */
            public Builder mngOpName(String mngOpName) {
                this.mngOpName = mngOpName;
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
             * The unique code of the query operation.
             */
            public Builder resUniqueCode(Long resUniqueCode) {
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
             * The registration file.
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
