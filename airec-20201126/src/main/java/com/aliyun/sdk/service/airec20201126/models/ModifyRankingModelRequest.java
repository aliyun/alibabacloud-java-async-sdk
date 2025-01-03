// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyRankingModelRequest} extends {@link RequestModel}
 *
 * <p>ModifyRankingModelRequest</p>
 */
public class ModifyRankingModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("rankingModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rankingModelId;

    private ModifyRankingModelRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.rankingModelId = builder.rankingModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRankingModelRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyRankingModelRequest, Builder> {
        private String instanceId; 
        private String rankingModelId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRankingModelRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.rankingModelId = request.rankingModelId;
        } 

        /**
         * <p>The time when the ranking model was modified.</p>
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
         * <p>The time when the ranking model was created.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test1234</p>
         */
        public Builder rankingModelId(String rankingModelId) {
            this.putPathParameter("rankingModelId", rankingModelId);
            this.rankingModelId = rankingModelId;
            return this;
        }

        @Override
        public ModifyRankingModelRequest build() {
            return new ModifyRankingModelRequest(this);
        } 

    } 

}
