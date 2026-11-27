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
 * {@link DeleteProtocolMountTargetRequest} extends {@link RequestModel}
 *
 * <p>DeleteProtocolMountTargetRequest</p>
 */
public class DeleteProtocolMountTargetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

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

    private DeleteProtocolMountTargetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.exportId = builder.exportId;
        this.fileSystemId = builder.fileSystemId;
        this.protocolServiceId = builder.protocolServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProtocolMountTargetRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteProtocolMountTargetRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String exportId; 
        private String fileSystemId; 
        private String protocolServiceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProtocolMountTargetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.exportId = request.exportId;
            this.fileSystemId = request.fileSystemId;
            this.protocolServiceId = request.protocolServiceId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId may be different for each API request.</p>
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
         * <p>Specifies whether to perform a dry run on the delete request.
         * A dry run helps you check parameter validity and dependencies. The export directory is not actually deleted, and no fees are incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: performs a dry run. The export directory is not deleted. The system checks whether required parameters are specified, the request format is valid, and business limits and dependencies are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the HTTP status code 200 is returned.</p>
         * </li>
         * <li><p>false (default): does not perform a dry run and sends the actual request. If the request passes the check, the export directory is directly deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the export directory.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exp-19abf5beab8d****</p>
         */
        public Builder exportId(String exportId) {
            this.putQueryParameter("ExportId", exportId);
            this.exportId = exportId;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The ID of the protocol service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ptc-197ed6a00f2b****</p>
         */
        public Builder protocolServiceId(String protocolServiceId) {
            this.putQueryParameter("ProtocolServiceId", protocolServiceId);
            this.protocolServiceId = protocolServiceId;
            return this;
        }

        @Override
        public DeleteProtocolMountTargetRequest build() {
            return new DeleteProtocolMountTargetRequest(this);
        } 

    } 

}
