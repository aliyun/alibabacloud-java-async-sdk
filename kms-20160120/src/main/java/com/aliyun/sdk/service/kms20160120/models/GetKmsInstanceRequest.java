// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetKmsInstanceRequest</p>
 */
public class GetKmsInstanceRequest extends Request {
    @Query
    @NameInMap("KmsInstanceId")
    @Validation(required = true)
    private String kmsInstanceId;

    private GetKmsInstanceRequest(Builder builder) {
        super(builder);
        this.kmsInstanceId = builder.kmsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKmsInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kmsInstanceId
     */
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public static final class Builder extends Request.Builder<GetKmsInstanceRequest, Builder> {
        private String kmsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetKmsInstanceRequest request) {
            super(request);
            this.kmsInstanceId = request.kmsInstanceId;
        } 

        /**
         * The ID of the KMS instance that you want to query.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        @Override
        public GetKmsInstanceRequest build() {
            return new GetKmsInstanceRequest(this);
        } 

    } 

}
