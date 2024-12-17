// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link UpdateImageInfosResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateImageInfosResponseBody</p>
 */
public class UpdateImageInfosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NonExistImageIds")
    private NonExistImageIds nonExistImageIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateImageInfosResponseBody(Builder builder) {
        this.nonExistImageIds = builder.nonExistImageIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateImageInfosResponseBody create() {
        return builder().build();
    }

    /**
     * @return nonExistImageIds
     */
    public NonExistImageIds getNonExistImageIds() {
        return this.nonExistImageIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NonExistImageIds nonExistImageIds; 
        private String requestId; 

        /**
         * <p>The IDs of the images that do not exist.</p>
         */
        public Builder nonExistImageIds(NonExistImageIds nonExistImageIds) {
            this.nonExistImageIds = nonExistImageIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateImageInfosResponseBody build() {
            return new UpdateImageInfosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateImageInfosResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateImageInfosResponseBody</p>
     */
    public static class NonExistImageIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private java.util.List<String> imageId;

        private NonExistImageIds(Builder builder) {
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistImageIds create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public java.util.List<String> getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private java.util.List<String> imageId; 

            /**
             * ImageId.
             */
            public Builder imageId(java.util.List<String> imageId) {
                this.imageId = imageId;
                return this;
            }

            public NonExistImageIds build() {
                return new NonExistImageIds(this);
            } 

        } 

    }
}
