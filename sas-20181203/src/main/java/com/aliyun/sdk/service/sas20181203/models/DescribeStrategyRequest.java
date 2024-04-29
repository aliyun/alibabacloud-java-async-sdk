// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeStrategyRequest</p>
 */
public class DescribeStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomType")
    private String customType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyIds")
    private String strategyIds;

    private DescribeStrategyRequest(Builder builder) {
        super(builder);
        this.customType = builder.customType;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
        this.strategyIds = builder.strategyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customType
     */
    public String getCustomType() {
        return this.customType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyIds
     */
    public String getStrategyIds() {
        return this.strategyIds;
    }

    public static final class Builder extends Request.Builder<DescribeStrategyRequest, Builder> {
        private String customType; 
        private String lang; 
        private String sourceIp; 
        private String strategyIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStrategyRequest request) {
            super(request);
            this.customType = request.customType;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
            this.strategyIds = request.strategyIds;
        } 

        /**
         * The type of the baseline check policy that you want to query. Valid values:
         * <p>
         * 
         * *   **common**: standard baseline check policy
         * *   **custom**: custom baseline check policy
         */
        public Builder customType(String customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
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
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The ID of the baseline check policy that you want to query. Separate multiple IDs with commas (,).
         */
        public Builder strategyIds(String strategyIds) {
            this.putQueryParameter("StrategyIds", strategyIds);
            this.strategyIds = strategyIds;
            return this;
        }

        @Override
        public DescribeStrategyRequest build() {
            return new DescribeStrategyRequest(this);
        } 

    } 

}
