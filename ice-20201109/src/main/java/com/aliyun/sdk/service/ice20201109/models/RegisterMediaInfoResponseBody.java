// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link RegisterMediaInfoResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterMediaInfoResponseBody</p>
 */
public class RegisterMediaInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterMediaInfoResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterMediaInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mediaId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterMediaInfoResponseBody model) {
            this.mediaId = model.mediaId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the media asset in IMS.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>b48fb04483915d4f2cd8</strong></strong></strong></p>
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>5A-CAAC-4850-A3AF-B74606</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterMediaInfoResponseBody build() {
            return new RegisterMediaInfoResponseBody(this);
        } 

    } 

}
