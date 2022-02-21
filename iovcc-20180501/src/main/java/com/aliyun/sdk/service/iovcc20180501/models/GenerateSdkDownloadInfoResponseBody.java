// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateSdkDownloadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateSdkDownloadInfoResponseBody</p>
 */
public class GenerateSdkDownloadInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SdkDownloadInfo")
    private SdkDownloadInfo sdkDownloadInfo;

    private GenerateSdkDownloadInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdkDownloadInfo = builder.sdkDownloadInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSdkDownloadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdkDownloadInfo
     */
    public SdkDownloadInfo getSdkDownloadInfo() {
        return this.sdkDownloadInfo;
    }

    public static final class Builder {
        private String requestId; 
        private SdkDownloadInfo sdkDownloadInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdkDownloadInfo.
         */
        public Builder sdkDownloadInfo(SdkDownloadInfo sdkDownloadInfo) {
            this.sdkDownloadInfo = sdkDownloadInfo;
            return this;
        }

        public GenerateSdkDownloadInfoResponseBody build() {
            return new GenerateSdkDownloadInfoResponseBody(this);
        } 

    } 

    public static class SdkDownloadInfo extends TeaModel {
        @NameInMap("Url")
        private String url;

        private SdkDownloadInfo(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkDownloadInfo create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public SdkDownloadInfo build() {
                return new SdkDownloadInfo(this);
            } 

        } 

    }
}
