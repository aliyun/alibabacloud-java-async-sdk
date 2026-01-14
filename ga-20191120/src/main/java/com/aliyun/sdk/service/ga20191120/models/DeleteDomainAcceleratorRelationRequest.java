// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DeleteDomainAcceleratorRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainAcceleratorRelationRequest</p>
 */
public class DeleteDomainAcceleratorRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorIds")
    private java.util.List<String> acceleratorIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteDomainAcceleratorRelationRequest(Builder builder) {
        super(builder);
        this.acceleratorIds = builder.acceleratorIds;
        this.domain = builder.domain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainAcceleratorRelationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorIds
     */
    public java.util.List<String> getAcceleratorIds() {
        return this.acceleratorIds;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDomainAcceleratorRelationRequest, Builder> {
        private java.util.List<String> acceleratorIds; 
        private String domain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainAcceleratorRelationRequest request) {
            super(request);
            this.acceleratorIds = request.acceleratorIds;
            this.domain = request.domain;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the GA instance to be disassociated. You can specify up to 50 IDs.</p>
         * <p>If you leave this parameter empty, all GA instances associated with the specified domain name are disassociated.</p>
         */
        public Builder acceleratorIds(java.util.List<String> acceleratorIds) {
            this.putQueryParameter("AcceleratorIds", acceleratorIds);
            this.acceleratorIds = acceleratorIds;
            return this;
        }

        /**
         * <p>The accelerated domain name to be disassociated.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteDomainAcceleratorRelationRequest build() {
            return new DeleteDomainAcceleratorRelationRequest(this);
        } 

    } 

}
