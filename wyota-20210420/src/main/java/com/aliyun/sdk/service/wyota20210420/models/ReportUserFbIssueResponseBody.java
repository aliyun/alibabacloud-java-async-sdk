// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReportUserFbIssueResponseBody} extends {@link TeaModel}
 *
 * <p>ReportUserFbIssueResponseBody</p>
 */
public class ReportUserFbIssueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ReportUserFbIssueResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportUserFbIssueResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 

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
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReportUserFbIssueResponseBody build() {
            return new ReportUserFbIssueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReportUserFbIssueResponseBody} extends {@link TeaModel}
     *
     * <p>ReportUserFbIssueResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssueId")
        private Integer issueId;

        private Data(Builder builder) {
            this.issueId = builder.issueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return issueId
         */
        public Integer getIssueId() {
            return this.issueId;
        }

        public static final class Builder {
            private Integer issueId; 

            /**
             * IssueId.
             */
            public Builder issueId(Integer issueId) {
                this.issueId = issueId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
