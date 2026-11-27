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
 * {@link CancelDataFlowAutoRefreshRequest} extends {@link RequestModel}
 *
 * <p>CancelDataFlowAutoRefreshRequest</p>
 */
public class CancelDataFlowAutoRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefreshPath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String refreshPath;

    private CancelDataFlowAutoRefreshRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.refreshPath = builder.refreshPath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDataFlowAutoRefreshRequest create() {
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
     * @return dataFlowId
     */
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return refreshPath
     */
    public String getRefreshPath() {
        return this.refreshPath;
    }

    public static final class Builder extends Request.Builder<CancelDataFlowAutoRefreshRequest, Builder> {
        private String clientToken; 
        private String dataFlowId; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String refreshPath; 

        private Builder() {
            super();
        } 

        private Builder(CancelDataFlowAutoRefreshRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.refreshPath = request.refreshPath;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate the value on your client and ensure that the value is unique across different requests.</p>
         * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
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
         * <p>The ID of the data flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>df-194433a5be31****</p>
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on this request.</p>
         * <p>A dry run checks parameter validity and resource availability. It does not actually perform the operation or incur fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run without performing the operation. The system checks whether required parameters are specified, whether the request format is valid, and whether business limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, HTTP status code 200 is returned, but DataFlowId is empty.</li>
         * <li>false (default): sends a regular request. If the request passes the check, the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * <p>The directory for which you want to cancel the auto-update configuration.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The value must be 2 to 1,024 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>The value must start and end with a forward slash (/).</li>
         * </ul>
         * <blockquote>
         * <p>The directory must already exist in the CPFS file system and must be located in a Fileset for which the data flow feature is enabled.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/prefix1/prefix2/</p>
         */
        public Builder refreshPath(String refreshPath) {
            this.putQueryParameter("RefreshPath", refreshPath);
            this.refreshPath = refreshPath;
            return this;
        }

        @Override
        public CancelDataFlowAutoRefreshRequest build() {
            return new CancelDataFlowAutoRefreshRequest(this);
        } 

    } 

}
