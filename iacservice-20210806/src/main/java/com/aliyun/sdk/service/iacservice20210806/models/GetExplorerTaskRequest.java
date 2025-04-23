// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link GetExplorerTaskRequest} extends {@link RequestModel}
 *
 * <p>GetExplorerTaskRequest</p>
 */
public class GetExplorerTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("explorerTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String explorerTaskId;

    private GetExplorerTaskRequest(Builder builder) {
        super(builder);
        this.explorerTaskId = builder.explorerTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExplorerTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerTaskId
     */
    public String getExplorerTaskId() {
        return this.explorerTaskId;
    }

    public static final class Builder extends Request.Builder<GetExplorerTaskRequest, Builder> {
        private String explorerTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetExplorerTaskRequest request) {
            super(request);
            this.explorerTaskId = request.explorerTaskId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder explorerTaskId(String explorerTaskId) {
            this.putPathParameter("explorerTaskId", explorerTaskId);
            this.explorerTaskId = explorerTaskId;
            return this;
        }

        @Override
        public GetExplorerTaskRequest build() {
            return new GetExplorerTaskRequest(this);
        } 

    } 

}
