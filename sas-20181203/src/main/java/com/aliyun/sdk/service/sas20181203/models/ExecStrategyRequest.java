// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the baseline check policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeStrategy~~">DescribeStrategy</a> operation to query the IDs of baseline check policies.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>215421</p>
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
