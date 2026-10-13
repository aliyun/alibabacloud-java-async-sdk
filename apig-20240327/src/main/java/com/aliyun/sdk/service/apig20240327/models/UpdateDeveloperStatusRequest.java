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
 * {@link UpdateDeveloperStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeveloperStatusRequest</p>
 */
public class UpdateDeveloperStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("developerId")
    private String developerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateDeveloperStatusRequest(Builder builder) {
        super(builder);
        this.developerId = builder.developerId;
        this.portalId = builder.portalId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeveloperStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return developerId
     */
    public String getDeveloperId() {
        return this.developerId;
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateDeveloperStatusRequest, Builder> {
        private String developerId; 
        private String portalId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeveloperStatusRequest request) {
            super(request);
            this.developerId = request.developerId;
            this.portalId = request.portalId;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the developer whose status you want to update. You can obtain this ID from the data.developerId field in the CreateDeveloper or GetDeveloper response, or from the developerId field of an item in the ListDevelopers response. This path parameter is the same as the one used in DeleteDeveloper to locate the developer.</p>
         * 
         * <strong>example:</strong>
         * <p>dev-xxxxxxxx</p>
         */
        public Builder developerId(String developerId) {
            this.putPathParameter("developerId", developerId);
            this.developerId = developerId;
            return this;
        }

        /**
         * <p>The ID of the portal to which the developer belongs, which is the primary ID of the portal resource. You can obtain this ID from the portalId field in the CreatePortal response or from the portalId field of an item in the ListPortals response.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putBodyParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        /**
         * <p>The target status of the developer. Valid values: PENDING, APPROVED, and REJECTED.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateDeveloperStatusRequest build() {
            return new UpdateDeveloperStatusRequest(this);
        } 

    } 

}
