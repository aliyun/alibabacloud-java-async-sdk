// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyPrivateDnsEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrivateDnsEndpointRequest</p>
 */
public class ModifyPrivateDnsEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryDns")
    private String primaryDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateDnsType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String privateDnsType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyDns")
    private String standbyDns;

    private ModifyPrivateDnsEndpointRequest(Builder builder) {
        super(builder);
        this.accessInstanceId = builder.accessInstanceId;
        this.accessInstanceName = builder.accessInstanceName;
        this.primaryDns = builder.primaryDns;
        this.privateDnsType = builder.privateDnsType;
        this.regionNo = builder.regionNo;
        this.standbyDns = builder.standbyDns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrivateDnsEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessInstanceId
     */
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    /**
     * @return accessInstanceName
     */
    public String getAccessInstanceName() {
        return this.accessInstanceName;
    }

    /**
     * @return primaryDns
     */
    public String getPrimaryDns() {
        return this.primaryDns;
    }

    /**
     * @return privateDnsType
     */
    public String getPrivateDnsType() {
        return this.privateDnsType;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return standbyDns
     */
    public String getStandbyDns() {
        return this.standbyDns;
    }

    public static final class Builder extends Request.Builder<ModifyPrivateDnsEndpointRequest, Builder> {
        private String accessInstanceId; 
        private String accessInstanceName; 
        private String primaryDns; 
        private String privateDnsType; 
        private String regionNo; 
        private String standbyDns; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrivateDnsEndpointRequest request) {
            super(request);
            this.accessInstanceId = request.accessInstanceId;
            this.accessInstanceName = request.accessInstanceName;
            this.primaryDns = request.primaryDns;
            this.privateDnsType = request.privateDnsType;
            this.regionNo = request.regionNo;
            this.standbyDns = request.standbyDns;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd-12345</p>
         */
        public Builder accessInstanceId(String accessInstanceId) {
            this.putQueryParameter("AccessInstanceId", accessInstanceId);
            this.accessInstanceId = accessInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder accessInstanceName(String accessInstanceName) {
            this.putQueryParameter("AccessInstanceName", accessInstanceName);
            this.accessInstanceName = accessInstanceName;
            return this;
        }

        /**
         * PrimaryDns.
         */
        public Builder primaryDns(String primaryDns) {
            this.putQueryParameter("PrimaryDns", primaryDns);
            this.primaryDns = primaryDns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder privateDnsType(String privateDnsType) {
            this.putQueryParameter("PrivateDnsType", privateDnsType);
            this.privateDnsType = privateDnsType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * StandbyDns.
         */
        public Builder standbyDns(String standbyDns) {
            this.putQueryParameter("StandbyDns", standbyDns);
            this.standbyDns = standbyDns;
            return this;
        }

        @Override
        public ModifyPrivateDnsEndpointRequest build() {
            return new ModifyPrivateDnsEndpointRequest(this);
        } 

    } 

}
