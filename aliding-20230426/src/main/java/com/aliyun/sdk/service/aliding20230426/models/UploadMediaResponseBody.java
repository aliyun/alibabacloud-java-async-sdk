// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link UploadMediaResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMediaResponseBody</p>
 */
public class UploadMediaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mediaId")
    private String mediaId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private UploadMediaResponseBody(Builder builder) {
        this.mediaId = builder.mediaId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaResponseBody create() {
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

        private Builder(UploadMediaResponseBody model) {
            this.mediaId = model.mediaId;
            this.requestId = model.requestId;
        } 

        /**
         * mediaId.
         */
        public Builder mediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>abcd-1234-wxyz-9876</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadMediaResponseBody build() {
            return new UploadMediaResponseBody(this);
        } 

    } 

}
