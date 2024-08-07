// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCycleTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteCycleTaskRequest</p>
 */
public class DeleteCycleTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configId;

    private DeleteCycleTaskRequest(Builder builder) {
        super(builder);
        this.configId = builder.configId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCycleTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
    }

    public static final class Builder extends Request.Builder<DeleteCycleTaskRequest, Builder> {
        private String configId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCycleTaskRequest request) {
            super(request);
            this.configId = request.configId;
        } 

        /**
         * The ID of the task configuration.
         * <p>
         * 
         * >  You can call the [DescribeCycleTaskList](~~DescribeCycleTaskList~~) operation to query the IDs of task configurations.
         */
        public Builder configId(String configId) {
            this.putQueryParameter("ConfigId", configId);
            this.configId = configId;
            return this;
        }

        @Override
        public DeleteCycleTaskRequest build() {
            return new DeleteCycleTaskRequest(this);
        } 

    } 

}
