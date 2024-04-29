// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotPresetResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHoneypotPresetResponseBody</p>
 */
public class CreateHoneypotPresetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotPreset")
    private HoneypotPreset honeypotPreset;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateHoneypotPresetResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotPreset = builder.honeypotPreset;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotPresetResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotPreset
     */
    public HoneypotPreset getHoneypotPreset() {
        return this.honeypotPreset;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private HoneypotPreset honeypotPreset; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The creation result.
         */
        public Builder honeypotPreset(HoneypotPreset honeypotPreset) {
            this.honeypotPreset = honeypotPreset;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateHoneypotPresetResponseBody build() {
            return new CreateHoneypotPresetResponseBody(this);
        } 

    } 

    public static class HoneypotPreset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HoneypotPresetId")
        private String honeypotPresetId;

        private HoneypotPreset(Builder builder) {
            this.honeypotPresetId = builder.honeypotPresetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotPreset create() {
            return builder().build();
        }

        /**
         * @return honeypotPresetId
         */
        public String getHoneypotPresetId() {
            return this.honeypotPresetId;
        }

        public static final class Builder {
            private String honeypotPresetId; 

            /**
             * The ID of the honeypot template.
             */
            public Builder honeypotPresetId(String honeypotPresetId) {
                this.honeypotPresetId = honeypotPresetId;
                return this;
            }

            public HoneypotPreset build() {
                return new HoneypotPreset(this);
            } 

        } 

    }
}
