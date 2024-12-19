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
 * {@link CreateDataFlowTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateDataFlowTaskRequest</p>
 */
public class CreateDataFlowTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConflictPolicy")
    private String conflictPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateDirIfNotExist")
    private Boolean createDirIfNotExist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Directory")
    @com.aliyun.core.annotation.Validation(maxLength = 1023)
    private String directory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstDirectory")
    private String dstDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntryList")
    private String entryList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTaskId")
    private String srcTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    private String taskAction;

    private CreateDataFlowTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.conflictPolicy = builder.conflictPolicy;
        this.createDirIfNotExist = builder.createDirIfNotExist;
        this.dataFlowId = builder.dataFlowId;
        this.dataType = builder.dataType;
        this.directory = builder.directory;
        this.dryRun = builder.dryRun;
        this.dstDirectory = builder.dstDirectory;
        this.entryList = builder.entryList;
        this.fileSystemId = builder.fileSystemId;
        this.srcTaskId = builder.srcTaskId;
        this.taskAction = builder.taskAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataFlowTaskRequest create() {
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
     * @return conflictPolicy
     */
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    /**
     * @return createDirIfNotExist
     */
    public Boolean getCreateDirIfNotExist() {
        return this.createDirIfNotExist;
    }

    /**
     * @return dataFlowId
     */
    public String getDataFlowId() {
        return this.dataFlowId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return directory
     */
    public String getDirectory() {
        return this.directory;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dstDirectory
     */
    public String getDstDirectory() {
        return this.dstDirectory;
    }

    /**
     * @return entryList
     */
    public String getEntryList() {
        return this.entryList;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return srcTaskId
     */
    public String getSrcTaskId() {
        return this.srcTaskId;
    }

    /**
     * @return taskAction
     */
    public String getTaskAction() {
        return this.taskAction;
    }

    public static final class Builder extends Request.Builder<CreateDataFlowTaskRequest, Builder> {
        private String clientToken; 
        private String conflictPolicy; 
        private Boolean createDirIfNotExist; 
        private String dataFlowId; 
        private String dataType; 
        private String directory; 
        private Boolean dryRun; 
        private String dstDirectory; 
        private String entryList; 
        private String fileSystemId; 
        private String srcTaskId; 
        private String taskAction; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataFlowTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.conflictPolicy = request.conflictPolicy;
            this.createDirIfNotExist = request.createDirIfNotExist;
            this.dataFlowId = request.dataFlowId;
            this.dataType = request.dataType;
            this.directory = request.directory;
            this.dryRun = request.dryRun;
            this.dstDirectory = request.dstDirectory;
            this.entryList = request.entryList;
            this.fileSystemId = request.fileSystemId;
            this.srcTaskId = request.srcTaskId;
            this.taskAction = request.taskAction;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
         * <p>The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure the idempotence?</a></p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.</p>
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
         * <p>The conflict policy for files with the same name. Valid values:</p>
         * <ul>
         * <li>SKIP_THE_FILE: skips files with the same name.</li>
         * <li>KEEP_LATEST: compares the update time and keeps the latest version.</li>
         * <li>OVERWRITE_EXISTING: forcibly overwrites the existing file.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required for CPFS for LINGJUN file systems.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SKIP_THE_FILE</p>
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a directory if no directory exists. Valid values:</p>
         * <ul>
         * <li>true: automatically creates a directory.</li>
         * <li>false (default): does not automatically create a directory.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is required if the TaskAction parameter is set to Import.</li>
         * <li>Only CPFS for LINGJUN V2.6.0 and later support this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder createDirIfNotExist(Boolean createDirIfNotExist) {
            this.putQueryParameter("CreateDirIfNotExist", createDirIfNotExist);
            this.createDirIfNotExist = createDirIfNotExist;
            return this;
        }

        /**
         * <p>The dataflow ID.</p>
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
         * <p>The type of data on which operations are performed by the dataflow task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.</li>
         * <li>Data: the data blocks of a file.</li>
         * <li>MetaAndData: the metadata and data blocks of the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Metadata</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The source directory of the data.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The directory must be 1 to 1,023 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>The directory must start and end with a forward slash (/).</li>
         * <li>Only one directory can be listed at a time.</li>
         * <li>If the TaskAction parameter is set to Export, the directory must be a relative path within the FileSystemPath.</li>
         * <li>If the TaskAction parameter is set to Import, the directory must be a relative path within the SourceStoragePath.</li>
         * <li>If the TaskAction parameter is set to StreamExport, the directory must be a relative path within the FileSystemPath.</li>
         * <li>If the TaskAction parameter is set to StreamImport, the directory must be a relative path within the SourceStoragePath.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/</p>
         */
        public Builder directory(String directory) {
            this.putQueryParameter("Directory", directory);
            this.directory = directory;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run.</p>
         * <p>During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no data flow task is created and no fee is incurred.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: performs a dry run. The system checks the required parameters, request syntax, service limits, and available File Storage NAS (NAS) resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the TaskId parameter.</li>
         * <li>false (default): performs a dry run and sends the request. If the request passes the dry run, a data flow task is created.</li>
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
         * <p>The directory mapped to the data flow task. Limits:</p>
         * <ul>
         * <li>The directory must start and end with a forward slash (/). The directory cannot be /../.</li>
         * <li>The directory must be 1 to 1,023 characters in length.</li>
         * <li>The directory must be encoded in UTF-8.</li>
         * <li>Only one directory can be listed at a time.</li>
         * <li>If the TaskAction parameter is set to Export, the directory must be a relative path within the SourceStoragePath.</li>
         * <li>If the TaskAction parameter is set to Import, the directory must be a relative path within the FileSystemPath.</li>
         * <li>If the TaskAction parameter is set to StreamExport, the directory must be a relative path within the SourceStoragePath.</li>
         * <li>If the TaskAction parameter is set to StreamImport, the directory must be a relative path within the FileSystemPath.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/path_in_cpfs/</p>
         */
        public Builder dstDirectory(String dstDirectory) {
            this.putQueryParameter("DstDirectory", dstDirectory);
            this.dstDirectory = dstDirectory;
            return this;
        }

        /**
         * <p>The list of files that are executed by the data flow task.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The list must be encoded in UTF-8.</li>
         * <li>The total length of the file list cannot exceed 64 KB.</li>
         * <li>The file list is in JSON format.</li>
         * <li>The path of a single file must be 1 to 1,023 characters in length and must start with a forward slash (/).</li>
         * <li>If the TaskAction parameter is set to Import, each element in the list represents an OSS object name.</li>
         * <li>If the TaskAction parameter is set to Export, each element in the list represents a CPFS file path.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/path_in_cpfs/file1&quot;, &quot;/path_in_cpfs/file2&quot;]</p>
         */
        public Builder entryList(String entryList) {
            this.putQueryParameter("EntryList", entryList);
            this.entryList = entryList;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-125487****.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-0015****.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS is not supported on the international site.</p>
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
         * <p>If you specify SrcTaskId, the configurations of the TaskAction, DataType, and EntryList parameters are copied from the desired dataflow task. You do not need to specify them.</p>
         * 
         * <strong>example:</strong>
         * <p>task-27aa8e890f45****</p>
         */
        public Builder srcTaskId(String srcTaskId) {
            this.putQueryParameter("SrcTaskId", srcTaskId);
            this.srcTaskId = srcTaskId;
            return this;
        }

        /**
         * <p>The type of the data flow task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Import: imports data stored in the source storage to a CPFS file system.</li>
         * <li>Export: exports specified data from a CPFS file system to the source storage.</li>
         * <li>StreamImport: batch imports the specified data from the source storage to a CPFS file system.</li>
         * <li>StreamExport: batch exports specified data from a CPFS file system to the source storage.</li>
         * </ul>
         * <blockquote>
         * <p> Only CPFS for LINGJUN V2.6.0 and later support StreamImport and StreamExport.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Import</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        @Override
        public CreateDataFlowTaskRequest build() {
            return new CreateDataFlowTaskRequest(this);
        } 

    } 

}
