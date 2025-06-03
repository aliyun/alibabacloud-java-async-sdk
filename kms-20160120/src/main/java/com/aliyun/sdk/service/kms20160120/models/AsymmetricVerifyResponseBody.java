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
 * {@link AsymmetricVerifyResponseBody} extends {@link TeaModel}
 *
 * <p>AsymmetricVerifyResponseBody</p>
 */
public class AsymmetricVerifyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Value")
    private Boolean value;

    private AsymmetricVerifyResponseBody(Builder builder) {
        this.keyId = builder.keyId;
        this.keyVersionId = builder.keyVersionId;
        this.requestId = builder.requestId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsymmetricVerifyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return value
     */
    public Boolean getValue() {
        return this.value;
    }

    public static final class Builder {
        private String keyId; 
        private String keyVersionId; 
        private String requestId; 
        private Boolean value; 

        private Builder() {
        } 

        private Builder(AsymmetricVerifyResponseBody model) {
            this.keyId = model.keyId;
            this.keyVersionId = model.keyVersionId;
            this.requestId = model.requestId;
            this.value = model.value;
        } 

        /**
         * <p>The ID of the CMK. The ID must be globally unique.</p>
         * <blockquote>
         * <p> If you set the KeyId parameter in the request to an alias, the ID of the CMK to which the alias is bound is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5c438b18-05be-40ad-b6c2-3be6752c****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The version ID of the CMK that is used to encrypt the plaintext.</p>
         * 
         * <strong>example:</strong>
         * <p>2ab1a983-7072-4bbc-a582-584b5bd8****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>475f1620-b9d3-4d35-b5c6-3fbdd941423d</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the signature passed the verification.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder value(Boolean value) {
            this.value = value;
            return this;
        }

        public AsymmetricVerifyResponseBody build() {
            return new AsymmetricVerifyResponseBody(this);
        } 

    } 

}
