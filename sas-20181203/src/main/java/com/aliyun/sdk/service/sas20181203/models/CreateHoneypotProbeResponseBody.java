// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHoneypotProbeResponseBody</p>
 */
public class CreateHoneypotProbeResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HoneypotProbe")
    private HoneypotProbe honeypotProbe;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateHoneypotProbeResponseBody(Builder builder) {
        this.code = builder.code;
        this.honeypotProbe = builder.honeypotProbe;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHoneypotProbeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return honeypotProbe
     */
    public HoneypotProbe getHoneypotProbe() {
        return this.honeypotProbe;
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
        private HoneypotProbe honeypotProbe; 
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
         * The information about the probe.
         */
        public Builder honeypotProbe(HoneypotProbe honeypotProbe) {
            this.honeypotProbe = honeypotProbe;
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

        public CreateHoneypotProbeResponseBody build() {
            return new CreateHoneypotProbeResponseBody(this);
        } 

    } 

    public static class HoneypotProbe extends TeaModel {
        @NameInMap("ProbeId")
        private String probeId;

        private HoneypotProbe(Builder builder) {
            this.probeId = builder.probeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HoneypotProbe create() {
            return builder().build();
        }

        /**
         * @return probeId
         */
        public String getProbeId() {
            return this.probeId;
        }

        public static final class Builder {
            private String probeId; 

            /**
             * The ID of the probe.
             */
            public Builder probeId(String probeId) {
                this.probeId = probeId;
                return this;
            }

            public HoneypotProbe build() {
                return new HoneypotProbe(this);
            } 

        } 

    }
}
