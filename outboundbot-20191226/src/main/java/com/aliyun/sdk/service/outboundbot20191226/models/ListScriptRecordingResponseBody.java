// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListScriptRecordingResponseBody} extends {@link TeaModel}
 *
 * <p>ListScriptRecordingResponseBody</p>
 */
public class ListScriptRecordingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScriptRecordings")
    private java.util.List<ScriptRecordings> scriptRecordings;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListScriptRecordingResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scriptRecordings = builder.scriptRecordings;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScriptRecordingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scriptRecordings
     */
    public java.util.List<ScriptRecordings> getScriptRecordings() {
        return this.scriptRecordings;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<ScriptRecordings> scriptRecordings; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListScriptRecordingResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scriptRecordings = model.scriptRecordings;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ScriptRecordings.
         */
        public Builder scriptRecordings(java.util.List<ScriptRecordings> scriptRecordings) {
            this.scriptRecordings = scriptRecordings;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScriptRecordingResponseBody build() {
            return new ListScriptRecordingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScriptRecordingResponseBody} extends {@link TeaModel}
     *
     * <p>ListScriptRecordingResponseBody</p>
     */
    public static class ScriptRecordings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GmtUpload")
        private Long gmtUpload;

        @com.aliyun.core.annotation.NameInMap("InnerId")
        private String innerId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RecordingContent")
        private String recordingContent;

        @com.aliyun.core.annotation.NameInMap("RecordingDuration")
        private Integer recordingDuration;

        @com.aliyun.core.annotation.NameInMap("RecordingName")
        private String recordingName;

        @com.aliyun.core.annotation.NameInMap("RefId")
        private String refId;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("State")
        private Integer state;

        @com.aliyun.core.annotation.NameInMap("StateExtend")
        private String stateExtend;

        @com.aliyun.core.annotation.NameInMap("StorageUuid")
        private String storageUuid;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private ScriptRecordings(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.gmtUpload = builder.gmtUpload;
            this.innerId = builder.innerId;
            this.instanceId = builder.instanceId;
            this.recordingContent = builder.recordingContent;
            this.recordingDuration = builder.recordingDuration;
            this.recordingName = builder.recordingName;
            this.refId = builder.refId;
            this.scriptId = builder.scriptId;
            this.state = builder.state;
            this.stateExtend = builder.stateExtend;
            this.storageUuid = builder.storageUuid;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScriptRecordings create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtUpload
         */
        public Long getGmtUpload() {
            return this.gmtUpload;
        }

        /**
         * @return innerId
         */
        public String getInnerId() {
            return this.innerId;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return recordingContent
         */
        public String getRecordingContent() {
            return this.recordingContent;
        }

        /**
         * @return recordingDuration
         */
        public Integer getRecordingDuration() {
            return this.recordingDuration;
        }

        /**
         * @return recordingName
         */
        public String getRecordingName() {
            return this.recordingName;
        }

        /**
         * @return refId
         */
        public String getRefId() {
            return this.refId;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return state
         */
        public Integer getState() {
            return this.state;
        }

        /**
         * @return stateExtend
         */
        public String getStateExtend() {
            return this.stateExtend;
        }

        /**
         * @return storageUuid
         */
        public String getStorageUuid() {
            return this.storageUuid;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long gmtUpload; 
            private String innerId; 
            private String instanceId; 
            private String recordingContent; 
            private Integer recordingDuration; 
            private String recordingName; 
            private String refId; 
            private String scriptId; 
            private Integer state; 
            private String stateExtend; 
            private String storageUuid; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(ScriptRecordings model) {
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.gmtUpload = model.gmtUpload;
                this.innerId = model.innerId;
                this.instanceId = model.instanceId;
                this.recordingContent = model.recordingContent;
                this.recordingDuration = model.recordingDuration;
                this.recordingName = model.recordingName;
                this.refId = model.refId;
                this.scriptId = model.scriptId;
                this.state = model.state;
                this.stateExtend = model.stateExtend;
                this.storageUuid = model.storageUuid;
                this.uuid = model.uuid;
            } 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GmtUpload.
             */
            public Builder gmtUpload(Long gmtUpload) {
                this.gmtUpload = gmtUpload;
                return this;
            }

            /**
             * InnerId.
             */
            public Builder innerId(String innerId) {
                this.innerId = innerId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RecordingContent.
             */
            public Builder recordingContent(String recordingContent) {
                this.recordingContent = recordingContent;
                return this;
            }

            /**
             * RecordingDuration.
             */
            public Builder recordingDuration(Integer recordingDuration) {
                this.recordingDuration = recordingDuration;
                return this;
            }

            /**
             * RecordingName.
             */
            public Builder recordingName(String recordingName) {
                this.recordingName = recordingName;
                return this;
            }

            /**
             * RefId.
             */
            public Builder refId(String refId) {
                this.refId = refId;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(Integer state) {
                this.state = state;
                return this;
            }

            /**
             * StateExtend.
             */
            public Builder stateExtend(String stateExtend) {
                this.stateExtend = stateExtend;
                return this;
            }

            /**
             * StorageUuid.
             */
            public Builder storageUuid(String storageUuid) {
                this.storageUuid = storageUuid;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public ScriptRecordings build() {
                return new ScriptRecordings(this);
            } 

        } 

    }
}
