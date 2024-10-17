// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(Condition condition) {
            this.putQueryParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dfid-194433a5be31****</p>
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>taskId-12345678</p>
         */
        public Builder dataFlowTaskId(String dataFlowTaskId) {
            this.putQueryParameter("DataFlowTaskId", dataFlowTaskId);
            this.dataFlowTaskId = dataFlowTaskId;
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
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Size.
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
