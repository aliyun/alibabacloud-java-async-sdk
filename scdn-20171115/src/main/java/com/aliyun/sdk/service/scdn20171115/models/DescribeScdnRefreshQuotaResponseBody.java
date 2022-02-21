// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScdnRefreshQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScdnRefreshQuotaResponseBody</p>
 */
public class DescribeScdnRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    private String blockQuota;

    @NameInMap("DirQuota")
    private String dirQuota;

    @NameInMap("DirRemain")
    private String dirRemain;

    @NameInMap("PreloadQuota")
    private String preloadQuota;

    @NameInMap("PreloadRemain")
    private String preloadRemain;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UrlQuota")
    private String urlQuota;

    @NameInMap("UrlRemain")
    private String urlRemain;

    @NameInMap("blockRemain")
    private String blockRemain;

    private DescribeScdnRefreshQuotaResponseBody(Builder builder) {
        this.blockQuota = builder.blockQuota;
        this.dirQuota = builder.dirQuota;
        this.dirRemain = builder.dirRemain;
        this.preloadQuota = builder.preloadQuota;
        this.preloadRemain = builder.preloadRemain;
        this.requestId = builder.requestId;
        this.urlQuota = builder.urlQuota;
        this.urlRemain = builder.urlRemain;
        this.blockRemain = builder.blockRemain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScdnRefreshQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return blockQuota
     */
    public String getBlockQuota() {
        return this.blockQuota;
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
     * @return preloadQuota
     */
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

    /**
     * @return preloadRemain
     */
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    /**
     * @return blockRemain
     */
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public static final class Builder {
        private String blockQuota; 
        private String dirQuota; 
        private String dirRemain; 
        private String preloadQuota; 
        private String preloadRemain; 
        private String requestId; 
        private String urlQuota; 
        private String urlRemain; 
        private String blockRemain; 

        /**
         * BlockQuota.
         */
        public Builder blockQuota(String blockQuota) {
            this.blockQuota = blockQuota;
            return this;
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
         * PreloadQuota.
         */
        public Builder preloadQuota(String preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * PreloadRemain.
         */
        public Builder preloadRemain(String preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        /**
         * blockRemain.
         */
        public Builder blockRemain(String blockRemain) {
            this.blockRemain = blockRemain;
            return this;
        }

        public DescribeScdnRefreshQuotaResponseBody build() {
            return new DescribeScdnRefreshQuotaResponseBody(this);
        } 

    } 

}
