// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterVbrAttachmentAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTransitRouterVbrAttachmentAttributeRequest</p>
 */
public class UpdateTransitRouterVbrAttachmentAttributeRequest extends Request {
    @Query
    @NameInMap("AutoPublishRouteEnabled")
    private Boolean autoPublishRouteEnabled;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TransitRouterAttachmentDescription")
    private String transitRouterAttachmentDescription;

    @Query
    @NameInMap("TransitRouterAttachmentId")
    @Validation(required = true)
    private String transitRouterAttachmentId;

    @Query
    @NameInMap("TransitRouterAttachmentName")
    private String transitRouterAttachmentName;

    private UpdateTransitRouterVbrAttachmentAttributeRequest(Builder builder) {
        super(builder);
        this.autoPublishRouteEnabled = builder.autoPublishRouteEnabled;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.transitRouterAttachmentDescription = builder.transitRouterAttachmentDescription;
        this.transitRouterAttachmentId = builder.transitRouterAttachmentId;
        this.transitRouterAttachmentName = builder.transitRouterAttachmentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTransitRouterVbrAttachmentAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPublishRouteEnabled
     */
    public Boolean getAutoPublishRouteEnabled() {
        return this.autoPublishRouteEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return transitRouterAttachmentDescription
     */
    public String getTransitRouterAttachmentDescription() {
        return this.transitRouterAttachmentDescription;
    }

    /**
     * @return transitRouterAttachmentId
     */
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    /**
     * @return transitRouterAttachmentName
     */
    public String getTransitRouterAttachmentName() {
        return this.transitRouterAttachmentName;
    }

    public static final class Builder extends Request.Builder<UpdateTransitRouterVbrAttachmentAttributeRequest, Builder> {
        private Boolean autoPublishRouteEnabled; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String transitRouterAttachmentDescription; 
        private String transitRouterAttachmentId; 
        private String transitRouterAttachmentName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTransitRouterVbrAttachmentAttributeRequest request) {
            super(request);
            this.autoPublishRouteEnabled = request.autoPublishRouteEnabled;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.transitRouterAttachmentDescription = request.transitRouterAttachmentDescription;
            this.transitRouterAttachmentId = request.transitRouterAttachmentId;
            this.transitRouterAttachmentName = request.transitRouterAttachmentName;
        } 

        /**
         * Specifies whether to allow the Enterprise Edition transit router to automatically advertise routes to the VBR. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder autoPublishRouteEnabled(Boolean autoPublishRouteEnabled) {
            this.putQueryParameter("AutoPublishRouteEnabled", autoPublishRouteEnabled);
            this.autoPublishRouteEnabled = autoPublishRouteEnabled;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. ClientToken can contain only ASCII characters.
         * 
         * >  If you do not set this parameter, **ClientToken** is set to the value of **RequestId**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform a precheck to check information such as the permissions and instance status. Valid values:
         * <p>
         * 
         * *   **false** (default): sends a request. If the request passes the precheck, the name and description of the VBR connection are modified.
         * *   **true**: sends a request for precheck only. The name and description of the VBR connection are not modified after the request passes the precheck. If you use this value, the system checks the required parameters and the request syntax. If the request fails to pass the precheck, an error message is returned. If the request passes the precheck, the `DryRunOperation` error code is returned.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The new description of the VBR connection.
         * <p>
         * 
         * The description must be 2 to 256 characters in length. The description must start with a letter but cannot start with `http://` or `https://`.
         */
        public Builder transitRouterAttachmentDescription(String transitRouterAttachmentDescription) {
            this.putQueryParameter("TransitRouterAttachmentDescription", transitRouterAttachmentDescription);
            this.transitRouterAttachmentDescription = transitRouterAttachmentDescription;
            return this;
        }

        /**
         * The ID of the VBR connection.
         */
        public Builder transitRouterAttachmentId(String transitRouterAttachmentId) {
            this.putQueryParameter("TransitRouterAttachmentId", transitRouterAttachmentId);
            this.transitRouterAttachmentId = transitRouterAttachmentId;
            return this;
        }

        /**
         * The new name of the VBR connection.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder transitRouterAttachmentName(String transitRouterAttachmentName) {
            this.putQueryParameter("TransitRouterAttachmentName", transitRouterAttachmentName);
            this.transitRouterAttachmentName = transitRouterAttachmentName;
            return this;
        }

        @Override
        public UpdateTransitRouterVbrAttachmentAttributeRequest build() {
            return new UpdateTransitRouterVbrAttachmentAttributeRequest(this);
        } 

    } 

}
