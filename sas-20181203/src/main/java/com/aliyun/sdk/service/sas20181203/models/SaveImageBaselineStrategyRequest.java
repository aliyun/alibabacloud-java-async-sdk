// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveImageBaselineStrategyRequest} extends {@link RequestModel}
 *
 * <p>SaveImageBaselineStrategyRequest</p>
 */
public class SaveImageBaselineStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItemList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String baselineItemList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    private Long strategyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyName")
    private String strategyName;

    private SaveImageBaselineStrategyRequest(Builder builder) {
        super(builder);
        this.baselineItemList = builder.baselineItemList;
        this.lang = builder.lang;
        this.source = builder.source;
        this.strategyId = builder.strategyId;
        this.strategyName = builder.strategyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveImageBaselineStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baselineItemList
     */
    public String getBaselineItemList() {
        return this.baselineItemList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    /**
     * @return strategyName
     */
    public String getStrategyName() {
        return this.strategyName;
    }

    public static final class Builder extends Request.Builder<SaveImageBaselineStrategyRequest, Builder> {
        private String baselineItemList; 
        private String lang; 
        private String source; 
        private Long strategyId; 
        private String strategyName; 

        private Builder() {
            super();
        } 

        private Builder(SaveImageBaselineStrategyRequest request) {
            super(request);
            this.baselineItemList = request.baselineItemList;
            this.lang = request.lang;
            this.source = request.source;
            this.strategyId = request.strategyId;
            this.strategyName = request.strategyName;
        } 

        /**
         * The baseline check items.
         * <p>
         * 
         * > You can call the [DescribeImageBaselineStrategy](~~DescribeImageBaselineStrategy~~) operation to query baseline check items.
         */
        public Builder baselineItemList(String baselineItemList) {
            this.putQueryParameter("BaselineItemList", baselineItemList);
            this.baselineItemList = baselineItemList;
            return this;
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
         * The data source. If this parameter is left empty, the baseline check policy for images is queried. Valid values:
         * <p>
         * 
         * *   **default**: the baseline check policy for images
         * *   **agentless**: agentless detection
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         * <p>
         * 
         * > You can call the [DescribeImageBaselineStrategy](~~DescribeImageBaselineStrategy~~) operation to query the IDs of baseline check policies.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        /**
         * The name of the baseline check policy.
         */
        public Builder strategyName(String strategyName) {
            this.putQueryParameter("StrategyName", strategyName);
            this.strategyName = strategyName;
            return this;
        }

        @Override
        public SaveImageBaselineStrategyRequest build() {
            return new SaveImageBaselineStrategyRequest(this);
        } 

    } 

}
