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
 * {@link GetMemoryCollectionRequest} extends {@link RequestModel}
 *
 * <p>GetMemoryCollectionRequest</p>
 */
public class GetMemoryCollectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryCollectionName")
    private String memoryCollectionName;

    private GetMemoryCollectionRequest(Builder builder) {
        super(builder);
        this.memoryCollectionName = builder.memoryCollectionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryCollectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryCollectionName
     */
    public String getMemoryCollectionName() {
        return this.memoryCollectionName;
    }

    public static final class Builder extends Request.Builder<GetMemoryCollectionRequest, Builder> {
        private String memoryCollectionName; 

        private Builder() {
            super();
        } 

        private Builder(GetMemoryCollectionRequest request) {
            super(request);
            this.memoryCollectionName = request.memoryCollectionName;
        } 

        /**
         * memoryCollectionName.
         */
        public Builder memoryCollectionName(String memoryCollectionName) {
            this.putPathParameter("memoryCollectionName", memoryCollectionName);
            this.memoryCollectionName = memoryCollectionName;
            return this;
        }

        @Override
        public GetMemoryCollectionRequest build() {
            return new GetMemoryCollectionRequest(this);
        } 

    } 

}
