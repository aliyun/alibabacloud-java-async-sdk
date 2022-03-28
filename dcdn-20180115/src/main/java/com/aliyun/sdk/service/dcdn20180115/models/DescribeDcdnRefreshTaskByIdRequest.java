// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRefreshTaskByIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnRefreshTaskByIdRequest</p>
 */
public class DescribeDcdnRefreshTaskByIdRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private String taskId;

    private DescribeDcdnRefreshTaskByIdRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRefreshTaskByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<DescribeDcdnRefreshTaskByIdRequest, Builder> {
        private Long ownerId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnRefreshTaskByIdRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.taskId = request.taskId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public DescribeDcdnRefreshTaskByIdRequest build() {
            return new DescribeDcdnRefreshTaskByIdRequest(this);
        } 

    } 

}
