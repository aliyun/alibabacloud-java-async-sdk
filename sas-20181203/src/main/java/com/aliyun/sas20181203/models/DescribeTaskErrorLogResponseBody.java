// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeTaskErrorLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTaskErrorLogResponseBody</p>
 */
public class DescribeTaskErrorLogResponseBody extends TeaModel {
    @NameInMap("Count")
    private Integer count;

    @NameInMap("Logs")
    private java.util.List < Logs> logs;

    @NameInMap("RequestId")
    private String requestId;


    private DescribeTaskErrorLogResponseBody(Builder builder) {
        this.count = builder.count;
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
        private Integer count; 
        private java.util.List < Logs> logs; 
        private String requestId; 

        /**
         * <p>Count.</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>Logs.</p>
         */
        public Builder logs(java.util.List < Logs> logs) {
            this.logs = logs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTaskErrorLogResponseBody build() {
            return new DescribeTaskErrorLogResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @NameInMap("Text")
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
             * <p>Text.</p>
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
