// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InventoryEncryption} extends {@link TeaModel}
 *
 * <p>InventoryEncryption</p>
 */
public class InventoryEncryption extends TeaModel {
    @NameInMap("SSE-KMS")
    private SSEKMS SSEKMS;

    @NameInMap("SSE-OSS")
    private SSEOSS SSEOSS;

    private InventoryEncryption(Builder builder) {
        this.SSEKMS = builder.SSEKMS;
        this.SSEOSS = builder.SSEOSS;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InventoryEncryption create() {
        return builder().build();
    }

    /**
     * @return SSEKMS
     */
    public SSEKMS getSSEKMS() {
        return this.SSEKMS;
    }

    /**
     * @return SSEOSS
     */
    public SSEOSS getSSEOSS() {
        return this.SSEOSS;
    }

    public static final class Builder {
        private SSEKMS SSEKMS; 
        private SSEOSS SSEOSS; 

        /**
         * The container that stores the CMK used in the SSE-KMS encryption method
         */
        public Builder SSEKMS(SSEKMS SSEKMS) {
            this.SSEKMS = SSEKMS;
            return this;
        }

        /**
         * The container that stores the information about the SSE-OSS encryption method
         */
        public Builder SSEOSS(SSEOSS SSEOSS) {
            this.SSEOSS = SSEOSS;
            return this;
        }

        public InventoryEncryption build() {
            return new InventoryEncryption(this);
        } 

    } 

}
