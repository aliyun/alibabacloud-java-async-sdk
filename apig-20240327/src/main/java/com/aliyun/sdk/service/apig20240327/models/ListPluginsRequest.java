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
 * {@link ListPluginsRequest} extends {@link RequestModel}
 *
 * <p>ListPluginsRequest</p>
 */
public class ListPluginsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceId")
    private String attachResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attachResourceType")
    private String attachResourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("includeBuiltinAiGateway")
    private Boolean includeBuiltinAiGateway;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginClassId")
    private String pluginClassId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pluginClassName")
    private String pluginClassName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("withAttachmentInfo")
    private Boolean withAttachmentInfo;

    private ListPluginsRequest(Builder builder) {
        super(builder);
        this.attachResourceId = builder.attachResourceId;
        this.attachResourceType = builder.attachResourceType;
        this.gatewayId = builder.gatewayId;
        this.gatewayType = builder.gatewayType;
        this.includeBuiltinAiGateway = builder.includeBuiltinAiGateway;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pluginClassId = builder.pluginClassId;
        this.pluginClassName = builder.pluginClassName;
        this.withAttachmentInfo = builder.withAttachmentInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginsRequest create() {
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
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return includeBuiltinAiGateway
     */
    public Boolean getIncludeBuiltinAiGateway() {
        return this.includeBuiltinAiGateway;
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
     * @return pluginClassId
     */
    public String getPluginClassId() {
        return this.pluginClassId;
    }

    /**
     * @return pluginClassName
     */
    public String getPluginClassName() {
        return this.pluginClassName;
    }

    /**
     * @return withAttachmentInfo
     */
    public Boolean getWithAttachmentInfo() {
        return this.withAttachmentInfo;
    }

    public static final class Builder extends Request.Builder<ListPluginsRequest, Builder> {
        private String attachResourceId; 
        private String attachResourceType; 
        private String gatewayId; 
        private String gatewayType; 
        private Boolean includeBuiltinAiGateway; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pluginClassId; 
        private String pluginClassName; 
        private Boolean withAttachmentInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginsRequest request) {
            super(request);
            this.attachResourceId = request.attachResourceId;
            this.attachResourceType = request.attachResourceType;
            this.gatewayId = request.gatewayId;
            this.gatewayType = request.gatewayType;
            this.includeBuiltinAiGateway = request.includeBuiltinAiGateway;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.pluginClassId = request.pluginClassId;
            this.pluginClassName = request.pluginClassName;
            this.withAttachmentInfo = request.withAttachmentInfo;
        } 

        /**
         * <p>The resource attachment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>api-cuip2pum1hksng6oni3g</p>
         */
        public Builder attachResourceId(String attachResourceId) {
            this.putQueryParameter("attachResourceId", attachResourceId);
            this.attachResourceId = attachResourceId;
            return this;
        }

        /**
         * <p>The resource attachment type.</p>
         * <ul>
         * <li>HttpApi: HttpApi.</li>
         * <li>Operation: Operation of HttpApi.</li>
         * <li>GatewayRoute: Gateway route.</li>
         * <li>GatewayService: Gateway service.</li>
         * <li>GatewayServicePort: Gateway service port.</li>
         * <li>Domain: Gateway domain.</li>
         * <li>Gateway: Gateway.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HttpApi</p>
         */
        public Builder attachResourceType(String attachResourceType) {
            this.putQueryParameter("attachResourceType", attachResourceType);
            this.attachResourceType = attachResourceType;
            return this;
        }

        /**
         * <p>The gateway instance ID for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-csrhgn6m1hkt65qbxxgg</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The instance type. Valid values: <strong>AI</strong> and <strong>API</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder gatewayType(String gatewayType) {
            this.putQueryParameter("gatewayType", gatewayType);
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * <p>Specifies whether to include built-in AI plug-ins in the returned results. Default: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeBuiltinAiGateway(Boolean includeBuiltinAiGateway) {
            this.putQueryParameter("includeBuiltinAiGateway", includeBuiltinAiGateway);
            this.includeBuiltinAiGateway = includeBuiltinAiGateway;
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
         * <p>The plug-in type ID for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-dn82a9djd8z****</p>
         */
        public Builder pluginClassId(String pluginClassId) {
            this.putQueryParameter("pluginClassId", pluginClassId);
            this.pluginClassId = pluginClassId;
            return this;
        }

        /**
         * <p>The plug-in type name for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>key-auth</p>
         */
        public Builder pluginClassName(String pluginClassName) {
            this.putQueryParameter("pluginClassName", pluginClassName);
            this.pluginClassName = pluginClassName;
            return this;
        }

        /**
         * <p>Specifies whether the returned results should include plug-in attachment information corresponding to the attachResourceId.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withAttachmentInfo(Boolean withAttachmentInfo) {
            this.putQueryParameter("withAttachmentInfo", withAttachmentInfo);
            this.withAttachmentInfo = withAttachmentInfo;
            return this;
        }

        @Override
        public ListPluginsRequest build() {
            return new ListPluginsRequest(this);
        } 

    } 

}
