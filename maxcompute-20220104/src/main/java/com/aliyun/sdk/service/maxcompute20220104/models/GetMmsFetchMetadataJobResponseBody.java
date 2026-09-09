// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link GetMmsFetchMetadataJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetMmsFetchMetadataJobResponseBody</p>
 */
public class GetMmsFetchMetadataJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMmsFetchMetadataJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMmsFetchMetadataJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMmsFetchMetadataJobResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5CA6292A-E301-5CD8-B4E2-AF060F99147B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMmsFetchMetadataJobResponseBody build() {
            return new GetMmsFetchMetadataJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMmsFetchMetadataJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMmsFetchMetadataJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("errorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("sourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.errorMsg = builder.errorMsg;
            this.id = builder.id;
            this.progress = builder.progress;
            this.result = builder.result;
            this.sourceId = builder.sourceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String endTime; 
            private String errorMsg; 
            private Long id; 
            private Float progress; 
            private String result; 
            private Long sourceId; 
            private String startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.errorMsg = model.errorMsg;
                this.id = model.id;
                this.progress = model.progress;
                this.result = model.result;
                this.sourceId = model.sourceId;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The time when metadata synchronization ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-16 19:10:07</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>unexpected exception</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The ID of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>1000002</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The progress of metadata synchronization. Valid values: 1 to 10000.</p>
             * 
             * <strong>example:</strong>
             * <p>5000</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The result of metadata synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;databases&quot;:5,&quot;tables&quot;:75,&quot;partitions&quot;:215}</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The data source ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2000015</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The time when metadata synchronization started.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-16 19:09:37</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the asynchronous task for metadata synchronization.</p>
             * 
             * <strong>example:</strong>
             * <p>SCAN_DOING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
