// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAsyncResultRequest} extends {@link RequestModel}
 *
 * <p>GetAsyncResultRequest</p>
 */
public class GetAsyncResultRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true, maximum = 100000000)
    private String taskId;

    private GetAsyncResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAsyncResultRequest create() {
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
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<GetAsyncResultRequest, Builder> {
        private String regionId; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(GetAsyncResultRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.taskId = response.taskId;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public GetAsyncResultRequest build() {
            return new GetAsyncResultRequest(this);
        } 

    } 

}
