// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainStationSearchRequest} extends {@link RequestModel}
 *
 * <p>TrainStationSearchRequest</p>
 */
public class TrainStationSearchRequest extends Request {
    @Query
    @NameInMap("keyword")
    @Validation(required = true)
    private String keyword;

    @Header
    @NameInMap("x-acs-btrip-so-corp-token")
    @Validation(required = true)
    private String xAcsBtripSoCorpToken;

    private TrainStationSearchRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.xAcsBtripSoCorpToken = builder.xAcsBtripSoCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainStationSearchRequest create() {
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
     * @return xAcsBtripSoCorpToken
     */
    public String getXAcsBtripSoCorpToken() {
        return this.xAcsBtripSoCorpToken;
    }

    public static final class Builder extends Request.Builder<TrainStationSearchRequest, Builder> {
        private String keyword; 
        private String xAcsBtripSoCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(TrainStationSearchRequest request) {
            super(request);
            this.keyword = request.keyword;
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
         * x-acs-btrip-so-corp-token.
         */
        public Builder xAcsBtripSoCorpToken(String xAcsBtripSoCorpToken) {
            this.putHeaderParameter("x-acs-btrip-so-corp-token", xAcsBtripSoCorpToken);
            this.xAcsBtripSoCorpToken = xAcsBtripSoCorpToken;
            return this;
        }

        @Override
        public TrainStationSearchRequest build() {
            return new TrainStationSearchRequest(this);
        } 

    } 

}
