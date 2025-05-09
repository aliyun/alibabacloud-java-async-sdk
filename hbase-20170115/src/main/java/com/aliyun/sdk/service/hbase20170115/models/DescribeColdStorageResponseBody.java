// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

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
        private String coldStorageUsePercent; 
        private String openStatus; 
        private String payType; 
        private String requestId; 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ColdStorageSize.
         */
        public Builder coldStorageSize(String coldStorageSize) {
            this.coldStorageSize = coldStorageSize;
            return this;
        }

        /**
         * ColdStorageUsePercent.
         */
        public Builder coldStorageUsePercent(String coldStorageUsePercent) {
            this.coldStorageUsePercent = coldStorageUsePercent;
            return this;
        }

        /**
         * OpenStatus.
         */
        public Builder openStatus(String openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * RequestId.
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
