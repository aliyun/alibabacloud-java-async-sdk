// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PauseComponentUpgradeRequest} extends {@link RequestModel}
 *
 * <p>PauseComponentUpgradeRequest</p>
 */
public class PauseComponentUpgradeRequest extends Request {
    @Path
    @NameInMap("clusterid")
    @Validation(required = true)
    private String clusterid;

    @Path
    @NameInMap("componentid")
    @Validation(required = true)
    private String componentid;

    private PauseComponentUpgradeRequest(Builder builder) {
        super(builder);
        this.clusterid = builder.clusterid;
        this.componentid = builder.componentid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PauseComponentUpgradeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterid
     */
    public String getClusterid() {
        return this.clusterid;
    }

    /**
     * @return componentid
     */
    public String getComponentid() {
        return this.componentid;
    }

    public static final class Builder extends Request.Builder<PauseComponentUpgradeRequest, Builder> {
        private String clusterid; 
        private String componentid; 

        private Builder() {
            super();
        } 

        private Builder(PauseComponentUpgradeRequest request) {
            super(request);
            this.clusterid = request.clusterid;
            this.componentid = request.componentid;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * The component ID.
         */
        public Builder componentid(String componentid) {
            this.putPathParameter("componentid", componentid);
            this.componentid = componentid;
            return this;
        }

        @Override
        public PauseComponentUpgradeRequest build() {
            return new PauseComponentUpgradeRequest(this);
        } 

    } 

}
