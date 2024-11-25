// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AttachRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>AttachRCInstancesRequest</p>
 */
public class AttachRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPair")
    private String keyPair;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private AttachRCInstancesRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.keyPair = builder.keyPair;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachRCInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keyPair
     */
    public String getKeyPair() {
        return this.keyPair;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<AttachRCInstancesRequest, Builder> {
        private java.util.List < String > instanceIds; 
        private String keyPair; 
        private String password; 
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(AttachRCInstancesRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.keyPair = request.keyPair;
            this.password = request.password;
            this.regionId = request.regionId;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The node IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "simple");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The key pair of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom_test</p>
         */
        public Builder keyPair(String keyPair) {
            this.putQueryParameter("KeyPair", keyPair);
            this.keyPair = keyPair;
            return this;
        }

        /**
         * <p>The logon password of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>testPassword</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The virtual private cloud (VPC) ID.</p>
         * <blockquote>
         * <p>This is a reserved parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public AttachRCInstancesRequest build() {
            return new AttachRCInstancesRequest(this);
        } 

    } 

}
