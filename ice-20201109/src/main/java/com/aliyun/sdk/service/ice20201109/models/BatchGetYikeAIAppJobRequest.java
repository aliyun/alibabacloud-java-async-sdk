// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link BatchGetYikeAIAppJobRequest} extends {@link RequestModel}
 *
 * <p>BatchGetYikeAIAppJobRequest</p>
 */
public class BatchGetYikeAIAppJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobIds")
    private String jobIds;

    private BatchGetYikeAIAppJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.jobIds = builder.jobIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetYikeAIAppJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return jobIds
     */
    public String getJobIds() {
        return this.jobIds;
    }

    public static final class Builder extends Request.Builder<BatchGetYikeAIAppJobRequest, Builder> {
        private String regionId; 
        private String jobIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetYikeAIAppJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.jobIds = request.jobIds;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * JobIds.
         */
        public Builder jobIds(String jobIds) {
            this.putQueryParameter("JobIds", jobIds);
            this.jobIds = jobIds;
            return this;
        }

        @Override
        public BatchGetYikeAIAppJobRequest build() {
            return new BatchGetYikeAIAppJobRequest(this);
        } 

    } 

}
