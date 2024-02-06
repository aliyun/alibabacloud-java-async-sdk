// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JoinPublicIpsToEpnInstanceRequest} extends {@link RequestModel}
 *
 * <p>JoinPublicIpsToEpnInstanceRequest</p>
 */
public class JoinPublicIpsToEpnInstanceRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    @Validation(required = true)
    private String EPNInstanceId;

    @Query
    @NameInMap("InstanceInfos")
    @Validation(required = true)
    private String instanceInfos;

    private JoinPublicIpsToEpnInstanceRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.instanceInfos = builder.instanceInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JoinPublicIpsToEpnInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<JoinPublicIpsToEpnInstanceRequest, Builder> {
        private String EPNInstanceId; 
        private String instanceInfos; 

        private Builder() {
            super();
        } 

        private Builder(JoinPublicIpsToEpnInstanceRequest request) {
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
         * The information about the public IP address that you want to add to the EPN instance.
         */
        public Builder instanceInfos(String instanceInfos) {
            this.putQueryParameter("InstanceInfos", instanceInfos);
            this.instanceInfos = instanceInfos;
            return this;
        }

        @Override
        public JoinPublicIpsToEpnInstanceRequest build() {
            return new JoinPublicIpsToEpnInstanceRequest(this);
        } 

    } 

}
