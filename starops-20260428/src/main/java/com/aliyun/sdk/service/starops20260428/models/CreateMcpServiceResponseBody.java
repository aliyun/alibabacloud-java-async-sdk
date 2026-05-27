// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link CreateMcpServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMcpServiceResponseBody</p>
 */
public class CreateMcpServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mcpServiceName")
    private String mcpServiceName;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateMcpServiceResponseBody(Builder builder) {
        this.mcpServiceName = builder.mcpServiceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMcpServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mcpServiceName
     */
    public String getMcpServiceName() {
        return this.mcpServiceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mcpServiceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMcpServiceResponseBody model) {
            this.mcpServiceName = model.mcpServiceName;
            this.requestId = model.requestId;
        } 

        /**
         * mcpServiceName.
         */
        public Builder mcpServiceName(String mcpServiceName) {
            this.mcpServiceName = mcpServiceName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMcpServiceResponseBody build() {
            return new CreateMcpServiceResponseBody(this);
        } 

    } 

}
