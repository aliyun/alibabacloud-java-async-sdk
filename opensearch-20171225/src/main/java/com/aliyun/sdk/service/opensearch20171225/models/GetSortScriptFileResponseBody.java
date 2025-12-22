// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link GetSortScriptFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetSortScriptFileResponseBody</p>
 */
public class GetSortScriptFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSortScriptFileResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABCDEFGH</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The content of the sort script.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSortScriptFileResponseBody build() {
            return new GetSortScriptFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSortScriptFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetSortScriptFileResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("modifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("version")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.modifyTime = model.modifyTime;
                this.version = model.version;
            } 

            /**
             * <p>The script content that is encoded in the Base64 format.</p>
             * 
             * <strong>example:</strong>
             * <p>YWJjZGVmZw==</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The time when the script was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 20:21:14</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the script was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-04-02 21:21:14</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The version of the script content.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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
