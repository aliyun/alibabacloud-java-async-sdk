// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApiRequest} extends {@link RequestModel}
 *
 * <p>DescribeApiRequest</p>
 */
public class DescribeApiRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("apiType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    private DescribeApiRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.apiId = builder.apiId;
        this.apiRegionId = builder.apiRegionId;
        this.apiType = builder.apiType;
        this.regId = builder.regId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApiRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return apiId
     */
    public String getApiId() {
        return this.apiId;
    }

    /**
     * @return apiRegionId
     */
    public String getApiRegionId() {
        return this.apiRegionId;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    public static final class Builder extends Request.Builder<DescribeApiRequest, Builder> {
        private String lang; 
        private String apiId; 
        private String apiRegionId; 
        private String apiType; 
        private String regId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApiRequest request) {
            super(request);
            this.lang = request.lang;
            this.apiId = request.apiId;
            this.apiRegionId = request.apiRegionId;
            this.apiType = request.apiType;
            this.regId = request.regId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * apiId.
         */
        public Builder apiId(String apiId) {
            this.putQueryParameter("apiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * apiRegionId.
         */
        public Builder apiRegionId(String apiRegionId) {
            this.putQueryParameter("apiRegionId", apiRegionId);
            this.apiRegionId = apiRegionId;
            return this;
        }

        /**
         * apiType.
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("apiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * regId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        @Override
        public DescribeApiRequest build() {
            return new DescribeApiRequest(this);
        } 

    } 

}
