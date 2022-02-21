// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagResponseBody</p>
 */
public class GetRepoTagResponseBody extends TeaModel {
    @NameInMap("digest")
    private String digest;

    @NameInMap("imageCreate")
    private Long imageCreate;

    @NameInMap("imageId")
    private String imageId;

    @NameInMap("imageSize")
    private Long imageSize;

    @NameInMap("imageUpdate")
    private Long imageUpdate;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("status")
    private String status;

    @NameInMap("tag")
    private String tag;

    private GetRepoTagResponseBody(Builder builder) {
        this.digest = builder.digest;
        this.imageCreate = builder.imageCreate;
        this.imageId = builder.imageId;
        this.imageSize = builder.imageSize;
        this.imageUpdate = builder.imageUpdate;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagResponseBody create() {
        return builder().build();
    }

    /**
     * @return digest
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * @return imageCreate
     */
    public Long getImageCreate() {
        return this.imageCreate;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageSize
     */
    public Long getImageSize() {
        return this.imageSize;
    }

    /**
     * @return imageUpdate
     */
    public Long getImageUpdate() {
        return this.imageUpdate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tag
     */
    public String getTag() {
        return this.tag;
    }

    public static final class Builder {
        private String digest; 
        private Long imageCreate; 
        private String imageId; 
        private Long imageSize; 
        private Long imageUpdate; 
        private String requestId; 
        private String status; 
        private String tag; 

        /**
         * digest.
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * imageCreate.
         */
        public Builder imageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }

        /**
         * imageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * imageSize.
         */
        public Builder imageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }

        /**
         * imageUpdate.
         */
        public Builder imageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * tag.
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        public GetRepoTagResponseBody build() {
            return new GetRepoTagResponseBody(this);
        } 

    } 

}
