// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link SetPolarFsFileQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetPolarFsFileQuotaRequest</p>
 */
public class SetPolarFsFileQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePathQuotas")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<FilePathQuotas> filePathQuotas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private SetPolarFsFileQuotaRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filePathQuotas = builder.filePathQuotas;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetPolarFsFileQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return filePathQuotas
     */
    public java.util.List<FilePathQuotas> getFilePathQuotas() {
        return this.filePathQuotas;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<SetPolarFsFileQuotaRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<FilePathQuotas> filePathQuotas; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(SetPolarFsFileQuotaRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filePathQuotas = request.filePathQuotas;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The details of the quota rules to apply to directories.</p>
         * <p>This parameter is required.</p>
         */
        public Builder filePathQuotas(java.util.List<FilePathQuotas> filePathQuotas) {
            this.putQueryParameter("FilePathQuotas", filePathQuotas);
            this.filePathQuotas = filePathQuotas;
            return this;
        }

        /**
         * <p>The Polarlakebase instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public SetPolarFsFileQuotaRequest build() {
            return new SetPolarFsFileQuotaRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetPolarFsFileQuotaRequest} extends {@link TeaModel}
     *
     * <p>SetPolarFsFileQuotaRequest</p>
     */
    public static class FilePathQuotas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("FilePathId")
        private String filePathId;

        @com.aliyun.core.annotation.NameInMap("Inodes")
        private Long inodes;

        @com.aliyun.core.annotation.NameInMap("MaxDepth")
        private Integer maxDepth;

        @com.aliyun.core.annotation.NameInMap("QuotaIds")
        private String quotaIds;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private FilePathQuotas(Builder builder) {
            this.capacity = builder.capacity;
            this.filePathId = builder.filePathId;
            this.inodes = builder.inodes;
            this.maxDepth = builder.maxDepth;
            this.quotaIds = builder.quotaIds;
            this.strategy = builder.strategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilePathQuotas create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return filePathId
         */
        public String getFilePathId() {
            return this.filePathId;
        }

        /**
         * @return inodes
         */
        public Long getInodes() {
            return this.inodes;
        }

        /**
         * @return maxDepth
         */
        public Integer getMaxDepth() {
            return this.maxDepth;
        }

        /**
         * @return quotaIds
         */
        public String getQuotaIds() {
            return this.quotaIds;
        }

        /**
         * @return strategy
         */
        public String getStrategy() {
            return this.strategy;
        }

        public static final class Builder {
            private Long capacity; 
            private String filePathId; 
            private Long inodes; 
            private Integer maxDepth; 
            private String quotaIds; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(FilePathQuotas model) {
                this.capacity = model.capacity;
                this.filePathId = model.filePathId;
                this.inodes = model.inodes;
                this.maxDepth = model.maxDepth;
                this.quotaIds = model.quotaIds;
                this.strategy = model.strategy;
            } 

            /**
             * <p>The quota capacity. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The directory path.</p>
             * 
             * <strong>example:</strong>
             * <p>/a/project</p>
             */
            public Builder filePathId(String filePathId) {
                this.filePathId = filePathId;
                return this;
            }

            /**
             * <p>The quota inodes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inodes(Long inodes) {
                this.inodes = inodes;
                return this;
            }

            /**
             * <p>The number of subdirectory levels to traverse under <code>FilePathId</code>. A value of 1 indicates that only the first-level subdirectories are traversed. A value of 0 indicates that all levels are traversed to the deepest level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxDepth(Integer maxDepth) {
                this.maxDepth = maxDepth;
                return this;
            }

            /**
             * <p>The IDs of the rules to apply, separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>1,2</p>
             */
            public Builder quotaIds(String quotaIds) {
                this.quotaIds = quotaIds;
                return this;
            }

            /**
             * <p>The mode in which rules take effect on existing files. Valid values:</p>
             * <ul>
             * <li><strong>missing</strong>: Rules take effect only when they are missing. This is the default value.</li>
             * <li><strong>all</strong>: Rules take effect on all files.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>missing</p>
             */
            public Builder strategy(String strategy) {
                this.strategy = strategy;
                return this;
            }

            public FilePathQuotas build() {
                return new FilePathQuotas(this);
            } 

        } 

    }
}
