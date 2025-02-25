// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtectionModuleCodeConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeProtectionModuleCodeConfigRequest</p>
 */
public class DescribeProtectionModuleCodeConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer codeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeValue")
    private Integer codeValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeProtectionModuleCodeConfigRequest(Builder builder) {
        super(builder);
        this.codeType = builder.codeType;
        this.codeValue = builder.codeValue;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleCodeConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeType
     */
    public Integer getCodeType() {
        return this.codeType;
    }

    /**
     * @return codeValue
     */
    public Integer getCodeValue() {
        return this.codeValue;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeProtectionModuleCodeConfigRequest, Builder> {
        private Integer codeType; 
        private Integer codeValue; 
        private String instanceId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProtectionModuleCodeConfigRequest request) {
            super(request);
            this.codeType = request.codeType;
            this.codeValue = request.codeValue;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * CodeType.
         */
        public Builder codeType(Integer codeType) {
            this.putQueryParameter("CodeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * CodeValue.
         */
        public Builder codeValue(Integer codeValue) {
            this.putQueryParameter("CodeValue", codeValue);
            this.codeValue = codeValue;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeProtectionModuleCodeConfigRequest build() {
            return new DescribeProtectionModuleCodeConfigRequest(this);
        } 

    } 

}
