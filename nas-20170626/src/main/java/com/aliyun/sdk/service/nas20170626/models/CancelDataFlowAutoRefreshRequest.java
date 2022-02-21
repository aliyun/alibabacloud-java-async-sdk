// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDataFlowAutoRefreshRequest} extends {@link RequestModel}
 *
 * <p>CancelDataFlowAutoRefreshRequest</p>
 */
public class CancelDataFlowAutoRefreshRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataFlowId")
    @Validation(required = true)
    private String dataFlowId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("RefreshPath")
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

        private Builder(CancelDataFlowAutoRefreshRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dataFlowId = response.dataFlowId;
            this.dryRun = response.dryRun;
            this.fileSystemId = response.fileSystemId;
            this.refreshPath = response.refreshPath;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DataFlowId.
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * RefreshPath.
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
