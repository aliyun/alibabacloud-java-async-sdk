// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListPluginAttachmentsRequest} extends {@link RequestModel}
 *
 * <p>ListPluginAttachmentsRequest</p>
 */
public class ListPluginAttachmentsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    private String attachResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceTypes")
    private String attachResourceTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("environmentId")
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withParentResource")
    private Boolean withParentResource;

    private ListPluginAttachmentsRequest(Builder builder) {
        super(builder);
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceType = builder.attachResourceType;
        this.attachResourceTypes = builder.attachResourceTypes;
        this.environmentId = builder.environmentId;
        this.gatewayId = builder.gatewayId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pluginId = builder.pluginId;
        this.withParentResource = builder.withParentResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginAttachmentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachResourceId
     */
    public String getAttachResourceId() {
        return this.attachResourceId;
    }

    /**
     * @return attachResourceType
     */
    public String getAttachResourceType() {
        return this.attachResourceType;
    }

    /**
     * @return attachResourceTypes
     */
    public String getAttachResourceTypes() {
        return this.attachResourceTypes;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return withParentResource
     */
    public Boolean getWithParentResource() {
        return this.withParentResource;
    }

    public static final class Builder extends Request.Builder<ListPluginAttachmentsRequest, Builder> {
        private String attachResourceId; 
        private String attachResourceType; 
        private String attachResourceTypes; 
        private String environmentId; 
        private String gatewayId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pluginId; 
        private Boolean withParentResource; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginAttachmentsRequest request) {
            super(request);
            this.attachResourceId = request.attachResourceId;
            this.attachResourceType = request.attachResourceType;
            this.attachResourceTypes = request.attachResourceTypes;
            this.environmentId = request.environmentId;
            this.gatewayId = request.gatewayId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pluginId = request.pluginId;
            this.withParentResource = request.withParentResource;
        } 

        /**
         * <p>The resource attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hr-cv2h58em1hkg7c6vt43g</p>
         */
        public Builder attachResourceId(String attachResourceId) {
            this.putQueryParameter("attachResourceId", attachResourceId);
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * <p>The resource attachment type (not yet in use).</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayRoute</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>The resource attachment types, separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>GatewayRoute</p>
         */
        public Builder attachResourceTypes(String attachResourceTypes) {
            this.putQueryParameter("attachResourceTypes", attachResourceTypes);
            this.attachResourceTypes = attachResourceTypes;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>env-crlnqhtlhtgqflkqislg</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("environmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cr79f75lhtgme744084g</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The page number to return. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The plug-in ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-ct8181um1hkiqns9f6e0</p>
         */
        public Builder pluginId(String pluginId) {
            this.putQueryParameter("pluginId", pluginId);
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Specifies whether to return parent resource attachments.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withParentResource(Boolean withParentResource) {
            this.putQueryParameter("withParentResource", withParentResource);
            this.withParentResource = withParentResource;
            return this;
        }

        @Override
        public ListPluginAttachmentsRequest build() {
            return new ListPluginAttachmentsRequest(this);
        } 

    } 

}
