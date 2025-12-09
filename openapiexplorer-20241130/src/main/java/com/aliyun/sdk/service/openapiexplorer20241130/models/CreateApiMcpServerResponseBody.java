// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link CreateApiMcpServerResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApiMcpServerResponseBody</p>
 */
public class CreateApiMcpServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("urls")
    private Urls urls;

    private CreateApiMcpServerResponseBody(Builder builder) {
        this.id = builder.id;
        this.requestId = builder.requestId;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiMcpServerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return urls
     */
    public Urls getUrls() {
        return this.urls;
    }

    public static final class Builder {
        private String id; 
        private String requestId; 
        private Urls urls; 

        private Builder() {
        } 

        private Builder(CreateApiMcpServerResponseBody model) {
            this.id = model.id;
            this.requestId = model.requestId;
            this.urls = model.urls;
        } 

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * urls.
         */
        public Builder urls(Urls urls) {
            this.urls = urls;
            return this;
        }

        public CreateApiMcpServerResponseBody build() {
            return new CreateApiMcpServerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApiMcpServerResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApiMcpServerResponseBody</p>
     */
    public static class Urls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mcp")
        private String mcp;

        @com.aliyun.core.annotation.NameInMap("sse")
        private String sse;

        @com.aliyun.core.annotation.NameInMap("vpcMcp")
        private String vpcMcp;

        @com.aliyun.core.annotation.NameInMap("vpcSse")
        private String vpcSse;

        private Urls(Builder builder) {
            this.mcp = builder.mcp;
            this.sse = builder.sse;
            this.vpcMcp = builder.vpcMcp;
            this.vpcSse = builder.vpcSse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urls create() {
            return builder().build();
        }

        /**
         * @return mcp
         */
        public String getMcp() {
            return this.mcp;
        }

        /**
         * @return sse
         */
        public String getSse() {
            return this.sse;
        }

        /**
         * @return vpcMcp
         */
        public String getVpcMcp() {
            return this.vpcMcp;
        }

        /**
         * @return vpcSse
         */
        public String getVpcSse() {
            return this.vpcSse;
        }

        public static final class Builder {
            private String mcp; 
            private String sse; 
            private String vpcMcp; 
            private String vpcSse; 

            private Builder() {
            } 

            private Builder(Urls model) {
                this.mcp = model.mcp;
                this.sse = model.sse;
                this.vpcMcp = model.vpcMcp;
                this.vpcSse = model.vpcSse;
            } 

            /**
             * mcp.
             */
            public Builder mcp(String mcp) {
                this.mcp = mcp;
                return this;
            }

            /**
             * sse.
             */
            public Builder sse(String sse) {
                this.sse = sse;
                return this;
            }

            /**
             * vpcMcp.
             */
            public Builder vpcMcp(String vpcMcp) {
                this.vpcMcp = vpcMcp;
                return this;
            }

            /**
             * vpcSse.
             */
            public Builder vpcSse(String vpcSse) {
                this.vpcSse = vpcSse;
                return this;
            }

            public Urls build() {
                return new Urls(this);
            } 

        } 

    }
}
