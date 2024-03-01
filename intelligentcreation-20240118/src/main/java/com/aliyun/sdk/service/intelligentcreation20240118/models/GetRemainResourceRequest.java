// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRemainResourceRequest} extends {@link RequestModel}
 *
 * <p>GetRemainResourceRequest</p>
 */
public class GetRemainResourceRequest extends Request {
    @Query
    @NameInMap("accountId")
    @Validation(required = true)
    private String accountId;

    @Query
    @NameInMap("resourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("subAccountId")
    private String subAccountId;

    private GetRemainResourceRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.resourceType = builder.resourceType;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRemainResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder extends Request.Builder<GetRemainResourceRequest, Builder> {
        private String accountId; 
        private String resourceType; 
        private String subAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetRemainResourceRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.resourceType = request.resourceType;
            this.subAccountId = request.subAccountId;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * resourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("resourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * subAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.putQueryParameter("subAccountId", subAccountId);
            this.subAccountId = subAccountId;
            return this;
        }

        @Override
        public GetRemainResourceRequest build() {
            return new GetRemainResourceRequest(this);
        } 

    } 

}
