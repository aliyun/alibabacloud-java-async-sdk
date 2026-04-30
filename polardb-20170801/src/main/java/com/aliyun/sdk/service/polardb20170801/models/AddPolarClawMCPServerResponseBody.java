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
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerName.
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
