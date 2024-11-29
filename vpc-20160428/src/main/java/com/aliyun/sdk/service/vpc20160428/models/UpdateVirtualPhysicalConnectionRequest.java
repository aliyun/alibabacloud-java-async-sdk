// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values: Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including required parameters, request syntax, and instance status. If the request fails to pass the dry run, an error message is returned. If the request passes the dry run, the system returns the ID of the request.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The estimated bandwidth value of the hosted connection. The estimated bandwidth value takes effect only after the payment is completed.</p>
         * <p>Valid values: <strong>50M</strong>, <strong>100M</strong>, <strong>200M</strong>, <strong>300M</strong>, <strong>400M</strong>, <strong>500M</strong>, <strong>1G</strong>, <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong>.</p>
         * <blockquote>
         * <p> <strong>2G</strong>, <strong>5G</strong>, <strong>8G</strong>, and <strong>10G</strong> are unavailable by default. If you want to use these bandwidth values, contact your account manager.</p>
         * </blockquote>
         * <p><strong>M</strong> indicates Mbit/s and <strong>G</strong> indicates Gbit/s.</p>
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
         * <p>The ID of the hosted connection over Express Connect circuit.</p>
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
         * <p>The region ID of the hosted connection.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to obtain the region ID.</p>
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
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
         * <p>The VLAN ID of the hosted connection over Express Connect circuit. Valid values: <strong>0</strong> to <strong>2999</strong>.</p>
         * <ul>
         * <li>If the VLAN ID is set to <strong>0</strong>, it indicates that the switch port of the virtual border router (VBR) is a Layer 3 router interface instead of a VLAN interface. When a Layer 3 router interface is used, each Express Connect circuit corresponds to a VBR.</li>
         * <li>If the VLAN ID is set to a value from <strong>1</strong> to <strong>2999</strong>, the switch port of the VBR is a Layer 3 VLAN subinterface. When a Layer 3 VLAN subinterface is used, each VLAN ID corresponds to one VBR. In this case, the Express Connect circuit with which the VBR is associated can be used to connect to virtual private clouds (VPCs) that belong to different Alibaba Cloud accounts. VBRs in different VLANs are isolated from each other at Layer 2.</li>
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
