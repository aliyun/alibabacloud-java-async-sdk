// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link UploadImageResponseBody} extends {@link TeaModel}
 *
 * <p>UploadImageResponseBody</p>
 */
public class UploadImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UploadImageResponseBody(Builder builder) {
        this.imageId = builder.imageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadImageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String imageId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UploadImageResponseBody model) {
            this.imageId = model.imageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-d4dwr5tgrgvd****</p>
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2CC66B0A-BA3B-5D87-BFBE-11AAAD7A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UploadImageResponseBody build() {
            return new UploadImageResponseBody(this);
        } 

    } 

}
