// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link RemovePublicIpsFromEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>RemovePublicIpsFromEpnInstanceRequest</p>
 */
public class RemovePublicIpsFromEpnInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String EPNInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceInfos")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the EPN instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>epn-xxxx</p>
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * <p>The information about the public IP addresses that you want to delete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;PublicIpAddress&quot;:&quot;2.230.XX.XX&quot;},{&quot;PublicIpAddress&quot;:&quot;2.230.XX.XX&quot;}]</p>
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
