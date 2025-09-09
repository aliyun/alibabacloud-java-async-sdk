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
 * {@link ScanOssObjectV1Request} extends {@link RequestModel}
 *
 * <p>ScanOssObjectV1Request</p>
 */
public class ScanOssObjectV1Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectKeyList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> objectKeyList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private ScanOssObjectV1Request(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.lang = builder.lang;
        this.objectKeyList = builder.objectKeyList;
        this.serviceRegionId = builder.serviceRegionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanOssObjectV1Request create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return objectKeyList
     */
    public java.util.List<String> getObjectKeyList() {
        return this.objectKeyList;
    }

    /**
     * @return serviceRegionId
     */
    public String getServiceRegionId() {
        return this.serviceRegionId;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ScanOssObjectV1Request, Builder> {
        private String bucketName; 
        private String lang; 
        private java.util.List<String> objectKeyList; 
        private String serviceRegionId; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ScanOssObjectV1Request request) {
            super(request);
            this.bucketName = request.bucketName;
            this.lang = request.lang;
            this.objectKeyList = request.objectKeyList;
            this.serviceRegionId = request.serviceRegionId;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The name of the OSS bucket.</p>
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
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The objects in the OSS bucket that you want to scan. You can specify up to 50 objects at a time.</p>
         * <p>This parameter is required.</p>
         */
        public Builder objectKeyList(java.util.List<String> objectKeyList) {
            String objectKeyListShrink = shrink(objectKeyList, "ObjectKeyList", "json");
            this.putQueryParameter("ObjectKeyList", objectKeyListShrink);
            this.objectKeyList = objectKeyList;
            return this;
        }

        /**
         * <p>The ID of the region in which the OSS bucket is located.</p>
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

        /**
         * <p>The ID of the industry-specific classification template.</p>
         * <blockquote>
         * <p> You can call the <strong>DescribeCategoryTemplateList</strong> operation to query industry-specific classification templates. If you do not specify this parameter, the system automatically uses the main template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ScanOssObjectV1Request build() {
            return new ScanOssObjectV1Request(this);
        } 

    } 

}
