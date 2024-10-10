// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOssBucketRequest} extends {@link RequestModel}
 *
 * <p>ListOssBucketRequest</p>
 */
public class ListOssBucketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BucketName")
    private String bucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ListOssBucketRequest(Builder builder) {
        super(builder);
        this.bucketName = builder.bucketName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOssBucketRequest create() {
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

    public static final class Builder extends Request.Builder<ListOssBucketRequest, Builder> {
        private String bucketName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ListOssBucketRequest request) {
            super(request);
            this.bucketName = request.bucketName;
            this.lang = request.lang;
        } 

        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>iboxpublic****</p>
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
            return this;
        }

        /**
         * <p>The language of the content in the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public ListOssBucketRequest build() {
            return new ListOssBucketRequest(this);
        } 

    } 

}
