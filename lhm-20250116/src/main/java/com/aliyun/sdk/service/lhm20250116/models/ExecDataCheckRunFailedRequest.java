// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ExecDataCheckRunFailedRequest} extends {@link RequestModel}
 *
 * <p>ExecDataCheckRunFailedRequest</p>
 */
public class ExecDataCheckRunFailedRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("batchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long batchId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    private ExecDataCheckRunFailedRequest(Builder builder) {
        super(builder);
        this.batchId = builder.batchId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecDataCheckRunFailedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchId
     */
    public Long getBatchId() {
        return this.batchId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ExecDataCheckRunFailedRequest, Builder> {
        private Long batchId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(ExecDataCheckRunFailedRequest request) {
            super(request);
            this.batchId = request.batchId;
            this.type = request.type;
        } 

        /**
         * <p>The batch ID returned by the ExecDataCheckSaveTask operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20001</p>
         */
        public Builder batchId(Long batchId) {
            this.putBodyParameter("batchId", batchId);
            this.batchId = batchId;
            return this;
        }

        /**
         * <p>The rerun type. Valid values:</p>
         * <ul>
         * <li>0: Reruns only execution-failed subtasks.</li>
         * <li>1: Reruns execution-failed and validation-failed subtasks.</li>
         * <li>2: Reruns execution-failed and stopped subtasks.</li>
         * </ul>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ExecDataCheckRunFailedRequest build() {
            return new ExecDataCheckRunFailedRequest(this);
        } 

    } 

}
