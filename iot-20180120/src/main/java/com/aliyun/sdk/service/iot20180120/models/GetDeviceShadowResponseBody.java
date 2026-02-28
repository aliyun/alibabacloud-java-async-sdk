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
 * {@link GetDeviceShadowResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeviceShadowResponseBody</p>
 */
public class GetDeviceShadowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShadowMessage")
    private String shadowMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDeviceShadowResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.shadowMessage = builder.shadowMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceShadowResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return shadowMessage
     */
    public String getShadowMessage() {
        return this.shadowMessage;
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
        private String requestId; 
        private String shadowMessage; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDeviceShadowResponseBody model) {
            this.code = model.code;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.shadowMessage = model.shadowMessage;
            this.success = model.success;
        } 

        /**
         * <p>The error code that is returned if the call fails. For more information about error codes, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message that is returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A56E345A-0978-4993-ACBA-3EF444ED187F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The shadow information that is returned if the call is successful.</p>
         * <blockquote>
         * <p> The structure of the shadow information varies based on the status of the device. For more information, see the <a href="https://help.aliyun.com/document_detail/53930.html">Overview</a> topic of Device shadows.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;method&quot;:&quot;update&quot;,&quot;state&quot;:{&quot;desired&quot;:{&quot;color&quot;:&quot;green&quot;}},&quot;version&quot;:1}</p>
         */
        public Builder shadowMessage(String shadowMessage) {
            this.shadowMessage = shadowMessage;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDeviceShadowResponseBody build() {
            return new GetDeviceShadowResponseBody(this);
        } 

    } 

}
