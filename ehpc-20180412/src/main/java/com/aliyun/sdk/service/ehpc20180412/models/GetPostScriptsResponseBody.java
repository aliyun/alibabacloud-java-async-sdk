// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPostScriptsResponseBody} extends {@link TeaModel}
 *
 * <p>GetPostScriptsResponseBody</p>
 */
public class GetPostScriptsResponseBody extends TeaModel {
    @NameInMap("PostInstallScripts")
    private java.util.List < PostInstallScripts> postInstallScripts;

    @NameInMap("RequestId")
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

    /**
     * @return postInstallScripts
     */
    public java.util.List < PostInstallScripts> getPostInstallScripts() {
        return this.postInstallScripts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PostInstallScripts> postInstallScripts; 
        private String requestId; 

        /**
         * PostInstallScripts.
         */
        public Builder postInstallScripts(java.util.List < PostInstallScripts> postInstallScripts) {
            this.postInstallScripts = postInstallScripts;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPostScriptsResponseBody build() {
            return new GetPostScriptsResponseBody(this);
        } 

    } 

    public static class PostInstallScripts extends TeaModel {
        @NameInMap("Args")
        private String args;

        @NameInMap("Url")
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

            /**
             * Args.
             */
            public Builder args(String args) {
                this.args = args;
                return this;
            }

            /**
             * Url.
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
