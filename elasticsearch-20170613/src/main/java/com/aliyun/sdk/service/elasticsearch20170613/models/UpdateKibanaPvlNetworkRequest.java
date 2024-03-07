// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaPvlNetworkRequest} extends {@link RequestModel}
 *
 * <p>UpdateKibanaPvlNetworkRequest</p>
 */
public class UpdateKibanaPvlNetworkRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("endpointName")
    private String endpointName;

    @Body
    @NameInMap("securityGroups")
    private java.util.List < String > securityGroups;

    @Query
    @NameInMap("pvlId")
    @Validation(required = true)
    private String pvlId;

    private UpdateKibanaPvlNetworkRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endpointName = builder.endpointName;
        this.securityGroups = builder.securityGroups;
        this.pvlId = builder.pvlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaPvlNetworkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return securityGroups
     */
    public java.util.List < String > getSecurityGroups() {
        return this.securityGroups;
    }

    /**
     * @return pvlId
     */
    public String getPvlId() {
        return this.pvlId;
    }

    public static final class Builder extends Request.Builder<UpdateKibanaPvlNetworkRequest, Builder> {
        private String instanceId; 
        private String endpointName; 
        private java.util.List < String > securityGroups; 
        private String pvlId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKibanaPvlNetworkRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endpointName = request.endpointName;
            this.securityGroups = request.securityGroups;
            this.pvlId = request.pvlId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * endpointName.
         */
        public Builder endpointName(String endpointName) {
            this.putBodyParameter("endpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * securityGroups.
         */
        public Builder securityGroups(java.util.List < String > securityGroups) {
            this.putBodyParameter("securityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * pvlId.
         */
        public Builder pvlId(String pvlId) {
            this.putQueryParameter("pvlId", pvlId);
            this.pvlId = pvlId;
            return this;
        }

        @Override
        public UpdateKibanaPvlNetworkRequest build() {
            return new UpdateKibanaPvlNetworkRequest(this);
        } 

    } 

}
