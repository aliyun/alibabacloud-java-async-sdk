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
 * {@link DescribeCommonLogFieldsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommonLogFieldsRequest</p>
 */
public class DescribeCommonLogFieldsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefault")
    private Boolean isDefault;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRequired")
    private Boolean isRequired;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogKeyList")
    private java.util.List<String> logKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private DescribeCommonLogFieldsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.isDefault = builder.isDefault;
        this.isRequired = builder.isRequired;
        this.logKeyList = builder.logKeyList;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonLogFieldsRequest create() {
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
     * @return isDefault
     */
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * @return isRequired
     */
    public Boolean getIsRequired() {
        return this.isRequired;
    }

    /**
     * @return logKeyList
     */
    public java.util.List<String> getLogKeyList() {
        return this.logKeyList;
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

    public static final class Builder extends Request.Builder<DescribeCommonLogFieldsRequest, Builder> {
        private String instanceId; 
        private Boolean isDefault; 
        private Boolean isRequired; 
        private java.util.List<String> logKeyList; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommonLogFieldsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.isDefault = request.isDefault;
            this.isRequired = request.isRequired;
            this.logKeyList = request.logKeyList;
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
         * <p>waf_v3prepaid_public_cn-l*****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to query for default log fields.</p>
         * <ul>
         * <li><p><strong>true</strong>: Queries for default log fields.</p>
         * </li>
         * <li><p><strong>false</strong>: Queries for non-default log fields.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * <p>Specifies whether to query for required log fields.</p>
         * <ul>
         * <li><p><strong>true</strong>: Queries for required log fields.</p>
         * </li>
         * <li><p><strong>false</strong>: Queries for non-required log fields.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isRequired(Boolean isRequired) {
            this.putQueryParameter("IsRequired", isRequired);
            this.isRequired = isRequired;
            return this;
        }

        /**
         * <p>The list of log fields to query.</p>
         */
        public Builder logKeyList(java.util.List<String> logKeyList) {
            String logKeyListShrink = shrink(logKeyList, "LogKeyList", "json");
            this.putQueryParameter("LogKeyList", logKeyListShrink);
            this.logKeyList = logKeyList;
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
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2sxgs*****</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public DescribeCommonLogFieldsRequest build() {
            return new DescribeCommonLogFieldsRequest(this);
        } 

    } 

}
