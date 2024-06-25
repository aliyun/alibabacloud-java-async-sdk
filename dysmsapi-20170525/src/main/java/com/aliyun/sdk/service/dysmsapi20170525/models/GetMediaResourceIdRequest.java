// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaResourceIdRequest} extends {@link RequestModel}
 *
 * <p>GetMediaResourceIdRequest</p>
 */
public class GetMediaResourceIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long fileSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Memo")
    private String memo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000)
    private Integer resourceType;

    private GetMediaResourceIdRequest(Builder builder) {
        super(builder);
        this.extendInfo = builder.extendInfo;
        this.fileSize = builder.fileSize;
        this.memo = builder.memo;
        this.ossKey = builder.ossKey;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaResourceIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return memo
     */
    public String getMemo() {
        return this.memo;
    }

    /**
     * @return ossKey
     */
    public String getOssKey() {
        return this.ossKey;
    }

    /**
     * @return resourceType
     */
    public Integer getResourceType() {
        return this.resourceType;
    }

    public static final class Builder extends Request.Builder<GetMediaResourceIdRequest, Builder> {
        private String extendInfo; 
        private Long fileSize; 
        private String memo; 
        private String ossKey; 
        private Integer resourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetMediaResourceIdRequest request) {
            super(request);
            this.extendInfo = request.extendInfo;
            this.fileSize = request.fileSize;
            this.memo = request.memo;
            this.ossKey = request.ossKey;
            this.resourceType = request.resourceType;
        } 

        /**
         * The extended fields.
         * <p>
         * 
         * > If you set the ResourceType parameter to **2**, this parameter is required.
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * The size of the resource. Unit: bytes.
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * The description of the resource.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * The address of the resource.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * The type of the resource.
         * <p>
         * 
         * *   **1**: text.
         * *   **2**: image. A small image cannot exceed 100 KB in size, and a large image cannot exceed 2 MB in size. The image must be clear. Supported format: JPG, JPEG, and PNG.
         * *   **3**: audio.
         * *   **4**: video. Supported format: MP4.
         * 
         * > 
         * 
         * *   If you set the ResourceType parameter to 2, the **img_rate** required is required. Valid values:
         * 
         * *   1:1
         * 
         * *   16:9
         * 
         * *   3:1
         * 
         * *   48:65
         */
        public Builder resourceType(Integer resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        @Override
        public GetMediaResourceIdRequest build() {
            return new GetMediaResourceIdRequest(this);
        } 

    } 

}
