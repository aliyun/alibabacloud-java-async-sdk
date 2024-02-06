// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePublicIpsFromEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemovePublicIpsFromEpnInstanceRequest</p>
 */
public class RemovePublicIpsFromEpnInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    private String EPNInstanceId;

    @Query
    @NameInMap("InstanceInfos")
    @Validation(required = true)
    private String instanceInfos;

    private RemovePublicIpsFromEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.instanceInfos = builder.instanceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePublicIpsFromEpnInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    /**
     * @return instanceInfos
     */
    public String getInstanceInfos() {
        return this.instanceInfos;
    }

    public static final class Builder extends Request.Builder<RemovePublicIpsFromEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String instanceInfos; 

        private Builder() {
            super();
        } 

        private Builder(RemovePublicIpsFromEpnInstanceRequest request) {
            super(request);
            this.EPNInstanceId = request.EPNInstanceId;
            this.instanceInfos = request.instanceInfos;
        } 

        /**
         * The ID of the EPN instance.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * The information about the public IP addresses that you want to delete.
         */
        public Builder instanceInfos(String instanceInfos) {
            this.putQueryParameter("InstanceInfos", instanceInfos);
            this.instanceInfos = instanceInfos;
            return this;
        }

        @Override
        public RemovePublicIpsFromEpnInstanceRequest build() {
            return new RemovePublicIpsFromEpnInstanceRequest(this);
        } 

    } 

}
