// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebLockConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockConfigListResponseBody</p>
 */
public class DescribeWebLockConfigListResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebLockConfigListResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebLockConfigListResponseBody create() {
        return builder().build();
    }

    /**
     * @return configList
     */
    public java.util.List < ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < ConfigList> configList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ConfigList.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockConfigListResponseBody build() {
            return new DescribeWebLockConfigListResponseBody(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("DefenceMode")
        private String defenceMode;

        @NameInMap("Dir")
        private String dir;

        @NameInMap("ExclusiveDir")
        private String exclusiveDir;

        @NameInMap("ExclusiveFile")
        private String exclusiveFile;

        @NameInMap("ExclusiveFileType")
        private String exclusiveFileType;

        @NameInMap("Id")
        private String id;

        @NameInMap("InclusiveFile")
        private String inclusiveFile;

        @NameInMap("InclusiveFileType")
        private String inclusiveFileType;

        @NameInMap("LocalBackupDir")
        private String localBackupDir;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Uuid")
        private String uuid;

        private ConfigList(Builder builder) {
            this.defenceMode = builder.defenceMode;
            this.dir = builder.dir;
            this.exclusiveDir = builder.exclusiveDir;
            this.exclusiveFile = builder.exclusiveFile;
            this.exclusiveFileType = builder.exclusiveFileType;
            this.id = builder.id;
            this.inclusiveFile = builder.inclusiveFile;
            this.inclusiveFileType = builder.inclusiveFileType;
            this.localBackupDir = builder.localBackupDir;
            this.mode = builder.mode;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return defenceMode
         */
        public String getDefenceMode() {
            return this.defenceMode;
        }

        /**
         * @return dir
         */
        public String getDir() {
            return this.dir;
        }

        /**
         * @return exclusiveDir
         */
        public String getExclusiveDir() {
            return this.exclusiveDir;
        }

        /**
         * @return exclusiveFile
         */
        public String getExclusiveFile() {
            return this.exclusiveFile;
        }

        /**
         * @return exclusiveFileType
         */
        public String getExclusiveFileType() {
            return this.exclusiveFileType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return inclusiveFile
         */
        public String getInclusiveFile() {
            return this.inclusiveFile;
        }

        /**
         * @return inclusiveFileType
         */
        public String getInclusiveFileType() {
            return this.inclusiveFileType;
        }

        /**
         * @return localBackupDir
         */
        public String getLocalBackupDir() {
            return this.localBackupDir;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String defenceMode; 
            private String dir; 
            private String exclusiveDir; 
            private String exclusiveFile; 
            private String exclusiveFileType; 
            private String id; 
            private String inclusiveFile; 
            private String inclusiveFileType; 
            private String localBackupDir; 
            private String mode; 
            private String uuid; 

            /**
             * DefenceMode.
             */
            public Builder defenceMode(String defenceMode) {
                this.defenceMode = defenceMode;
                return this;
            }

            /**
             * Dir.
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * ExclusiveDir.
             */
            public Builder exclusiveDir(String exclusiveDir) {
                this.exclusiveDir = exclusiveDir;
                return this;
            }

            /**
             * ExclusiveFile.
             */
            public Builder exclusiveFile(String exclusiveFile) {
                this.exclusiveFile = exclusiveFile;
                return this;
            }

            /**
             * ExclusiveFileType.
             */
            public Builder exclusiveFileType(String exclusiveFileType) {
                this.exclusiveFileType = exclusiveFileType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InclusiveFile.
             */
            public Builder inclusiveFile(String inclusiveFile) {
                this.inclusiveFile = inclusiveFile;
                return this;
            }

            /**
             * InclusiveFileType.
             */
            public Builder inclusiveFileType(String inclusiveFileType) {
                this.inclusiveFileType = inclusiveFileType;
                return this;
            }

            /**
             * LocalBackupDir.
             */
            public Builder localBackupDir(String localBackupDir) {
                this.localBackupDir = localBackupDir;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
