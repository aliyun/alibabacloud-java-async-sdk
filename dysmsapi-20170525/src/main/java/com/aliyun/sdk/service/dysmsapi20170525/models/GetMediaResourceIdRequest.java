// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMediaResourceIdRequest} extends {@link RequestModel}
 *
 * <p>GetMediaResourceIdRequest</p>
 */
public class GetMediaResourceIdRequest extends Request {
    @Query
    @NameInMap("ExtendInfo")
    private String extendInfo;

    @Query
    @NameInMap("FileSize")
    @Validation(required = true)
    private Long fileSize;

    @Query
    @NameInMap("Memo")
    private String memo;

    @Query
    @NameInMap("OssKey")
    @Validation(required = true)
    private String ossKey;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true, maximum = 10000)
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
         * ExtendInfo.
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * FileSize.
         */
        public Builder fileSize(Long fileSize) {
            this.putQueryParameter("FileSize", fileSize);
            this.fileSize = fileSize;
            return this;
        }

        /**
         * Memo.
         */
        public Builder memo(String memo) {
            this.putQueryParameter("Memo", memo);
            this.memo = memo;
            return this;
        }

        /**
         * OssKey.
         */
        public Builder ossKey(String ossKey) {
            this.putQueryParameter("OssKey", ossKey);
            this.ossKey = ossKey;
            return this;
        }

        /**
         * ResourceType.
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
