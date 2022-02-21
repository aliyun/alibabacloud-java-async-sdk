// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueryOptimizeSolutionRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeSolutionRequest</p>
 */
public class GetQueryOptimizeSolutionRequest extends Request {
    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("RuleIds")
    @Validation(required = true)
    private String ruleIds;

    @Query
    @NameInMap("SqlId")
    @Validation(required = true)
    private String sqlId;

    private GetQueryOptimizeSolutionRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.ruleIds = builder.ruleIds;
        this.sqlId = builder.sqlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeSolutionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeSolutionRequest, Builder> {
        private String engine; 
        private String ruleIds; 
        private String sqlId; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeSolutionRequest response) {
            super(response);
            this.engine = response.engine;
            this.ruleIds = response.ruleIds;
            this.sqlId = response.sqlId;
        } 

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * RuleIds.
         */
        public Builder ruleIds(String ruleIds) {
            this.putQueryParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        /**
         * SqlId.
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        @Override
        public GetQueryOptimizeSolutionRequest build() {
            return new GetQueryOptimizeSolutionRequest(this);
        } 

    } 

}
