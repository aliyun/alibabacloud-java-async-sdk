// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetMemoryAutoExtractionSwitchResponseBody} extends {@link TeaModel}
 *
 * <p>GetMemoryAutoExtractionSwitchResponseBody</p>
 */
public class GetMemoryAutoExtractionSwitchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetMemoryAutoExtractionSwitchResponseBody(Builder builder) {
        this.code = builder.code;
        this.enabled = builder.enabled;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMemoryAutoExtractionSwitchResponseBody create() {
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
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
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

    public static final class Builder {
        private String code; 
        private Boolean enabled; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMemoryAutoExtractionSwitchResponseBody model) {
            this.code = model.code;
            this.enabled = model.enabled;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The status of the automatic memory collection switch for the current memory scope. A value of true indicates that the switch is enabled, and a value of false indicates that the switch is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The current user is not an active member of the group cg_12345</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMemoryAutoExtractionSwitchResponseBody build() {
            return new GetMemoryAutoExtractionSwitchResponseBody(this);
        } 

    } 

}
