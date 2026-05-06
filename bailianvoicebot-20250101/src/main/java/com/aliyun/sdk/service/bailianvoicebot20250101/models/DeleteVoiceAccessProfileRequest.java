// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianvoicebot20250101.models;

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
 * {@link DeleteVoiceAccessProfileRequest} extends {@link RequestModel}
 *
 * <p>DeleteVoiceAccessProfileRequest</p>
 */
public class DeleteVoiceAccessProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessProfileId")
    private String accessProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessUnitId")
    private String businessUnitId;

    private DeleteVoiceAccessProfileRequest(Builder builder) {
        super(builder);
        this.accessProfileId = builder.accessProfileId;
        this.businessUnitId = builder.businessUnitId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVoiceAccessProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessProfileId
     */
    public String getAccessProfileId() {
        return this.accessProfileId;
    }

    /**
     * @return businessUnitId
     */
    public String getBusinessUnitId() {
        return this.businessUnitId;
    }

    public static final class Builder extends Request.Builder<DeleteVoiceAccessProfileRequest, Builder> {
        private String accessProfileId; 
        private String businessUnitId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVoiceAccessProfileRequest request) {
            super(request);
            this.accessProfileId = request.accessProfileId;
            this.businessUnitId = request.businessUnitId;
        } 

        /**
         * AccessProfileId.
         */
        public Builder accessProfileId(String accessProfileId) {
            this.putBodyParameter("AccessProfileId", accessProfileId);
            this.accessProfileId = accessProfileId;
            return this;
        }

        /**
         * BusinessUnitId.
         */
        public Builder businessUnitId(String businessUnitId) {
            this.putBodyParameter("BusinessUnitId", businessUnitId);
            this.businessUnitId = businessUnitId;
            return this;
        }

        @Override
        public DeleteVoiceAccessProfileRequest build() {
            return new DeleteVoiceAccessProfileRequest(this);
        } 

    } 

}
