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
 * {@link CreateDefenseResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseResourceRequest</p>
 */
public class CreateDefenseResourceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomHeaders")
    private java.util.List<String> customHeaders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    @com.aliyun.core.annotation.Validation(required = true)
    private String detail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private String ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Pattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroup")
    private String resourceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOrigin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceOrigin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XffStatus")
    private Integer xffStatus;

    private CreateDefenseResourceRequest(Builder builder) {
        super(builder);
        this.customHeaders = builder.customHeaders;
        this.description = builder.description;
        this.detail = builder.detail;
        this.instanceId = builder.instanceId;
        this.ownerUserId = builder.ownerUserId;
        this.pattern = builder.pattern;
        this.product = builder.product;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceGroup = builder.resourceGroup;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceOrigin = builder.resourceOrigin;
        this.tag = builder.tag;
        this.xffStatus = builder.xffStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseResourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customHeaders
     */
    public java.util.List<String> getCustomHeaders() {
        return this.customHeaders;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerUserId
     */
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return pattern
     */
    public String getPattern() {
        return this.pattern;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceGroup
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resourceOrigin
     */
    public String getResourceOrigin() {
        return this.resourceOrigin;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return xffStatus
     */
    public Integer getXffStatus() {
        return this.xffStatus;
    }

    public static final class Builder extends Request.Builder<CreateDefenseResourceRequest, Builder> {
        private java.util.List<String> customHeaders; 
        private String description; 
        private String detail; 
        private String instanceId; 
        private String ownerUserId; 
        private String pattern; 
        private String product; 
        private String regionId; 
        private String resource; 
        private String resourceGroup; 
        private String resourceManagerResourceGroupId; 
        private String resourceOrigin; 
        private java.util.List<Tag> tag; 
        private Integer xffStatus; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseResourceRequest request) {
            super(request);
            this.customHeaders = request.customHeaders;
            this.description = request.description;
            this.detail = request.detail;
            this.instanceId = request.instanceId;
            this.ownerUserId = request.ownerUserId;
            this.pattern = request.pattern;
            this.product = request.product;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceGroup = request.resourceGroup;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceOrigin = request.resourceOrigin;
            this.tag = request.tag;
            this.xffStatus = request.xffStatus;
        } 

        /**
         * <p>The list of specified header fields.</p>
         * <blockquote>
         * <p>When XffStatus is set to 1, the first IP in the specified header field is used as the client source IP to prevent XFF spoofing. When multiple headers are specified, the system attempts to obtain the source IP from each header in order. If the first header does not contain an IP, the system tries the second header, and so on. If no specified header contains an IP, the first IP in the X-Forwarded-For header is used. When XffStatus is set to 1, the IP is obtained from the first available header.</p>
         * </blockquote>
         */
        public Builder customHeaders(java.util.List<String> customHeaders) {
            String customHeadersShrink = shrink(customHeaders, "CustomHeaders", "json");
            this.putQueryParameter("CustomHeaders", customHeadersShrink);
            this.customHeaders = customHeaders;
            return this;
        }

        /**
         * <p>The description of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceTest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The specific parameter information of the protected object, which is a string converted from a JSON object constructed with a series of parameters.</p>
         * <blockquote>
         * <p>The parameters vary depending on the specified <strong>cloud product</strong> (<strong>Product</strong>) and <strong>protection mode</strong> (<strong>Pattern</strong>). For more information, see <strong>Detail parameter description for protected objects</strong>.</p>
         * </blockquote>
         * <blockquote>
         * <p>Notice: When <strong>Product</strong> is set to <strong>ecs</strong>, <strong>clb4</strong>, <strong>clb7</strong>, or <strong>nlb</strong>, domain names connected to regions in the Chinese mainland must have completed ICP filing.</notice></p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;domain\&quot;: \&quot;zhhclb4test096-05111.test.com\&quot;}</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-4xl*******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the account to which the protected object belongs in multi-account scenarios. By default, the protected object belongs to the WAF administrator account.</p>
         * 
         * <strong>example:</strong>
         * <p>123221XXX</p>
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The protection mode of the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>domain</strong>: domain name-based protection.</p>
         * </li>
         * <li><p><strong>multi_service</strong>: hybrid cloud service-based protection.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Currently, only the following combinations are supported: when <strong>Product</strong> is set to <strong>alb</strong>, <strong>ecs</strong>, <strong>clb4</strong>, <strong>clb7</strong>, or <strong>nlb</strong>, <strong>Pattern</strong> must be set to <strong>domain</strong>. When <strong>Product</strong> is set to <strong>waf</strong>, <strong>Pattern</strong> must be set to <strong>multi_service</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        public Builder pattern(String pattern) {
            this.putQueryParameter("Pattern", pattern);
            this.pattern = pattern;
            return this;
        }

        /**
         * <p>The cloud product name. Valid values:</p>
         * <ul>
         * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
         * </li>
         * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
         * </li>
         * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) Layer 4 access.</p>
         * </li>
         * <li><p><strong>clb7</strong>: Classic Load Balancer (CLB) Layer 7 access.</p>
         * </li>
         * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
         * </li>
         * <li><p><strong>waf</strong>: Web Application Firewall (WAF).</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
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
         * <p>The name of the protected object.</p>
         * <blockquote>
         * <ul>
         * <li>Only protected objects in hybrid cloud service mode support custom protected object names.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abctest.com</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The name of the protection group to which the protected object is added. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>testGroup</p>
         */
        public Builder resourceGroup(String resourceGroup) {
            this.putQueryParameter("ResourceGroup", resourceGroup);
            this.resourceGroup = resourceGroup;
            return this;
        }

        /**
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The source of the protected object. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: user-defined.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder resourceOrigin(String resourceOrigin) {
            this.putQueryParameter("ResourceOrigin", resourceOrigin);
            this.resourceOrigin = resourceOrigin;
            return this;
        }

        /**
         * <p>The tag list, which contains up to 20 items.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>Specifies whether XFF proxy is enabled for the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled (default).</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder xffStatus(Integer xffStatus) {
            this.putQueryParameter("XffStatus", xffStatus);
            this.xffStatus = xffStatus;
            return this;
        }

        @Override
        public CreateDefenseResourceRequest build() {
            return new CreateDefenseResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDefenseResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateDefenseResourceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>demoTagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>TagValue1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
