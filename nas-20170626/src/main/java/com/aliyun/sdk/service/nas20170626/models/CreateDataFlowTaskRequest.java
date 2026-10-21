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
    @com.aliyun.core.annotation.NameInMap("Includes")
    private String includes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcTaskId")
    private String srcTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskAction")
    private String taskAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferFileListPath")
    private String transferFileListPath;

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
        this.includes = builder.includes;
        this.srcTaskId = builder.srcTaskId;
        this.taskAction = builder.taskAction;
        this.transferFileListPath = builder.transferFileListPath;
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
     * @return includes
     */
    public String getIncludes() {
        return this.includes;
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

    /**
     * @return transferFileListPath
     */
    public String getTransferFileListPath() {
        return this.transferFileListPath;
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
        private String includes; 
        private String srcTaskId; 
        private String taskAction; 
        private String transferFileListPath; 

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
            this.includes = request.includes;
            this.srcTaskId = request.srcTaskId;
            this.taskAction = request.taskAction;
            this.transferFileListPath = request.transferFileListPath;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, and you must make sure that the value is unique among different requests.</p>
         * <p>The client token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
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
         * <p>The conflict policy for files with the same name.
         * Valid values:</p>
         * <ul>
         * <li>SKIP_THE_FILE: skips files with the same name.</li>
         * <li>KEEP_LATEST: compares the update time and retains the latest version.</li>
         * <li>OVERWRITE_EXISTING: forcibly overwrites files with the same name.<blockquote>
         * <p>This parameter is required when the file system type is CPFS for Lingjun.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to enable automatic creation of the folder if the folder does not exist.
         * Valid values:</p>
         * <ul>
         * <li>true: Enables automatic creation of the folder.</li>
         * <li>false: Disables automatic creation of the folder.
         * Default value: false.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect when TaskAction is set to Import.</li>
         * <li>This parameter is supported only in CPFS for Lingjun 2.6.0 and later.</li>
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
         * <p>The ID of the data flow.</p>
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
         * <p>The type of data operated by the data flow task.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Metadata: the metadata of files, including attributes such as timestamp, ownership, and permission. If you select Metadata, only the metadata of the files is imported. You can only view the files. When you access the file data, the data is loaded on demand from the source storage.</li>
         * <li>Data: the data blocks of files.</li>
         * <li>MetaAndData: the metadata and data blocks of files.<blockquote>
         * <p>When TaskAction is set to Evict, the DataType parameter is required.</p>
         * </blockquote>
         * </li>
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
         * <li>The value must be 1 to 1,023 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>The value must start and end with a forward slash (/).</li>
         * <li>You can specify only one directory at a time.</li>
         * <li>When TaskAction is set to Export, the directory must be a relative path within FileSystemPath.</li>
         * <li>When TaskAction is set to Import, the directory must be a relative path within SourceStoragePath.</li>
         * <li>When TaskAction is set to StreamExport, the directory must be a relative path within FileSystemPath.</li>
         * <li>When TaskAction is set to StreamImport, the directory must be a relative path within SourceStoragePath.<blockquote>
         * <p>StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.
         * The Directory, EntryList, and TransferFileListPath parameters are mutually exclusive. You can specify only one of them.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>Specifies whether to perform a dry run on the creation request.</p>
         * <p>A dry run helps you check parameter validity and verify inventory. It does not actually create the instance or incur fees.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>true: Sends a check request and does not create the instance. The system checks whether required parameters are specified, the request format, business limits, and NAS inventory. If the check fails, the corresponding error is returned. If the check succeeds, the HTTP status code 200 is returned, but TaskId is empty.</li>
         * <li>false: Sends a normal request and directly creates the instance after the check succeeds.
         * Default value: false.</li>
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
         * <p>The destination directory mapped by the data flow task.
         * Limits:</p>
         * <ul>
         * <li>The value must start and end with a forward slash (/). The value cannot contain /../.</li>
         * <li>The value must be 1 to 1,023 characters in length.</li>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>You can specify only one directory at a time.</li>
         * <li>When TaskAction is set to Export, the directory must be a relative path within SourceStoragePath.</li>
         * <li>When TaskAction is set to Import, the directory must be a relative path within FileSystemPath.</li>
         * <li>When TaskAction is set to StreamExport, the directory must be a relative path within SourceStoragePath.</li>
         * <li>When TaskAction is set to StreamImport, the directory must be a relative path within FileSystemPath.<blockquote>
         * <p>StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The list of files for the data flow task to execute.</p>
         * <p>Limits:</p>
         * <ul>
         * <li>The value must be encoded in UTF-8.</li>
         * <li>The total length of the file list must be less than 64 KB.</li>
         * <li>The file list must be in JSON format.</li>
         * <li>The path of a single file must be 1 to 1,023 characters in length and must start with a forward slash (/).</li>
         * <li>When TaskAction is set to Import, each element in the list represents an OSS object name.</li>
         * <li>When TaskAction is set to Export, each element in the list represents a CPFS file path.<blockquote>
         * <p>The Directory, EntryList, and TransferFileListPath parameters are mutually exclusive. You can specify only one of them.</p>
         * </blockquote>
         * </li>
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
         * <li><p>General-purpose CPFS: The ID must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>Filters the directories under the specified directory and transfers the content of the folders within the filtered directories.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when the Directory parameter is specified.</li>
         * <li>The path of a single folder must be 1 to 1,023 characters in length, must start and end with a forward slash (/), and cannot exceed 3,000 characters in total length.</li>
         * <li>Only CPFS for Lingjun supports this feature.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[&quot;/test/&quot;,&quot;/test1/&quot;]</p>
         */
        public Builder includes(String includes) {
            this.putQueryParameter("Includes", includes);
            this.includes = includes;
            return this;
        }

        /**
         * <p>The ID of the source data flow task. If you specify SrcTaskId, you must enter a data flow task ID. The system copies the TaskAction, DataType, and EntryList parameters from the specified data flow task. You do not need to specify these parameters separately.</p>
         * <blockquote>
         * <p>Streaming data flow tasks are not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>task-29ee8e890f45****</p>
         */
        public Builder srcTaskId(String srcTaskId) {
            this.putQueryParameter("SrcTaskId", srcTaskId);
            this.srcTaskId = srcTaskId;
            return this;
        }

        /**
         * <p>The type of the data stream node.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Import: performs data import of specified data from the source storage to CPFS.</li>
         * <li>Export: exports specified data from CPFS to the source storage.</li>
         * <li>StreamImport: imports specified data in batches from the source storage to CPFS.</li>
         * <li>StreamExport: performs batch export of specified data from CPFS to the source storage.</li>
         * <li>Evict: releases the data blocks of files in CPFS. After the release, only the metadata of the files is retained in CPFS. You can still query the files, but the data blocks are purged and do not occupy storage capacity in CPFS. When you access the file data, the data is loaded on demand from the source storage.</li>
         * <li>Inventory: obtains the checklist of files managed by data streams in CPFS. This provides the cache status of the files in the data streams.<blockquote>
         * <p>CPFS for Lingjun supports only Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Import</p>
         */
        public Builder taskAction(String taskAction) {
            this.putQueryParameter("TaskAction", taskAction);
            this.taskAction = taskAction;
            return this;
        }

        /**
         * <p>The OSS directory. Data is synchronized based on the content of the CSV file in the OSS directory. Limits:</p>
         * <ul>
         * <li><p>The value must start and end with a forward slash (/).</p>
         * </li>
         * <li><p>The value is case-sensitive.</p>
         * </li>
         * <li><p>The value must be 1 to 1,023 characters in length.</p>
         * </li>
         * <li><p>The value must be encoded in UTF-8.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The TransferFileListPath, Directory, and EntryList parameters are mutually exclusive. You can specify only one of them.</li>
         * <li>This parameter must be an actual path in OSS. The *.csv files under the path are stored in OSS.</li>
         * <li>TransferFileListPath supports only the Import and Export operations.</li>
         * <li>In the Import scenario, the files or directories specified in the CSV file are imported from OSS to CPFS.</li>
         * <li>In the Export scenario, the files or directories specified in the CSV file are exported from CPFS to OSS.</li>
         * <li>The CSV file must contain the Name and Type columns. Name is a relative path. Type supports two values: dir and file. If Type is set to dir, the Name suffix must end with a forward slash (/).</li>
         * <li>Only CPFS for Lingjun supports this feature.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test_oss_path/</p>
         */
        public Builder transferFileListPath(String transferFileListPath) {
            this.putQueryParameter("TransferFileListPath", transferFileListPath);
            this.transferFileListPath = transferFileListPath;
            return this;
        }

        @Override
        public CreateDataFlowTaskRequest build() {
            return new CreateDataFlowTaskRequest(this);
        } 

    } 

}
