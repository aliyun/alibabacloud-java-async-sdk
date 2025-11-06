// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link GetIntlFixPriceDomainListUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntlFixPriceDomainListUrlResponseBody</p>
 */
public class GetIntlFixPriceDomainListUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetIntlFixPriceDomainListUrlResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntlFixPriceDomainListUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Module module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetIntlFixPriceDomainListUrlResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIntlFixPriceDomainListUrlResponseBody build() {
            return new GetIntlFixPriceDomainListUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIntlFixPriceDomainListUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetIntlFixPriceDomainListUrlResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        private Module(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public static final class Builder {
            private String downloadUrl; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.downloadUrl = model.downloadUrl;
            } 

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
