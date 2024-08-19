// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddKeywordLibRequest} extends {@link RequestModel}
 *
 * <p>AddKeywordLibRequest</p>
 */
public class AddKeywordLibRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private String keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeywordsObject")
    private String keywordsObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LibName")
    private String libName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddKeywordLibRequest(Builder builder) {
        super(builder);
        this.keywords = builder.keywords;
        this.keywordsObject = builder.keywordsObject;
        this.libName = builder.libName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKeywordLibRequest create() {
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
     * @return libName
     */
    public String getLibName() {
        return this.libName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddKeywordLibRequest, Builder> {
        private String keywords; 
        private String keywordsObject; 
        private String libName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddKeywordLibRequest request) {
            super(request);
            this.keywords = request.keywords;
            this.keywordsObject = request.keywordsObject;
            this.libName = request.libName;
            this.regionId = request.regionId;
        } 

        /**
         * Keywords.
         */
        public Builder keywords(String keywords) {
            this.putBodyParameter("Keywords", keywords);
            this.keywords = keywords;
            return this;
        }

        /**
         * KeywordsObject.
         */
        public Builder keywordsObject(String keywordsObject) {
            this.putBodyParameter("KeywordsObject", keywordsObject);
            this.keywordsObject = keywordsObject;
            return this;
        }

        /**
         * LibName.
         */
        public Builder libName(String libName) {
            this.putBodyParameter("LibName", libName);
            this.libName = libName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddKeywordLibRequest build() {
            return new AddKeywordLibRequest(this);
        } 

    } 

}
