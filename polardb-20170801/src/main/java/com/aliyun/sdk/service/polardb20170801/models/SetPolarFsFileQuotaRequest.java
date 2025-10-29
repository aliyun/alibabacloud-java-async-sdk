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
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder filePathQuotas(java.util.List<FilePathQuotas> filePathQuotas) {
            this.putQueryParameter("FilePathQuotas", filePathQuotas);
            this.filePathQuotas = filePathQuotas;
            return this;
        }

        /**
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
        @com.aliyun.core.annotation.NameInMap("FilePathId")
        private String filePathId;

        @com.aliyun.core.annotation.NameInMap("MaxDepth")
        private Integer maxDepth;

        @com.aliyun.core.annotation.NameInMap("QuotaIds")
        private String quotaIds;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private String strategy;

        private FilePathQuotas(Builder builder) {
            this.filePathId = builder.filePathId;
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
         * @return filePathId
         */
        public String getFilePathId() {
            return this.filePathId;
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
            private String filePathId; 
            private Integer maxDepth; 
            private String quotaIds; 
            private String strategy; 

            private Builder() {
            } 

            private Builder(FilePathQuotas model) {
                this.filePathId = model.filePathId;
                this.maxDepth = model.maxDepth;
                this.quotaIds = model.quotaIds;
                this.strategy = model.strategy;
            } 

            /**
             * FilePathId.
             */
            public Builder filePathId(String filePathId) {
                this.filePathId = filePathId;
                return this;
            }

            /**
             * MaxDepth.
             */
            public Builder maxDepth(Integer maxDepth) {
                this.maxDepth = maxDepth;
                return this;
            }

            /**
             * QuotaIds.
             */
            public Builder quotaIds(String quotaIds) {
                this.quotaIds = quotaIds;
                return this;
            }

            /**
             * Strategy.
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
