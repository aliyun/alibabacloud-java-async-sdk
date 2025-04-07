// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DeleteAirEcsInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAirEcsInstanceRequest</p>
 */
public class DeleteAirEcsInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsInstanceId")
    private String ecsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UninstallClientSourceTypes")
    private java.util.List<String> uninstallClientSourceTypes;

    private DeleteAirEcsInstanceRequest(Builder builder) {
        super(builder);
        this.ecsInstanceId = builder.ecsInstanceId;
        this.uninstallClientSourceTypes = builder.uninstallClientSourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAirEcsInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsInstanceId
     */
    public String getEcsInstanceId() {
        return this.ecsInstanceId;
    }

    /**
     * @return uninstallClientSourceTypes
     */
    public java.util.List<String> getUninstallClientSourceTypes() {
        return this.uninstallClientSourceTypes;
    }

    public static final class Builder extends Request.Builder<DeleteAirEcsInstanceRequest, Builder> {
        private String ecsInstanceId; 
        private java.util.List<String> uninstallClientSourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAirEcsInstanceRequest request) {
            super(request);
            this.ecsInstanceId = request.ecsInstanceId;
            this.uninstallClientSourceTypes = request.uninstallClientSourceTypes;
        } 

        /**
         * <p>The ID of the Elastic Compute Service (ECS) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-uf6ir9y******hvisj</p>
         */
        public Builder ecsInstanceId(String ecsInstanceId) {
            this.putQueryParameter("EcsInstanceId", ecsInstanceId);
            this.ecsInstanceId = ecsInstanceId;
            return this;
        }

        /**
         * <p>The data sources for which the client needs to be uninstalled.</p>
         */
        public Builder uninstallClientSourceTypes(java.util.List<String> uninstallClientSourceTypes) {
            String uninstallClientSourceTypesShrink = shrink(uninstallClientSourceTypes, "UninstallClientSourceTypes", "json");
            this.putQueryParameter("UninstallClientSourceTypes", uninstallClientSourceTypesShrink);
            this.uninstallClientSourceTypes = uninstallClientSourceTypes;
            return this;
        }

        @Override
        public DeleteAirEcsInstanceRequest build() {
            return new DeleteAirEcsInstanceRequest(this);
        } 

    } 

}
