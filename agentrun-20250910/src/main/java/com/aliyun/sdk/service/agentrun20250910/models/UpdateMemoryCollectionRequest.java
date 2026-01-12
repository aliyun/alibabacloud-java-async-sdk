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
 * {@link UpdateMemoryCollectionRequest} extends {@link RequestModel}
 *
 * <p>UpdateMemoryCollectionRequest</p>
 */
public class UpdateMemoryCollectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("memoryCollectionName")
    private String memoryCollectionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private UpdateMemoryCollectionInput body;

    private UpdateMemoryCollectionRequest(Builder builder) {
        super(builder);
        this.memoryCollectionName = builder.memoryCollectionName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMemoryCollectionRequest create() {
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

    /**
     * @return body
     */
    public UpdateMemoryCollectionInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMemoryCollectionRequest, Builder> {
        private String memoryCollectionName; 
        private UpdateMemoryCollectionInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMemoryCollectionRequest request) {
            super(request);
            this.memoryCollectionName = request.memoryCollectionName;
            this.body = request.body;
        } 

        /**
         * memoryCollectionName.
         */
        public Builder memoryCollectionName(String memoryCollectionName) {
            this.putPathParameter("memoryCollectionName", memoryCollectionName);
            this.memoryCollectionName = memoryCollectionName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(UpdateMemoryCollectionInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMemoryCollectionRequest build() {
            return new UpdateMemoryCollectionRequest(this);
        } 

    } 

}
