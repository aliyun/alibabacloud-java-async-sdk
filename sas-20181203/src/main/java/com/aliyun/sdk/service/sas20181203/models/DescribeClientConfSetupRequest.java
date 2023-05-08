// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientConfSetupRequest} extends {@link RequestModel}
 *
 * <p>DescribeClientConfSetupRequest</p>
 */
public class DescribeClientConfSetupRequest extends Request {
    @Query
    @NameInMap("StrategyTag")
    @Validation(required = true)
    private String strategyTag;

    @Query
    @NameInMap("StrategyTagValue")
    @Validation(required = true)
    private String strategyTagValue;

    private DescribeClientConfSetupRequest(Builder builder) {
        super(builder);
        this.strategyTag = builder.strategyTag;
        this.strategyTagValue = builder.strategyTagValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientConfSetupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return strategyTag
     */
    public String getStrategyTag() {
        return this.strategyTag;
    }

    /**
     * @return strategyTagValue
     */
    public String getStrategyTagValue() {
        return this.strategyTagValue;
    }

    public static final class Builder extends Request.Builder<DescribeClientConfSetupRequest, Builder> {
        private String strategyTag; 
        private String strategyTagValue; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClientConfSetupRequest request) {
            super(request);
            this.strategyTag = request.strategyTag;
            this.strategyTagValue = request.strategyTagValue;
        } 

        /**
         * The tag that is added to the server.
         */
        public Builder strategyTag(String strategyTag) {
            this.putQueryParameter("StrategyTag", strategyTag);
            this.strategyTag = strategyTag;
            return this;
        }

        /**
         * The value of the tag. Valid values:
         * <p>
         * 
         * *   major
         * *   advanced
         * *   basic
         */
        public Builder strategyTagValue(String strategyTagValue) {
            this.putQueryParameter("StrategyTagValue", strategyTagValue);
            this.strategyTagValue = strategyTagValue;
            return this;
        }

        @Override
        public DescribeClientConfSetupRequest build() {
            return new DescribeClientConfSetupRequest(this);
        } 

    } 

}
