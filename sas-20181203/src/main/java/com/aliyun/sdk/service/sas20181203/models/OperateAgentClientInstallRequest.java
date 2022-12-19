// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperateAgentClientInstallRequest} extends {@link RequestModel}
 *
 * <p>OperateAgentClientInstallRequest</p>
 */
public class OperateAgentClientInstallRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Uuids")
    private String uuids;

    private OperateAgentClientInstallRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.lang = builder.lang;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateAgentClientInstallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<OperateAgentClientInstallRequest, Builder> {
        private String instanceIds; 
        private String lang; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(OperateAgentClientInstallRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.lang = request.lang;
            this.uuids = request.uuids;
        } 

        /**
         * The IDs of the servers on which you want to install the Security Center agent. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The UUIDs of the servers on which you want to install the Security Center agent. Separate multiple UUIDs with commas (,).
         * <p>
         * 
         * >  You must specify at least one of the **InstanceIds** and **Uuids** parameters before you can call this operation.
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public OperateAgentClientInstallRequest build() {
            return new OperateAgentClientInstallRequest(this);
        } 

    } 

}
