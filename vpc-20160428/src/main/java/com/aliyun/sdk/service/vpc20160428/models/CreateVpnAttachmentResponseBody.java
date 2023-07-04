// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpnAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpnAttachmentResponseBody</p>
 */
public class CreateVpnAttachmentResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("Message")
    private String message;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("VpnConnectionId")
    private String vpnConnectionId;

    private CreateVpnAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.message = builder.message;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.vpnConnectionId = builder.vpnConnectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpnAttachmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return vpnConnectionId
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }

    public static final class Builder {
        private String code; 
        private Long createTime; 
        private String message; 
        private String name; 
        private String requestId; 
        private Boolean success; 
        private String vpnConnectionId; 

        /**
         * The status code returned by the current operation. **200** indicates that the operation is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The timestamp generated when the IPsec-VPN connection was established. Unit: milliseconds.
         * <p>
         * 
         * This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The information returned by the current operation.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The name of the IPsec-VPN connection.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the current operation is successful.
         * <p>
         * 
         * *   **true**: The operation is successful.
         * *   **false**: The operation failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the IPsec-VPN connection.
         */
        public Builder vpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = vpnConnectionId;
            return this;
        }

        public CreateVpnAttachmentResponseBody build() {
            return new CreateVpnAttachmentResponseBody(this);
        } 

    } 

}
