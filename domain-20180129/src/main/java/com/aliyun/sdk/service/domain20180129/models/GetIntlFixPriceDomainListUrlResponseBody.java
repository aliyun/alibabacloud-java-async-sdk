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
         * <p>The returned data.</p>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BF014B60-C708-4253-B5F2-3F9B493F398B</p>
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
             * <p>The URL for downloading the list that contains available fixed-price domain names at the international site (alibabacloud.com).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&OSSAccessKeyId=LTAI5tPMAybR4gfSEjdf****&Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuT">http://intl-fixed-price.oss-cn-zhangjiakou.aliyuncs.com/aliyun_intl_fixed_price_domain_20240827.gz?Expires=1724830838&amp;OSSAccessKeyId=LTAI5tPMAybR4gfSEjdf****&amp;Signature=tb0SPs6tKb9gLKyQ5ibpQnBUuT</a>****</p>
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
