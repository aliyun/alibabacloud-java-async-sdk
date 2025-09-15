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
         * IsDefault.
         */
        public Builder isDefault(Boolean isDefault) {
            this.putQueryParameter("IsDefault", isDefault);
            this.isDefault = isDefault;
            return this;
        }

        /**
         * IsRequired.
         */
        public Builder isRequired(Boolean isRequired) {
            this.putQueryParameter("IsRequired", isRequired);
            this.isRequired = isRequired;
            return this;
        }

        /**
         * LogKeyList.
         */
        public Builder logKeyList(java.util.List<String> logKeyList) {
            String logKeyListShrink = shrink(logKeyList, "LogKeyList", "json");
            this.putQueryParameter("LogKeyList", logKeyListShrink);
            this.logKeyList = logKeyList;
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
         * ResourceManagerResourceGroupId.
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
