// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStreamSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryStreamSnapshotJobResponseBody</p>
 */
public class QueryStreamSnapshotJobResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryStreamSnapshotJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStreamSnapshotJobResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public QueryStreamSnapshotJobResponseBody build() {
            return new QueryStreamSnapshotJobResponseBody(this);
        } 

    } 

    public static class JobList extends TeaModel {
        @NameInMap("SnapshotInterval")
        private Integer snapshotInterval;

        @NameInMap("StreamType")
        private Integer streamType;

        private JobList(Builder builder) {
            this.snapshotInterval = builder.snapshotInterval;
            this.streamType = builder.streamType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobList create() {
            return builder().build();
        }

        /**
         * @return snapshotInterval
         */
        public Integer getSnapshotInterval() {
            return this.snapshotInterval;
        }

        /**
         * @return streamType
         */
        public Integer getStreamType() {
            return this.streamType;
        }

        public static final class Builder {
            private Integer snapshotInterval; 
            private Integer streamType; 

            /**
             * SnapshotInterval.
             */
            public Builder snapshotInterval(Integer snapshotInterval) {
                this.snapshotInterval = snapshotInterval;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Integer streamType) {
                this.streamType = streamType;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("JobList")
        private java.util.List < JobList> jobList;

        private Data(Builder builder) {
            this.jobList = builder.jobList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobList
         */
        public java.util.List < JobList> getJobList() {
            return this.jobList;
        }

        public static final class Builder {
            private java.util.List < JobList> jobList; 

            /**
             * JobList.
             */
            public Builder jobList(java.util.List < JobList> jobList) {
                this.jobList = jobList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
