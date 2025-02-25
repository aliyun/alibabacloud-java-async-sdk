// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKeyDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateKeyDescriptionRequest</p>
 */
public class UpdateKeyDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    private UpdateKeyDescriptionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.keyId = builder.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKeyDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    public static final class Builder extends Request.Builder<UpdateKeyDescriptionRequest, Builder> {
        private String description; 
        private String keyId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKeyDescriptionRequest request) {
            super(request);
            this.description = request.description;
            this.keyId = request.keyId;
        } 

        /**
         * The description of the CMK. This description includes the purpose of the CMK, such as the types of data that you want to protect and applications that can use the CMK.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the CMK. The ID must be globally unique.
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        @Override
        public UpdateKeyDescriptionRequest build() {
            return new UpdateKeyDescriptionRequest(this);
        } 

    } 

}
