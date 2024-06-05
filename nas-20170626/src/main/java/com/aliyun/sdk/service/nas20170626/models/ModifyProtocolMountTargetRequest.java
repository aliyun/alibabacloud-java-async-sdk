// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProtocolMountTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyProtocolMountTargetRequest</p>
 */
public class ModifyProtocolMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String exportId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolServiceId;

    private ModifyProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.exportId = builder.exportId;
        this.fileSystemId = builder.fileSystemId;
        this.protocolServiceId = builder.protocolServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtocolMountTargetRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return exportId
     */
    public String getExportId() {
        return this.exportId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return protocolServiceId
     */
    public String getProtocolServiceId() {
        return this.protocolServiceId;
    }

    public static final class Builder extends Request.Builder<ModifyProtocolMountTargetRequest, Builder> {
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String exportId; 
        private String fileSystemId; 
        private String protocolServiceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProtocolMountTargetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.exportId = request.exportId;
            this.fileSystemId = request.fileSystemId;
            this.protocolServiceId = request.protocolServiceId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the export directory for the protocol service.
         * <p>
         * 
         * Limits:
         * 
         * *   The description must be 2 to 128 characters in length.
         * *   The description must start with a letter but cannot start with `http://` or `https://`.
         * *   The description can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. The dry run checks parameter validity and prerequisites. The dry run does not modify the specified export directory or incur fees.
         * <p>
         * 
         * Valid values:
         * 
         * *   true: performs only a dry run. The system checks the required parameters, request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned.
         * *   false (default): performs a dry run and sends the request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the export directory for the protocol service.
         */
        public Builder exportId(String exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * The ID of the file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The ID of the protocol service.
         */
        public Builder protocolServiceId(String protocolServiceId) {
            this.putQueryParameter("ProtocolServiceId", protocolServiceId);
            this.protocolServiceId = protocolServiceId;
            return this;
        }

        @Override
        public ModifyProtocolMountTargetRequest build() {
            return new ModifyProtocolMountTargetRequest(this);
        } 

    } 

}
