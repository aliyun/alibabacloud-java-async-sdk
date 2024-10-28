// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetFilesetQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetFilesetQuotaRequest</p>
 */
public class SetFilesetQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileCountLimit")
    private Long fileCountLimit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SizeLimit")
    private Long sizeLimit;

    private SetFilesetQuotaRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fileCountLimit = builder.fileCountLimit;
        this.fileSystemId = builder.fileSystemId;
        this.fsetId = builder.fsetId;
        this.sizeLimit = builder.sizeLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetFilesetQuotaRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return fileCountLimit
     */
    public Long getFileCountLimit() {
        return this.fileCountLimit;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fsetId
     */
    public String getFsetId() {
        return this.fsetId;
    }

    /**
     * @return sizeLimit
     */
    public Long getSizeLimit() {
        return this.sizeLimit;
    }

    public static final class Builder extends Request.Builder<SetFilesetQuotaRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Long fileCountLimit; 
        private String fileSystemId; 
        private String fsetId; 
        private Long sizeLimit; 

        private Builder() {
            super();
        } 

        private Builder(SetFilesetQuotaRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fileCountLimit = request.fileCountLimit;
            this.fileSystemId = request.fileSystemId;
            this.fsetId = request.fsetId;
            this.sizeLimit = request.sizeLimit;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * FileCountLimit.
         */
        public Builder fileCountLimit(Long fileCountLimit) {
            this.putQueryParameter("FileCountLimit", fileCountLimit);
            this.fileCountLimit = fileCountLimit;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64ya****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>Fileset ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fset-1902718ea0ae****</p>
         */
        public Builder fsetId(String fsetId) {
            this.putQueryParameter("FsetId", fsetId);
            this.fsetId = fsetId;
            return this;
        }

        /**
         * SizeLimit.
         */
        public Builder sizeLimit(Long sizeLimit) {
            this.putQueryParameter("SizeLimit", sizeLimit);
            this.sizeLimit = sizeLimit;
            return this;
        }

        @Override
        public SetFilesetQuotaRequest build() {
            return new SetFilesetQuotaRequest(this);
        } 

    } 

}
