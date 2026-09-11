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
 * {@link CancelDataFlowTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelDataFlowTaskRequest</p>
 */
public class CancelDataFlowTaskRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private CancelDataFlowTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDataFlowTaskRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<CancelDataFlowTaskRequest, Builder> {
        private String clientToken; 
        private String dataFlowId; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(CancelDataFlowTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.taskId = request.taskId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may vary for each API request.</p>
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
         * <p>The data flow ID.</p>
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
         * <p>Specifies whether to perform a dry run for this cancel request to check parameter validity and task state without actually canceling the task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a check request without actually canceling the task. The check items include whether required parameters are specified, the request format, and the task state. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</li>
         * <li>false (default): Sends a normal request and directly cancels the task after the check passes.</li>
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
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>CPFS General-purpose: Must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: Must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
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
         * <p>The data flow task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38aa8e890f45****</p>
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public CancelDataFlowTaskRequest build() {
            return new CancelDataFlowTaskRequest(this);
        } 

    } 

}
