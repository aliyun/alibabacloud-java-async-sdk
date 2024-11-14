// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetChatappUploadAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>GetChatappUploadAuthorizationRequest</p>
 */
public class GetChatappUploadAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The space ID of the RAM user within the independent software vendor (ISV) account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493</p>
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
