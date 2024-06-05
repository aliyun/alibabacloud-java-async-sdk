// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataFlowAutoRefreshRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataFlowAutoRefreshRequest</p>
 */
public class ModifyDataFlowAutoRefreshRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshInterval")
    @com.aliyun.core.annotation.Validation(maximum = 525600, minimum = 5)
    private Long autoRefreshInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRefreshPolicy")
    private String autoRefreshPolicy;

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

    private ModifyDataFlowAutoRefreshRequest(Builder builder) {
        super(builder);
        this.autoRefreshInterval = builder.autoRefreshInterval;
        this.autoRefreshPolicy = builder.autoRefreshPolicy;
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataFlowAutoRefreshRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRefreshInterval
     */
    public Long getAutoRefreshInterval() {
        return this.autoRefreshInterval;
    }

    /**
     * @return autoRefreshPolicy
     */
    public String getAutoRefreshPolicy() {
        return this.autoRefreshPolicy;
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

    public static final class Builder extends Request.Builder<ModifyDataFlowAutoRefreshRequest, Builder> {
        private Long autoRefreshInterval; 
        private String autoRefreshPolicy; 
        private String clientToken; 
        private String dataFlowId; 
        private Boolean dryRun; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataFlowAutoRefreshRequest request) {
            super(request);
            this.autoRefreshInterval = request.autoRefreshInterval;
            this.autoRefreshPolicy = request.autoRefreshPolicy;
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * AutoRefreshInterval.
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * AutoRefreshPolicy.
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
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

        @Override
        public ModifyDataFlowAutoRefreshRequest build() {
            return new ModifyDataFlowAutoRefreshRequest(this);
        } 

    } 

}
