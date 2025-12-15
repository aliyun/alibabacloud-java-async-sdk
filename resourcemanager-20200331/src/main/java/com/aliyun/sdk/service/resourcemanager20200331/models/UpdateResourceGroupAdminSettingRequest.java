// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link UpdateResourceGroupAdminSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateResourceGroupAdminSettingRequest</p>
 */
public class UpdateResourceGroupAdminSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatorAsAdmin")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean creatorAsAdmin;

    private UpdateResourceGroupAdminSettingRequest(Builder builder) {
        super(builder);
        this.creatorAsAdmin = builder.creatorAsAdmin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateResourceGroupAdminSettingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return creatorAsAdmin
     */
    public Boolean getCreatorAsAdmin() {
        return this.creatorAsAdmin;
    }

    public static final class Builder extends Request.Builder<UpdateResourceGroupAdminSettingRequest, Builder> {
        private Boolean creatorAsAdmin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateResourceGroupAdminSettingRequest request) {
            super(request);
            this.creatorAsAdmin = request.creatorAsAdmin;
        } 

        /**
         * <p>Specifies whether to enable the Use Creator as Administrator feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder creatorAsAdmin(Boolean creatorAsAdmin) {
            this.putQueryParameter("CreatorAsAdmin", creatorAsAdmin);
            this.creatorAsAdmin = creatorAsAdmin;
            return this;
        }

        @Override
        public UpdateResourceGroupAdminSettingRequest build() {
            return new UpdateResourceGroupAdminSettingRequest(this);
        } 

    } 

}
