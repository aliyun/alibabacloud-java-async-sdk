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
 * {@link FetchRemoteMcpToolsResponseBody} extends {@link TeaModel}
 *
 * <p>FetchRemoteMcpToolsResponseBody</p>
 */
public class FetchRemoteMcpToolsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("tools")
    private String tools;

    private FetchRemoteMcpToolsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FetchRemoteMcpToolsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tools
     */
    public String getTools() {
        return this.tools;
    }

    public static final class Builder {
        private String requestId; 
        private String tools; 

        private Builder() {
        } 

        private Builder(FetchRemoteMcpToolsResponseBody model) {
            this.requestId = model.requestId;
            this.tools = model.tools;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * tools.
         */
        public Builder tools(String tools) {
            this.tools = tools;
            return this;
        }

        public FetchRemoteMcpToolsResponseBody build() {
            return new FetchRemoteMcpToolsResponseBody(this);
        } 

    } 

}
