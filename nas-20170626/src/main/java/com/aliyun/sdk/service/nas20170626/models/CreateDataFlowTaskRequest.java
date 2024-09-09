// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
         * <p>
         * 
         * The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How do I ensure the idempotence?](~~25693~~)
         * 
         * >  If you do not specify this parameter, the system automatically uses the request ID as the client token. The value of RequestId may be different for each API request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The conflict policy for files with the same name. Valid values:
         * <p>
         * 
         * *   SKIP_THE_FILE: skips files with the same name.
         * *   KEEP_LATEST: compares the update time and keeps the latest version.
         * *   OVERWRITE_EXISTING: forcibly overwrites the existing file.
         * 
         * >  This parameter does not take effect for CPFS file systems.
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * CreateDirIfNotExist.
         */
        public Builder createDirIfNotExist(Boolean createDirIfNotExist) {
            this.putQueryParameter("CreateDirIfNotExist", createDirIfNotExist);
            this.createDirIfNotExist = createDirIfNotExist;
            return this;
        }

        /**
         * The dataflow ID.
         */
        public Builder dataFlowId(String dataFlowId) {
            this.putQueryParameter("DataFlowId", dataFlowId);
            this.dataFlowId = dataFlowId;
            return this;
        }

        /**
         * The type of data on which operations are performed by the dataflow task.
         * <p>
         * 
         * Valid values:
         * 
         * *   Metadata: the metadata of a file, including the timestamp, ownership, and permission information of the file. If you select Metadata, only the metadata of the file is imported. You can only query the file. When you access the file data, the file is loaded from the source storage as required.
         * *   Data: the data blocks of a file.
         * *   MetaAndData: the metadata and data blocks of the file.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * The directory in which the data flow task is executed.
         * <p>
         * 
         * Limits:
         * 
         * *   The directory must be 1 to 1,023 characters in length.
         * *   The directory must be encoded in UTF-8.
         * *   The directory must start and end with a forward slash (/).
         * *   Only one directory can be listed at a time.
         * *   If the TaskAction parameter is set to Export, the directory must be a relative path within the FileSystemPath.
         * *   If the TaskAction parameter is set to Import, the directory must be a relative path within the SourceStoragePath.
         */
        public Builder directory(String directory) {
            this.putQueryParameter("Directory", directory);
            this.directory = directory;
            return this;
        }

        /**
         * Specifies whether to perform a dry run.
         * <p>
         * 
         * During the dry run, the system checks whether the request parameters are valid and whether the requested resources are available. During the dry run, no file system is created and no fee is incurred.
         * 
         * Valid values:
         * 
         * *   true: performs a dry run. The system checks the required parameters, request syntax, limits, and available NAS resources. If the request fails the dry run, an error message is returned. If the request passes the dry run, the HTTP status code 200 is returned. No value is returned for the FileSystemId parameter.
         * *   false (default): performs a dry run and sends the request. If the request passes the dry run, a file system is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * DstDirectory.
         */
        public Builder dstDirectory(String dstDirectory) {
            this.putQueryParameter("DstDirectory", dstDirectory);
            this.dstDirectory = dstDirectory;
            return this;
        }

        /**
         * The list of files that are executed by the data flow task.
         * <p>
         * 
         * Limits:
         * 
         * *   The list must be encoded in UTF-8.
         * *   The total length of the file list cannot exceed 64 KB.
         * *   The file list is in JSON format.
         * *   The path of a single file must be 1 to 1,023 characters in length and must start with a forward slash (/).
         * *   If the TaskAction parameter is set to Import, each element in the list represents an OSS object name.
         * *   If the TaskAction parameter is set to Export, each element in the list represents a CPFS file path.
         */
        public Builder entryList(String entryList) {
            this.putQueryParameter("EntryList", entryList);
            this.entryList = entryList;
            return this;
        }

        /**
         * The ID of the file system.
         * <p>
         * 
         * *   The IDs of CPFS file systems must start with `cpfs-`. Example: cpfs-125487\*\*\*\*.
         * *   The IDs of CPFS for LINGJUN file systems must start with `bmcpfs-`. Example: bmcpfs-0015\*\*\*\*.
         * 
         * >  CPFS file systems are available only on the China site (aliyun.com).
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * If you specify SrcTaskId, the configurations of the TaskAction, DataType, and EntryList parameters are copied from the desired dataflow task. You do not need to specify them.
         */
        public Builder srcTaskId(String srcTaskId) {
            this.putQueryParameter("SrcTaskId", srcTaskId);
            this.srcTaskId = srcTaskId;
            return this;
        }

        /**
         * The type of the data flow task.
         * <p>
         * 
         * Valid values:
         * 
         * *   Import: imports data stored in the source storage to a CPFS file system.
         * *   Export: exports specified data from a CPFS file system to the source storage.
         * *   Evict: releases the data blocks of a file in a CPFS file system. After the eviction, only the metadata of the file is retained in the CPFS file system. You can still query the file. However, the data blocks of the file are cleared and do not occupy the storage space in the CPFS file system. When you access the file data, the file is loaded from the source storage as required.
         * *   Inventory: obtains the inventory list managed by a data flow from the CPFS file system, providing the cache status of inventories in the data flow.
         * 
         * >  CPFS for LINGJUN supports only the Import and Export tasks.
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
