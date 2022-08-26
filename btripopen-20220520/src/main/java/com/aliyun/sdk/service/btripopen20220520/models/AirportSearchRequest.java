// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AirportSearchRequest} extends {@link RequestModel}
 *
 * <p>AirportSearchRequest</p>
 */
public class AirportSearchRequest extends Request {
    @Query
    @NameInMap("keyword")
    @Validation(required = true)
    private String keyword;

    @Query
    @NameInMap("type")
    private Integer type;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private AirportSearchRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.type = builder.type;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AirportSearchRequest create() {
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<AirportSearchRequest, Builder> {
        private String keyword; 
        private Integer type; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(AirportSearchRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.type = request.type;
            this.xAcsBtripSoCorpToken = request.xAcsBtripSoCorpToken;
        } 

        /**
         * 搜索关键字
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * 0国内机场，2国内机场+临近机场，3国际机场
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public AirportSearchRequest build() {
            return new AirportSearchRequest(this);
        } 

    } 

}
