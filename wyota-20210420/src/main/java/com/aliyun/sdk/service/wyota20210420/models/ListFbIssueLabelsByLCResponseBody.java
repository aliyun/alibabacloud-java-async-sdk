// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFbIssueLabelsByLCResponseBody} extends {@link TeaModel}
 *
 * <p>ListFbIssueLabelsByLCResponseBody</p>
 */
public class ListFbIssueLabelsByLCResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFbIssueLabelsByLCResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFbIssueLabelsByLCResponseBody create() {
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

        public ListFbIssueLabelsByLCResponseBody build() {
            return new ListFbIssueLabelsByLCResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IssueLabel")
        private java.util.List < String > issueLabel;

        private Data(Builder builder) {
            this.issueLabel = builder.issueLabel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return issueLabel
         */
        public java.util.List < String > getIssueLabel() {
            return this.issueLabel;
        }

        public static final class Builder {
            private java.util.List < String > issueLabel; 

            /**
             * IssueLabel.
             */
            public Builder issueLabel(java.util.List < String > issueLabel) {
                this.issueLabel = issueLabel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
