// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskDefaultKMSKeyIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskDefaultKMSKeyIdResponseBody</p>
 */
public class DescribeDiskDefaultKMSKeyIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KMSKeyId")
    private String KMSKeyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskDefaultKMSKeyIdResponseBody(Builder builder) {
        this.KMSKeyId = builder.KMSKeyId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskDefaultKMSKeyIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return KMSKeyId
     */
    public String getKMSKeyId() {
        return this.KMSKeyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String KMSKeyId; 
        private String requestId; 

        /**
         * KMSKeyId.
         */
        public Builder KMSKeyId(String KMSKeyId) {
            this.KMSKeyId = KMSKeyId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskDefaultKMSKeyIdResponseBody build() {
            return new DescribeDiskDefaultKMSKeyIdResponseBody(this);
        } 

    } 

}
