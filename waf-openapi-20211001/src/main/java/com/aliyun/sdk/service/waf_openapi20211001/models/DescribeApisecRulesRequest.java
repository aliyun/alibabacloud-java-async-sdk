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
 * {@link DescribeApisecRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeApisecRulesRequest</p>
 */
public class DescribeApisecRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Level")
    private String level;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeApisecRulesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.level = builder.level;
        this.name = builder.name;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApisecRulesRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return level
     */
    public String getLevel() {
        return this.level;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeApisecRulesRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private String level; 
        private String name; 
        private String origin; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long status; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApisecRulesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.level = request.level;
            this.name = request.name;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.status = request.status;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0x***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The level of the rule.</p>
         * <p>For threat detection (risk) and security events (event), valid values are:</p>
         * <ul>
         * <li><p><strong>high</strong>: important</p>
         * </li>
         * <li><p><strong>medium</strong>: medium</p>
         * </li>
         * <li><p><strong>low</strong>: low</p>
         * </li>
         * </ul>
         * <p>For sensitive data (sensitive_word), valid values are:</p>
         * <ul>
         * <li><p><strong>S1</strong>: S1</p>
         * </li>
         * <li><p><strong>S2</strong>: S2</p>
         * </li>
         * <li><p><strong>S3</strong>: S3</p>
         * </li>
         * <li><p><strong>S4</strong>: S4</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder level(String level) {
            this.putQueryParameter("Level", level);
            this.level = level;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>information leakage</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The source of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>custom</strong>: custom</p>
         * </li>
         * <li><p><strong>default</strong>: built-in</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region of the WAF instance. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland</p>
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

        /**
         * <p>The enabling status of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled</p>
         * </li>
         * <li><p><strong>0</strong>: disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><p><strong>risk</strong>: threat detection</p>
         * </li>
         * <li><p><strong>event</strong>: security event</p>
         * </li>
         * <li><p><strong>sensitive_word</strong>: sensitive data</p>
         * </li>
         * <li><p><strong>auth_flag</strong>: authentication credential</p>
         * </li>
         * <li><p><strong>api_tag</strong>: business purpose</p>
         * </li>
         * <li><p><strong>desensitization</strong>: data masking</p>
         * </li>
         * <li><p><strong>whitelist</strong>: whitelist</p>
         * </li>
         * <li><p><strong>recognition</strong>: API</p>
         * </li>
         * <li><p><strong>offline_api</strong>: lifecycle management</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>risk</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeApisecRulesRequest build() {
            return new DescribeApisecRulesRequest(this);
        } 

    } 

}
