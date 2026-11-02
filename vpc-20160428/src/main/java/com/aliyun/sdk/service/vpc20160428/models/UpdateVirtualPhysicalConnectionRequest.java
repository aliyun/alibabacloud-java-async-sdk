// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link UpdateVirtualPhysicalConnectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirtualPhysicalConnectionRequest</p>
 */
public class UpdateVirtualPhysicalConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectSpec")
    private String expectSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long vlanId;

    private UpdateVirtualPhysicalConnectionRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.expectSpec = builder.expectSpec;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.token = builder.token;
        this.vlanId = builder.vlanId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirtualPhysicalConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return expectSpec
     */
    public String getExpectSpec() {
        return this.expectSpec;
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
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return vlanId
     */
    public Long getVlanId() {
        return this.vlanId;
    }

    public static final class Builder extends Request.Builder<UpdateVirtualPhysicalConnectionRequest, Builder> {
        private Boolean dryRun; 
        private String expectSpec; 
        private String instanceId; 
        private String regionId; 
        private String token; 
        private Long vlanId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirtualPhysicalConnectionRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.expectSpec = request.expectSpec;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.token = request.token;
            this.vlanId = request.vlanId;
        } 

        /**
         * <p>Specifies whether to only perform a dry run for the request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The system performs a dry run without modifying the VLAN ID of the shared Express Connect circuit. The system checks whether the required parameters are specified, the request format, and the instance status. If the request fails the dry run, the corresponding error is returned. If the request passes the dry run, the corresponding request ID is returned.</li>
         * <li><strong>false</strong> (default): The system sends a normal request. After the request passes the dry run, the VLAN ID of the shared Express Connect circuit is modified.</li>
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
         * <p>The expected bandwidth of the shared Express Connect circuit. The bandwidth takes effect only after the payment is completed.</p>
         * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>The bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>The bandwidth values of <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are not available by default. To use these values, contact your account manager.</p>
         * </blockquote>
         * <p>Unit: <strong>M</strong> indicates Mbps, and <strong>G</strong> indicates Gbps.</p>
         * 
         * <strong>example:</strong>
         * <p>50M</p>
         */
        public Builder expectSpec(String expectSpec) {
            this.putQueryParameter("ExpectSpec", expectSpec);
            this.expectSpec = expectSpec;
            return this;
        }

        /**
         * <p>The instance ID of the shared Express Connect circuit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1mrgfbtmc9brre7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the shared Express Connect circuit.</p>
         * <p>You can invoke the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must ensure that it is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CBCE910E-D396-4944-8****</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * <p>The VLAN ID of the shared Express Connect circuit. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
         * <ul>
         * <li>A value of <strong>0</strong> specifies that the physical vSwitch port of the Virtual Border Router (VBR), which acts as a vRouter, does not use the VLAN mode, but uses the Layer 3 routing interface mode. In the Layer 3 routing interface mode, each Express Connect circuit corresponds to one VBR.</li>
         * <li>A value of <strong>1</strong> to <strong>2999</strong> specifies that the physical vSwitch port of the VBR uses a VLAN-based Layer 3 subinterface. In the Layer 3 subinterface mode, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit of the VBR can be used to connect VPCs that belong to different Alibaba Cloud accounts. Layer 2 network isolation is implemented for VBRs in different VLANs, and they cannot communicate with each other.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vlanId(Long vlanId) {
            this.putQueryParameter("VlanId", vlanId);
            this.vlanId = vlanId;
            return this;
        }

        @Override
        public UpdateVirtualPhysicalConnectionRequest build() {
            return new UpdateVirtualPhysicalConnectionRequest(this);
        } 

    } 

}
