// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link DescribeColdStorageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColdStorageResponseBody</p>
 */
public class DescribeColdStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ColdStorageSize")
    private String coldStorageSize;

    @com.aliyun.core.annotation.NameInMap("ColdStorageType")
    private String coldStorageType;

    @com.aliyun.core.annotation.NameInMap("ColdStorageUseAmount")
    private String coldStorageUseAmount;

    @com.aliyun.core.annotation.NameInMap("ColdStorageUsePercent")
    private String coldStorageUsePercent;

    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private String openStatus;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeColdStorageResponseBody(Builder builder) {
        this.clusterId = builder.clusterId;
        this.coldStorageSize = builder.coldStorageSize;
        this.coldStorageType = builder.coldStorageType;
        this.coldStorageUseAmount = builder.coldStorageUseAmount;
        this.coldStorageUsePercent = builder.coldStorageUsePercent;
        this.openStatus = builder.openStatus;
        this.payType = builder.payType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColdStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coldStorageSize
     */
    public String getColdStorageSize() {
        return this.coldStorageSize;
    }

    /**
     * @return coldStorageType
     */
    public String getColdStorageType() {
        return this.coldStorageType;
    }

    /**
     * @return coldStorageUseAmount
     */
    public String getColdStorageUseAmount() {
        return this.coldStorageUseAmount;
    }

    /**
     * @return coldStorageUsePercent
     */
    public String getColdStorageUsePercent() {
        return this.coldStorageUsePercent;
    }

    /**
     * @return openStatus
     */
    public String getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String clusterId; 
        private String coldStorageSize; 
        private String coldStorageType; 
        private String coldStorageUseAmount; 
        private String coldStorageUsePercent; 
        private String openStatus; 
        private String payType; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeColdStorageResponseBody model) {
            this.clusterId = model.clusterId;
            this.coldStorageSize = model.coldStorageSize;
            this.coldStorageType = model.coldStorageType;
            this.coldStorageUseAmount = model.coldStorageUseAmount;
            this.coldStorageUsePercent = model.coldStorageUsePercent;
            this.openStatus = model.openStatus;
            this.payType = model.payType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1uoihlf82e8****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The total storage capacity of cold storage, in GB.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>OpenStatus</strong> is <strong>open</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder coldStorageSize(String coldStorageSize) {
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * <p>The cold storage type. For newly created BDS instances, the cold storage type is <strong>BdsColdStorage</strong>. This parameter is not returned for other instances by default.</p>
         * 
         * <strong>example:</strong>
         * <p>BdsColdStorage</p>
         */
        public Builder coldStorageType(String coldStorageType) {
            this.coldStorageType = coldStorageType;
            return this;
        }

        /**
         * <p>The amount of cold storage space used, in GB.</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>OpenStatus</strong> is <strong>open</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        public Builder coldStorageUseAmount(String coldStorageUseAmount) {
            this.coldStorageUseAmount = coldStorageUseAmount;
            return this;
        }

        /**
         * <p>The usage of the cold storage space, in percentage (%).</p>
         * <blockquote>
         * <p>This parameter is returned only when <strong>OpenStatus</strong> is <strong>open</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20.00</p>
         */
        public Builder coldStorageUsePercent(String coldStorageUsePercent) {
            this.coldStorageUsePercent = coldStorageUsePercent;
            return this;
        }

        /**
         * <p>The enabling status of cold storage. Valid values:</p>
         * <ul>
         * <li><strong>open</strong>: Cold storage is enabled.</li>
         * <li><strong>close</strong>: Cold storage is not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder openStatus(String openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DCB9479E-F05F-4D1C-AFB7-C639B87764B7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeColdStorageResponseBody build() {
            return new DescribeColdStorageResponseBody(this);
        } 

    } 

}
