// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeWebLockConfigListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebLockConfigListResponseBody</p>
 */
public class DescribeWebLockConfigListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<ConfigList> getConfigList() {
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
        private java.util.List<ConfigList> configList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The configurations of web tamper proofing.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D9354C1A-D709-4873-9AAE-41513327B247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of directories that have web tamper proofing enabled on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebLockConfigListResponseBody build() {
            return new DescribeWebLockConfigListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebLockConfigListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebLockConfigListResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefenceMode")
        private String defenceMode;

        @com.aliyun.core.annotation.NameInMap("Dir")
        private String dir;

        @com.aliyun.core.annotation.NameInMap("ExclusiveDir")
        private String exclusiveDir;

        @com.aliyun.core.annotation.NameInMap("ExclusiveFile")
        private String exclusiveFile;

        @com.aliyun.core.annotation.NameInMap("ExclusiveFileType")
        private String exclusiveFileType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InclusiveFile")
        private String inclusiveFile;

        @com.aliyun.core.annotation.NameInMap("InclusiveFileType")
        private String inclusiveFileType;

        @com.aliyun.core.annotation.NameInMap("LocalBackupDir")
        private String localBackupDir;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
             * <p>The prevention mode. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: Interception Mode</li>
             * <li><strong>audit</strong>: Alert Mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>audit</p>
             */
            public Builder defenceMode(String defenceMode) {
                this.defenceMode = defenceMode;
                return this;
            }

            /**
             * <p>The directory that has web tamper proofing enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>/www/tmp/</p>
             */
            public Builder dir(String dir) {
                this.dir = dir;
                return this;
            }

            /**
             * <p>The directory that has web tamper proofing disabled.</p>
             * <blockquote>
             * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/home/admin/tomcat</p>
             */
            public Builder exclusiveDir(String exclusiveDir) {
                this.exclusiveDir = exclusiveDir;
                return this;
            }

            /**
             * <p>The file that has web tamper proofing disabled.</p>
             * <blockquote>
             * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/home/admin/tomcat/localhost.log</p>
             */
            public Builder exclusiveFile(String exclusiveFile) {
                this.exclusiveFile = exclusiveFile;
                return this;
            }

            /**
             * <p>The type of the file that has web tamper proofing disabled.</p>
             * <blockquote>
             * <p>If the value of <strong>Mode</strong> is <strong>blacklist</strong>, this parameter is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>*.jpg</p>
             */
            public Builder exclusiveFileType(String exclusiveFileType) {
                this.exclusiveFileType = exclusiveFileType;
                return this;
            }

            /**
             * <p>The configuration ID of the protected directory.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The file that has web tamper proofing enabled.</p>
             * <blockquote>
             * <p>If the value of <strong>Mode</strong> is <strong>whitelist</strong>, this parameter is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>/home/admin/tomcat/aaa.log</p>
             */
            public Builder inclusiveFile(String inclusiveFile) {
                this.inclusiveFile = inclusiveFile;
                return this;
            }

            /**
             * <p>The type of the file that has web tamper proofing enabled.</p>
             * <blockquote>
             * <p>If the value of <strong>Mode</strong> is <strong>whitelist</strong>, this parameter is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>jpg</p>
             */
            public Builder inclusiveFileType(String inclusiveFileType) {
                this.inclusiveFileType = inclusiveFileType;
                return this;
            }

            /**
             * <p>The local path to the backup files of the protected directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/local/backup</p>
             */
            public Builder localBackupDir(String localBackupDir) {
                this.localBackupDir = localBackupDir;
                return this;
            }

            /**
             * <p>The protection mode of web tamper proofing. Valid values:</p>
             * <ul>
             * <li><strong>whitelist</strong>: In this mode, web tamper proofing is enabled for the specified directories and file types.</li>
             * <li><strong>blacklist</strong>: In this mode, web tamper proofing is enabled for the unspecified subdirectories, file types, and files in the protected directory.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>blacklist</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The UUID of the server that has web tamper proofing enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>80d2f7d6-31a9-4d7f-8ff4-7ecc42f8****</p>
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
