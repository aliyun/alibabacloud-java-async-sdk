// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DeleteScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteScheduledTaskRequest</p>
 */
public class DeleteScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScheduledId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduledId;

    private DeleteScheduledTaskRequest(Builder builder) {
        super(builder);
        this.scheduledId = builder.scheduledId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScheduledTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scheduledId
     */
    public String getScheduledId() {
        return this.scheduledId;
    }

    public static final class Builder extends Request.Builder<DeleteScheduledTaskRequest, Builder> {
        private String scheduledId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScheduledTaskRequest request) {
            super(request);
            this.scheduledId = request.scheduledId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>847268a4-196f-416b-aa12-bfe0c115****</p>
         */
        public Builder scheduledId(String scheduledId) {
            this.putQueryParameter("ScheduledId", scheduledId);
            this.scheduledId = scheduledId;
            return this;
        }

        @Override
        public DeleteScheduledTaskRequest build() {
            return new DeleteScheduledTaskRequest(this);
        } 

    } 

}
