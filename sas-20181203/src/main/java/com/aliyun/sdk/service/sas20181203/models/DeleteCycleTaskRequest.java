// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The ID of the task configuration.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCycleTaskList~~">DescribeCycleTaskList</a> operation to query the IDs of task configurations.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>435f626256ebf564cf5ba966a539****</p>
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
