// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeRecordingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordingsResponseBody</p>
 */
public class DescribeRecordingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Recordings")
    private java.util.List<Recordings> recordings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRecordingsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.recordings = builder.recordings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecordingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return recordings
     */
    public java.util.List<Recordings> getRecordings() {
        return this.recordings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List<Recordings> recordings; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRecordingsResponseBody model) {
            this.nextToken = model.nextToken;
            this.recordings = model.recordings;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAV3MpHK1AP0pfERHZN5pu6nbCQ7ar+fECeh1IuWQXi39R5eoJ68zWp99mTAKRRNRhw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The screen recording files.</p>
         */
        public Builder recordings(java.util.List<Recordings> recordings) {
            this.recordings = recordings;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>327CFE78-1C0D-51AC-A9C6-BCEDF0DD44D6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRecordingsResponseBody build() {
            return new DescribeRecordingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRecordingsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRecordingsResponseBody</p>
     */
    public static class Recordings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List<String> endUserIds;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
        private String policyGroupId;

        @com.aliyun.core.annotation.NameInMap("RecordingSize")
        private Integer recordingSize;

        @com.aliyun.core.annotation.NameInMap("RecordingType")
        private String recordingType;

        @com.aliyun.core.annotation.NameInMap("SignedUrl")
        private String signedUrl;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private Recordings(Builder builder) {
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.endTime = builder.endTime;
            this.endUserIds = builder.endUserIds;
            this.filePath = builder.filePath;
            this.policyGroupId = builder.policyGroupId;
            this.recordingSize = builder.recordingSize;
            this.recordingType = builder.recordingType;
            this.signedUrl = builder.signedUrl;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recordings create() {
            return builder().build();
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return endUserIds
         */
        public java.util.List<String> getEndUserIds() {
            return this.endUserIds;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return policyGroupId
         */
        public String getPolicyGroupId() {
            return this.policyGroupId;
        }

        /**
         * @return recordingSize
         */
        public Integer getRecordingSize() {
            return this.recordingSize;
        }

        /**
         * @return recordingType
         */
        public String getRecordingType() {
            return this.recordingType;
        }

        /**
         * @return signedUrl
         */
        public String getSignedUrl() {
            return this.signedUrl;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String desktopId; 
            private String desktopName; 
            private String endTime; 
            private java.util.List<String> endUserIds; 
            private String filePath; 
            private String policyGroupId; 
            private Integer recordingSize; 
            private String recordingType; 
            private String signedUrl; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(Recordings model) {
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.endTime = model.endTime;
                this.endUserIds = model.endUserIds;
                this.filePath = model.filePath;
                this.policyGroupId = model.policyGroupId;
                this.recordingSize = model.recordingSize;
                this.recordingType = model.recordingType;
                this.signedUrl = model.signedUrl;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The cloud computer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-10v0vuvm616sk****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The cloud computer name.</p>
             * 
             * <strong>example:</strong>
             * <p>DemoComputer</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <p>The end time of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T07:26:06Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The end user IDs.</p>
             */
            public Builder endUserIds(java.util.List<String> endUserIds) {
                this.endUserIds = endUserIds;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-4w5nk44zo5yl129dd/1mk78dugw344.mp4</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pg-6dn811rzrwh9ws4z6</p>
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * <p>The size of the screen recording file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1742845</p>
             */
            public Builder recordingSize(Integer recordingSize) {
                this.recordingSize = recordingSize;
                return this;
            }

            /**
             * <p>The type of event that triggers the recording.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>byaction_cmd_ft: triggered by copy-paste or file transfer events.</li>
             * <li>period: triggered at scheduled intervals.</li>
             * <li>session: triggered by session lifecycle monitoring.</li>
             * <li>byaction_commands: triggered by copy-paste only.</li>
             * <li>alltime: continuous recording.</li>
             * <li>byaction_file_transfer: triggered by file transfer only.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>alltime</p>
             */
            public Builder recordingType(String recordingType) {
                this.recordingType = recordingType;
                return this;
            }

            /**
             * <p>The download URL of the screen recording file.</p>
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            /**
             * <p>The start time of the recording.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-04-10T07:26:06Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Recordings build() {
                return new Recordings(this);
            } 

        } 

    }
}
