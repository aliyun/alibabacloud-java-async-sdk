// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DecribeRankingModelRequest} extends {@link RequestModel}
 *
 * <p>DecribeRankingModelRequest</p>
 */
public class DecribeRankingModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("rankingModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rankingModelId;

    private DecribeRankingModelRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.rankingModelId = builder.rankingModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DecribeRankingModelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return rankingModelId
     */
    public String getRankingModelId() {
        return this.rankingModelId;
    }

    public static final class Builder extends Request.Builder<DecribeRankingModelRequest, Builder> {
        private String instanceId; 
        private String rankingModelId; 

        private Builder() {
            super();
        } 

        private Builder(DecribeRankingModelRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.rankingModelId = request.rankingModelId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the ranking model.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ranktest</p>
         */
        public Builder rankingModelId(String rankingModelId) {
            this.putPathParameter("rankingModelId", rankingModelId);
            this.rankingModelId = rankingModelId;
            return this;
        }

        @Override
        public DecribeRankingModelRequest build() {
            return new DecribeRankingModelRequest(this);
        } 

    } 

}
