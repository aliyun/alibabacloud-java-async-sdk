// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckRankingModelReachableRequest} extends {@link RequestModel}
 *
 * <p>CheckRankingModelReachableRequest</p>
 */
public class CheckRankingModelReachableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("rankingModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rankingModelId;

    private CheckRankingModelReachableRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.rankingModelId = builder.rankingModelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckRankingModelReachableRequest create() {
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

    public static final class Builder extends Request.Builder<CheckRankingModelReachableRequest, Builder> {
        private String instanceId; 
        private String rankingModelId; 

        private Builder() {
            super();
        } 

        private Builder(CheckRankingModelReachableRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.rankingModelId = request.rankingModelId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-7e22x6f75001</p>
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
         * <p>rankingModelId</p>
         */
        public Builder rankingModelId(String rankingModelId) {
            this.putPathParameter("rankingModelId", rankingModelId);
            this.rankingModelId = rankingModelId;
            return this;
        }

        @Override
        public CheckRankingModelReachableRequest build() {
            return new CheckRankingModelReachableRequest(this);
        } 

    } 

}
