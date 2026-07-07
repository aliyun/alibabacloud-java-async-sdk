// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link GetParseProgressRequest} extends {@link RequestModel}
 *
 * <p>GetParseProgressRequest</p>
 */
public class GetParseProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskKey;

    private GetParseProgressRequest(Builder builder) {
        super(builder);
        this.taskKey = builder.taskKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParseProgressRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return taskKey
     */
    public String getTaskKey() {
        return this.taskKey;
    }

    public static final class Builder extends Request.Builder<GetParseProgressRequest, Builder> {
        private String taskKey; 

        private Builder() {
            super();
        } 

        private Builder(GetParseProgressRequest request) {
            super(request);
            this.taskKey = request.taskKey;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2E7D8B71-2677-1B4C-9E25-A88B9C5******</p>
         */
        public Builder taskKey(String taskKey) {
            this.putQueryParameter("TaskKey", taskKey);
            this.taskKey = taskKey;
            return this;
        }

        @Override
        public GetParseProgressRequest build() {
            return new GetParseProgressRequest(this);
        } 

    } 

}
