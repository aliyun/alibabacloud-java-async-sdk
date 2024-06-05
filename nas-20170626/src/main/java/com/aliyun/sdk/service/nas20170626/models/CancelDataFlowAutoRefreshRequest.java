// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The dataflow ID.
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * Specifies whether to perform a dry run.
         * <p>
         * 
         * During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.
         * 
         * Valid values:
         * 
         * *   true: performs a dry run. The system checks the request format, service limits, prerequisites, and whether the required parameters are specified. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the DataFlowld parameter.
         * *   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * The directory for which you want to cancel AutoRefresh configurations.
         * <p>
         * 
         * Limits:
         * 
         * *   The directory must be 2 to 1,024 characters in length.
         * *   The directory must be encoded in UTF-8.
         * *   The directory must start and end with a forward slash (/).
         * 
         * >  The directory must be an existing directory in the CPFS file system and must be in a fileset where the dataflow is enabled.
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
