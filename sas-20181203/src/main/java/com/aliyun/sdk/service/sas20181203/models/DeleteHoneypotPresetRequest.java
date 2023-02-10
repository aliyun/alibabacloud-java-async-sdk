// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotPresetRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotPresetRequest</p>
 */
public class DeleteHoneypotPresetRequest extends Request {
    @Query
    @NameInMap("HoneypotPresetId")
    @Validation(required = true)
    private String honeypotPresetId;

    private DeleteHoneypotPresetRequest(Builder builder) {
        super(builder);
        this.honeypotPresetId = builder.honeypotPresetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotPresetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return honeypotPresetId
     */
    public String getHoneypotPresetId() {
        return this.honeypotPresetId;
    }

    public static final class Builder extends Request.Builder<DeleteHoneypotPresetRequest, Builder> {
        private String honeypotPresetId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotPresetRequest request) {
            super(request);
            this.honeypotPresetId = request.honeypotPresetId;
        } 

        /**
         * The ID of the honeypot template.
         * <p>
         * 
         * >  You can call the [ListHoneypotPreset](~~ListHoneypotPreset~~) operation to query the IDs of honeypot templates.
         */
        public Builder honeypotPresetId(String honeypotPresetId) {
            this.putQueryParameter("HoneypotPresetId", honeypotPresetId);
            this.honeypotPresetId = honeypotPresetId;
            return this;
        }

        @Override
        public DeleteHoneypotPresetRequest build() {
            return new DeleteHoneypotPresetRequest(this);
        } 

    } 

}
