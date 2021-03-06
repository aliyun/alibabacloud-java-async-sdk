// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SSEKMS} extends {@link TeaModel}
 *
 * <p>SSEKMS</p>
 */
public class SSEKMS extends TeaModel {
    @NameInMap("KeyId")
    private String keyId;

    private SSEKMS(Builder builder) {
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SSEKMS create() {
        return builder().build();
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    public static final class Builder {
        private String keyId; 

        /**
         * The CMK used in the SSE-KMS encryption method
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        public SSEKMS build() {
            return new SSEKMS(this);
        } 

    } 

}
