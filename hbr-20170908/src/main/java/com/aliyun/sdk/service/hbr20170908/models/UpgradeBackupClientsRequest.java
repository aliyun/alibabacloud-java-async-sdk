// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeBackupClientsRequest</p>
 */
public class UpgradeBackupClientsRequest extends Request {
    @Query
    @NameInMap("ClientIds")
    private java.util.Map < String, ? > clientIds;

    @Query
    @NameInMap("InstanceIds")
    private java.util.Map < String, ? > instanceIds;

    private UpgradeBackupClientsRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeBackupClientsRequest create() {
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
     * @return instanceIds
     */
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<UpgradeBackupClientsRequest, Builder> {
        private java.util.Map < String, ? > clientIds; 
        private java.util.Map < String, ? > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeBackupClientsRequest response) {
            super(response);
            this.clientIds = response.clientIds;
            this.instanceIds = response.instanceIds;
        } 

        /**
         * ClientIds.
         */
        public Builder clientIds(java.util.Map < String, ? > clientIds) {
            this.putQueryParameter("ClientIds", clientIds);
            this.clientIds = clientIds;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.Map < String, ? > instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public UpgradeBackupClientsRequest build() {
            return new UpgradeBackupClientsRequest(this);
        } 

    } 

}
