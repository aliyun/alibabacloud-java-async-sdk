// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link InstallDataAgentMcpRequest} extends {@link RequestModel}
 *
 * <p>InstallDataAgentMcpRequest</p>
 */
public class InstallDataAgentMcpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromJson")
    private String fromJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Headers")
    private String headers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedUidInHeader")
    private Boolean needUidInHeader;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetType")
    private String netType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransportType")
    private String transportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VswId")
    private String vswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private InstallDataAgentMcpRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.endpoint = builder.endpoint;
        this.fromJson = builder.fromJson;
        this.headers = builder.headers;
        this.name = builder.name;
        this.needUidInHeader = builder.needUidInHeader;
        this.netType = builder.netType;
        this.transportType = builder.transportType;
        this.vpcId = builder.vpcId;
        this.vswId = builder.vswId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallDataAgentMcpRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return fromJson
     */
    public String getFromJson() {
        return this.fromJson;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return needUidInHeader
     */
    public Boolean getNeedUidInHeader() {
        return this.needUidInHeader;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return transportType
     */
    public String getTransportType() {
        return this.transportType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return vswId
     */
    public String getVswId() {
        return this.vswId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<InstallDataAgentMcpRequest, Builder> {
        private String description; 
        private String endpoint; 
        private String fromJson; 
        private String headers; 
        private String name; 
        private Boolean needUidInHeader; 
        private String netType; 
        private String transportType; 
        private String vpcId; 
        private String vswId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(InstallDataAgentMcpRequest request) {
            super(request);
            this.description = request.description;
            this.endpoint = request.endpoint;
            this.fromJson = request.fromJson;
            this.headers = request.headers;
            this.name = request.name;
            this.needUidInHeader = request.needUidInHeader;
            this.netType = request.netType;
            this.transportType = request.transportType;
            this.vpcId = request.vpcId;
            this.vswId = request.vswId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The brief description of the artifact. This parameter can be empty.</p>
         * 
         * <strong>example:</strong>
         * <p>query user information by user ID</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The endpoint of the MCP instance.</p>
         * 
         * <strong>example:</strong>
         * <p>http://***.com/mcp</p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The JSON used to create the MCP.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;mcpServers&quot;: {
         *     &quot;sse-server-name&quot;: {
         *       &quot;description&quot;: &quot;describe sse mcp server&quot;,
         *       &quot;type&quot;: &quot;sse&quot;,
         *       &quot;netType&quot;: &quot;vpc&quot;,
         *       &quot;vpcId&quot;: &quot;vpc-xxxx&quot;,
         *       &quot;url&quot;: &quot;<a href="http://sse-in-vpc.com/sse">http://sse-in-vpc.com/sse</a>&quot;,
         *       &quot;needUidInHeader&quot;: true,
         *       &quot;headers&quot;: {
         *         &quot;Authorization&quot;: &quot;Bearer <token>&quot;
         *       }
         *     }
         *   }
         * }</p>
         */
        public Builder fromJson(String fromJson) {
            this.putQueryParameter("FromJson", fromJson);
            this.fromJson = fromJson;
            return this;
        }

        /**
         * <p>The request header settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Authorization&quot;:&quot;Bearer ***&quot;}</p>
         */
        public Builder headers(String headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * <p>The MCP name.</p>
         * 
         * <strong>example:</strong>
         * <p>query_tool</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether to include the Alibaba Cloud UID in the request header.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder needUidInHeader(Boolean needUidInHeader) {
            this.putQueryParameter("NeedUidInHeader", needUidInHeader);
            this.needUidInHeader = needUidInHeader;
            return this;
        }

        /**
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><code>vpc</code>: virtual private cloud.</li>
         * <li><code>public</code>: public network.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>public</p>
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * <p>The transport channel type. Valid values: streamablehttp and sse.</p>
         * 
         * <strong>example:</strong>
         * <p>sse</p>
         */
        public Builder transportType(String transportType) {
            this.putQueryParameter("TransportType", transportType);
            this.transportType = transportType;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf63***o5</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-8vb5j***6h</p>
         */
        public Builder vswId(String vswId) {
            this.putQueryParameter("VswId", vswId);
            this.vswId = vswId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public InstallDataAgentMcpRequest build() {
            return new InstallDataAgentMcpRequest(this);
        } 

    } 

}
