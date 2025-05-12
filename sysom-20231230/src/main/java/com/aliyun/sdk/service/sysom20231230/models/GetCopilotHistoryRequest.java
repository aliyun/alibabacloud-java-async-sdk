// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetCopilotHistoryRequest} extends {@link RequestModel}
 *
 * <p>GetCopilotHistoryRequest</p>
 */
public class GetCopilotHistoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("count")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long count;

    private GetCopilotHistoryRequest(Builder builder) {
        super(builder);
        this.count = builder.count;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    public static final class Builder extends Request.Builder<GetCopilotHistoryRequest, Builder> {
        private Long count; 

        private Builder() {
            super();
        } 

        private Builder(GetCopilotHistoryRequest request) {
            super(request);
            this.count = request.count;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder count(Long count) {
            this.putBodyParameter("count", count);
            this.count = count;
            return this;
        }

        @Override
        public GetCopilotHistoryRequest build() {
            return new GetCopilotHistoryRequest(this);
        } 

    } 

}
