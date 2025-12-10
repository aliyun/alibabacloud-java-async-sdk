// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetAlgorithmDefRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmDefRequest</p>
 */
public class GetAlgorithmDefRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgoVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String algoVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Provider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String provider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GetAlgorithmDefRequest(Builder builder) {
        super(builder);
        this.algoVersion = builder.algoVersion;
        this.identifier = builder.identifier;
        this.provider = builder.provider;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmDefRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algoVersion
     */
    public String getAlgoVersion() {
        return this.algoVersion;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    public static final class Builder extends Request.Builder<GetAlgorithmDefRequest, Builder> {
        private String algoVersion; 
        private String identifier; 
        private String provider; 
        private String signature; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmDefRequest request) {
            super(request);
            this.algoVersion = request.algoVersion;
            this.identifier = request.identifier;
            this.provider = request.provider;
            this.signature = request.signature;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder algoVersion(String algoVersion) {
            this.putQueryParameter("AlgoVersion", algoVersion);
            this.algoVersion = algoVersion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logisticregression_binary</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.putQueryParameter("Provider", provider);
            this.provider = provider;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.putQueryParameter("Signature", signature);
            this.signature = signature;
            return this;
        }

        @Override
        public GetAlgorithmDefRequest build() {
            return new GetAlgorithmDefRequest(this);
        } 

    } 

}
