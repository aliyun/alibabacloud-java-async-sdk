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
 * {@link UploadDataSourceFileRequest} extends {@link RequestModel}
 *
 * <p>UploadDataSourceFileRequest</p>
 */
public class UploadDataSourceFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UploadCommand uploadCommand;

    private UploadDataSourceFileRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.uploadCommand = builder.uploadCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDataSourceFileRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return uploadCommand
     */
    public UploadCommand getUploadCommand() {
        return this.uploadCommand;
    }

    public static final class Builder extends Request.Builder<UploadDataSourceFileRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UploadCommand uploadCommand; 

        private Builder() {
            super();
        } 

        private Builder(UploadDataSourceFileRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.uploadCommand = request.uploadCommand;
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
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadCommand(UploadCommand uploadCommand) {
            String uploadCommandShrink = shrink(uploadCommand, "UploadCommand", "json");
            this.putBodyParameter("UploadCommand", uploadCommandShrink);
            this.uploadCommand = uploadCommand;
            return this;
        }

        @Override
        public UploadDataSourceFileRequest build() {
            return new UploadDataSourceFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadDataSourceFileRequest} extends {@link TeaModel}
     *
     * <p>UploadDataSourceFileRequest</p>
     */
    public static class UploadCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileContentBase64")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileContentBase64;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String fileName;

        private UploadCommand(Builder builder) {
            this.fileContentBase64 = builder.fileContentBase64;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadCommand create() {
            return builder().build();
        }

        /**
         * @return fileContentBase64
         */
        public String getFileContentBase64() {
            return this.fileContentBase64;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String fileContentBase64; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(UploadCommand model) {
                this.fileContentBase64 = model.fileContentBase64;
                this.fileName = model.fileName;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a2V5dGFiIGNvbnRlbnQ=</p>
             */
            public Builder fileContentBase64(String fileContentBase64) {
                this.fileContentBase64 = fileContentBase64;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user.keytab</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public UploadCommand build() {
                return new UploadCommand(this);
            } 

        } 

    }
}
