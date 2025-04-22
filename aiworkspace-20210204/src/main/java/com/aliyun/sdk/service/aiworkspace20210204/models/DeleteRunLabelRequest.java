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
 * {@link DeleteRunLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteRunLabelRequest</p>
 */
public class DeleteRunLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("RunId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    private DeleteRunLabelRequest(Builder builder) {
        super(builder);
        this.runId = builder.runId;
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRunLabelRequest create() {
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

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<DeleteRunLabelRequest, Builder> {
        private String runId; 
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRunLabelRequest request) {
            super(request);
            this.runId = request.runId;
            this.key = request.key;
        } 

        /**
         * <p>The run ID.</p>
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

        /**
         * <p>The key of the run tag to be deleted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>is_evaluate</p>
         */
        public Builder key(String key) {
            this.putPathParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public DeleteRunLabelRequest build() {
            return new DeleteRunLabelRequest(this);
        } 

    } 

}
