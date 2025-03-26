// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
         * <p>The extended fields.</p>
         * <blockquote>
         * <p>If you set the ResourceType parameter to <strong>2</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;img_rate&quot;:&quot;oneToOne&quot;}</p>
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * <p>The size of the resource. Unit: bytes.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>The description of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder memo(String memo) {
            this.putQueryParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * <p>The address of the resource.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://alicom-fc-media/1947741454322274/alicom-fc-media/pic/202205191526575398603697152.png</p>
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * <p>The type of the resource.</p>
         * <ul>
         * <li><strong>1</strong>: text.</li>
         * <li><strong>2</strong>: image. A small image cannot exceed 100 KB in size, and a large image cannot exceed 2 MB in size. The image must be clear. Supported format: JPG, JPEG, and PNG.</li>
         * <li><strong>3</strong>: audio.</li>
         * <li><strong>4</strong>: video. Supported format: MP4.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set the ResourceType parameter to 2, the <strong>img_rate</strong> required is required. Valid values:</p>
         * </li>
         * <li><p>1:1</p>
         * </li>
         * <li><p>16:9</p>
         * </li>
         * <li><p>3:1</p>
         * </li>
         * <li><p>48:65</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
