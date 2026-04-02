// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetTempFileTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTempFileTaskRequest</p>
 */
public class GetTempFileTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TempFileTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tempFileTaskId;

    private GetTempFileTaskRequest(Builder builder) {
        super(builder);
        this.tempFileTaskId = builder.tempFileTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTempFileTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileTaskId
     */
    public String getTempFileTaskId() {
        return this.tempFileTaskId;
    }

    public static final class Builder extends Request.Builder<GetTempFileTaskRequest, Builder> {
        private String tempFileTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTempFileTaskRequest request) {
            super(request);
            this.tempFileTaskId = request.tempFileTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-05cexxxxxxxxx</p>
         */
        public Builder tempFileTaskId(String tempFileTaskId) {
            this.putPathParameter("TempFileTaskId", tempFileTaskId);
            this.tempFileTaskId = tempFileTaskId;
            return this;
        }

        @Override
        public GetTempFileTaskRequest build() {
            return new GetTempFileTaskRequest(this);
        } 

    } 

}
