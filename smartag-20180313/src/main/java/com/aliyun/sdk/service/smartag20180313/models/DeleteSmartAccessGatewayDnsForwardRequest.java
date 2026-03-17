// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DeleteSmartAccessGatewayDnsForwardRequest} extends {@link RequestModel}
 *
 * <p>DeleteSmartAccessGatewayDnsForwardRequest</p>
 */
public class DeleteSmartAccessGatewayDnsForwardRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagInsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagInsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SagSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sagSn;

    private DeleteSmartAccessGatewayDnsForwardRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.sagInsId = builder.sagInsId;
        this.sagSn = builder.sagSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSmartAccessGatewayDnsForwardRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sagInsId
     */
    public String getSagInsId() {
        return this.sagInsId;
    }

    /**
     * @return sagSn
     */
    public String getSagSn() {
        return this.sagSn;
    }

    public static final class Builder extends Request.Builder<DeleteSmartAccessGatewayDnsForwardRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String sagInsId; 
        private String sagSn; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSmartAccessGatewayDnsForwardRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.sagInsId = request.sagInsId;
            this.sagSn = request.sagSn;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagv3dnsforward-nc7qabskj17werc7su</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the region where the SAG instance is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the SAG instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sag-v9un1ccz22owd76lf8</p>
         */
        public Builder sagInsId(String sagInsId) {
            this.putQueryParameter("SagInsId", sagInsId);
            this.sagInsId = sagInsId;
            return this;
        }

        /**
         * <p>The serial number (SN) of the device.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sagf4dkqh78</p>
         */
        public Builder sagSn(String sagSn) {
            this.putQueryParameter("SagSn", sagSn);
            this.sagSn = sagSn;
            return this;
        }

        @Override
        public DeleteSmartAccessGatewayDnsForwardRequest build() {
            return new DeleteSmartAccessGatewayDnsForwardRequest(this);
        } 

    } 

}
