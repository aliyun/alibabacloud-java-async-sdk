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
 * {@link ModifyDataFlowRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataFlowRequest</p>
 */
public class ModifyDataFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64, minLength = 1)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Throughput")
    private Long throughput;

    private ModifyDataFlowRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataFlowId = builder.dataFlowId;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.throughput = builder.throughput;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataFlowRequest create() {
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
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return throughput
     */
    public Long getThroughput() {
        return this.throughput;
    }

    public static final class Builder extends Request.Builder<ModifyDataFlowRequest, Builder> {
        private String clientToken; 
        private String dataFlowId; 
        private String description; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private Long throughput; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataFlowRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dataFlowId = request.dataFlowId;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.throughput = request.throughput;
        } 

        /**
         * <p>Ensures the idempotence of the request. Generate a parameter value from your client to ensure that the value is unique across different requests.</p>
         * <p>ClientToken supports only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The description of the data flow. </p>
         * <p>Limits:</p>
         * <ul>
         * <li>The description must be 2 to 128 characters in length.</li>
         * <li>The description must start with a letter and cannot start with http:// or https://.</li>
         * <li>The description can contain digits, colons (:), underscores (_), or hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Bucket01DataFlow.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run for this request.</p>
         * <p>A dry run checks parameter validity and resource availability without actually creating the instance or incurring fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a check request without creating the instance. The check items include whether required parameters are specified, the request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned, but FileSystemId is empty.</li>
         * <li>false (default): Sends a normal request. After the check passes, the instance is directly created.</li>
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
         * <li><p>CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
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
         * <p>The maximum transmission bandwidth of the data flow. Unit: MB/s.
         * Valid values: </p>
         * <ul>
         * <li>600</li>
         * <li>1200</li>
         * <li>1500</li>
         * </ul>
         * <blockquote>
         * <p>The transmission bandwidth of the data flow must be less than the I/O bandwidth of the file system. This parameter is required when the file system type is CPFS.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        public Builder throughput(Long throughput) {
            this.putQueryParameter("Throughput", throughput);
            this.throughput = throughput;
            return this;
        }

        @Override
        public ModifyDataFlowRequest build() {
            return new ModifyDataFlowRequest(this);
        } 

    } 

}
