// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTaskExecutionInvocationsRequest} extends {@link RequestModel}
 *
 * <p>ListTaskExecutionInvocationsRequest</p>
 */
public class ListTaskExecutionInvocationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskExecutionId")
    private String taskExecutionId;

    private ListTaskExecutionInvocationsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.status = builder.status;
        this.taskExecutionId = builder.taskExecutionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskExecutionInvocationsRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskExecutionId
     */
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public static final class Builder extends Request.Builder<ListTaskExecutionInvocationsRequest, Builder> {
        private String regionId; 
        private String status; 
        private String taskExecutionId; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskExecutionInvocationsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.status = request.status;
            this.taskExecutionId = request.taskExecutionId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * TaskExecutionId.
         */
        public Builder taskExecutionId(String taskExecutionId) {
            this.putQueryParameter("TaskExecutionId", taskExecutionId);
            this.taskExecutionId = taskExecutionId;
            return this;
        }

        @Override
        public ListTaskExecutionInvocationsRequest build() {
            return new ListTaskExecutionInvocationsRequest(this);
        } 

    } 

}
