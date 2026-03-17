// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifySagRemoteAccessResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySagRemoteAccessResponseBody</p>
 */
public class ModifySagRemoteAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RemoteAccessIp")
    private String remoteAccessIp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ModifySagRemoteAccessResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.remoteAccessIp = builder.remoteAccessIp;
        this.requestId = builder.requestId;
        this.serialNumber = builder.serialNumber;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySagRemoteAccessResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return remoteAccessIp
     */
    public String getRemoteAccessIp() {
        return this.remoteAccessIp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String remoteAccessIp; 
        private String requestId; 
        private String serialNumber; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ModifySagRemoteAccessResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.remoteAccessIp = model.remoteAccessIp;
            this.requestId = model.requestId;
            this.serialNumber = model.serialNumber;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message returned after calling the API.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The remote access IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.2</p>
         */
        public Builder remoteAccessIp(String remoteAccessIp) {
            this.remoteAccessIp = remoteAccessIp;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4FF203D7-462D-498E-94F9-2B2FA462DD23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The SN of the SAG device.</p>
         * 
         * <strong>example:</strong>
         * <p>sag61a344**</p>
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifySagRemoteAccessResponseBody build() {
            return new ModifySagRemoteAccessResponseBody(this);
        } 

    } 

}
