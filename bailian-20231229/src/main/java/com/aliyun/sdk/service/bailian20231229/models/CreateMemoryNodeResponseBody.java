// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link CreateMemoryNodeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMemoryNodeResponseBody</p>
 */
public class CreateMemoryNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("memoryNodeId")
    private String memoryNodeId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMemoryNodeResponseBody(Builder builder) {
        this.memoryNodeId = builder.memoryNodeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMemoryNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return memoryNodeId
     */
    public String getMemoryNodeId() {
        return this.memoryNodeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String memoryNodeId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMemoryNodeResponseBody model) {
            this.memoryNodeId = model.memoryNodeId;
            this.requestId = model.requestId;
        } 

        /**
         * memoryNodeId.
         */
        public Builder memoryNodeId(String memoryNodeId) {
            this.memoryNodeId = memoryNodeId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMemoryNodeResponseBody build() {
            return new CreateMemoryNodeResponseBody(this);
        } 

    } 

}
