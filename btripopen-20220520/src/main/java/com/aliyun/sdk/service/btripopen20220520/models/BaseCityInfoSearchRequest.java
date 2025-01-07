// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link BaseCityInfoSearchRequest} extends {@link RequestModel}
 *
 * <p>BaseCityInfoSearchRequest</p>
 */
public class BaseCityInfoSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-access-token")
    private String xAcsBtripAccessToken;

    private BaseCityInfoSearchRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.region = builder.region;
        this.xAcsBtripAccessToken = builder.xAcsBtripAccessToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BaseCityInfoSearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return xAcsBtripAccessToken
     */
    public String getXAcsBtripAccessToken() {
        return this.xAcsBtripAccessToken;
    }

    public static final class Builder extends Request.Builder<BaseCityInfoSearchRequest, Builder> {
        private String keyword; 
        private String region; 
        private String xAcsBtripAccessToken; 

        private Builder() {
            super();
        } 

        private Builder(BaseCityInfoSearchRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.region = request.region;
            this.xAcsBtripAccessToken = request.xAcsBtripAccessToken;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * x-acs-btrip-access-token.
         */
        public Builder xAcsBtripAccessToken(String xAcsBtripAccessToken) {
            this.putHeaderParameter("x-acs-btrip-access-token", xAcsBtripAccessToken);
            this.xAcsBtripAccessToken = xAcsBtripAccessToken;
            return this;
        }

        @Override
        public BaseCityInfoSearchRequest build() {
            return new BaseCityInfoSearchRequest(this);
        } 

    } 

}
