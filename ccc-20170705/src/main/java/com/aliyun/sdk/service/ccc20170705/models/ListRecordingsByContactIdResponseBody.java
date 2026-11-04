// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListRecordingsByContactIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecordingsByContactIdResponseBody</p>
 */
public class ListRecordingsByContactIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Recordings")
    private Recordings recordings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRecordingsByContactIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.recordings = builder.recordings;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecordingsByContactIdResponseBody create() {
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
     * @return recordings
     */
    public Recordings getRecordings() {
        return this.recordings;
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
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private Recordings recordings; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListRecordingsByContactIdResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.recordings = model.recordings;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * Recordings.
         */
        public Builder recordings(Recordings recordings) {
            this.recordings = recordings;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRecordingsByContactIdResponseBody build() {
            return new ListRecordingsByContactIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecordingsByContactIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecordingsByContactIdResponseBody</p>
     */
    public static class Recording extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("CalledNumber")
        private String calledNumber;

        @com.aliyun.core.annotation.NameInMap("CallingNumber")
        private String callingNumber;

        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("ContactType")
        private String contactType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FileDescription")
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("QualityCheckTaskId")
        private String qualityCheckTaskId;

        @com.aliyun.core.annotation.NameInMap("QualityCheckTid")
        private String qualityCheckTid;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Recording(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.calledNumber = builder.calledNumber;
            this.callingNumber = builder.callingNumber;
            this.channel = builder.channel;
            this.contactId = builder.contactId;
            this.contactType = builder.contactType;
            this.duration = builder.duration;
            this.fileDescription = builder.fileDescription;
            this.fileName = builder.fileName;
            this.filePath = builder.filePath;
            this.instanceId = builder.instanceId;
            this.qualityCheckTaskId = builder.qualityCheckTaskId;
            this.qualityCheckTid = builder.qualityCheckTid;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recording create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return calledNumber
         */
        public String getCalledNumber() {
            return this.calledNumber;
        }

        /**
         * @return callingNumber
         */
        public String getCallingNumber() {
            return this.callingNumber;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return contactType
         */
        public String getContactType() {
            return this.contactType;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return qualityCheckTaskId
         */
        public String getQualityCheckTaskId() {
            return this.qualityCheckTaskId;
        }

        /**
         * @return qualityCheckTid
         */
        public String getQualityCheckTid() {
            return this.qualityCheckTid;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String calledNumber; 
            private String callingNumber; 
            private String channel; 
            private String contactId; 
            private String contactType; 
            private Integer duration; 
            private String fileDescription; 
            private String fileName; 
            private String filePath; 
            private String instanceId; 
            private String qualityCheckTaskId; 
            private String qualityCheckTid; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Recording model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.calledNumber = model.calledNumber;
                this.callingNumber = model.callingNumber;
                this.channel = model.channel;
                this.contactId = model.contactId;
                this.contactType = model.contactType;
                this.duration = model.duration;
                this.fileDescription = model.fileDescription;
                this.fileName = model.fileName;
                this.filePath = model.filePath;
                this.instanceId = model.instanceId;
                this.qualityCheckTaskId = model.qualityCheckTaskId;
                this.qualityCheckTid = model.qualityCheckTid;
                this.startTime = model.startTime;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * CalledNumber.
             */
            public Builder calledNumber(String calledNumber) {
                this.calledNumber = calledNumber;
                return this;
            }

            /**
             * CallingNumber.
             */
            public Builder callingNumber(String callingNumber) {
                this.callingNumber = callingNumber;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * ContactType.
             */
            public Builder contactType(String contactType) {
                this.contactType = contactType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileDescription.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
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
             * QualityCheckTaskId.
             */
            public Builder qualityCheckTaskId(String qualityCheckTaskId) {
                this.qualityCheckTaskId = qualityCheckTaskId;
                return this;
            }

            /**
             * QualityCheckTid.
             */
            public Builder qualityCheckTid(String qualityCheckTid) {
                this.qualityCheckTid = qualityCheckTid;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Recording build() {
                return new Recording(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecordingsByContactIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecordingsByContactIdResponseBody</p>
     */
    public static class Recordings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Recording")
        private java.util.List<Recording> recording;

        private Recordings(Builder builder) {
            this.recording = builder.recording;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recordings create() {
            return builder().build();
        }

        /**
         * @return recording
         */
        public java.util.List<Recording> getRecording() {
            return this.recording;
        }

        public static final class Builder {
            private java.util.List<Recording> recording; 

            private Builder() {
            } 

            private Builder(Recordings model) {
                this.recording = model.recording;
            } 

            /**
             * Recording.
             */
            public Builder recording(java.util.List<Recording> recording) {
                this.recording = recording;
                return this;
            }

            public Recordings build() {
                return new Recordings(this);
            } 

        } 

    }
}
