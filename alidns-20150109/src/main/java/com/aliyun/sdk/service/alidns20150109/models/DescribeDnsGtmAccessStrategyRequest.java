// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAccessStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAccessStrategyRequest</p>
 */
public class DescribeDnsGtmAccessStrategyRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("StrategyId")
    @Validation(required = true)
    private String strategyId;

    private DescribeDnsGtmAccessStrategyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategyRequest create() {
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
     * @return strategyId
     */
    public String getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<DescribeDnsGtmAccessStrategyRequest, Builder> {
        private String lang; 
        private String strategyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAccessStrategyRequest request) {
            super(request);
            this.lang = request.lang;
            this.strategyId = request.strategyId;
        } 

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the access policy.
         */
        public Builder strategyId(String strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public DescribeDnsGtmAccessStrategyRequest build() {
            return new DescribeDnsGtmAccessStrategyRequest(this);
        } 

    } 

}
