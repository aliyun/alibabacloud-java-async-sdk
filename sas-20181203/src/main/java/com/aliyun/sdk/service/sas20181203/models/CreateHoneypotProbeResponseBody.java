// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateHoneypotProbeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHoneypotProbeResponseBody</p>
 */
public class CreateHoneypotProbeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HoneypotProbe")
    private HoneypotProbe honeypotProbe;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The status code returned. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the probe.</p>
         */
        public Builder honeypotProbe(HoneypotProbe honeypotProbe) {
            this.honeypotProbe = honeypotProbe;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A839E8-70AE-591D-8D9E-C5419A2240DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateHoneypotProbeResponseBody build() {
            return new CreateHoneypotProbeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateHoneypotProbeResponseBody} extends {@link TeaModel}
     *
     * <p>CreateHoneypotProbeResponseBody</p>
     */
    public static class HoneypotProbe extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProbeId")
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
             * <p>The ID of the probe.</p>
             * 
             * <strong>example:</strong>
             * <p>b69e9aa8-2ea8-4c5a-836a-c1fbacff****</p>
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
