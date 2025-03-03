// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DeleteRunRequest} extends {@link RequestModel}
 *
 * <p>DeleteRunRequest</p>
 */
public class DeleteRunRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    private DeleteRunRequest(Builder builder) {
        super(builder);
        this.runId = builder.runId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRunRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    public static final class Builder extends Request.Builder<DeleteRunRequest, Builder> {
        private String runId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRunRequest request) {
            super(request);
            this.runId = request.runId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1qJhzJ2YXgX****</p>
         */
        public Builder runId(String runId) {
            this.putPathParameter("RunId", runId);
            this.runId = runId;
            return this;
        }

        @Override
        public DeleteRunRequest build() {
            return new DeleteRunRequest(this);
        } 

    } 

}
