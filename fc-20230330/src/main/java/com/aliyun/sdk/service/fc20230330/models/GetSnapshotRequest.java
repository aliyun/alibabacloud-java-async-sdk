// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link GetSnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetSnapshotRequest</p>
 */
public class GetSnapshotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("snapshotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotId;

    private GetSnapshotRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSnapshotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<GetSnapshotRequest, Builder> {
        private String functionName; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(GetSnapshotRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myFunction</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8e7d6c5b-4a3f-4c1a-9b8e-1f2a3b4c5d6e</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putPathParameter("snapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public GetSnapshotRequest build() {
            return new GetSnapshotRequest(this);
        } 

    } 

}
