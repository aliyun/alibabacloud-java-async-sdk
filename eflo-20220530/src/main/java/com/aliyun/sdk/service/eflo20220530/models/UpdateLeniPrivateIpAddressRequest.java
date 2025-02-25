// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link UpdateLeniPrivateIpAddressRequest} extends {@link RequestModel}
 *
 * <p>UpdateLeniPrivateIpAddressRequest</p>
 */
public class UpdateLeniPrivateIpAddressRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ElasticNetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String elasticNetworkInterfaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateLeniPrivateIpAddressRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.elasticNetworkInterfaceId = builder.elasticNetworkInterfaceId;
        this.ipName = builder.ipName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLeniPrivateIpAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return elasticNetworkInterfaceId
     */
    public String getElasticNetworkInterfaceId() {
        return this.elasticNetworkInterfaceId;
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateLeniPrivateIpAddressRequest, Builder> {
        private String description; 
        private String elasticNetworkInterfaceId; 
        private String ipName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLeniPrivateIpAddressRequest request) {
            super(request);
            this.description = request.description;
            this.elasticNetworkInterfaceId = request.elasticNetworkInterfaceId;
            this.ipName = request.ipName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The description of the ECS instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Lingjun Elastic Network Interface ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>leni-1234****</p>
         */
        public Builder elasticNetworkInterfaceId(String elasticNetworkInterfaceId) {
            this.putBodyParameter("ElasticNetworkInterfaceId", elasticNetworkInterfaceId);
            this.elasticNetworkInterfaceId = elasticNetworkInterfaceId;
            return this;
        }

        /**
         * <p>Lingjun Elastic Network Interface secondary private IP unique identifier.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sip-8ylg****</p>
         */
        public Builder ipName(String ipName) {
            this.putBodyParameter("IpName", ipName);
            this.ipName = ipName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateLeniPrivateIpAddressRequest build() {
            return new UpdateLeniPrivateIpAddressRequest(this);
        } 

    } 

}
