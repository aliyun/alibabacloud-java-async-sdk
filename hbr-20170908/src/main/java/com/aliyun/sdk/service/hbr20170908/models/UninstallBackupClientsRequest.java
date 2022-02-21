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
    @NameInMap("InstanceIds")
    private java.util.Map < String, ? > instanceIds;

    private UninstallBackupClientsRequest(Builder builder) {
        super(builder);
        this.clientIds = builder.clientIds;
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
     * @return instanceIds
     */
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<UninstallBackupClientsRequest, Builder> {
        private java.util.Map < String, ? > clientIds; 
        private java.util.Map < String, ? > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(UninstallBackupClientsRequest response) {
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
        public UninstallBackupClientsRequest build() {
            return new UninstallBackupClientsRequest(this);
        } 

    } 

}
