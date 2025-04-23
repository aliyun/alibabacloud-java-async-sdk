// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link DescribeJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeJobResponseBody</p>
 */
public class DescribeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private Message message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeJobResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of returned job information.</p>
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9697AD8D-56FA-4C8E-B46C-00AC9***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeJobResponseBody build() {
            return new DescribeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeJobResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeJobResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JobInfo")
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

            private Builder() {
            } 

            private Builder(Message model) {
                this.jobInfo = model.jobInfo;
            } 

            /**
             * <p>The details of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;2.scheduler&quot;: {&quot;egroup&quot;: &quot;users&quot;,&quot;Stageout_status&quot;: 1,&quot;Keep_Files&quot;: &quot;n&quot;,&quot;server&quot;: &quot;scheduler&quot;,&quot;queue&quot;: &quot;workq&quot;}}</p>
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
