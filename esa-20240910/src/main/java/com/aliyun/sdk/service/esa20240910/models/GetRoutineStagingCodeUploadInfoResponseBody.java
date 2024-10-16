// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRoutineStagingCodeUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineStagingCodeUploadInfoResponseBody</p>
 */
public class GetRoutineStagingCodeUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.NameInMap("OssPostConfig")
    private java.util.Map < String, ? > ossPostConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRoutineStagingCodeUploadInfoResponseBody(Builder builder) {
        this.codeVersion = builder.codeVersion;
        this.ossPostConfig = builder.ossPostConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoutineStagingCodeUploadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeVersion
     */
    public String getCodeVersion() {
        return this.codeVersion;
    }

    /**
     * @return ossPostConfig
     */
    public java.util.Map < String, ? > getOssPostConfig() {
        return this.ossPostConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeVersion; 
        private java.util.Map < String, ? > ossPostConfig; 
        private String requestId; 

        /**
         * CodeVersion.
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * OssPostConfig.
         */
        public Builder ossPostConfig(java.util.Map < String, ? > ossPostConfig) {
            this.ossPostConfig = ossPostConfig;
            return this;
        }

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRoutineStagingCodeUploadInfoResponseBody build() {
            return new GetRoutineStagingCodeUploadInfoResponseBody(this);
        } 

    } 

}
