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
 * {@link CancelFilesetQuotaRequest} extends {@link RequestModel}
 *
 * <p>CancelFilesetQuotaRequest</p>
 */
public class CancelFilesetQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FsetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fsetId;

    private CancelFilesetQuotaRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.fileSystemId = builder.fileSystemId;
        this.fsetId = builder.fsetId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelFilesetQuotaRequest create() {
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

    public static final class Builder extends Request.Builder<CancelFilesetQuotaRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String fileSystemId; 
        private String fsetId; 

        private Builder() {
            super();
        } 

        private Builder(CancelFilesetQuotaRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.fileSystemId = request.fileSystemId;
            this.fsetId = request.fsetId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can generate the token from your client and make sure that the token is unique across different requests.</p>
         * <p>The ClientToken parameter supports only ASCII characters and can be up to 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
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
         * <p>Specifies whether to perform a dry run on the request.</p>
         * <p>A dry run checks the validity of parameters and business constraints. It does not actually cancel the fileset quota or incur any fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a check request and does not cancel the quota. The check items include whether required parameters are specified, request format, and business limits. If the check fails, the corresponding error is returned. If the check succeeds, the HTTP status code 200 is returned.</li>
         * <li>false (default value): Sends a normal request and directly cancels the fileset quota after the check succeeds.</li>
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
         * <p>The ID of the CPFS for Lingjun file system. The ID must start with <code>bmcpfs-</code>, for example, bmcpfs-290w65p03ok64ya****. To use CPFS for Lingjun, you must first submit a ticket to apply for the service whitelist and then create the file system in the NAS console.</p>
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
         * <p>The fileset ID.</p>
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

        @Override
        public CancelFilesetQuotaRequest build() {
            return new CancelFilesetQuotaRequest(this);
        } 

    } 

}
