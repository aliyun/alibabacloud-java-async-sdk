// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOssBucketRequest} extends {@link RequestModel}
 *
 * <p>ListOssBucketRequest</p>
 */
public class ListOssBucketRequest extends Request {
    @Query
    @NameInMap("BucketName")
    private String bucketName;

    @Query
    @NameInMap("Lang")
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
         * BucketName.
         */
        public Builder bucketName(String bucketName) {
            this.putQueryParameter("BucketName", bucketName);
            this.bucketName = bucketName;
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

        @Override
        public ListOssBucketRequest build() {
            return new ListOssBucketRequest(this);
        } 

    } 

}
