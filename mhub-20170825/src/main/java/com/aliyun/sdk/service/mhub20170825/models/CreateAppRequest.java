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
 * {@link CreateAppRequest} extends {@link RequestModel}
 *
 * <p>CreateAppRequest</p>
 */
public class CreateAppRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BundleId")
    private String bundleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncodedIcon")
    private String encodedIcon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IndustryId")
    private String industryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageName")
    private String packageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Integer type;

    private CreateAppRequest(Builder builder) {
        super(builder);
        this.bundleId = builder.bundleId;
        this.encodedIcon = builder.encodedIcon;
        this.industryId = builder.industryId;
        this.name = builder.name;
        this.packageName = builder.packageName;
        this.productId = builder.productId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getIndustryId() {
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

    /**
     * @return productId
     */
    public String getProductId() {
        return this.productId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAppRequest, Builder> {
        private String bundleId; 
        private String encodedIcon; 
        private String industryId; 
        private String name; 
        private String packageName; 
        private String productId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppRequest request) {
            super(request);
            this.bundleId = request.bundleId;
            this.encodedIcon = request.encodedIcon;
            this.industryId = request.industryId;
            this.name = request.name;
            this.packageName = request.packageName;
            this.productId = request.productId;
            this.type = request.type;
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
        public Builder industryId(String industryId) {
            this.putQueryParameter("IndustryId", industryId);
            this.industryId = industryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder productId(String productId) {
            this.putQueryParameter("ProductId", productId);
            this.productId = productId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAppRequest build() {
            return new CreateAppRequest(this);
        } 

    } 

}
