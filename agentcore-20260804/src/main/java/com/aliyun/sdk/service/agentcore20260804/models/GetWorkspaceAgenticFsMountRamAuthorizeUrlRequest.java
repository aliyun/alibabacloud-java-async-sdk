// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest</p>
 */
public class GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessPointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessPointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("server")
    @com.aliyun.core.annotation.Validation(required = true)
    private String server;

    private GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.accessPointId = builder.accessPointId;
        this.fileSystemId = builder.fileSystemId;
        this.server = builder.server;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return accessPointId
     */
    public String getAccessPointId() {
        return this.accessPointId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return server
     */
    public String getServer() {
        return this.server;
    }

    public static final class Builder extends Request.Builder<GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest, Builder> {
        private String workspaceId; 
        private String accessPointId; 
        private String fileSystemId; 
        private String server; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.accessPointId = request.accessPointId;
            this.fileSystemId = request.fileSystemId;
            this.server = request.server;
        } 

        /**
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0123456789abcdef01234</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The ID of the target NAS AccessPoint. This parameter corresponds to the server and fileSystemId parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0</p>
         */
        public Builder accessPointId(String accessPointId) {
            this.putQueryParameter("accessPointId", accessPointId);
            this.accessPointId = accessPointId;
            return this;
        }

        /**
         * <p>The ID of the NAS file system to which the target AccessPoint belongs. This parameter corresponds to the server and accessPointId parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("fileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The domain name of the target AccessPoint, obtained from the DomainName field of the NAS ListAccessPoints operation. Do not include the protocol, port, or path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-0123456789abcdef0.0123456789-vlm36.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder server(String server) {
            this.putQueryParameter("server", server);
            this.server = server;
            return this;
        }

        @Override
        public GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest build() {
            return new GetWorkspaceAgenticFsMountRamAuthorizeUrlRequest(this);
        } 

    } 

}
