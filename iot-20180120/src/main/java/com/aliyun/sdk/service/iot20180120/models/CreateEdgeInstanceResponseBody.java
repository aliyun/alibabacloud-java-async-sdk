// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateEdgeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEdgeInstanceResponseBody</p>
 */
public class CreateEdgeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateEdgeInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEdgeInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String errorMessage; 
        private String instanceId; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateEdgeInstanceResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code. Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the edge instance.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>28D159F4-980F-423D-95F0-F705E9DFC016</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. true: indicates that the call was successful. false: indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateEdgeInstanceResponseBody build() {
            return new CreateEdgeInstanceResponseBody(this);
        } 

    } 

}
