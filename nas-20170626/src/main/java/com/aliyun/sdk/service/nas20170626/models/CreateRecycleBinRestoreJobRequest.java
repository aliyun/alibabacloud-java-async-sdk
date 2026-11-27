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
 * {@link CreateRecycleBinRestoreJobRequest} extends {@link RequestModel}
 *
 * <p>CreateRecycleBinRestoreJobRequest</p>
 */
public class CreateRecycleBinRestoreJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetFileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetFileId;

    private CreateRecycleBinRestoreJobRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.fileId = builder.fileId;
        this.fileSystemId = builder.fileSystemId;
        this.targetFileId = builder.targetFileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecycleBinRestoreJobRequest create() {
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return targetFileId
     */
    public String getTargetFileId() {
        return this.targetFileId;
    }

    public static final class Builder extends Request.Builder<CreateRecycleBinRestoreJobRequest, Builder> {
        private String clientToken; 
        private String fileId; 
        private String fileSystemId; 
        private String targetFileId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecycleBinRestoreJobRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.fileId = request.fileId;
            this.fileSystemId = request.fileSystemId;
            this.targetFileId = request.targetFileId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value on your client to ensure that it is unique across different requests. The ClientToken parameter only supports ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * <blockquote>
         * <p>If you do not specify the ClientToken parameter, the system automatically uses the RequestId of the API request as the ClientToken. The RequestId of each API request may be different.</p>
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
         * <p>The FileId of the file or directory to be restored.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2412174.html">ListRecycledDirectoriesAndFiles</a> operation to query the FileId of the deleted data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>04***08</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The file system ID. <strong>Required</strong>.</p>
         * <p><strong>How to obtain</strong>:</p>
         * <ul>
         * <li>Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-describefilesystems">DescribeFileSystems</a> operation to query the file system list and obtain the FileSystemId.</li>
         * <li>Call the <a href="https://www.alibabacloud.com/help/en/nas/developer-reference/api-nas-2017-06-26-createfilesystem">CreateFileSystem</a> operation to create a file system and obtain the returned FileSystemId.</li>
         * </ul>
         * <p><strong>Usage notes</strong>:</p>
         * <ul>
         * <li>This operation is applicable only to General-purpose NAS file systems.</li>
         * <li>Before you call this operation, make sure that the recycle bin feature is enabled for the target file system.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The FileId of the directory where the restored file is stored.</p>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories</a> operation to query the TargetFileId of the directory on which the delete operation was performed.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/2412163.html">ListDirectoriesAndFiles</a> operation to query the TargetFileId of an existing directory in the file system.</p>
         * </li>
         * </ul>
         * <p><strong>Special notes</strong>:</p>
         * <ul>
         * <li>The FileId of the root directory of the file system is fixed to <code>2</code>. You can directly use <code>2</code> as the TargetFileId to restore the file to the root directory without querying it.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>13***15</p>
         */
        public Builder targetFileId(String targetFileId) {
            this.putQueryParameter("TargetFileId", targetFileId);
            this.targetFileId = targetFileId;
            return this;
        }

        @Override
        public CreateRecycleBinRestoreJobRequest build() {
            return new CreateRecycleBinRestoreJobRequest(this);
        } 

    } 

}
