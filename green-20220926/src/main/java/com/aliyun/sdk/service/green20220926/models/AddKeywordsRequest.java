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
 * {@link AddKeywordsRequest} extends {@link RequestModel}
 *
 * <p>AddKeywordsRequest</p>
 */
public class AddKeywordsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private AddKeywordsRequest(Builder builder) {
        super(builder);
        this.keywords = builder.keywords;
        this.keywordsObject = builder.keywordsObject;
        this.libId = builder.libId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddKeywordsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddKeywordsRequest, Builder> {
        private String keywords; 
        private String keywordsObject; 
        private String libId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddKeywordsRequest request) {
            super(request);
            this.keywords = request.keywords;
            this.keywordsObject = request.keywordsObject;
            this.libId = request.libId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The keywords to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>keywords</p>
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
         * <p>The id of keyword library.</p>
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

        @Override
        public AddKeywordsRequest build() {
            return new AddKeywordsRequest(this);
        } 

    } 

}
