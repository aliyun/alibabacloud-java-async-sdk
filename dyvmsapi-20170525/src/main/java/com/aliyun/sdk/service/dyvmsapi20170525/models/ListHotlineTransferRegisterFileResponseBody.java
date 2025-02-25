// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListHotlineTransferRegisterFileResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineTransferRegisterFileResponseBody</p>
 */
public class ListHotlineTransferRegisterFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The response parameters.</p>
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

        public ListHotlineTransferRegisterFileResponseBody build() {
            return new ListHotlineTransferRegisterFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotlineTransferRegisterFileResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineTransferRegisterFileResponseBody</p>
     */
    public static class Values extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agree")
        private String agree;

        @com.aliyun.core.annotation.NameInMap("CorpName")
        private String corpName;

        @com.aliyun.core.annotation.NameInMap("HotlineNumber")
        private String hotlineNumber;

        @com.aliyun.core.annotation.NameInMap("MngOpIdentityCard")
        private String mngOpIdentityCard;

        @com.aliyun.core.annotation.NameInMap("MngOpMail")
        private String mngOpMail;

        @com.aliyun.core.annotation.NameInMap("MngOpMobile")
        private String mngOpMobile;

        @com.aliyun.core.annotation.NameInMap("MngOpName")
        private String mngOpName;

        @com.aliyun.core.annotation.NameInMap("QualificationId")
        private String qualificationId;

        @com.aliyun.core.annotation.NameInMap("ResUniqueCode")
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
             * <p>The authenticity of the commitment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder agree(String agree) {
                this.agree = agree;
                return this;
            }

            /**
             * <p>The enterprise name.</p>
             * 
             * <strong>example:</strong>
             * <p>A**</p>
             */
            public Builder corpName(String corpName) {
                this.corpName = corpName;
                return this;
            }

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
             * <p>The ID card number of the handler.</p>
             * 
             * <strong>example:</strong>
             * <p>5****************9</p>
             */
            public Builder mngOpIdentityCard(String mngOpIdentityCard) {
                this.mngOpIdentityCard = mngOpIdentityCard;
                return this;
            }

            /**
             * <p>The email address of the handler.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder mngOpMail(String mngOpMail) {
                this.mngOpMail = mngOpMail;
                return this;
            }

            /**
             * <p>The mobile phone number of the handler.</p>
             * 
             * <strong>example:</strong>
             * <p>150****0000</p>
             */
            public Builder mngOpMobile(String mngOpMobile) {
                this.mngOpMobile = mngOpMobile;
                return this;
            }

            /**
             * <p>The name of the handler.</p>
             * 
             * <strong>example:</strong>
             * <p>A***</p>
             */
            public Builder mngOpName(String mngOpName) {
                this.mngOpName = mngOpName;
                return this;
            }

            /**
             * <p>The qualification ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234****</p>
             */
            public Builder qualificationId(String qualificationId) {
                this.qualificationId = qualificationId;
                return this;
            }

            /**
             * <p>The unique code of the query operation.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListHotlineTransferRegisterFileResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineTransferRegisterFileResponseBody</p>
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
             * <p>10</p>
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
             * <p>The registration file.</p>
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
