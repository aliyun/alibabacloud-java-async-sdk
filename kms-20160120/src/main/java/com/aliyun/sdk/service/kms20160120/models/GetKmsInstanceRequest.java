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
 * {@link GetKmsInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetKmsInstanceRequest</p>
 */
public class GetKmsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the KMS instance to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kst-bjj62f5ba3dnpb6v8****</p>
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
