// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateIdentifyCredentialRequest} extends {@link RequestModel}
 *
 * <p>CreateIdentifyCredentialRequest</p>
 */
public class CreateIdentifyCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifyCredential")
    private IdentifyCredential identifyCredential;

    private CreateIdentifyCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identifyCredential = builder.identifyCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIdentifyCredentialRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return identifyCredential
     */
    public IdentifyCredential getIdentifyCredential() {
        return this.identifyCredential;
    }

    public static final class Builder extends Request.Builder<CreateIdentifyCredentialRequest, Builder> {
        private String regionId; 
        private IdentifyCredential identifyCredential; 

        private Builder() {
            super();
        } 

        private Builder(CreateIdentifyCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identifyCredential = request.identifyCredential;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * IdentifyCredential.
         */
        public Builder identifyCredential(IdentifyCredential identifyCredential) {
            String identifyCredentialShrink = shrink(identifyCredential, "IdentifyCredential", "json");
            this.putBodyParameter("IdentifyCredential", identifyCredentialShrink);
            this.identifyCredential = identifyCredential;
            return this;
        }

        @Override
        public CreateIdentifyCredentialRequest build() {
            return new CreateIdentifyCredentialRequest(this);
        } 

    } 

}
