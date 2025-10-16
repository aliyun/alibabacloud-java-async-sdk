// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link DeleteMemoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteMemoryRequest</p>
 */
public class DeleteMemoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String memoryName;

    private DeleteMemoryRequest(Builder builder) {
        super(builder);
        this.memoryName = builder.memoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMemoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryName
     */
    public String getMemoryName() {
        return this.memoryName;
    }

    public static final class Builder extends Request.Builder<DeleteMemoryRequest, Builder> {
        private String memoryName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMemoryRequest request) {
            super(request);
            this.memoryName = request.memoryName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-memory</p>
         */
        public Builder memoryName(String memoryName) {
            this.putPathParameter("memoryName", memoryName);
            this.memoryName = memoryName;
            return this;
        }

        @Override
        public DeleteMemoryRequest build() {
            return new DeleteMemoryRequest(this);
        } 

    } 

}
