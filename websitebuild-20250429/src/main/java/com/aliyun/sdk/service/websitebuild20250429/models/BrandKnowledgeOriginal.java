// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeOriginal} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeOriginal</p>
 */
public class BrandKnowledgeOriginal extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DownloadUrl")
    private String downloadUrl;

    @com.aliyun.core.annotation.NameInMap("ExpiresAt")
    private Long expiresAt;

    private BrandKnowledgeOriginal(Builder builder) {
        this.downloadUrl = builder.downloadUrl;
        this.expiresAt = builder.expiresAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeOriginal create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    public static final class Builder {
        private String downloadUrl; 
        private Long expiresAt; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeOriginal model) {
            this.downloadUrl = model.downloadUrl;
            this.expiresAt = model.expiresAt;
        } 

        /**
         * <p>The temporary download URL used to access the original document.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/download/example.pdf">https://example.com/download/example.pdf</a></p>
         */
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }

        /**
         * <p>The expiration time of the temporary link, represented as a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1795659000000</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        public BrandKnowledgeOriginal build() {
            return new BrandKnowledgeOriginal(this);
        } 

    } 

}
