// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAiCallDetailPageResponseBody</p>
 */
public class QueryAiCallDetailPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryAiCallDetailPageResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiCallDetailPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryAiCallDetailPageResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The detailed reason why access was denied.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A57441B2-8EB6-5B93-9F37-0A51B8E2C9F5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryAiCallDetailPageResponseBody build() {
            return new QueryAiCallDetailPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallDetailPageResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BatchId")
        private String batchId;

        @com.aliyun.core.annotation.NameInMap("BranchId")
        private Long branchId;

        @com.aliyun.core.annotation.NameInMap("BranchName")
        private String branchName;

        @com.aliyun.core.annotation.NameInMap("BranchVersionId")
        private Long branchVersionId;

        @com.aliyun.core.annotation.NameInMap("CallExpireTime")
        private Long callExpireTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallResult")
        private String callResult;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingTime")
        private Long callingTime;

        @com.aliyun.core.annotation.NameInMap("ConversationDuration")
        private Long conversationDuration;

        @com.aliyun.core.annotation.NameInMap("ConversationRecord")
        private String conversationRecord;

        @com.aliyun.core.annotation.NameInMap("ConversationTurnCount")
        private Long conversationTurnCount;

        @com.aliyun.core.annotation.NameInMap("DetailId")
        private String detailId;

        @com.aliyun.core.annotation.NameInMap("EncryptionType")
        private Long encryptionType;

        @com.aliyun.core.annotation.NameInMap("FailedReason")
        private String failedReason;

        @com.aliyun.core.annotation.NameInMap("ImportedTime")
        private Long importedTime;

        @com.aliyun.core.annotation.NameInMap("MajorIntent")
        private String majorIntent;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("RecordingFilePath")
        private String recordingFilePath;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VersionNo")
        private Long versionNo;

