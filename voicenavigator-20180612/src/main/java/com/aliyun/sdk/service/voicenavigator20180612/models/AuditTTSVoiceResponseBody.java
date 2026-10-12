// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link AuditTTSVoiceResponseBody} extends {@link TeaModel}
 *
 * <p>AuditTTSVoiceResponseBody</p>
 */
public class AuditTTSVoiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuditionUrl")
    private String auditionUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AuditTTSVoiceResponseBody(Builder builder) {
        this.auditionUrl = builder.auditionUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AuditTTSVoiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditionUrl
     */
    public String getAuditionUrl() {
        return this.auditionUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String auditionUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AuditTTSVoiceResponseBody model) {
            this.auditionUrl = model.auditionUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The audition URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://voicenavigator-cn-shanghai.oss-cn-shanghai.aliyuncs.com/exported_files/2020-02-20/ttsConfig-1582188148528-abd8e407de0a49b381bb591bd91fc073.wav?Expires=1582188208&OSSAccessKeyId=LTAIppQY*******&Signature=FaBassElzqGEB0H2TvTKPJsOJHs%3D">http://voicenavigator-cn-shanghai.oss-cn-shanghai.aliyuncs.com/exported_files/2020-02-20/ttsConfig-1582188148528-abd8e407de0a49b381bb591bd91fc073.wav?Expires=1582188208&amp;OSSAccessKeyId=LTAIppQY*******&amp;Signature=FaBassElzqGEB0H2TvTKPJsOJHs%3D</a></p>
         */
        public Builder auditionUrl(String auditionUrl) {
            this.auditionUrl = auditionUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AuditTTSVoiceResponseBody build() {
            return new AuditTTSVoiceResponseBody(this);
        } 

    } 

}
