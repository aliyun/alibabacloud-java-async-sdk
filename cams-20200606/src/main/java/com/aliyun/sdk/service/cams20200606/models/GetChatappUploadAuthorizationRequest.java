// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappUploadAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>GetChatappUploadAuthorizationRequest</p>
 */
public class GetChatappUploadAuthorizationRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    private GetChatappUploadAuthorizationRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappUploadAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public static final class Builder extends Request.Builder<GetChatappUploadAuthorizationRequest, Builder> {
        private String custSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetChatappUploadAuthorizationRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
        } 

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        @Override
        public GetChatappUploadAuthorizationRequest build() {
            return new GetChatappUploadAuthorizationRequest(this);
        } 

    } 

}
