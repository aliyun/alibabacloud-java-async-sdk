// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRecordingsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRecordingsResponseBody</p>
 */
public class DescribeRecordingsResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Recordings")
    private java.util.List < Recordings> recordings;

    @NameInMap("RequestId")
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
        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndUserIds")
        private java.util.List < String > endUserIds;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("RecordingSize")
        private Integer recordingSize;

        @NameInMap("RecordingType")
        private String recordingType;

        @NameInMap("StartTime")
        private String startTime;

        private Recordings(Builder builder) {
            this.desktopId = builder.desktopId;
            this.endTime = builder.endTime;
            this.endUserIds = builder.endUserIds;
            this.filePath = builder.filePath;
            this.recordingSize = builder.recordingSize;
            this.recordingType = builder.recordingType;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String desktopId; 
            private String endTime; 
            private java.util.List < String > endUserIds; 
            private String filePath; 
            private Integer recordingSize; 
            private String recordingType; 
            private String startTime; 

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
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
