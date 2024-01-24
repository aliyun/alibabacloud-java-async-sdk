// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBusinessIdRequest} extends {@link RequestModel}
 *
 * <p>GetBusinessIdRequest</p>
 */
public class GetBusinessIdRequest extends Request {
    @Query
    @NameInMap("BusinessId")
    private String businessId;

    private GetBusinessIdRequest(Builder builder) {
        super(builder);
        this.businessId = builder.businessId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBusinessIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    public static final class Builder extends Request.Builder<GetBusinessIdRequest, Builder> {
        private String businessId; 

        private Builder() {
            super();
        } 

        private Builder(GetBusinessIdRequest request) {
            super(request);
            this.businessId = request.businessId;
        } 

        /**
         * BusinessId.
         */
        public Builder businessId(String businessId) {
            this.putQueryParameter("BusinessId", businessId);
            this.businessId = businessId;
            return this;
        }

        @Override
        public GetBusinessIdRequest build() {
            return new GetBusinessIdRequest(this);
        } 

    } 

}
