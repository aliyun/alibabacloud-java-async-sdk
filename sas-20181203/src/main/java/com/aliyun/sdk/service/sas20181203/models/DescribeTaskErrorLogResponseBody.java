// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTaskErrorLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskErrorLogResponseBody</p>
 */
public class DescribeTaskErrorLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Logs")
    private java.util.List < Logs> logs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTaskErrorLogResponseBody(Builder builder) {
        this.logs = builder.logs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTaskErrorLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return logs
     */
    public java.util.List < Logs> getLogs() {
        return this.logs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Logs> logs; 
        private String requestId; 

        /**
         * <p>An array that consists of the error logs.</p>
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F929E952-EBFC-56C3-BD35-BF8B59024C69</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTaskErrorLogResponseBody build() {
            return new DescribeTaskErrorLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTaskErrorLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTaskErrorLogResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        private Logs(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            /**
             * <p>The text content of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>mv: cannot move &quot;CentOS-Base.repo&quot; to &quot;CentOS-Base.repo.backup&quot;: Permission denied</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
}
