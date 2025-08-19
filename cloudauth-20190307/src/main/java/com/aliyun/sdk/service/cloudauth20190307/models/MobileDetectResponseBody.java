// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link MobileDetectResponseBody} extends {@link TeaModel}
 *
 * <p>MobileDetectResponseBody</p>
 */
public class MobileDetectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private MobileDetectResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MobileDetectResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(MobileDetectResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code: 200 for success, others for failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>969434DF-926B-4997-9881-4DE94E39F805</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public MobileDetectResponseBody build() {
            return new MobileDetectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MobileDetectResponseBody} extends {@link TeaModel}
     *
     * <p>MobileDetectResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Area")
        private String area;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("SubCode")
        private String subCode;

        private Items(Builder builder) {
            this.area = builder.area;
            this.bizCode = builder.bizCode;
            this.ispName = builder.ispName;
            this.mobile = builder.mobile;
            this.subCode = builder.subCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return area
         */
        public String getArea() {
            return this.area;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return subCode
         */
        public String getSubCode() {
            return this.subCode;
        }

        public static final class Builder {
            private String area; 
            private String bizCode; 
            private String ispName; 
            private String mobile; 
            private String subCode; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.area = model.area;
                this.bizCode = model.bizCode;
                this.ispName = model.ispName;
                this.mobile = model.mobile;
                this.subCode = model.subCode;
            } 

            /**
             * <p>Phone number&quot;s area (only for plaintext phone numbers)</p>
             * 
             * <strong>example:</strong>
             * <p>安徽-马**</p>
             */
            public Builder area(String area) {
                this.area = area;
                return this;
            }

            /**
             * <p>Verification result</p>
             * <ul>
             * <li>1: Available online </li>
             * <li>2: Not available online</li>
             * <li>3: No query result</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Operator name</p>
             * <ul>
             * <li>CMCC: China Mobile </li>
             * <li>CUCC: China Unicom </li>
             * <li>CTCC: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>Phone number</p>
             * 
             * <strong>example:</strong>
             * <p>131********</p>
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * <p>Verification details</p>
             * <ul>
             * <li>101: Available number</li>
             * <li>102: Empty number</li>
             * <li>103: Suspended </li>
             * <li>104: Silent number (inactive small number, new number, non-smartphone user within the last six months) </li>
             * <li>105: Risky number (long-term shutdown or no voice service activated and prone to complaints)</li>
             * <li>301: No record found</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder subCode(String subCode) {
                this.subCode = subCode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link MobileDetectResponseBody} extends {@link TeaModel}
     *
     * <p>MobileDetectResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeCount")
        private String chargeCount;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        private ResultObject(Builder builder) {
            this.chargeCount = builder.chargeCount;
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return chargeCount
         */
        public String getChargeCount() {
            return this.chargeCount;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private String chargeCount; 
            private java.util.List<Items> items; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.chargeCount = model.chargeCount;
                this.items = model.items;
            } 

            /**
             * <p>Billing count, the total billing count in one request</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder chargeCount(String chargeCount) {
                this.chargeCount = chargeCount;
                return this;
            }

            /**
             * <p>Verification results set</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
