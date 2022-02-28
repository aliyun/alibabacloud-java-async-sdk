// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyRequest} extends {@link RequestModel}
 *
 * <p>DescribeStrategyRequest</p>
 */
public class DescribeStrategyRequest extends Request {
    @Query
    @NameInMap("CustomType")
    private String customType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("StrategyIds")
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

        private Builder(DescribeStrategyRequest response) {
            super(response);
            this.customType = response.customType;
            this.lang = response.lang;
            this.sourceIp = response.sourceIp;
            this.strategyIds = response.strategyIds;
        } 

        /**
         * CustomType.
         */
        public Builder customType(String customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StrategyIds.
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
