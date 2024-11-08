// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExecutionsRequest} extends {@link RequestModel}
 *
 * <p>DeleteExecutionsRequest</p>
 */
public class DeleteExecutionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteExecutionsRequest(Builder builder) {
        super(builder);
        this.executionIds = builder.executionIds;
        this.force = builder.force;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExecutionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return executionIds
     */
    public String getExecutionIds() {
        return this.executionIds;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteExecutionsRequest, Builder> {
        private String executionIds; 
        private Boolean force; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExecutionsRequest request) {
            super(request);
            this.executionIds = request.executionIds;
            this.force = request.force;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The execution IDs.</p>
         * <p>You can specify multiple execution IDs in a JSON array in the format of <code>[&quot;xxxxxxxxx&quot;, &quot;yyyyyyyyy&quot;, ... &quot;zzzzzzzzz&quot;]</code>. You can specify up to 100 execution IDs at a time. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;exec-xxx&quot;]</p>
         */
        public Builder executionIds(String executionIds) {
            this.putQueryParameter("ExecutionIds", executionIds);
            this.executionIds = executionIds;
            return this;
        }

        /**
         * <p>Whether to force delete the running task, the default value is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteExecutionsRequest build() {
            return new DeleteExecutionsRequest(this);
        } 

    } 

}
