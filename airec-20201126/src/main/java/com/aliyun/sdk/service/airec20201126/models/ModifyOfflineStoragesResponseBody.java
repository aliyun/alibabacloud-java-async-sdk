// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyOfflineStoragesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyOfflineStoragesResponseBody</p>
 */
public class ModifyOfflineStoragesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private byte[] requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Boolean result;

    private ModifyOfflineStoragesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfflineStoragesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public byte[] getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private byte[] requestId; 
        private Boolean result; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7F176EE8-51DA-4B4D-8FFE-04448CD7A171</p>
         */
        public Builder requestId(byte[] requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public ModifyOfflineStoragesResponseBody build() {
            return new ModifyOfflineStoragesResponseBody(this);
        } 

    } 

}
