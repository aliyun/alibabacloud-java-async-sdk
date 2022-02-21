// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20180713.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDVOrderResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDVOrderResultResponseBody</p>
 */
public class DescribeDVOrderResultResponseBody extends TeaModel {
    @NameInMap("Certificate")
    private String certificate;

    @NameInMap("CheckName")
    private String checkName;

    @NameInMap("CheckType")
    private String checkType;

    @NameInMap("CheckValue")
    private String checkValue;

    @NameInMap("OrderStatus")
    private String orderStatus;

    @NameInMap("PrivateKey")
    private String privateKey;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDVOrderResultResponseBody(Builder builder) {
        this.certificate = builder.certificate;
        this.checkName = builder.checkName;
        this.checkType = builder.checkType;
        this.checkValue = builder.checkValue;
        this.orderStatus = builder.orderStatus;
        this.privateKey = builder.privateKey;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDVOrderResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return checkName
     */
    public String getCheckName() {
        return this.checkName;
    }

    /**
     * @return checkType
     */
    public String getCheckType() {
        return this.checkType;
    }

    /**
     * @return checkValue
     */
    public String getCheckValue() {
        return this.checkValue;
    }

    /**
     * @return orderStatus
     */
    public String getOrderStatus() {
        return this.orderStatus;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String certificate; 
        private String checkName; 
        private String checkType; 
        private String checkValue; 
        private String orderStatus; 
        private String privateKey; 
        private String requestId; 

        /**
         * Certificate.
         */
        public Builder certificate(String certificate) {
            this.certificate = certificate;
            return this;
        }

        /**
         * CheckName.
         */
        public Builder checkName(String checkName) {
            this.checkName = checkName;
            return this;
        }

        /**
         * CheckType.
         */
        public Builder checkType(String checkType) {
            this.checkType = checkType;
            return this;
        }

        /**
         * CheckValue.
         */
        public Builder checkValue(String checkValue) {
            this.checkValue = checkValue;
            return this;
        }

        /**
         * OrderStatus.
         */
        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        /**
         * PrivateKey.
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDVOrderResultResponseBody build() {
            return new DescribeDVOrderResultResponseBody(this);
        } 

    } 

}
