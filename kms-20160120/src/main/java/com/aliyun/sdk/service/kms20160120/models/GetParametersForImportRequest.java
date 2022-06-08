// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParametersForImportRequest} extends {@link RequestModel}
 *
 * <p>GetParametersForImportRequest</p>
 */
public class GetParametersForImportRequest extends Request {
    @Query
    @NameInMap("KeyId")
    @Validation(required = true)
    private String keyId;

    @Query
    @NameInMap("WrappingAlgorithm")
    @Validation(required = true)
    private String wrappingAlgorithm;

    @Query
    @NameInMap("WrappingKeySpec")
    @Validation(required = true)
    private String wrappingKeySpec;

    private GetParametersForImportRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.wrappingAlgorithm = builder.wrappingAlgorithm;
        this.wrappingKeySpec = builder.wrappingKeySpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParametersForImportRequest create() {
        return builder().build();
    }

    @Override
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
     * @return wrappingAlgorithm
     */
    public String getWrappingAlgorithm() {
        return this.wrappingAlgorithm;
    }

    /**
     * @return wrappingKeySpec
     */
    public String getWrappingKeySpec() {
        return this.wrappingKeySpec;
    }

    public static final class Builder extends Request.Builder<GetParametersForImportRequest, Builder> {
        private String keyId; 
        private String wrappingAlgorithm; 
        private String wrappingKeySpec; 

        private Builder() {
            super();
        } 

        private Builder(GetParametersForImportRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.wrappingAlgorithm = request.wrappingAlgorithm;
            this.wrappingKeySpec = request.wrappingKeySpec;
        } 

        /**
         * KeyId.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * WrappingAlgorithm.
         */
        public Builder wrappingAlgorithm(String wrappingAlgorithm) {
            this.putQueryParameter("WrappingAlgorithm", wrappingAlgorithm);
            this.wrappingAlgorithm = wrappingAlgorithm;
            return this;
        }

        /**
         * WrappingKeySpec.
         */
        public Builder wrappingKeySpec(String wrappingKeySpec) {
            this.putQueryParameter("WrappingKeySpec", wrappingKeySpec);
            this.wrappingKeySpec = wrappingKeySpec;
            return this;
        }

        @Override
        public GetParametersForImportRequest build() {
            return new GetParametersForImportRequest(this);
        } 

    } 

}
