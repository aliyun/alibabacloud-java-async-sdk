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
 * {@link CancelDataFlowSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CancelDataFlowSubTaskRequest</p>
 */
public class CancelDataFlowSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowSubTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowSubTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    private CancelDataFlowSubTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.dataFlowSubTaskId = builder.dataFlowSubTaskId;
        this.dataFlowTaskId = builder.dataFlowTaskId;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDataFlowSubTaskRequest create() {
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
     * @return dataFlowSubTaskId
     */
    public String getDataFlowSubTaskId() {
        return this.dataFlowSubTaskId;
    }

    /**
     * @return dataFlowTaskId
     */
    public String getDataFlowTaskId() {
        return this.dataFlowTaskId;
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

    public static final class Builder extends Request.Builder<CancelDataFlowSubTaskRequest, Builder> {
        private String clientToken; 
        private String dataFlowId; 
        private String dataFlowSubTaskId; 
        private String dataFlowTaskId; 
        private Boolean dryRun; 
        private String fileSystemId; 

        private Builder() {
            super();
        } 

        private Builder(CancelDataFlowSubTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.dataFlowSubTaskId = request.dataFlowSubTaskId;
            this.dataFlowTaskId = request.dataFlowTaskId;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may differ for each API request.</p>
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
         * <p>The data flow streaming subtask ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>subTaskId-370kyfmyknxcyzw****</p>
         */
        public Builder dataFlowSubTaskId(String dataFlowSubTaskId) {
            this.putQueryParameter("DataFlowSubTaskId", dataFlowSubTaskId);
            this.dataFlowSubTaskId = dataFlowSubTaskId;
            return this;
        }

        /**
         * <p>The data flow task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-38aa8e890f45****</p>
         */
        public Builder dataFlowTaskId(String dataFlowTaskId) {
            this.putQueryParameter("DataFlowTaskId", dataFlowTaskId);
            this.dataFlowTaskId = dataFlowTaskId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this request.</p>
         * <p>A dry run checks parameter validity and resource availability without actually creating an instance or incurring charges.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a dry run request without creating an instance. The check items include required parameters, request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</li>
         * <li>false (default): Sends a normal request and creates the instance after the check passes.</li>
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
         * <blockquote>
         * <p>Only CPFS for Lingjun (with the bmcpfs- prefix) file systems of version 2.6.0 or later are supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-370lx1ev9ss27o0****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        @Override
        public CancelDataFlowSubTaskRequest build() {
            return new CancelDataFlowSubTaskRequest(this);
        } 

    } 

}
