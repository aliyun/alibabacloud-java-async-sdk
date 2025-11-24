// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link UpdateGuestClusterConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateGuestClusterConfigRequest</p>
 */
public class UpdateGuestClusterConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GuestClusterId")
    private String guestClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SMCEnabled")
    private Boolean SMCEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private UpdateGuestClusterConfigRequest(Builder builder) {
        super(builder);
        this.guestClusterId = builder.guestClusterId;
        this.SMCEnabled = builder.SMCEnabled;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGuestClusterConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return guestClusterId
     */
    public String getGuestClusterId() {
        return this.guestClusterId;
    }

    /**
     * @return SMCEnabled
     */
    public Boolean getSMCEnabled() {
        return this.SMCEnabled;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpdateGuestClusterConfigRequest, Builder> {
        private String guestClusterId; 
        private Boolean SMCEnabled; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGuestClusterConfigRequest request) {
            super(request);
            this.guestClusterId = request.guestClusterId;
            this.SMCEnabled = request.SMCEnabled;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * GuestClusterId.
         */
        public Builder guestClusterId(String guestClusterId) {
            this.putBodyParameter("GuestClusterId", guestClusterId);
            this.guestClusterId = guestClusterId;
            return this;
        }

        /**
         * SMCEnabled.
         */
        public Builder SMCEnabled(Boolean SMCEnabled) {
            this.putBodyParameter("SMCEnabled", SMCEnabled);
            this.SMCEnabled = SMCEnabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb8963379255149cb98c8686f274x****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpdateGuestClusterConfigRequest build() {
            return new UpdateGuestClusterConfigRequest(this);
        } 

    } 

}
