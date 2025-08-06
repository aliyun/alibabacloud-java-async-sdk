// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeRefreshQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRefreshQuotaResponseBody</p>
 */
public class DescribeRefreshQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RefreshCacheQuota")
    private RefreshCacheQuota refreshCacheQuota;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRefreshQuotaResponseBody(Builder builder) {
        this.refreshCacheQuota = builder.refreshCacheQuota;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefreshQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return refreshCacheQuota
     */
    public RefreshCacheQuota getRefreshCacheQuota() {
        return this.refreshCacheQuota;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RefreshCacheQuota refreshCacheQuota; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRefreshQuotaResponseBody model) {
            this.refreshCacheQuota = model.refreshCacheQuota;
            this.requestId = model.requestId;
        } 

        /**
         * RefreshCacheQuota.
         */
        public Builder refreshCacheQuota(RefreshCacheQuota refreshCacheQuota) {
            this.refreshCacheQuota = refreshCacheQuota;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRefreshQuotaResponseBody build() {
            return new DescribeRefreshQuotaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRefreshQuotaResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRefreshQuotaResponseBody</p>
     */
    public static class RefreshCacheQuota extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirQuota")
        private String dirQuota;

        @com.aliyun.core.annotation.NameInMap("DirRemain")
        private String dirRemain;

        @com.aliyun.core.annotation.NameInMap("UrlQuota")
        private String urlQuota;

        @com.aliyun.core.annotation.NameInMap("UrlRemain")
        private String urlRemain;

        private RefreshCacheQuota(Builder builder) {
            this.dirQuota = builder.dirQuota;
            this.dirRemain = builder.dirRemain;
            this.urlQuota = builder.urlQuota;
            this.urlRemain = builder.urlRemain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefreshCacheQuota create() {
            return builder().build();
        }

        /**
         * @return dirQuota
         */
        public String getDirQuota() {
            return this.dirQuota;
        }

        /**
         * @return dirRemain
         */
        public String getDirRemain() {
            return this.dirRemain;
        }

        /**
         * @return urlQuota
         */
        public String getUrlQuota() {
            return this.urlQuota;
        }

        /**
         * @return urlRemain
         */
        public String getUrlRemain() {
            return this.urlRemain;
        }

        public static final class Builder {
            private String dirQuota; 
            private String dirRemain; 
            private String urlQuota; 
            private String urlRemain; 

            private Builder() {
            } 

            private Builder(RefreshCacheQuota model) {
                this.dirQuota = model.dirQuota;
                this.dirRemain = model.dirRemain;
                this.urlQuota = model.urlQuota;
                this.urlRemain = model.urlRemain;
            } 

            /**
             * DirQuota.
             */
            public Builder dirQuota(String dirQuota) {
                this.dirQuota = dirQuota;
                return this;
            }

            /**
             * DirRemain.
             */
            public Builder dirRemain(String dirRemain) {
                this.dirRemain = dirRemain;
                return this;
            }

            /**
             * UrlQuota.
             */
            public Builder urlQuota(String urlQuota) {
                this.urlQuota = urlQuota;
                return this;
            }

            /**
             * UrlRemain.
             */
            public Builder urlRemain(String urlRemain) {
                this.urlRemain = urlRemain;
                return this;
            }

            public RefreshCacheQuota build() {
                return new RefreshCacheQuota(this);
            } 

        } 

    }
}
