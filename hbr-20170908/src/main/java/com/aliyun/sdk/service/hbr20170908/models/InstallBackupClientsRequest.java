// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallBackupClientsRequest} extends {@link RequestModel}
 *
 * <p>InstallBackupClientsRequest</p>
 */
public class InstallBackupClientsRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private java.util.Map < String, ? > instanceIds;

    private InstallBackupClientsRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallBackupClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.Map < String, ? > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<InstallBackupClientsRequest, Builder> {
        private java.util.Map < String, ? > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallBackupClientsRequest response) {
            super(response);
            this.instanceIds = response.instanceIds;
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
        public InstallBackupClientsRequest build() {
            return new InstallBackupClientsRequest(this);
        } 

    } 

}
