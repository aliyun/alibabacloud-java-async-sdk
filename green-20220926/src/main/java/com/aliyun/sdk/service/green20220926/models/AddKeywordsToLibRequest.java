// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link AddKeywordsToLibRequest} extends {@link RequestModel}
 *
 * <p>AddKeywordsToLibRequest</p>
 */
public class AddKeywordsToLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordsObject")
    private String keywordsObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibId")
    private String libId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Properties")
    private String properties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantCode")
    private String tenantCode;

    private AddKeywordsToLibRequest(Builder builder) {
        super(builder);
        this.keywords = builder.keywords;
        this.keywordsObject = builder.keywordsObject;
        this.libId = builder.libId;
        this.properties = builder.properties;
        this.regionId = builder.regionId;
        this.tenantCode = builder.tenantCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKeywordsToLibRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywords
     */
    public String getKeywords() {
        return this.keywords;
    }

    /**
     * @return keywordsObject
     */
    public String getKeywordsObject() {
        return this.keywordsObject;
    }

    /**
     * @return libId
     */
    public String getLibId() {
        return this.libId;
    }

    /**
     * @return properties
     */
    public String getProperties() {
        return this.properties;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantCode
     */
    public String getTenantCode() {
        return this.tenantCode;
    }

    public static final class Builder extends Request.Builder<AddKeywordsToLibRequest, Builder> {
        private String keywords; 
        private String keywordsObject; 
        private String libId; 
        private String properties; 
        private String regionId; 
        private String tenantCode; 

        private Builder() {
            super();
        } 

        private Builder(AddKeywordsToLibRequest request) {
            super(request);
            this.keywords = request.keywords;
            this.keywordsObject = request.keywordsObject;
            this.libId = request.libId;
            this.properties = request.properties;
            this.regionId = request.regionId;
            this.tenantCode = request.tenantCode;
        } 

        /**
         * <p>The keyword to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * <p>The name of the keyword file.</p>
         * 
         * <strong>example:</strong>
         * <p>upload/1e5353c0-0d91-40ba-9d41-ae7abd3fe561.txt</p>
         */
        public Builder keywordsObject(String keywordsObject) {
            this.putBodyParameter("KeywordsObject", keywordsObject);
            this.keywordsObject = keywordsObject;
            return this;
        }

        /**
         * <p>The id of the keyword library.</p>
         * 
         * <strong>example:</strong>
         * <p>customxx_xxxx</p>
         */
        public Builder libId(String libId) {
            this.putBodyParameter("LibId", libId);
            this.libId = libId;
            return this;
        }

        /**
         * Properties.
         */
        public Builder properties(String properties) {
            this.putQueryParameter("Properties", properties);
            this.properties = properties;
            return this;
        }

        /**
         * <p>Region ID</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TenantCode.
         */
        public Builder tenantCode(String tenantCode) {
            this.putQueryParameter("TenantCode", tenantCode);
            this.tenantCode = tenantCode;
            return this;
        }

        @Override
        public AddKeywordsToLibRequest build() {
            return new AddKeywordsToLibRequest(this);
        } 

    } 

}
