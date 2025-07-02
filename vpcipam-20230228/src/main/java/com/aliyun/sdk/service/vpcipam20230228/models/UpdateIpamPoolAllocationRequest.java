// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link UpdateIpamPoolAllocationRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpamPoolAllocationRequest</p>
 */
public class UpdateIpamPoolAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationDescription")
    private String ipamPoolAllocationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolAllocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
    private String ipamPoolAllocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateIpamPoolAllocationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamPoolAllocationDescription = builder.ipamPoolAllocationDescription;
        this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
        this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpamPoolAllocationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ipamPoolAllocationDescription
     */
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    /**
     * @return ipamPoolAllocationId
     */
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * @return ipamPoolAllocationName
     */
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateIpamPoolAllocationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamPoolAllocationDescription; 
        private String ipamPoolAllocationId; 
        private String ipamPoolAllocationName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpamPoolAllocationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamPoolAllocationDescription = request.ipamPoolAllocationDescription;
            this.ipamPoolAllocationId = request.ipamPoolAllocationId;
            this.ipamPoolAllocationName = request.ipamPoolAllocationName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to precheck this request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run without modifying the CIDR blocks of IPAM pools. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the DryRunOperation error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and the actual request. If the request passes the check, an HTTP 2xx status code is returned and the CIDR allocation information of the IPAM address pool is modified.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The description of the CIDR allocation of the IPAM pool.</p>
         * <p>The description must be 1 to 256 characters in length and start with a letter, but cannot start with a <code>http://</code> or <code>https://</code>. This parameter is empty by default.</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.putQueryParameter("IpamPoolAllocationDescription", ipamPoolAllocationDescription);
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * <p>The ID of the instance to which CIDR blocks are allocated from the IPAM pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.putQueryParameter("IpamPoolAllocationId", ipamPoolAllocationId);
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * <p>The name of the CIDR allocation of the IPAM pool.</p>
         * <p>It must be 1 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test name</p>
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.putQueryParameter("IpamPoolAllocationName", ipamPoolAllocationName);
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * <p>The ID of the region where you want to perform the operation. You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region list.</p>
         * <p>This parameter is required.</p>
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
        public UpdateIpamPoolAllocationRequest build() {
            return new UpdateIpamPoolAllocationRequest(this);
        } 

    } 

}
