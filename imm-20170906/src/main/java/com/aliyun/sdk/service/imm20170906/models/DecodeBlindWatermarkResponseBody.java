// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecodeBlindWatermarkResponseBody} extends {@link TeaModel}
 *
 * <p>DecodeBlindWatermarkResponseBody</p>
 */
public class DecodeBlindWatermarkResponseBody extends TeaModel {
    @NameInMap("Content")
    private String content;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TargetUri")
    private String targetUri;

    private DecodeBlindWatermarkResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.targetUri = builder.targetUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecodeBlindWatermarkResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetUri
     */
    public String getTargetUri() {
        return this.targetUri;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 
        private String targetUri; 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * TargetUri.
         */
        public Builder targetUri(String targetUri) {
            this.targetUri = targetUri;
            return this;
        }

        public DecodeBlindWatermarkResponseBody build() {
            return new DecodeBlindWatermarkResponseBody(this);
        } 

    } 

}
