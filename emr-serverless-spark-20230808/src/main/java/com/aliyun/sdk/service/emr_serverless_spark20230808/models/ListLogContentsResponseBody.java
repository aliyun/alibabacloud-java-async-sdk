// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListLogContentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLogContentsResponseBody</p>
 */
public class ListLogContentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("listLogContent")
    private ListLogContent listLogContent;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListLogContentsResponseBody(Builder builder) {
        this.listLogContent = builder.listLogContent;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLogContentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listLogContent
     */
    public ListLogContent getListLogContent() {
        return this.listLogContent;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ListLogContent listLogContent; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListLogContentsResponseBody model) {
            this.listLogContent = model.listLogContent;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Log content.</p>
         */
        public Builder listLogContent(ListLogContent listLogContent) {
            this.listLogContent = listLogContent;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListLogContentsResponseBody build() {
            return new ListLogContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLogContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogContentsResponseBody</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LineContent")
        private String lineContent;

        private Contents(Builder builder) {
            this.lineContent = builder.lineContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return lineContent
         */
        public String getLineContent() {
            return this.lineContent;
        }

        public static final class Builder {
            private String lineContent; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.lineContent = model.lineContent;
            } 

            /**
             * <p>Log line content.</p>
             * 
             * <strong>example:</strong>
             * <p>spark pi is 3.14\n</p>
             */
            public Builder lineContent(String lineContent) {
                this.lineContent = lineContent;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLogContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListLogContentsResponseBody</p>
     */
    public static class ListLogContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("totalLength")
        private Long totalLength;

        private ListLogContent(Builder builder) {
            this.contents = builder.contents;
            this.totalLength = builder.totalLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListLogContent create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        /**
         * @return totalLength
         */
        public Long getTotalLength() {
            return this.totalLength;
        }

        public static final class Builder {
            private java.util.List<Contents> contents; 
            private Long totalLength; 

            private Builder() {
            } 

            private Builder(ListLogContent model) {
                this.contents = model.contents;
                this.totalLength = model.totalLength;
            } 

            /**
             * <p>List of log line contents.</p>
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * <p>Total number of log lines.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalLength(Long totalLength) {
                this.totalLength = totalLength;
                return this;
            }

            public ListLogContent build() {
                return new ListLogContent(this);
            } 

        } 

    }
}
