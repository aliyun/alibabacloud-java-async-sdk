// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link DeleteScannerTaskRequest} extends {@link RequestModel}
 *
 * <p>DeleteScannerTaskRequest</p>
 */
public class DeleteScannerTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScannerTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scannerTaskId;

    private DeleteScannerTaskRequest(Builder builder) {
        super(builder);
        this.scannerTaskId = builder.scannerTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteScannerTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scannerTaskId
     */
    public String getScannerTaskId() {
        return this.scannerTaskId;
    }

    public static final class Builder extends Request.Builder<DeleteScannerTaskRequest, Builder> {
        private String scannerTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteScannerTaskRequest request) {
            super(request);
            this.scannerTaskId = request.scannerTaskId;
        } 

        /**
         * <p>The unique identifier of the scan task. This is the TaskId returned by CreateTargetScanTask or the ScannerTaskId returned by ListScanTasksByTarget. If the task does not exist or belongs to another tenant, a 400 error is returned without exposing whether the resource exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-abc123def4567</p>
         */
        public Builder scannerTaskId(String scannerTaskId) {
            this.putQueryParameter("ScannerTaskId", scannerTaskId);
            this.scannerTaskId = scannerTaskId;
            return this;
        }

        @Override
        public DeleteScannerTaskRequest build() {
            return new DeleteScannerTaskRequest(this);
        } 

    } 

}
