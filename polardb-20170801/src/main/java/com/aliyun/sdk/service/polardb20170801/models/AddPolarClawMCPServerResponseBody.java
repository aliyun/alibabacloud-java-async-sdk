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
 * {@link AddPolarClawMCPServerResponseBody} extends {@link TeaModel}
 *
 * <p>AddPolarClawMCPServerResponseBody</p>
 */
public class AddPolarClawMCPServerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServerName")
    private String serverName;

    private AddPolarClawMCPServerResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.ok = builder.ok;
        this.requestId = builder.requestId;
        this.serverName = builder.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPolarClawMCPServerResponseBody create() {
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
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverName
     */
    public String getServerName() {
        return this.serverName;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Boolean ok; 
        private String requestId; 
        private String serverName; 

        private Builder() {
        } 

        private Builder(AddPolarClawMCPServerResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.ok = model.ok;
            this.requestId = model.requestId;
            this.serverName = model.serverName;
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
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
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
         * <p>The name of the added or updated MCP server.</p>
         * 
         * <strong>example:</strong>
         * <p>test-v1</p>
         */
        public Builder serverName(String serverName) {
            this.serverName = serverName;
            return this;
        }

        public AddPolarClawMCPServerResponseBody build() {
            return new AddPolarClawMCPServerResponseBody(this);
        } 

    } 

}
