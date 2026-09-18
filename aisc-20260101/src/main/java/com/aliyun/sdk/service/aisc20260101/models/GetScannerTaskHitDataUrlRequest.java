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
 * {@link GetScannerTaskHitDataUrlRequest} extends {@link RequestModel}
 *
 * <p>GetScannerTaskHitDataUrlRequest</p>
 */
public class GetScannerTaskHitDataUrlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScannerTaskId")
    private String scannerTaskId;

    private GetScannerTaskHitDataUrlRequest(Builder builder) {
        super(builder);
        this.scannerTaskId = builder.scannerTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScannerTaskHitDataUrlRequest create() {
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

    public static final class Builder extends Request.Builder<GetScannerTaskHitDataUrlRequest, Builder> {
        private String scannerTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetScannerTaskHitDataUrlRequest request) {
            super(request);
            this.scannerTaskId = request.scannerTaskId;
        } 

        /**
         * <p>The unique identifier of the scan task. This is the TaskId returned by CreateTargetScanTask or the ScannerTaskId returned by ListScanTasksByTarget. This parameter is registered as optional but is required in practice. An empty value returns HTTP status code 400. If the task does not exist or belongs to another tenant, HTTP status code 400 is returned uniformly to avoid exposing whether the resource exists.</p>
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
        public GetScannerTaskHitDataUrlRequest build() {
            return new GetScannerTaskHitDataUrlRequest(this);
        } 

    } 

}
