// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link ImportKeyPairResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKeyPairResponseBody</p>
 */
public class ImportKeyPairResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportKeyPairResponseBody(Builder builder) {
        this.keyPairName = builder.keyPairName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeyPairResponseBody create() {
        return builder().build();
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String keyPairName; 
        private String requestId; 

        /**
         * <p>The name of the key pair. The name must be 2 to 64 characters in length and can contain letters, digits, colons (:), underscores (_), and hyphens (-). The name must start with a letter and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>KeyPairName</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportKeyPairResponseBody build() {
            return new ImportKeyPairResponseBody(this);
        } 

    } 

}
