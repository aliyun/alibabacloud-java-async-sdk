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
 * {@link UpdateApplicationEnvironmentVariablesResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationEnvironmentVariablesResponseBody</p>
 */
public class UpdateApplicationEnvironmentVariablesResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Restarted")
    private Boolean restarted;

    @com.aliyun.core.annotation.NameInMap("TotalVariables")
    private Integer totalVariables;

    @com.aliyun.core.annotation.NameInMap("UpdatedKeys")
    private java.util.List<String> updatedKeys;

    private UpdateApplicationEnvironmentVariablesResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.code = builder.code;
        this.message = builder.message;
        this.ok = builder.ok;
        this.requestId = builder.requestId;
        this.restarted = builder.restarted;
        this.totalVariables = builder.totalVariables;
        this.updatedKeys = builder.updatedKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationEnvironmentVariablesResponseBody create() {
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
     * @return restarted
     */
    public Boolean getRestarted() {
        return this.restarted;
    }

    /**
     * @return totalVariables
     */
    public Integer getTotalVariables() {
        return this.totalVariables;
    }

    /**
     * @return updatedKeys
     */
    public java.util.List<String> getUpdatedKeys() {
        return this.updatedKeys;
    }

    public static final class Builder {
        private String applicationId; 
        private Integer code; 
        private String message; 
        private Boolean ok; 
        private String requestId; 
        private Boolean restarted; 
        private Integer totalVariables; 
        private java.util.List<String> updatedKeys; 

        private Builder() {
        } 

        private Builder(UpdateApplicationEnvironmentVariablesResponseBody model) {
            this.applicationId = model.applicationId;
            this.code = model.code;
            this.message = model.message;
            this.ok = model.ok;
            this.requestId = model.requestId;
            this.restarted = model.restarted;
            this.totalVariables = model.totalVariables;
            this.updatedKeys = model.updatedKeys;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Restarted.
         */
        public Builder restarted(Boolean restarted) {
            this.restarted = restarted;
            return this;
        }

        /**
         * TotalVariables.
         */
        public Builder totalVariables(Integer totalVariables) {
            this.totalVariables = totalVariables;
            return this;
        }

        /**
         * UpdatedKeys.
         */
        public Builder updatedKeys(java.util.List<String> updatedKeys) {
            this.updatedKeys = updatedKeys;
            return this;
        }

        public UpdateApplicationEnvironmentVariablesResponseBody build() {
            return new UpdateApplicationEnvironmentVariablesResponseBody(this);
        } 

    } 

}
