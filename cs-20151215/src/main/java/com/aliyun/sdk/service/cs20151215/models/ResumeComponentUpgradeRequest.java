// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumeComponentUpgradeRequest} extends {@link RequestModel}
 *
 * <p>ResumeComponentUpgradeRequest</p>
 */
public class ResumeComponentUpgradeRequest extends Request {
    @Path
    @NameInMap("clusterid")
    @Validation(required = true)
    private String clusterid;

    @Path
    @NameInMap("componentid")
    @Validation(required = true)
    private String componentid;

    private ResumeComponentUpgradeRequest(Builder builder) {
        super(builder);
        this.clusterid = builder.clusterid;
        this.componentid = builder.componentid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeComponentUpgradeRequest create() {
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

    public static final class Builder extends Request.Builder<ResumeComponentUpgradeRequest, Builder> {
        private String clusterid; 
        private String componentid; 

        private Builder() {
            super();
        } 

        private Builder(ResumeComponentUpgradeRequest request) {
            super(request);
            this.clusterid = request.clusterid;
            this.componentid = request.componentid;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterid(String clusterid) {
            this.putPathParameter("clusterid", clusterid);
            this.clusterid = clusterid;
            return this;
        }

        /**
         * The ID of the component.
         */
        public Builder componentid(String componentid) {
            this.putPathParameter("componentid", componentid);
            this.componentid = componentid;
            return this;
        }

        @Override
        public ResumeComponentUpgradeRequest build() {
            return new ResumeComponentUpgradeRequest(this);
        } 

    } 

}
