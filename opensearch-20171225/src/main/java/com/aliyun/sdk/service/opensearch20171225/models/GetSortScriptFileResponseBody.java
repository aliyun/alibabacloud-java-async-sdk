// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSortScriptFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetSortScriptFileResponseBody</p>
 */
public class GetSortScriptFileResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetSortScriptFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSortScriptFileResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The content of the sort script.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSortScriptFileResponseBody build() {
            return new GetSortScriptFileResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("content")
        private String content;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("modifyTime")
        private String modifyTime;

        @NameInMap("version")
        private Long version;

        private Result(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.modifyTime = builder.modifyTime;
            this.version = builder.version;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private String modifyTime; 
            private Long version; 

            /**
             * The script content that is encoded in the Base64 format.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The time when the script was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The last time when the script was last modified.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The version of the script.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
