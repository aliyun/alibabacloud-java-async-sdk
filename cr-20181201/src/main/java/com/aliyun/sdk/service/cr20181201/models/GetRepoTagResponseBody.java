// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetRepoTagResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagResponseBody</p>
 */
public class GetRepoTagResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Digest")
    private String digest;

    @com.aliyun.core.annotation.NameInMap("ImageCreate")
    private Long imageCreate;

    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.NameInMap("ImageSize")
    private Long imageSize;

    @com.aliyun.core.annotation.NameInMap("ImageUpdate")
    private Long imageUpdate;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private String tag;

    private GetRepoTagResponseBody(Builder builder) {
        this.code = builder.code;
        this.digest = builder.digest;
        this.imageCreate = builder.imageCreate;
        this.imageId = builder.imageId;
        this.imageSize = builder.imageSize;
        this.imageUpdate = builder.imageUpdate;
        this.isSuccess = builder.isSuccess;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
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
        private String code; 
        private String digest; 
        private Long imageCreate; 
        private String imageId; 
        private Long imageSize; 
        private Long imageUpdate; 
        private Boolean isSuccess; 
        private String requestId; 
        private String status; 
        private String tag; 

        private Builder() {
        } 

        private Builder(GetRepoTagResponseBody model) {
            this.code = model.code;
            this.digest = model.digest;
            this.imageCreate = model.imageCreate;
            this.imageId = model.imageId;
            this.imageSize = model.imageSize;
            this.imageUpdate = model.imageUpdate;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.status = model.status;
            this.tag = model.tag;
        } 

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The size of the image. Unit: Bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>67bfbcc12b67936ec7f867927817cbb071832b873dbcaed312a1930ba5f1****</p>
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * <p>crr-tquyps22md8p****</p>
         * 
         * <strong>example:</strong>
         * <p>1572839125000</p>
         */
        public Builder imageCreate(Long imageCreate) {
            this.imageCreate = imageCreate;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The number of milliseconds that have elapsed since the image was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>27107966</p>
         */
        public Builder imageSize(Long imageSize) {
            this.imageSize = imageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1572875608000</p>
         */
        public Builder imageUpdate(Long imageUpdate) {
            this.imageUpdate = imageUpdate;
            return this;
        }

        /**
         * <p>The status of the image. Valid values:</p>
         * <ul>
         * <li><code>NORMAL</code>: The image is normal.</li>
         * <li><code>DELETING</code>: The image is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>1.0</p>
         * 
         * <strong>example:</strong>
         * <p>031572FA-7D8F-4C05-B790-1071E0E05DE6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The version of the repository.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
