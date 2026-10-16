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
 * {@link GenerateMacResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateMacResponseBody</p>
 */
public class GenerateMacResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.NameInMap("Mac")
    private String mac;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateMacResponseBody(Builder builder) {
        this.algorithm = builder.algorithm;
        this.keyId = builder.keyId;
        this.mac = builder.mac;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMacResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return mac
     */
    public String getMac() {
        return this.mac;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String algorithm; 
        private String keyId; 
        private String mac; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateMacResponseBody model) {
            this.algorithm = model.algorithm;
            this.keyId = model.keyId;
            this.mac = model.mac;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The algorithm that is used to generate the message authentication code. Valid values vary based on the key specification:  </p>
         * <ul>
         * <li><p>HMAC_SM3</p>
         * </li>
         * <li><p>HMAC_SHA_224</p>
         * </li>
         * <li><p>HMAC_SHA_256</p>
         * </li>
         * <li><p>HMAC_SHA_384</p>
         * </li>
         * <li><p>HMAC_SHA_512</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HMAC_SHA_256</p>
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }

        /**
         * <p>The globally unique identifier of the customer master key (CMK).</p>
         * <blockquote>
         * <p>If the KeyId parameter in the request uses a CMK alias, the response returns the CMK identifier that corresponds to the alias.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>key-hzz630494463ejqjx****</p>
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The Base64-encoded message authenticate code.</p>
         * 
         * <strong>example:</strong>
         * <p>vz1Snp+jGJbgydCFRWVWxAwIMdyfKCSp+jnMWQ==</p>
         */
        public Builder mac(String mac) {
            this.mac = mac;
            return this;
        }

        /**
         * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4c8ae23f-3a42-6791-a4ba-1faa77831c28</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateMacResponseBody build() {
            return new GenerateMacResponseBody(this);
        } 

    } 

}
