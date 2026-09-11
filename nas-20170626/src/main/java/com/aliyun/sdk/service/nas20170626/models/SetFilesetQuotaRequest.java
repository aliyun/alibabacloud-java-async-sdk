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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId may be different for each API request.</p>
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
         * <p>Specifies whether to perform a dry run for this request. A dry run checks parameter validity and dependencies without actually deleting the instance or incurring fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true: Sends a dry run request without deleting the export directory. The check items include required parameters, request format, and business limit dependencies. If the check fails, the corresponding error is returned. If the check passes, HTTP status code 200 is returned.</p>
         * </li>
         * <li><p>false (default): Sends a normal request. After the check passes, the instance is directly deleted.</p>
         * </li>
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
         * <p>The file count limit for the quota. Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10,000.</p>
         * </li>
         * <li><p>Maximum value: 10,000,000,000.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the file count is unlimited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder fileCountLimit(Long fileCountLimit) {
            this.putQueryParameter("FileCountLimit", fileCountLimit);
            this.fileCountLimit = fileCountLimit;
            return this;
        }

        /**
         * <p>The ID of the CPFS for Lingjun file system. The ID must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya****. You can call <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> (FileSystemType=bmcpfs) to query existing file systems.</p>
         * <blockquote>
         * <p>CPFS for Lingjun file systems with the bmcpfs- prefix cannot be created by calling the CreateFileSystem operation. You must create them in the console.</p>
         * </blockquote>
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
         * <p>The total capacity limit for the quota. Unit: bytes.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Minimum value: 10,737,418,240 (10 GiB).</p>
         * </li>
         * <li><p>Increment: 1,073,741,824 (1 GiB).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, the capacity is unlimited.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10737418240</p>
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
