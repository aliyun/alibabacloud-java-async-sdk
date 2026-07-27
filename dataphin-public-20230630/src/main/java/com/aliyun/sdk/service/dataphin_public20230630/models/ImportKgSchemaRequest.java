// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ImportKgSchemaRequest} extends {@link RequestModel}
 *
 * <p>ImportKgSchemaRequest</p>
 */
public class ImportKgSchemaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImportCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ImportCommand importCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private ImportKgSchemaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.importCommand = builder.importCommand;
        this.opTenantId = builder.opTenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKgSchemaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return importCommand
     */
    public ImportCommand getImportCommand() {
        return this.importCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ImportKgSchemaRequest, Builder> {
        private String regionId; 
        private ImportCommand importCommand; 
        private Long opTenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ImportKgSchemaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.importCommand = request.importCommand;
            this.opTenantId = request.opTenantId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder importCommand(ImportCommand importCommand) {
            String importCommandShrink = shrink(importCommand, "ImportCommand", "json");
            this.putBodyParameter("ImportCommand", importCommandShrink);
            this.importCommand = importCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ImportKgSchemaRequest build() {
            return new ImportKgSchemaRequest(this);
        } 

    } 

    /**
     * 
     * {@link ImportKgSchemaRequest} extends {@link TeaModel}
     *
     * <p>ImportKgSchemaRequest</p>
     */
    public static class ImportCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("InputFormat")
        private String inputFormat;

        @com.aliyun.core.annotation.NameInMap("MergeStrategy")
        private String mergeStrategy;

        private ImportCommand(Builder builder) {
            this.content = builder.content;
            this.inputFormat = builder.inputFormat;
            this.mergeStrategy = builder.mergeStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImportCommand create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return inputFormat
         */
        public String getInputFormat() {
            return this.inputFormat;
        }

        /**
         * @return mergeStrategy
         */
        public String getMergeStrategy() {
            return this.mergeStrategy;
        }

        public static final class Builder {
            private String content; 
            private String inputFormat; 
            private String mergeStrategy; 

            private Builder() {
            } 

            private Builder(ImportCommand model) {
                this.content = model.content;
                this.inputFormat = model.inputFormat;
                this.mergeStrategy = model.mergeStrategy;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * InputFormat.
             */
            public Builder inputFormat(String inputFormat) {
                this.inputFormat = inputFormat;
                return this;
            }

            /**
             * MergeStrategy.
             */
            public Builder mergeStrategy(String mergeStrategy) {
                this.mergeStrategy = mergeStrategy;
                return this;
            }

            public ImportCommand build() {
                return new ImportCommand(this);
            } 

        } 

    }
}
