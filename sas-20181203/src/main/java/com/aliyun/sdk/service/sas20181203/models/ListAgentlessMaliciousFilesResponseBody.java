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
 * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessMaliciousFilesResponseBody</p>
 */
public class ListAgentlessMaliciousFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAgentlessMaliciousFilesResponseBody model) {
            this.list = model.list;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The malicious files.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CE343162-35BF-565E-B85E-8E3B7A2B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentlessMaliciousFilesResponseBody build() {
            return new ListAgentlessMaliciousFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessMaliciousFilesResponseBody</p>
     */
    public static class Details extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NameKey")
        private String nameKey;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Details model) {
                this.name = model.name;
                this.nameKey = model.nameKey;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The name of the detailed item.</p>
             * 
             * <strong>example:</strong>
             * <p>MD5</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name key of the detailed item.</p>
             * 
             * <strong>example:</strong>
             * <p>${suspicious.mp.db.maliciousfilemd5}</p>
             */
            public Builder nameKey(String nameKey) {
                this.nameKey = nameKey;
                return this;
            }

            /**
             * <p>The type of the detailed item.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the detailed item.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessMaliciousFilesResponseBody</p>
     */
    public static class Notes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("NoteId")
        private String noteId;

        @com.aliyun.core.annotation.NameInMap("NoteTime")
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

            private Builder() {
            } 

            private Builder(Notes model) {
                this.note = model.note;
                this.noteId = model.noteId;
                this.noteTime = model.noteTime;
            } 

            /**
             * <p>The remark.</p>
             * 
             * <strong>example:</strong>
             * <p>Serious***</p>
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * <p>The ID of the remark.</p>
             * 
             * <strong>example:</strong>
             * <p>50****</p>
             */
            public Builder noteId(String noteId) {
                this.noteId = noteId;
                return this;
            }

            /**
             * <p>The time when the remark was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-27 14:49:21</p>
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
    /**
     * 
     * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessMaliciousFilesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Details")
        private java.util.List<Details> details;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private Long filePath;

        @com.aliyun.core.annotation.NameInMap("FirstScanTimestamp")
        private Long firstScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("HighLight")
        private String highLight;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("LatestScanTimestamp")
        private Long latestScanTimestamp;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("MaliciousMd5")
        private String maliciousMd5;

        @com.aliyun.core.annotation.NameInMap("MaliciousName")
        private String maliciousName;

        @com.aliyun.core.annotation.NameInMap("MaliciousType")
        private String maliciousType;

        @com.aliyun.core.annotation.NameInMap("Notes")
        private java.util.List<Notes> notes;

        @com.aliyun.core.annotation.NameInMap("OperateResult")
        private String operateResult;

        @com.aliyun.core.annotation.NameInMap("OperateTimestamp")
        private String operateTimestamp;

        @com.aliyun.core.annotation.NameInMap("Partition")
        private String partition;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("Uuid")
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
        public java.util.List<Details> getDetails() {
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
        public java.util.List<Notes> getNotes() {
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
            private java.util.List<Details> details; 
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
            private java.util.List<Notes> notes; 
            private String operateResult; 
            private String operateTimestamp; 
            private String partition; 
            private String targetId; 
            private String targetName; 
            private String targetType; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(List model) {
                this.details = model.details;
                this.downloadUrl = model.downloadUrl;
                this.filePath = model.filePath;
                this.firstScanTimestamp = model.firstScanTimestamp;
                this.highLight = model.highLight;
                this.id = model.id;
                this.instanceName = model.instanceName;
                this.internetIp = model.internetIp;
                this.intranetIp = model.intranetIp;
                this.latestScanTimestamp = model.latestScanTimestamp;
                this.level = model.level;
                this.maliciousMd5 = model.maliciousMd5;
                this.maliciousName = model.maliciousName;
                this.maliciousType = model.maliciousType;
                this.notes = model.notes;
                this.operateResult = model.operateResult;
                this.operateTimestamp = model.operateTimestamp;
                this.partition = model.partition;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The details of the alert event.</p>
             */
            public Builder details(java.util.List<Details> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>The URL to download the malicious image sample.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://upgrade-rule-pkg.oss-cn-beijing.aliyuncs.com/totalpackage/rule/V3.166.2/totalpackage_rule_V3.16_6.2_tip_20230220110">https://upgrade-rule-pkg.oss-cn-beijing.aliyuncs.com/totalpackage/rule/V3.166.2/totalpackage_rule_V3.16_6.2_tip_20230220110</a>****</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/etc/g****</p>
             */
            public Builder filePath(Long filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The timestamp generated when the first scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>168257753****</p>
             */
            public Builder firstScanTimestamp(Long firstScanTimestamp) {
                this.firstScanTimestamp = firstScanTimestamp;
                return this;
            }

            /**
             * <p>The highlighted JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;highlight&quot;:{&quot;ruleVersion&quot;:&quot;20230223&quot;,&quot;ruleId&quot;:600139,&quot;events&quot;:[[207,284]]}}</p>
             */
            public Builder highLight(String highLight) {
                this.highLight = highLight;
                return this;
            }

            /**
             * <p>The event ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1****</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-001****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The timestamp generated when the last scan was performed. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>168257753****</p>
             */
            public Builder latestScanTimestamp(Long latestScanTimestamp) {
                this.latestScanTimestamp = latestScanTimestamp;
                return this;
            }

            /**
             * <p>The severity of the malicious file. Valid values:</p>
             * <ul>
             * <li>serious</li>
             * <li>suspicious</li>
             * <li>remind</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>serious</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The MD5 hash value of the malicious file.</p>
             * 
             * <strong>example:</strong>
             * <p>1f2e13a7c51ee89316ae50066515****</p>
             */
            public Builder maliciousMd5(String maliciousMd5) {
                this.maliciousMd5 = maliciousMd5;
                return this;
            }

            /**
             * <p>The name of the malicious file.</p>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder maliciousName(String maliciousName) {
                this.maliciousName = maliciousName;
                return this;
            }

            /**
             * <p>The type of the virus.</p>
             * 
             * <strong>example:</strong>
             * <p>WebShell</p>
             */
            public Builder maliciousType(String maliciousType) {
                this.maliciousType = maliciousType;
                return this;
            }

            /**
             * <p>The remarks.</p>
             */
            public Builder notes(java.util.List<Notes> notes) {
                this.notes = notes;
                return this;
            }

            /**
             * <p>The handling result of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>addWhitelist.USER.Success</p>
             */
            public Builder operateResult(String operateResult) {
                this.operateResult = operateResult;
                return this;
            }

            /**
             * <p>The timestamp generated when the alert is handled. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>168257753****</p>
             */
            public Builder operateTimestamp(String operateTimestamp) {
                this.operateTimestamp = operateTimestamp;
                return this;
            }

            /**
             * <p>The partition of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/dev/xvda1</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The ID of the asset that is scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>m-****</p>
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the asset that is scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>jenkins****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the asset that is scanned. Valid values:</p>
             * <ul>
             * <li>2: The scanned asset is an image.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
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
    /**
     * 
     * {@link ListAgentlessMaliciousFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessMaliciousFilesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
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
