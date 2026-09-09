// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyUserWafLogStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserWafLogStatusRequest</p>
 */
public class ModifyUserWafLogStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogRegionId")
    private String logRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer logStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyUserWafLogStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.logRegionId = builder.logRegionId;
        this.logStatus = builder.logStatus;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserWafLogStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logRegionId
     */
    public String getLogRegionId() {
        return this.logRegionId;
    }

    /**
     * @return logStatus
     */
    public Integer getLogStatus() {
        return this.logStatus;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyUserWafLogStatusRequest, Builder> {
        private String instanceId; 
        private String logRegionId; 
        private Integer logStatus; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserWafLogStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.logRegionId = request.logRegionId;
            this.logStatus = request.logStatus;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-mp9153****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the log storage region. If this parameter is not specified, Simple Log Service is enabled in the region where the WAF instance resides.</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the default region where Simple Log Service is enabled for a WAF instance in the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: the default region where Simple Log Service is enabled for a WAF instance outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/2712598.html">DescribeUserSlsLogRegions</a> to query the available log storage regions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder logRegionId(String logRegionId) {
            this.putQueryParameter("LogRegionId", logRegionId);
            this.logRegionId = logRegionId;
            return this;
        }

        /**
         * <p>Indicates whether Simple Log Service is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Simple Log Service is disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: Simple Log Service is enabled.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logStatus(Integer logStatus) {
            this.putQueryParameter("LogStatus", logStatus);
            this.logStatus = logStatus;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyUserWafLogStatusRequest build() {
            return new ModifyUserWafLogStatusRequest(this);
        } 

    } 

}
