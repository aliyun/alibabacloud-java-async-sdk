// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportScreenRequest} extends {@link RequestModel}
 *
 * <p>ReportScreenRequest</p>
 */
public class ReportScreenRequest extends Request {
    @Query
    @NameInMap("OssBucketName")
    @Validation(required = true)
    private String ossBucketName;

    @Query
    @NameInMap("OssObjectKey")
    @Validation(required = true)
    private String ossObjectKey;

    private ReportScreenRequest(Builder builder) {
        super(builder);
        this.ossBucketName = builder.ossBucketName;
        this.ossObjectKey = builder.ossObjectKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReportScreenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossObjectKey
     */
    public String getOssObjectKey() {
        return this.ossObjectKey;
    }

    public static final class Builder extends Request.Builder<ReportScreenRequest, Builder> {
        private String ossBucketName; 
        private String ossObjectKey; 

        private Builder() {
            super();
        } 

        private Builder(ReportScreenRequest request) {
            super(request);
            this.ossBucketName = request.ossBucketName;
            this.ossObjectKey = request.ossObjectKey;
        } 

        /**
         * OssBucketName.
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * OssObjectKey.
         */
        public Builder ossObjectKey(String ossObjectKey) {
            this.putQueryParameter("OssObjectKey", ossObjectKey);
            this.ossObjectKey = ossObjectKey;
            return this;
        }

        @Override
        public ReportScreenRequest build() {
            return new ReportScreenRequest(this);
        } 

    } 

}
