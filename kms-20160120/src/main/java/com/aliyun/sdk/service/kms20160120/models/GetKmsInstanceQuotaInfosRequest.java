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
 * {@link GetKmsInstanceQuotaInfosRequest} extends {@link RequestModel}
 *
 * <p>GetKmsInstanceQuotaInfosRequest</p>
 */
public class GetKmsInstanceQuotaInfosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KmsInstanceId")
    private String kmsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    private GetKmsInstanceQuotaInfosRequest(Builder builder) {
        super(builder);
        this.kmsInstanceId = builder.kmsInstanceId;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKmsInstanceQuotaInfosRequest create() {
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

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetKmsInstanceQuotaInfosRequest, Builder> {
        private String kmsInstanceId; 
        private String resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetKmsInstanceQuotaInfosRequest request) {
            super(request);
            this.kmsInstanceId = request.kmsInstanceId;
            this.resourceType = request.resourceType;
        } 

        /**
         * KmsInstanceId.
         */
        public Builder kmsInstanceId(String kmsInstanceId) {
            this.putQueryParameter("KmsInstanceId", kmsInstanceId);
            this.kmsInstanceId = kmsInstanceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetKmsInstanceQuotaInfosRequest build() {
            return new GetKmsInstanceQuotaInfosRequest(this);
        } 

    } 

}
