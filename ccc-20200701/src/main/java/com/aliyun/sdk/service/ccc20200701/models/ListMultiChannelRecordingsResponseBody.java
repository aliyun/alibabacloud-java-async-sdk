// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListMultiChannelRecordingsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMultiChannelRecordingsResponseBody</p>
 */
public class ListMultiChannelRecordingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMultiChannelRecordingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMultiChannelRecordingsResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListMultiChannelRecordingsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Recording list.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B19CD719-9F65-56A6-8B79-DA4282EA4797</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMultiChannelRecordingsResponseBody build() {
            return new ListMultiChannelRecordingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMultiChannelRecordingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiChannelRecordingsResponseBody</p>
     */
    public static class HoldTimeSegments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private HoldTimeSegments(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoldTimeSegments create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(HoldTimeSegments model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The end time of the call hold, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1687860143925</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Call hold start time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1673255098049</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public HoldTimeSegments build() {
                return new HoldTimeSegments(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMultiChannelRecordingsResponseBody} extends {@link TeaModel}
     *
     * <p>ListMultiChannelRecordingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentChannelId")
        private String agentChannelId;

        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("HoldTimeSegments")
        private java.util.List<HoldTimeSegments> holdTimeSegments;

        @com.aliyun.core.annotation.NameInMap("RamId")
        private String ramId;

        @com.aliyun.core.annotation.NameInMap("SkillGroupId")
        private String skillGroupId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private Data(Builder builder) {
            this.agentChannelId = builder.agentChannelId;
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.contactId = builder.contactId;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileUrl = builder.fileUrl;
            this.holdTimeSegments = builder.holdTimeSegments;
            this.ramId = builder.ramId;
            this.skillGroupId = builder.skillGroupId;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentChannelId
         */
        public String getAgentChannelId() {
            return this.agentChannelId;
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
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return holdTimeSegments
         */
        public java.util.List<HoldTimeSegments> getHoldTimeSegments() {
            return this.holdTimeSegments;
        }

        /**
         * @return ramId
         */
        public String getRamId() {
            return this.ramId;
        }

        /**
         * @return skillGroupId
         */
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String agentChannelId; 
            private String agentId; 
            private String agentName; 
            private String contactId; 
            private String duration; 
            private String fileName; 
            private String fileUrl; 
            private java.util.List<HoldTimeSegments> holdTimeSegments; 
            private String ramId; 
            private String skillGroupId; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentChannelId = model.agentChannelId;
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.contactId = model.contactId;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileUrl = model.fileUrl;
                this.holdTimeSegments = model.holdTimeSegments;
                this.ramId = model.ramId;
                this.skillGroupId = model.skillGroupId;
                this.startTime = model.startTime;
            } 

            /**
             * <p>Agent call channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ch-user-8526899****-8602****-1656926504363-job-25920271311543****</p>
             */
            public Builder agentChannelId(String agentChannelId) {
                this.agentChannelId = agentChannelId;
                return this;
            }

            /**
             * <p>Agent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agent@ccc-test</p>
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>Agent name.</p>
             * 
             * <strong>example:</strong>
             * <p>坐席小王</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-25920271311543****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>Recording duration, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>56321</p>
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Recording file name.</p>
             * 
             * <strong>example:</strong>
             * <p>job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>OSS download URL for the recording file. Note the time-to-live (TTL) of the download URL. The download URL is valid for 1 day.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ccc-v2-shanghai.oss-cn-shanghai.aliyuncs.com/ccc-test/job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv?Expires=1657014031&OSSAccessKeyId=****&Signature=">https://ccc-v2-shanghai.oss-cn-shanghai.aliyuncs.com/ccc-test/job-25920271311543****-798f1e90-1f82-42da-914c-46580c8f4c85-1656926518491.mkv?Expires=1657014031&amp;OSSAccessKeyId=****&amp;Signature=</a>****</p>
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * <p>List of call hold time segments.</p>
             */
            public Builder holdTimeSegments(java.util.List<HoldTimeSegments> holdTimeSegments) {
                this.holdTimeSegments = holdTimeSegments;
                return this;
            }

            /**
             * <p>RAM account ID for the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>22807673106369****</p>
             */
            public Builder ramId(String ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * <p>Skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>skillgroup@ccc-test</p>
             */
            public Builder skillGroupId(String skillGroupId) {
                this.skillGroupId = skillGroupId;
                return this;
            }

            /**
             * <p>Recording start time, in UNIX timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1656926518491</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