        private List(Builder builder) {
            this.batchId = builder.batchId;
            this.branchId = builder.branchId;
            this.branchName = builder.branchName;
            this.branchVersionId = builder.branchVersionId;
            this.callExpireTime = builder.callExpireTime;
            this.callId = builder.callId;
            this.callResult = builder.callResult;
            this.calledNumber = builder.calledNumber;
            this.callingTime = builder.callingTime;
            this.conversationDuration = builder.conversationDuration;
            this.conversationRecord = builder.conversationRecord;
            this.conversationTurnCount = builder.conversationTurnCount;
            this.detailId = builder.detailId;
            this.encryptionType = builder.encryptionType;
            this.failedReason = builder.failedReason;
            this.importedTime = builder.importedTime;
            this.majorIntent = builder.majorIntent;
            this.options = builder.options;
            this.outId = builder.outId;
            this.recordingFilePath = builder.recordingFilePath;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.versionName = builder.versionName;
            this.versionNo = builder.versionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return batchId
         */
        public String getBatchId() {
            return this.batchId;
        }

        /**
         * @return branchId
         */
        public Long getBranchId() {
            return this.branchId;
        }

        /**
         * @return branchName
         */
        public String getBranchName() {
            return this.branchName;
        }

        /**
         * @return branchVersionId
         */
        public Long getBranchVersionId() {
            return this.branchVersionId;
        }

        /**
         * @return callExpireTime
         */
        public Long getCallExpireTime() {
            return this.callExpireTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callResult
         */
        public String getCallResult() {
            return this.callResult;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingTime
         */
        public Long getCallingTime() {
            return this.callingTime;
        }

        /**
         * @return conversationDuration
         */
        public Long getConversationDuration() {
            return this.conversationDuration;
        }

        /**
         * @return conversationRecord
         */
        public String getConversationRecord() {
            return this.conversationRecord;
        }

        /**
         * @return conversationTurnCount
         */
        public Long getConversationTurnCount() {
            return this.conversationTurnCount;
        }

        /**
         * @return detailId
         */
        public String getDetailId() {
            return this.detailId;
        }

        /**
         * @return encryptionType
         */
        public Long getEncryptionType() {
            return this.encryptionType;
        }

        /**
         * @return failedReason
         */
        public String getFailedReason() {
            return this.failedReason;
        }

        /**
         * @return importedTime
         */
        public Long getImportedTime() {
            return this.importedTime;
        }

        /**
         * @return majorIntent
         */
        public String getMajorIntent() {
            return this.majorIntent;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return recordingFilePath
         */
        public String getRecordingFilePath() {
            return this.recordingFilePath;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        /**
         * @return versionNo
         */
        public Long getVersionNo() {
            return this.versionNo;
        }

        public static final class Builder {
            private String batchId; 
            private Long branchId; 
            private String branchName; 
            private Long branchVersionId; 
            private Long callExpireTime; 
            private String callId; 
            private String callResult; 
            private String calledNumber; 
            private Long callingTime; 
            private Long conversationDuration; 
            private String conversationRecord; 
            private Long conversationTurnCount; 
            private String detailId; 
            private Long encryptionType; 
            private String failedReason; 
            private Long importedTime; 
            private String majorIntent; 
            private String options; 
            private String outId; 
            private String recordingFilePath; 
            private Long status; 
            private String taskId; 
            private String versionName; 
            private Long versionNo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.batchId = model.batchId;
                this.branchId = model.branchId;
                this.branchName = model.branchName;
                this.branchVersionId = model.branchVersionId;
                this.callExpireTime = model.callExpireTime;
                this.callId = model.callId;
                this.callResult = model.callResult;
                this.calledNumber = model.calledNumber;
                this.callingTime = model.callingTime;
                this.conversationDuration = model.conversationDuration;
                this.conversationRecord = model.conversationRecord;
                this.conversationTurnCount = model.conversationTurnCount;
                this.detailId = model.detailId;
                this.encryptionType = model.encryptionType;
                this.failedReason = model.failedReason;
                this.importedTime = model.importedTime;
                this.majorIntent = model.majorIntent;
                this.options = model.options;
                this.outId = model.outId;
                this.recordingFilePath = model.recordingFilePath;
                this.status = model.status;
                this.taskId = model.taskId;
                this.versionName = model.versionName;
                this.versionNo = model.versionNo;
            } 

            /**
             * <p>The batch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1183**************</p>
             */
            public Builder batchId(String batchId) {
                this.batchId = batchId;
                return this;
            }

            /**
             * <p>The branch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
             */
            public Builder branchId(Long branchId) {
                this.branchId = branchId;
                return this;
            }

            /**
             * <p>The branch name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default branch</p>
             */
            public Builder branchName(String branchName) {
                this.branchName = branchName;
                return this;
            }

            /**
             * <p>The version ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder branchVersionId(Long branchVersionId) {
                this.branchVersionId = branchVersionId;
                return this;
            }

            /**
             * <p>The expiration time of the outbound call detail. Format: YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-30 20:00:20</p>
             */
            public Builder callExpireTime(Long callExpireTime) {
                this.callExpireTime = callExpireTime;
                return this;
            }

            /**
             * <p>The call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123<em><strong><strong>456^123</strong></strong></em>456</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The call result.</p>
             * 
             * <strong>example:</strong>
             * <p>Answered</p>
             */
            public Builder callResult(String callResult) {
                this.callResult = callResult;
                return this;
            }

            /**
             * <p>The called number.</p>
             * 
             * <strong>example:</strong>
             * <p>0537101****</p>
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * <p>The calling time. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748948749000</p>
             */
            public Builder callingTime(Long callingTime) {
                this.callingTime = callingTime;
                return this;
            }

            /**
             * <p>The call duration. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder conversationDuration(Long conversationDuration) {
                this.conversationDuration = conversationDuration;
                return this;
            }

            /**
             * <p>The chat record information. The structure is a JSON array, and the chat records are sorted in chronological order. The structure is as follows:</p>
             * <pre><code class="language-json">[
             *     {
             *         &quot;content&quot;:&quot;Chat content&quot;,
             *         &quot;role&quot;:&quot;Role&quot;,//Valid values: user and assistant (bot).
             *     }
             * ]
             * </code></pre>
             * 
             * <strong>example:</strong>
             * <p>[
             *     {
             *         &quot;content&quot;: &quot;111您好，年龄222，性别男，我这边是<strong>汽车的官方顾问，我们新出了一款车型为</strong>；<strong>已经上市了，售价</strong>万元起，<strong>分钟破*台，您看要不了解一下？&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;
             *     },
             *     {
             *         &quot;content&quot;: &quot;&lt;客户打断&gt;哎，你是谁？&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;&lt;客户打断&gt;你再说一遍。&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;哎，我没听清。&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;你在说什么？&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;您好，&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;我是</strong>汽车总部销售服务顾问。&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;我们最近推出了一款新车**，想了解一下您是否对这款车型感兴趣？&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;&lt;客户打断&gt;哎，那我是谁？&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;你在说什么呢？&quot;,
             *         &quot;role&quot;: &quot;user&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;抱歉打扰了，111先生。&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;,
             *     },
             *     {
             *         &quot;content&quot;: &quot;祝您生活愉快！再见！&quot;,
             *         &quot;role&quot;: &quot;assistant&quot;,
             *     }
             * ]</p>
             */
            public Builder conversationRecord(String conversationRecord) {
                this.conversationRecord = conversationRecord;
                return this;
            }

            /**
             * <p>The number of conversation turns.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder conversationTurnCount(Long conversationTurnCount) {
                this.conversationTurnCount = conversationTurnCount;
                return this;
            }

            /**
             * <p>The task detail ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9662*************</p>
             */
            public Builder detailId(String detailId) {
                this.detailId = detailId;
                return this;
            }

            /**
             * <p>The encryption type. Valid values: 0: no encryption. 1: MD5. 2: SHA256. 3: SM3.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder encryptionType(Long encryptionType) {
                this.encryptionType = encryptionType;
                return this;
            }

            /**
             * <p>The reason for the call failure. This field is returned only when the call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Account suspended</p>
             */
            public Builder failedReason(String failedReason) {
                this.failedReason = failedReason;
                return this;
            }

            /**
             * <p>The import time. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1748948749000</p>
             */
            public Builder importedTime(Long importedTime) {
                this.importedTime = importedTime;
                return this;
            }

            /**
             * <p>The major intent.</p>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder majorIntent(String majorIntent) {
                this.majorIntent = majorIntent;
                return this;
            }

            /**
             * <p>The variable information used at runtime. The information is stored in this field as key-value pairs.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;date&quot;: &quot;666&quot;,
             *   &quot;phoneNumber&quot;: &quot;777&quot;,
             *   &quot;distance&quot;: &quot;555&quot;,
             *   &quot;mendian&quot;: &quot;444&quot;,
             *   &quot;sex&quot;: &quot;Male&quot;,
             *   &quot;name&quot;: &quot;111&quot;,
             *   &quot;age&quot;: &quot;222&quot;
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The external business serial number reserved for external input. You can use a unique ID for business association.</p>
             * 
             * <strong>example:</strong>
             * <p>outId</p>
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * <p>The download path of the recording file. This field is returned only after the recording file is generated.</p>
             * 
             * <strong>example:</strong>
             * <p>https://*******</p>
             */
            public Builder recordingFilePath(String recordingFilePath) {
                this.recordingFilePath = recordingFilePath;
                return this;
            }

            /**
             * <p>The task detail status. Valid values:</p>
             * <ul>
             * <li>0: Initialization.</li>
             * <li>1: Waiting for call.</li>
             * <li>2: Waiting for retry.</li>
             * <li>3: Calling.</li>
             * <li>4: Call ended.</li>
             * <li>5: Call failed.</li>
             * </ul>
             * <p>Only 4 and 5 are desired states.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1187**************</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default version</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionNo(Long versionNo) {
                this.versionNo = versionNo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAiCallDetailPageResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAiCallDetailPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * <p>The list of task detail data.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
