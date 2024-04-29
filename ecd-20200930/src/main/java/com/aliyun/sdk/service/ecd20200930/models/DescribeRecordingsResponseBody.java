// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordingsResponseBody</p>
 */
public class DescribeRecordingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Recordings")
    private java.util.List < Recordings> recordings;

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

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return recordings
     */
    public java.util.List < Recordings> getRecordings() {
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
        private java.util.List < Recordings> recordings; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Recordings.
         */
        public Builder recordings(java.util.List < Recordings> recordings) {
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

        public DescribeRecordingsResponseBody build() {
            return new DescribeRecordingsResponseBody(this);
        } 

    } 

    public static class Recordings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

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
        public java.util.List < String > getEndUserIds() {
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
            private java.util.List < String > endUserIds; 
            private String filePath; 
            private String policyGroupId; 
            private Integer recordingSize; 
            private String recordingType; 
            private String signedUrl; 
            private String startTime; 

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndUserIds.
             */
            public Builder endUserIds(java.util.List < String > endUserIds) {
                this.endUserIds = endUserIds;
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
             * PolicyGroupId.
             */
            public Builder policyGroupId(String policyGroupId) {
                this.policyGroupId = policyGroupId;
                return this;
            }

            /**
             * RecordingSize.
             */
            public Builder recordingSize(Integer recordingSize) {
                this.recordingSize = recordingSize;
                return this;
            }

            /**
             * RecordingType.
             */
            public Builder recordingType(String recordingType) {
                this.recordingType = recordingType;
                return this;
            }

            /**
             * SignedUrl.
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            /**
             * StartTime.
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
