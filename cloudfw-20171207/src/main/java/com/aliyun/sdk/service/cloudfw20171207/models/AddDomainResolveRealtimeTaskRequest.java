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
 * {@link AddDomainResolveRealtimeTaskRequest} extends {@link RequestModel}
 *
 * <p>AddDomainResolveRealtimeTaskRequest</p>
 */
public class AddDomainResolveRealtimeTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    private AddDomainResolveRealtimeTaskRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.firewallType = builder.firewallType;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDomainResolveRealtimeTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<AddDomainResolveRealtimeTaskRequest, Builder> {
        private String domainName; 
        private String firewallType; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(AddDomainResolveRealtimeTaskRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.firewallType = request.firewallType;
            this.regionNo = request.regionNo;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * FirewallType.
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public AddDomainResolveRealtimeTaskRequest build() {
            return new AddDomainResolveRealtimeTaskRequest(this);
        } 

    } 

}
