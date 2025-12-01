// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link MaskOssImageRequest} extends {@link RequestModel}
 *
 * <p>MaskOssImageRequest</p>
 */
public class MaskOssImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAlwaysUpload")
    private Boolean isAlwaysUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportRestore")
    private Boolean isSupportRestore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskRuleIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maskRuleIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String objectKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceRegionId;

    private MaskOssImageRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.isAlwaysUpload = builder.isAlwaysUpload;
        this.isSupportRestore = builder.isSupportRestore;
        this.lang = builder.lang;
        this.maskRuleIdList = builder.maskRuleIdList;
        this.objectKey = builder.objectKey;
        this.serviceRegionId = builder.serviceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MaskOssImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketName
     */
    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * @return isAlwaysUpload
     */
    public Boolean getIsAlwaysUpload() {
        return this.isAlwaysUpload;
    }

    /**
     * @return isSupportRestore
     */
    public Boolean getIsSupportRestore() {
        return this.isSupportRestore;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return maskRuleIdList
     */
    public String getMaskRuleIdList() {
        return this.maskRuleIdList;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    public static final class Builder extends Request.Builder<MaskOssImageRequest, Builder> {
        private String bucketName; 
        private Boolean isAlwaysUpload; 
        private Boolean isSupportRestore; 
        private String lang; 
        private String maskRuleIdList; 
        private String objectKey; 
        private String serviceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(MaskOssImageRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.isAlwaysUpload = request.isAlwaysUpload;
            this.isSupportRestore = request.isSupportRestore;
            this.lang = request.lang;
            this.maskRuleIdList = request.maskRuleIdList;
            this.objectKey = request.objectKey;
            this.serviceRegionId = request.serviceRegionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sddp-api-demo-bucket</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * IsAlwaysUpload.
         */
        public Builder isAlwaysUpload(Boolean isAlwaysUpload) {
            this.putQueryParameter("IsAlwaysUpload", isAlwaysUpload);
            this.isAlwaysUpload = isAlwaysUpload;
            return this;
        }

        /**
         * IsSupportRestore.
         */
        public Builder isSupportRestore(Boolean isSupportRestore) {
            this.putQueryParameter("IsSupportRestore", isSupportRestore);
            this.isSupportRestore = isSupportRestore;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3000,3002</p>
         */
        public Builder maskRuleIdList(String maskRuleIdList) {
            this.putQueryParameter("MaskRuleIdList", maskRuleIdList);
            this.maskRuleIdList = maskRuleIdList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dir1/test.png</p>
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder serviceRegionId(String serviceRegionId) {
            this.putQueryParameter("ServiceRegionId", serviceRegionId);
            this.serviceRegionId = serviceRegionId;
            return this;
        }

        @Override
        public MaskOssImageRequest build() {
            return new MaskOssImageRequest(this);
        } 

    } 

}
