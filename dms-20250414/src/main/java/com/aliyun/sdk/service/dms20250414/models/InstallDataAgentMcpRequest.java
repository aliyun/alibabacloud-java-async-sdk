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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * FromJson.
         */
        public Builder fromJson(String fromJson) {
            this.putQueryParameter("FromJson", fromJson);
            this.fromJson = fromJson;
            return this;
        }

        /**
         * Headers.
         */
        public Builder headers(String headers) {
            this.putQueryParameter("Headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NeedUidInHeader.
         */
        public Builder needUidInHeader(Boolean needUidInHeader) {
            this.putQueryParameter("NeedUidInHeader", needUidInHeader);
            this.needUidInHeader = needUidInHeader;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * TransportType.
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
         * VswId.
         */
        public Builder vswId(String vswId) {
            this.putQueryParameter("VswId", vswId);
            this.vswId = vswId;
            return this;
        }

        /**
         * WorkspaceId.
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
