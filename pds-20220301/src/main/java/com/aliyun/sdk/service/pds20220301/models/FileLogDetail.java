// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileLogDetail} extends {@link TeaModel}
 *
 * <p>FileLogDetail</p>
 */
public class FileLogDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("decompress_file_list")
    private java.util.List < String > decompressFileList;

    @com.aliyun.core.annotation.NameInMap("new_name")
    private String newName;

    @com.aliyun.core.annotation.NameInMap("parent_path")
    private String parentPath;

    @com.aliyun.core.annotation.NameInMap("rev_version")
    private Long revVersion;

    @com.aliyun.core.annotation.NameInMap("revision_id")
    private String revisionId;

    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.NameInMap("to_parent_path")
    private String toParentPath;

    @com.aliyun.core.annotation.NameInMap("to_parent_path_type")
    private String toParentPathType;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private FileLogDetail(Builder builder) {
        this.decompressFileList = builder.decompressFileList;
        this.newName = builder.newName;
        this.parentPath = builder.parentPath;
        this.revVersion = builder.revVersion;
        this.revisionId = builder.revisionId;
        this.size = builder.size;
        this.toParentPath = builder.toParentPath;
        this.toParentPathType = builder.toParentPathType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileLogDetail create() {
        return builder().build();
    }

    /**
     * @return decompressFileList
     */
    public java.util.List < String > getDecompressFileList() {
        return this.decompressFileList;
    }

    /**
     * @return newName
     */
    public String getNewName() {
        return this.newName;
    }

    /**
     * @return parentPath
     */
    public String getParentPath() {
        return this.parentPath;
    }

    /**
     * @return revVersion
     */
    public Long getRevVersion() {
        return this.revVersion;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return toParentPath
     */
    public String getToParentPath() {
        return this.toParentPath;
    }

    /**
     * @return toParentPathType
     */
    public String getToParentPathType() {
        return this.toParentPathType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private java.util.List < String > decompressFileList; 
        private String newName; 
        private String parentPath; 
        private Long revVersion; 
        private String revisionId; 
        private Long size; 
        private String toParentPath; 
        private String toParentPathType; 
        private String type; 

        /**
         * decompress_file_list.
         */
        public Builder decompressFileList(java.util.List < String > decompressFileList) {
            this.decompressFileList = decompressFileList;
            return this;
        }

        /**
         * new_name.
         */
        public Builder newName(String newName) {
            this.newName = newName;
            return this;
        }

        /**
         * parent_path.
         */
        public Builder parentPath(String parentPath) {
            this.parentPath = parentPath;
            return this;
        }

        /**
         * rev_version.
         */
        public Builder revVersion(Long revVersion) {
            this.revVersion = revVersion;
            return this;
        }

        /**
         * revision_id.
         */
        public Builder revisionId(String revisionId) {
            this.revisionId = revisionId;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Long size) {
            this.size = size;
            return this;
        }

        /**
         * to_parent_path.
         */
        public Builder toParentPath(String toParentPath) {
            this.toParentPath = toParentPath;
            return this;
        }

        /**
         * to_parent_path_type.
         */
        public Builder toParentPathType(String toParentPathType) {
            this.toParentPathType = toParentPathType;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FileLogDetail build() {
            return new FileLogDetail(this);
        } 

    } 

}
