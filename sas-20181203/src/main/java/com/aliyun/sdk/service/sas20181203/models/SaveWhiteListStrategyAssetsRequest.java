// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWhiteListStrategyAssetsRequest} extends {@link RequestModel}
 *
 * <p>SaveWhiteListStrategyAssetsRequest</p>
 */
public class SaveWhiteListStrategyAssetsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operations")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operations;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer relationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long strategyId;

    private SaveWhiteListStrategyAssetsRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.operations = builder.operations;
        this.relationType = builder.relationType;
        this.sourceIp = builder.sourceIp;
        this.strategyId = builder.strategyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWhiteListStrategyAssetsRequest create() {
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
     * @return operations
     */
    public String getOperations() {
        return this.operations;
    }

    /**
     * @return relationType
     */
    public Integer getRelationType() {
        return this.relationType;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return strategyId
     */
    public Long getStrategyId() {
        return this.strategyId;
    }

    public static final class Builder extends Request.Builder<SaveWhiteListStrategyAssetsRequest, Builder> {
        private String lang; 
        private String operations; 
        private Integer relationType; 
        private String sourceIp; 
        private Long strategyId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWhiteListStrategyAssetsRequest request) {
            super(request);
            this.lang = request.lang;
            this.operations = request.operations;
            this.relationType = request.relationType;
            this.sourceIp = request.sourceIp;
            this.strategyId = request.strategyId;
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
         * Operations.
         */
        public Builder operations(String operations) {
            this.putQueryParameter("Operations", operations);
            this.operations = operations;
            return this;
        }

        /**
         * RelationType.
         */
        public Builder relationType(Integer relationType) {
            this.putQueryParameter("RelationType", relationType);
            this.relationType = relationType;
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
         * StrategyId.
         */
        public Builder strategyId(Long strategyId) {
            this.putQueryParameter("StrategyId", strategyId);
            this.strategyId = strategyId;
            return this;
        }

        @Override
        public SaveWhiteListStrategyAssetsRequest build() {
            return new SaveWhiteListStrategyAssetsRequest(this);
        } 

    } 

}
