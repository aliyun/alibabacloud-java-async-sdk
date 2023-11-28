// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultCollectorConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDefaultCollectorConfigurationsResponseBody</p>
 */
public class ListDefaultCollectorConfigurationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListDefaultCollectorConfigurationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultCollectorConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDefaultCollectorConfigurationsResponseBody build() {
            return new ListDefaultCollectorConfigurationsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("fileName")
        private String fileName;

        private Result(Builder builder) {
            this.content = builder.content;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String content; 
            private String fileName; 

            /**
             * The content of the configuration file.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The name of the configuration file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
