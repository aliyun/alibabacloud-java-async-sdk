// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link ModifyAppRequest} extends {@link RequestModel}
 *
 * <p>ModifyAppRequest</p>
 */
public class ModifyAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodedIcon")
    private String encodedIcon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndustryId")
    private Integer industryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    private ModifyAppRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.bundleId = builder.bundleId;
        this.encodedIcon = builder.encodedIcon;
        this.industryId = builder.industryId;
        this.name = builder.name;
        this.packageName = builder.packageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return bundleId
     */
    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * @return encodedIcon
     */
    public String getEncodedIcon() {
        return this.encodedIcon;
    }

    /**
     * @return industryId
     */
    public Integer getIndustryId() {
        return this.industryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }

    public static final class Builder extends Request.Builder<ModifyAppRequest, Builder> {
        private String appKey; 
        private String bundleId; 
        private String encodedIcon; 
        private Integer industryId; 
        private String name; 
        private String packageName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAppRequest request) {
            super(request);
            this.appKey = request.appKey;
            this.bundleId = request.bundleId;
            this.encodedIcon = request.encodedIcon;
            this.industryId = request.industryId;
            this.name = request.name;
            this.packageName = request.packageName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * BundleId.
         */
        public Builder bundleId(String bundleId) {
            this.putQueryParameter("BundleId", bundleId);
            this.bundleId = bundleId;
            return this;
        }

        /**
         * EncodedIcon.
         */
        public Builder encodedIcon(String encodedIcon) {
            this.putQueryParameter("EncodedIcon", encodedIcon);
            this.encodedIcon = encodedIcon;
            return this;
        }

        /**
         * IndustryId.
         */
        public Builder industryId(Integer industryId) {
            this.putQueryParameter("IndustryId", industryId);
            this.industryId = industryId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PackageName.
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
            return this;
        }

        @Override
        public ModifyAppRequest build() {
            return new ModifyAppRequest(this);
        } 

    } 

}
