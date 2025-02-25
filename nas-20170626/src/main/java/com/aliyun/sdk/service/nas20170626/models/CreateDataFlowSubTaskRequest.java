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
 * {@link CreateDataFlowSubTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDataFlowSubTaskRequest</p>
 */
public class CreateDataFlowSubTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Condition")
    private Condition condition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dstFilePath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcFilePath")
    @com.aliyun.core.annotation.Validation(required = true)
    private String srcFilePath;

    private CreateDataFlowSubTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.condition = builder.condition;
        this.dataFlowId = builder.dataFlowId;
        this.dataFlowTaskId = builder.dataFlowTaskId;
        this.dryRun = builder.dryRun;
        this.dstFilePath = builder.dstFilePath;
        this.fileSystemId = builder.fileSystemId;
        this.srcFilePath = builder.srcFilePath;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowSubTaskRequest create() {
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
     * @return condition
     */
    public Condition getCondition() {
        return this.condition;
    }

    /**
     * @return dataFlowId
     */
    public String getDataFlowId() {
        return this.dataFlowId;
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
     * @return dstFilePath
     */
    public String getDstFilePath() {
        return this.dstFilePath;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return srcFilePath
     */
    public String getSrcFilePath() {
        return this.srcFilePath;
    }

    public static final class Builder extends Request.Builder<CreateDataFlowSubTaskRequest, Builder> {
        private String clientToken; 
        private Condition condition; 
        private String dataFlowId; 
        private String dataFlowTaskId; 
        private Boolean dryRun; 
        private String dstFilePath; 
        private String fileSystemId; 
        private String srcFilePath; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataFlowSubTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.condition = request.condition;
            this.dataFlowId = request.dataFlowId;
            this.dataFlowTaskId = request.dataFlowTaskId;
            this.dryRun = request.dryRun;
            this.dstFilePath = request.dstFilePath;
            this.fileSystemId = request.fileSystemId;
            this.srcFilePath = request.srcFilePath;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The request ID may be different for each request.</p>
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
         * <p>The check conditions. The check must be passed after the following conditions are specified.</p>
         */
        public Builder condition(Condition condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
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
         * <p>The ID of the data flow task.</p>
         * <blockquote>
         * <p> Only the IDs of data streaming tasks are supported.</p>
         * </blockquote>
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
         * <p>Specifies whether to perform a dry run.</p>
         * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no data streaming subtask is created and no fee is incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run. The system checks the required parameters, request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the DataFlowSubTaskId parameter.</li>
         * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a data streaming subtask is created.</li>
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
         * <p>The path of the destination file. Limits:</p>
         * <ul>
         * <li>The path must be 1 to 1,023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * <li>The path must start with a forward slash (/).</li>
         * <li>The path must end with the file name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/file.png</p>
         */
        public Builder dstFilePath(String dstFilePath) {
            this.putQueryParameter("DstFilePath", dstFilePath);
            this.dstFilePath = dstFilePath;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
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

        /**
         * <p>The path of the source file. Limits:</p>
         * <ul>
         * <li>The path must be 1 to 1,023 characters in length.</li>
         * <li>The path must be encoded in UTF-8.</li>
         * <li>The path must start with a forward slash (/).</li>
         * <li>The path must end with the file name.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/file.png</p>
         */
        public Builder srcFilePath(String srcFilePath) {
            this.putQueryParameter("SrcFilePath", srcFilePath);
            this.srcFilePath = srcFilePath;
            return this;
        }

        @Override
        public CreateDataFlowSubTaskRequest build() {
            return new CreateDataFlowSubTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataFlowSubTaskRequest} extends {@link TeaModel}
     *
     * <p>CreateDataFlowSubTaskRequest</p>
     */
    public static class Condition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Condition(Builder builder) {
            this.modifyTime = builder.modifyTime;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Condition create() {
            return builder().build();
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private Long modifyTime; 
            private Long size; 

            /**
             * <p>The modification time. The value must be a UNIX timestamp. Unit: ns.</p>
             * 
             * <strong>example:</strong>
             * <p>1725897600000000000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The file size. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Condition build() {
                return new Condition(this);
            } 

        } 

    }
}
