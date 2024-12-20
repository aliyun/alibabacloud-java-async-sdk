// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link DeleteSyntheticTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteSyntheticTaskRequest</p>
 */
public class DeleteSyntheticTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> taskIds;

    private DeleteSyntheticTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskIds = builder.taskIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSyntheticTaskRequest create() {
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
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    public static final class Builder extends Request.Builder<DeleteSyntheticTaskRequest, Builder> {
        private String regionId; 
        private java.util.List<String> taskIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSyntheticTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.taskIds = request.taskIds;
        } 

        /**
         * <p>The region ID. Default value: cn-hangzhou.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The task IDs.</p>
         * <p>This parameter is required.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        @Override
        public DeleteSyntheticTaskRequest build() {
            return new DeleteSyntheticTaskRequest(this);
        } 

    } 

}
