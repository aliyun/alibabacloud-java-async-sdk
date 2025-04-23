// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link GetPostScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPostScriptsResponseBody</p>
 */
public class GetPostScriptsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PostInstallScripts")
    private java.util.List<PostInstallScripts> postInstallScripts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetPostScriptsResponseBody(Builder builder) {
        this.postInstallScripts = builder.postInstallScripts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPostScriptsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return postInstallScripts
     */
    public java.util.List<PostInstallScripts> getPostInstallScripts() {
        return this.postInstallScripts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PostInstallScripts> postInstallScripts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPostScriptsResponseBody model) {
            this.postInstallScripts = model.postInstallScripts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The post-installation scripts.</p>
         */
        public Builder postInstallScripts(java.util.List<PostInstallScripts> postInstallScripts) {
            this.postInstallScripts = postInstallScripts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B745C159-3155-4B94-95D0-4B73D4D2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPostScriptsResponseBody build() {
            return new GetPostScriptsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPostScriptsResponseBody} extends {@link TeaModel}
     *
     * <p>GetPostScriptsResponseBody</p>
     */
    public static class PostInstallScripts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Args")
        private String args;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private PostInstallScripts(Builder builder) {
            this.args = builder.args;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostInstallScripts create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public String getArgs() {
            return this.args;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String args; 
            private String url; 

            private Builder() {
            } 

            private Builder(PostInstallScripts model) {
                this.args = model.args;
                this.url = model.url;
            } 

            /**
             * <p>The parameter that is used to run the post-installation script.</p>
             * 
             * <strong>example:</strong>
             * <p>-h</p>
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * <p>The URL that is used to download the post-installation script.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh">https://bucket.oss-cn-shanghai.aliyuncs.com/postscript_examples.sh</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public PostInstallScripts build() {
                return new PostInstallScripts(this);
            } 

        } 

    }
}
