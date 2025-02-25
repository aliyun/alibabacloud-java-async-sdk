// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link GetRoutineStagingCodeUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoutineStagingCodeUploadInfoResponseBody</p>
 */
public class GetRoutineStagingCodeUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeVersion")
    private String codeVersion;

    @com.aliyun.core.annotation.NameInMap("OssPostConfig")
    private java.util.Map<String, ?> ossPostConfig;

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
    public java.util.Map<String, ?> getOssPostConfig() {
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
        private java.util.Map<String, ?> ossPostConfig; 
        private String requestId; 

        /**
         * <p>The code version.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>The configuration information that can be used to upload to OSS.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *             &quot;Url&quot;: &quot;<a href="http://oss_fake_bucket_url">http://oss_fake_bucket_url</a>&quot;,
         *             &quot;OSSAccessKeyId&quot;: &quot;xxx&quot;,
         *             &quot;key&quot;: &quot;site_er_js/hello.1418586423220543.unstable.js&quot;,
         *             &quot;callback&quot;: &quot;xxx==&quot;,
         *             &quot;x:codeDescription&quot;: &quot;xxx=&quot;,
         *             &quot;policy&quot;: &quot;xxx&quot;,
         *             &quot;Signature&quot;: &quot;xxx=&quot;
         * }</p>
         */
        public Builder ossPostConfig(java.util.Map<String, ?> ossPostConfig) {
            this.ossPostConfig = ossPostConfig;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
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
