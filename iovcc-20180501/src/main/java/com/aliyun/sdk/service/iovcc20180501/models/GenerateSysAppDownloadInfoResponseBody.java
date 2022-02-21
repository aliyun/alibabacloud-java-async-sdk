// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateSysAppDownloadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateSysAppDownloadInfoResponseBody</p>
 */
public class GenerateSysAppDownloadInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SysAppDownloadInfo")
    private SysAppDownloadInfo sysAppDownloadInfo;

    private GenerateSysAppDownloadInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sysAppDownloadInfo = builder.sysAppDownloadInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateSysAppDownloadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sysAppDownloadInfo
     */
    public SysAppDownloadInfo getSysAppDownloadInfo() {
        return this.sysAppDownloadInfo;
    }

    public static final class Builder {
        private String requestId; 
        private SysAppDownloadInfo sysAppDownloadInfo; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SysAppDownloadInfo.
         */
        public Builder sysAppDownloadInfo(SysAppDownloadInfo sysAppDownloadInfo) {
            this.sysAppDownloadInfo = sysAppDownloadInfo;
            return this;
        }

        public GenerateSysAppDownloadInfoResponseBody build() {
            return new GenerateSysAppDownloadInfoResponseBody(this);
        } 

    } 

    public static class SysAppDownloadInfo extends TeaModel {
        @NameInMap("Url")
        private String url;

        private SysAppDownloadInfo(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SysAppDownloadInfo create() {
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

            public SysAppDownloadInfo build() {
                return new SysAppDownloadInfo(this);
            } 

        } 

    }
}
