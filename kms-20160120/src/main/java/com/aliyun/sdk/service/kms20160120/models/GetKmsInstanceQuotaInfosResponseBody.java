// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link GetKmsInstanceQuotaInfosResponseBody} extends {@link TeaModel}
 *
 * <p>GetKmsInstanceQuotaInfosResponseBody</p>
 */
public class GetKmsInstanceQuotaInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    private String kmsInstanceId;

    @com.aliyun.core.annotation.NameInMap("KmsInstanceQuotaInfos")
    private java.util.List<KmsInstanceQuotaInfos> kmsInstanceQuotaInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetKmsInstanceQuotaInfosResponseBody(Builder builder) {
        this.kmsInstanceId = builder.kmsInstanceId;
        this.kmsInstanceQuotaInfos = builder.kmsInstanceQuotaInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKmsInstanceQuotaInfosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    /**
     * @return kmsInstanceQuotaInfos
     */
    public java.util.List<KmsInstanceQuotaInfos> getKmsInstanceQuotaInfos() {
        return this.kmsInstanceQuotaInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String kmsInstanceId; 
        private java.util.List<KmsInstanceQuotaInfos> kmsInstanceQuotaInfos; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetKmsInstanceQuotaInfosResponseBody model) {
            this.kmsInstanceId = model.kmsInstanceId;
            this.kmsInstanceQuotaInfos = model.kmsInstanceQuotaInfos;
            this.requestId = model.requestId;
        } 

        /**
         * KmsInstanceId.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * KmsInstanceQuotaInfos.
         */
        public Builder kmsInstanceQuotaInfos(java.util.List<KmsInstanceQuotaInfos> kmsInstanceQuotaInfos) {
            this.kmsInstanceQuotaInfos = kmsInstanceQuotaInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKmsInstanceQuotaInfosResponseBody build() {
            return new GetKmsInstanceQuotaInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKmsInstanceQuotaInfosResponseBody} extends {@link TeaModel}
     *
     * <p>GetKmsInstanceQuotaInfosResponseBody</p>
     */
    public static class KmsInstanceQuotaInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceQuota")
        private Long resourceQuota;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("UsedQuantity")
        private Long usedQuantity;

        private KmsInstanceQuotaInfos(Builder builder) {
            this.resourceQuota = builder.resourceQuota;
            this.resourceType = builder.resourceType;
            this.usedQuantity = builder.usedQuantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KmsInstanceQuotaInfos create() {
            return builder().build();
        }

        /**
         * @return resourceQuota
         */
        public Long getResourceQuota() {
            return this.resourceQuota;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return usedQuantity
         */
        public Long getUsedQuantity() {
            return this.usedQuantity;
        }

        public static final class Builder {
            private Long resourceQuota; 
            private String resourceType; 
            private Long usedQuantity; 

            private Builder() {
            } 

            private Builder(KmsInstanceQuotaInfos model) {
                this.resourceQuota = model.resourceQuota;
                this.resourceType = model.resourceType;
                this.usedQuantity = model.usedQuantity;
            } 

            /**
             * ResourceQuota.
             */
            public Builder resourceQuota(Long resourceQuota) {
                this.resourceQuota = resourceQuota;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * UsedQuantity.
             */
            public Builder usedQuantity(Long usedQuantity) {
                this.usedQuantity = usedQuantity;
                return this;
            }

            public KmsInstanceQuotaInfos build() {
                return new KmsInstanceQuotaInfos(this);
            } 

        } 

    }
}
