// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link GetRealtimeCampaignStatsRequest} extends {@link RequestModel}
 *
 * <p>GetRealtimeCampaignStatsRequest</p>
 */
public class GetRealtimeCampaignStatsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueId;

    private GetRealtimeCampaignStatsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.queueId = builder.queueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeCampaignStatsRequest create() {
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
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    public static final class Builder extends Request.Builder<GetRealtimeCampaignStatsRequest, Builder> {
        private String instanceId; 
        private String queueId; 

        private Builder() {
            super();
        } 

        private Builder(GetRealtimeCampaignStatsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.queueId = request.queueId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        @Override
        public GetRealtimeCampaignStatsRequest build() {
            return new GetRealtimeCampaignStatsRequest(this);
        } 

    } 

}
