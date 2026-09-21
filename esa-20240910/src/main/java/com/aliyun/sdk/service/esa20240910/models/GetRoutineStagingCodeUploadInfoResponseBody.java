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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRoutineStagingCodeUploadInfoResponseBody model) {
            this.codeVersion = model.codeVersion;
            this.ossPostConfig = model.ossPostConfig;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The code version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        public Builder codeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }

        /**
         * <p>The configuration information for uploading a JavaScript file to OSS. When uploading to OSS, you must include the OSSAccessKeyId and x-oss-security-token parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;OssPostConfig&quot;: {
         *             &quot;Url&quot;: &quot;<a href="http://oss_fake_bucket_url">http://oss_fake_bucket_url</a>&quot;,
         *             &quot;OSSAccessKeyId&quot;: &quot;xxx&quot;,
         *             &quot;XOssSecurityToken&quot;: &quot;&quot;,
         *             &quot;key&quot;: &quot;sp_esa_rwa/xxx/hello/unstable/routine/index.js&quot;,
         *             &quot;callback&quot;: &quot;xxx=&quot;,
         *             &quot;x:codeDescription&quot;: &quot;xxx=&quot;,
         *             &quot;policy&quot;: &quot;xxx=&quot;,
         *             &quot;Signature&quot;: &quot;xxx=&quot;
         *         }</p>
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
