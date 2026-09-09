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
 * {@link ModifyUserLogFieldConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserLogFieldConfigRequest</p>
 */
public class ModifyUserLogFieldConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendConfig")
    private String extendConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fieldList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDeliveryStrategy")
    private String logDeliveryStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    private ModifyUserLogFieldConfigRequest(Builder builder) {
        super(builder);
        this.deliveryType = builder.deliveryType;
        this.extendConfig = builder.extendConfig;
        this.fieldList = builder.fieldList;
        this.instanceId = builder.instanceId;
        this.logDeliveryStrategy = builder.logDeliveryStrategy;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserLogFieldConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return extendConfig
     */
    public String getExtendConfig() {
        return this.extendConfig;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logDeliveryStrategy
     */
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
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

    public static final class Builder extends Request.Builder<ModifyUserLogFieldConfigRequest, Builder> {
        private String deliveryType; 
        private String extendConfig; 
        private String fieldList; 
        private String instanceId; 
        private String logDeliveryStrategy; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserLogFieldConfigRequest request) {
            super(request);
            this.deliveryType = request.deliveryType;
            this.extendConfig = request.extendConfig;
            this.fieldList = request.fieldList;
            this.instanceId = request.instanceId;
            this.logDeliveryStrategy = request.logDeliveryStrategy;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
        } 

        /**
         * <p>The delivery type. Valid values:</p>
         * <ul>
         * <li><strong>sls</strong>: Simple Log Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.putQueryParameter("DeliveryType", deliveryType);
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The extended configuration for log delivery. The value is a JSON string constructed from a set of parameters.</p>
         * <blockquote>
         * <p>For more information, see the <strong>Log delivery extended configuration</strong> parameter description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;request_header\&quot;:\&quot;App-Id,channelCode\&quot;}</p>
         */
        public Builder extendConfig(String extendConfig) {
            this.putQueryParameter("ExtendConfig", extendConfig);
            this.extendConfig = extendConfig;
            return this;
        }

        /**
         * <p>The list of log fields to deliver. Specify the fields in the &quot;a,b,c,...&quot; format.</p>
         * <blockquote>
         * <ul>
         * <li>All required log fields must be included. You can invoke the <a href="~~DescribeCommonLogFields~~">DescribeCommonLogFields</a> operation to query the log fields supported by Simple Log Service for WAF. </li>
         * <li>If the log fields include <strong>request_header</strong>, use the <strong>delivery extension configuration</strong> (<strong>ExtendConfig</strong>) parameter to specify the request headers to deliver.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
         */
        public Builder fieldList(String fieldList) {
            this.putQueryParameter("FieldList", fieldList);
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>Instance ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-fou****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The log delivery strategy. Multiple strategies are supported. The value is a JSON array string constructed from a set of parameters.</p>
         * <blockquote>
         * <p>For more information, see the <strong>Log delivery strategy</strong> parameter description.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
         */
        public Builder logDeliveryStrategy(String logDeliveryStrategy) {
            this.putQueryParameter("LogDeliveryStrategy", logDeliveryStrategy);
            this.logDeliveryStrategy = logDeliveryStrategy;
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
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        @Override
        public ModifyUserLogFieldConfigRequest build() {
            return new ModifyUserLogFieldConfigRequest(this);
        } 

    } 

}
