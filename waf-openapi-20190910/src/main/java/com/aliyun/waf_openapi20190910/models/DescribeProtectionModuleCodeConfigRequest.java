// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeProtectionModuleCodeConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeProtectionModuleCodeConfigRequest</p>
 */
public class DescribeProtectionModuleCodeConfigRequest extends Request {
    @Query
    @NameInMap("CodeType")
    private Integer codeType;

    @Query
    @NameInMap("CodeValue")
    private Integer codeValue;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;


    private DescribeProtectionModuleCodeConfigRequest(Builder builder) {
        super(builder);
        this.codeType = builder.codeType;
        this.codeValue = builder.codeValue;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleCodeConfigRequest create() {
        return builder().build();
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder {
        private Integer codeType; 
        private Integer codeValue; 
        private String instanceId; 
        private String resourceGroupId; 

        /**
         * <p>CodeType.</p>
         */
        public Builder codeType(Integer codeType) {
            this.putQueryParameter("CodeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * <p>CodeValue.</p>
         */
        public Builder codeValue(Integer codeValue) {
            this.putQueryParameter("CodeValue", codeValue);
            this.codeValue = codeValue;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeProtectionModuleCodeConfigRequest build() {
            return new DescribeProtectionModuleCodeConfigRequest(this);
        } 

    } 

}
