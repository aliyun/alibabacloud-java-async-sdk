// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDcdnProjectExistResponseBody} extends {@link TeaModel}
 *
 * <p>CheckDcdnProjectExistResponseBody</p>
 */
public class CheckDcdnProjectExistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckDcdnProjectExistResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDcdnProjectExistResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * The returned results.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckDcdnProjectExistResponseBody build() {
            return new CheckDcdnProjectExistResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exist")
        private String exist;

        private Content(Builder builder) {
            this.exist = builder.exist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return exist
         */
        public String getExist() {
            return this.exist;
        }

        public static final class Builder {
            private String exist; 

            /**
             * Indicates whether the real-time log delivery project exists. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder exist(String exist) {
                this.exist = exist;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
