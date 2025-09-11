// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DetachVscFromFilesystemsRequest} extends {@link RequestModel}
 *
 * <p>DetachVscFromFilesystemsRequest</p>
 */
public class DetachVscFromFilesystemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ResourceIds> resourceIds;

    private DetachVscFromFilesystemsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.resourceIds = builder.resourceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachVscFromFilesystemsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return resourceIds
     */
    public java.util.List<ResourceIds> getResourceIds() {
        return this.resourceIds;
    }

    public static final class Builder extends Request.Builder<DetachVscFromFilesystemsRequest, Builder> {
        private String clientToken; 
        private java.util.List<ResourceIds> resourceIds; 

        private Builder() {
            super();
        } 

        private Builder(DetachVscFromFilesystemsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.resourceIds = request.resourceIds;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID information of the file system and virtual storage channel. Each batch can contain up to 10 IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceIds(java.util.List<ResourceIds> resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        @Override
        public DetachVscFromFilesystemsRequest build() {
            return new DetachVscFromFilesystemsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachVscFromFilesystemsRequest} extends {@link TeaModel}
     *
     * <p>DetachVscFromFilesystemsRequest</p>
     */
    public static class ResourceIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        private ResourceIds(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
            this.vscId = builder.vscId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIds create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        public static final class Builder {
            private String fileSystemId; 
            private String vscId; 

            private Builder() {
            } 

            private Builder(ResourceIds model) {
                this.fileSystemId = model.fileSystemId;
                this.vscId = model.vscId;
            } 

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>bmcpfs-290t15yn4uo8lid****</p>
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * <p>The ID of the virtual storage channel.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-8vb864o3ppwfvh****</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            public ResourceIds build() {
                return new ResourceIds(this);
            } 

        } 

    }
}
