// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>UninstallBackupClientsRequest</p>
 */
public class UninstallBackupClientsRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    private java.util.Map < String, ? > clientIds;

    @Query
    @NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @Query
    @NameInMap("CrossAccountType")
    private String crossAccountType;

    @Query
    @NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @Query
    @NameInMap("InstanceIds")
    private java.util.Map < String, ? > instanceIds;

    private UninstallBackupClientsRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallBackupClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIds
     */
    public java.util.Map < String, ? > getClientIds() {
        return this.clientIds;
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return instanceIds
     */
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<UninstallBackupClientsRequest, Builder> {
        private java.util.Map < String, ? > clientIds; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private java.util.Map < String, ? > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(UninstallBackupClientsRequest request) {
            super(request);
            this.clientIds = request.clientIds;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The ID of the backup client. The sum of the number of backup client IDs and the number of ECS instance IDs cannot exceed 20. Otherwise, an error occurs.
         */
        public Builder clientIds(java.util.Map < String, ? > clientIds) {
            String clientIdsShrink = shrink(clientIds, "ClientIds", "json");
            this.putQueryParameter("ClientIds", clientIdsShrink);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * The name of the RAM role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * Specifies whether data is backed up and restored within the same Alibaba Cloud account or across Alibaba Cloud accounts. Valid values:
         * <p>
         * 
         * *   SELF_ACCOUNT: Data is backed up and restored within the same Alibaba Cloud account.
         * *   CROSS_ACCOUNT: Data is backed up and restored across Alibaba Cloud accounts.
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up and restore data across Alibaba Cloud accounts.
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * The ID of the ECS instance. You can specify up to 20 IDs.
         */
        public Builder instanceIds(java.util.Map < String, ? > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public UninstallBackupClientsRequest build() {
            return new UninstallBackupClientsRequest(this);
        } 

    } 

}
