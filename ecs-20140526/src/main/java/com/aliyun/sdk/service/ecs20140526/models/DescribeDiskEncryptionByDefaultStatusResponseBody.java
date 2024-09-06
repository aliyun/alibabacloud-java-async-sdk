// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskEncryptionByDefaultStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskEncryptionByDefaultStatusResponseBody</p>
 */
public class DescribeDiskEncryptionByDefaultStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDiskEncryptionByDefaultStatusResponseBody(Builder builder) {
        this.encrypted = builder.encrypted;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskEncryptionByDefaultStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean encrypted; 
        private String requestId; 

        /**
         * Encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDiskEncryptionByDefaultStatusResponseBody build() {
            return new DescribeDiskEncryptionByDefaultStatusResponseBody(this);
        } 

    } 

}
