// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecStrategyRequest} extends {@link RequestModel}
 *
 * <p>ExecStrategyRequest</p>
 */
public class ExecStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Integer strategyId;

    private ExecStrategyRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecStrategyRequest create() {
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
    public Integer getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<ExecStrategyRequest, Builder> {
        private String lang; 
        private Integer strategyId; 

        private Builder() {
            super();
        } 

        private Builder(ExecStrategyRequest request) {
            super(request);
            this.lang = request.lang;
            this.strategyId = request.strategyId;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         * <p>
         * 
         * >  You can call the [DescribeStrategy](~~DescribeStrategy~~) operation to query the IDs of baseline check policies.
         */
        public Builder strategyId(Integer strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public ExecStrategyRequest build() {
            return new ExecStrategyRequest(this);
        } 

    } 

}
