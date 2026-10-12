// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeletePortalRequest} extends {@link RequestModel}
 *
 * <p>DeletePortalRequest</p>
 */
public class DeletePortalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    private DeletePortalRequest(Builder builder) {
        super(builder);
        this.portalId = builder.portalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePortalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    public static final class Builder extends Request.Builder<DeletePortalRequest, Builder> {
        private String portalId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePortalRequest request) {
            super(request);
            this.portalId = request.portalId;
        } 

        /**
         * <p>The ID of the portal to delete. You can obtain the portal ID from the portalId field in the CreatePortal response or from the portalId field of an item in the ListPortals response. This parameter uses the same /himarket/v1/portals/{portalId} path as the GetPortal, UpdatePortal, and DeletePortal operations to locate the portal.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putPathParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        @Override
        public DeletePortalRequest build() {
            return new DeletePortalRequest(this);
        } 

    } 

}
