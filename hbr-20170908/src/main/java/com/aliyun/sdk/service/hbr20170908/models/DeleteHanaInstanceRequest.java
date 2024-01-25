// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHanaInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteHanaInstanceRequest</p>
 */
public class DeleteHanaInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Sid")
    @Validation(required = true)
    private String sid;

    @Query
    @NameInMap("VaultId")
    @Validation(required = true)
    private String vaultId;

    private DeleteHanaInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sid = builder.sid;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHanaInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<DeleteHanaInstanceRequest, Builder> {
        private String clusterId; 
        private String resourceGroupId; 
        private String sid; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHanaInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceGroupId = request.resourceGroupId;
            this.sid = request.sid;
            this.vaultId = request.vaultId;
        } 

        /**
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The SID of the SAP HANA database. You must specify a valid SID. The SID must be three characters in length and start with a letter. For more information, see [How to find sid user and instance number of HANA db?](https://answers.sap.com/questions/555192/how-to-find-sid-user-and-instance-number-of-hana-d.html?)
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public DeleteHanaInstanceRequest build() {
            return new DeleteHanaInstanceRequest(this);
        } 

    } 

}
