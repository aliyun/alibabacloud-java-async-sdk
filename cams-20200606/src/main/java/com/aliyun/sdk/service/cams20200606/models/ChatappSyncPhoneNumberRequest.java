// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChatappSyncPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>ChatappSyncPhoneNumberRequest</p>
 */
public class ChatappSyncPhoneNumberRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    private ChatappSyncPhoneNumberRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatappSyncPhoneNumberRequest create() {
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

    public static final class Builder extends Request.Builder<ChatappSyncPhoneNumberRequest, Builder> {
        private String custSpaceId; 

        private Builder() {
            super();
        } 

        private Builder(ChatappSyncPhoneNumberRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
        } 

        /**
         * The space ID of the user under the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        @Override
        public ChatappSyncPhoneNumberRequest build() {
            return new ChatappSyncPhoneNumberRequest(this);
        } 

    } 

}
