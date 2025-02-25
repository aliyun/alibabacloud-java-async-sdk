// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTagsRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTagsRequest</p>
 */
public class ListResourceTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private ListResourceTagsRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTagsRequest create() {
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

    public static final class Builder extends Request.Builder<ListResourceTagsRequest, Builder> {
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTagsRequest request) {
            super(request);
            this.keyId = request.keyId;
        } 

        /**
         * The globally unique ID of the CMK.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public ListResourceTagsRequest build() {
            return new ListResourceTagsRequest(this);
        } 

    } 

}
