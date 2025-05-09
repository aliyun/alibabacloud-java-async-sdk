// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateKibanaPvlNetworkRequest} extends {@link RequestModel}
 *
 * <p>UpdateKibanaPvlNetworkRequest</p>
 */
public class UpdateKibanaPvlNetworkRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endpointName")
    private String endpointName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("securityGroups")
    private java.util.List<String> securityGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pvlId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getSecurityGroups() {
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
        private java.util.List<String> securityGroups; 
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-n6w1o1x0w001c****</p>
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
        public Builder securityGroups(java.util.List<String> securityGroups) {
            this.putBodyParameter("securityGroups", securityGroups);
            this.securityGroups = securityGroups;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-27a3mul6l0***-kibana-internal</p>
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
