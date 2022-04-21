// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceQuotaResponseBody</p>
 */
public class DescribeResourceQuotaResponseBody extends TeaModel {
    @NameInMap("CloudStorageDataSizeQuota")
    private Double cloudStorageDataSizeQuota;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StaticWebDataSizeQuota")
    private Double staticWebDataSizeQuota;

    private DescribeResourceQuotaResponseBody(Builder builder) {
        this.cloudStorageDataSizeQuota = builder.cloudStorageDataSizeQuota;
        this.requestId = builder.requestId;
        this.staticWebDataSizeQuota = builder.staticWebDataSizeQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudStorageDataSizeQuota
     */
    public Double getCloudStorageDataSizeQuota() {
        return this.cloudStorageDataSizeQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return staticWebDataSizeQuota
     */
    public Double getStaticWebDataSizeQuota() {
        return this.staticWebDataSizeQuota;
    }

    public static final class Builder {
        private Double cloudStorageDataSizeQuota; 
        private String requestId; 
        private Double staticWebDataSizeQuota; 

        /**
         * CloudStorageDataSizeQuota.
         */
        public Builder cloudStorageDataSizeQuota(Double cloudStorageDataSizeQuota) {
            this.cloudStorageDataSizeQuota = cloudStorageDataSizeQuota;
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
         * StaticWebDataSizeQuota.
         */
        public Builder staticWebDataSizeQuota(Double staticWebDataSizeQuota) {
            this.staticWebDataSizeQuota = staticWebDataSizeQuota;
            return this;
        }

        public DescribeResourceQuotaResponseBody build() {
            return new DescribeResourceQuotaResponseBody(this);
        } 

    } 

}
