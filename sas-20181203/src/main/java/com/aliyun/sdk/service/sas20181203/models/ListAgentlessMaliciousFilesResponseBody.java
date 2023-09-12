// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessMaliciousFilesResponseBody</p>
 */
public class ListAgentlessMaliciousFilesResponseBody extends TeaModel {
    @NameInMap("List")
    private java.util.List < List> list;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListAgentlessMaliciousFilesResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessMaliciousFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The malicious files.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentlessMaliciousFilesResponseBody build() {
            return new ListAgentlessMaliciousFilesResponseBody(this);
        } 

    } 

    public static class Details extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NameKey")
        private String nameKey;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Details(Builder builder) {
            this.name = builder.name;
            this.nameKey = builder.nameKey;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Details create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nameKey
         */
        public String getNameKey() {
            return this.nameKey;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String nameKey; 
            private String type; 
            private String value; 

            /**
             * The name of the exception.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The name key of the exception.
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * The type of the exception.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The value of the exception.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Details build() {
                return new Details(this);
            } 

        } 

    }
    public static class Notes extends TeaModel {
        @NameInMap("Note")
        private String note;

        @NameInMap("NoteId")
        private String noteId;

        @NameInMap("NoteTime")
        private String noteTime;

        private Notes(Builder builder) {
            this.note = builder.note;
            this.noteId = builder.noteId;
            this.noteTime = builder.noteTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notes create() {
            return builder().build();
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return noteId
         */
        public String getNoteId() {
            return this.noteId;
        }

        /**
         * @return noteTime
         */
        public String getNoteTime() {
            return this.noteTime;
        }

        public static final class Builder {
            private String note; 
            private String noteId; 
            private String noteTime; 

            /**
             * The remark.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * The ID of the remark.
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * The time when the remark was created.
             */
            public Builder noteTime(String noteTime) {
                this.noteTime = noteTime;
                return this;
            }

            public Notes build() {
                return new Notes(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("Details")
        private java.util.List < Details> details;

        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("FilePath")
        private Long filePath;

        @NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @NameInMap("HighLight")
        private String highLight;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InternetIp")
        private String internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @NameInMap("Level")
        private String level;

        @NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @NameInMap("MaliciousName")
        private String maliciousName;

        @NameInMap("MaliciousType")
        private String maliciousType;

        @NameInMap("Notes")
        private java.util.List < Notes> notes;

        @NameInMap("OperateResult")
        private String operateResult;

        @NameInMap("OperateTimestamp")
        private String operateTimestamp;

        @NameInMap("Partition")
        private String partition;

        @NameInMap("TargetId")
        private String targetId;

        @NameInMap("TargetName")
        private String targetName;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.details = builder.details;
            this.downloadUrl = builder.downloadUrl;
            this.filePath = builder.filePath;
            this.firstScanTimestamp = builder.firstScanTimestamp;
            this.highLight = builder.highLight;
            this.id = builder.id;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.latestScanTimestamp = builder.latestScanTimestamp;
            this.level = builder.level;
            this.maliciousMd5 = builder.maliciousMd5;
            this.maliciousName = builder.maliciousName;
            this.maliciousType = builder.maliciousType;
            this.notes = builder.notes;
            this.operateResult = builder.operateResult;
            this.operateTimestamp = builder.operateTimestamp;
            this.partition = builder.partition;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return details
         */
        public java.util.List < Details> getDetails() {
            return this.details;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return filePath
         */
        public Long getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTimestamp
         */
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        /**
         * @return highLight
         */
        public String getHighLight() {
            return this.highLight;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return latestScanTimestamp
         */
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return maliciousMd5
         */
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        /**
         * @return maliciousName
         */
        public String getMaliciousName() {
            return this.maliciousName;
        }

        /**
         * @return maliciousType
         */
        public String getMaliciousType() {
            return this.maliciousType;
        }

        /**
         * @return notes
         */
        public java.util.List < Notes> getNotes() {
            return this.notes;
        }

        /**
         * @return operateResult
         */
        public String getOperateResult() {
            return this.operateResult;
        }

        /**
         * @return operateTimestamp
         */
        public String getOperateTimestamp() {
            return this.operateTimestamp;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private java.util.List < Details> details; 
            private String downloadUrl; 
            private Long filePath; 
            private Long firstScanTimestamp; 
            private String highLight; 
            private Long id; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long latestScanTimestamp; 
            private String level; 
            private String maliciousMd5; 
            private String maliciousName; 
            private String maliciousType; 
            private java.util.List < Notes> notes; 
            private String operateResult; 
            private String operateTimestamp; 
            private String partition; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String uuid; 

            /**
             * The details of the exception.
             */
            public Builder details(java.util.List < Details> details) {
                this.details = details;
                return this;
            }

            /**
             * The URL to download the malicious image sample.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The file path.
             */
            public Builder filePath(Long filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The timestamp generated when the first scan was performed. Unit: milliseconds.
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * The highlighted JSON string.
             */
            public Builder highLight(String highLight) {
                this.highLight = highLight;
                return this;
            }

            /**
             * The event ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The timestamp generated when the last scan was performed. Unit: milliseconds.
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * The severity of the malicious file. Valid values:
             * <p>
             * 
             * *   serious
             * *   suspicious
             * *   remind
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * The MD5 hash value of the malicious file.
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * The name of the malicious file.
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * MaliciousType.
             */
            public Builder maliciousType(String maliciousType) {
                this.maliciousType = maliciousType;
                return this;
            }

            /**
             * The remarks.
             */
            public Builder notes(java.util.List < Notes> notes) {
                this.notes = notes;
                return this;
            }

            /**
             * The handling result of the exception.
             */
            public Builder operateResult(String operateResult) {
                this.operateResult = operateResult;
                return this;
            }

            /**
             * The timestamp generated when the exception is handled. Unit: milliseconds.
             */
            public Builder operateTimestamp(String operateTimestamp) {
                this.operateTimestamp = operateTimestamp;
                return this;
            }

            /**
             * The partition of the disk.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The ID of the asset that is scanned.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * The name of the asset that is scanned.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the asset that is scanned. Valid values:
             * <p>
             * 
             * *   2: The scanned asset is an image.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
