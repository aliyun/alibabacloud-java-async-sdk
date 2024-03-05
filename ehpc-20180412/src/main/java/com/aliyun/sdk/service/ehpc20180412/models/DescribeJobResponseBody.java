// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @NameInMap("Message")
    private Message message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeJobResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Message message; 
        private String requestId; 

        /**
         * The list of returned job information.
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

    public static class Message extends TeaModel {
        @NameInMap("JobInfo")
        private String jobInfo;

        private Message(Builder builder) {
            this.jobInfo = builder.jobInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return jobInfo
         */
        public String getJobInfo() {
            return this.jobInfo;
        }

        public static final class Builder {
            private String jobInfo; 

            /**
             * The details of the job.
             */
            public Builder jobInfo(String jobInfo) {
                this.jobInfo = jobInfo;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
