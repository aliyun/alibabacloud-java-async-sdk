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
         * The automatic update interval. CPFS checks whether data is updated in the directory at the interval. If data is updated, CPFS runs an AutoRefresh task. Unit: minutes.
         * <p>
         * 
         * Valid values: 5 to 526600. Default value: 10.
         */
        public Builder autoRefreshInterval(Long autoRefreshInterval) {
            this.putQueryParameter("AutoRefreshInterval", autoRefreshInterval);
            this.autoRefreshInterval = autoRefreshInterval;
            return this;
        }

        /**
         * The automatic update policy. CPFS imports data updates in the Object Storage Service (OSS) bucket to the CPFS file system based on this policy. Valid values:
         * <p>
         * 
         * *   None: CPFS does not automatically import data updates in the OSS bucket to the CPFS file system. You can import the data updates by using a dataflow task.
         * *   ImportChanged: CPFS automatically imports data updates in the OSS bucket to the CPFS file system.
         */
        public Builder autoRefreshPolicy(String autoRefreshPolicy) {
            this.putQueryParameter("AutoRefreshPolicy", autoRefreshPolicy);
            this.autoRefreshPolicy = autoRefreshPolicy;
            return this;
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
         * *   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.
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

        @Override
        public ModifyDataFlowAutoRefreshRequest build() {
            return new ModifyDataFlowAutoRefreshRequest(this);
        } 

    } 

}
