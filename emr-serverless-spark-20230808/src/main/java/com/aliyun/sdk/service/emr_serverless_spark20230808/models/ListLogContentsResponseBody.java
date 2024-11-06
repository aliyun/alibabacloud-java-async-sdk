// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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

        /**
         * listLogContent.
         */
        public Builder listLogContent(ListLogContent listLogContent) {
            this.listLogContent = listLogContent;
            return this;
        }

        /**
         * <p>请求ID。</p>
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

            /**
             * LineContent.
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
        private java.util.List < Contents> contents;

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
        public java.util.List < Contents> getContents() {
            return this.contents;
        }

        /**
         * @return totalLength
         */
        public Long getTotalLength() {
            return this.totalLength;
        }

        public static final class Builder {
            private java.util.List < Contents> contents; 
            private Long totalLength; 

            /**
             * contents.
             */
            public Builder contents(java.util.List < Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * totalLength.
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
