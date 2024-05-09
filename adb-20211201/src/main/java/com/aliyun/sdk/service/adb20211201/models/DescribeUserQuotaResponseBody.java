// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserQuotaResponseBody</p>
 */
public class DescribeUserQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticACU")
    private String elasticACU;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ReserverdCompteACU")
    private String reserverdCompteACU;

    @com.aliyun.core.annotation.NameInMap("ReserverdStorageACU")
    private String reserverdStorageACU;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupCount")
    private String resourceGroupCount;

    private DescribeUserQuotaResponseBody(Builder builder) {
        this.elasticACU = builder.elasticACU;
        this.requestId = builder.requestId;
        this.reserverdCompteACU = builder.reserverdCompteACU;
        this.reserverdStorageACU = builder.reserverdStorageACU;
        this.resourceGroupCount = builder.resourceGroupCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticACU
     */
    public String getElasticACU() {
        return this.elasticACU;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return reserverdCompteACU
     */
    public String getReserverdCompteACU() {
        return this.reserverdCompteACU;
    }

    /**
     * @return reserverdStorageACU
     */
    public String getReserverdStorageACU() {
        return this.reserverdStorageACU;
    }

    /**
     * @return resourceGroupCount
     */
    public String getResourceGroupCount() {
        return this.resourceGroupCount;
    }

    public static final class Builder {
        private String elasticACU; 
        private String requestId; 
        private String reserverdCompteACU; 
        private String reserverdStorageACU; 
        private String resourceGroupCount; 

        /**
         * The available elastic AnalyticDB compute units (ACUs).
         */
        public Builder elasticACU(String elasticACU) {
            this.elasticACU = elasticACU;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The available reserved computing resources.
         */
        public Builder reserverdCompteACU(String reserverdCompteACU) {
            this.reserverdCompteACU = reserverdCompteACU;
            return this;
        }

        /**
         * The available reserved storage resources.
         */
        public Builder reserverdStorageACU(String reserverdStorageACU) {
            this.reserverdStorageACU = reserverdStorageACU;
            return this;
        }

        /**
         * The number of available resource groups.
         */
        public Builder resourceGroupCount(String resourceGroupCount) {
            this.resourceGroupCount = resourceGroupCount;
            return this;
        }

        public DescribeUserQuotaResponseBody build() {
            return new DescribeUserQuotaResponseBody(this);
        } 

    } 

}
