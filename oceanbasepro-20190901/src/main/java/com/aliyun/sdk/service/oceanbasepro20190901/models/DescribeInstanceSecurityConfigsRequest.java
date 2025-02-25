// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSecurityConfigsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceSecurityConfigsRequest</p>
 */
public class DescribeInstanceSecurityConfigsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DescribeInstanceSecurityConfigsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.checkId = builder.checkId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSecurityConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceSecurityConfigsRequest, Builder> {
        private String regionId; 
        private String checkId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceSecurityConfigsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.checkId = request.checkId;
            this.instanceId = request.instanceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The unique identifier of the check.
         */
        public Builder checkId(String checkId) {
            this.putBodyParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * The ID of the OceanBase cluster.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeInstanceSecurityConfigsRequest build() {
            return new DescribeInstanceSecurityConfigsRequest(this);
        } 

    } 

}
