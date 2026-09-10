// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawMCPServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarClawMCPServersResponseBody</p>
 */
public class DescribePolarClawMCPServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Servers")
    private java.util.Map<String, ?> servers;

    private DescribePolarClawMCPServersResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.servers = builder.servers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawMCPServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servers
     */
    public java.util.Map<String, ?> getServers() {
        return this.servers;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private java.util.Map<String, ?> servers; 

        private Builder() {
        } 

        private Builder(DescribePolarClawMCPServersResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.servers = model.servers;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The configurations of the MCP servers.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;dev-mcp-server&quot;: &quot;{\&quot;args\&quot;:[\&quot;-y\&quot;,\&quot;@polarclaw/mcp-dev\&quot;],\&quot;command\&quot;:\&quot;node\&quot;}&quot;
         * }</p>
         */
        public Builder servers(java.util.Map<String, ?> servers) {
            this.servers = servers;
            return this;
        }

        public DescribePolarClawMCPServersResponseBody build() {
            return new DescribePolarClawMCPServersResponseBody(this);
        } 

    } 

}
