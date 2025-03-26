// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link UnAssignPrivateIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>UnAssignPrivateIpAddressResponseBody</p>
 */
public class UnAssignPrivateIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UnAssignPrivateIpAddressResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnAssignPrivateIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UnAssignPrivateIpAddressResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
         * 
         * <strong>example:</strong>
         * <p>You don&quot;t have the permission to do this operation.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>A88DFED5-24B7-5A3E-87DE-380BF06F3C90</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UnAssignPrivateIpAddressResponseBody build() {
            return new UnAssignPrivateIpAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UnAssignPrivateIpAddressResponseBody} extends {@link TeaModel}
     *
     * <p>UnAssignPrivateIpAddressResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpName")
        private String ipName;

        @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
        private String networkInterfaceId;

        private Content(Builder builder) {
            this.ipName = builder.ipName;
            this.networkInterfaceId = builder.networkInterfaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return ipName
         */
        public String getIpName() {
            return this.ipName;
        }

        /**
         * @return networkInterfaceId
         */
        public String getNetworkInterfaceId() {
            return this.networkInterfaceId;
        }

        public static final class Builder {
            private String ipName; 
            private String networkInterfaceId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.ipName = model.ipName;
                this.networkInterfaceId = model.networkInterfaceId;
            } 

            /**
             * <p>IP unique identifier</p>
             * 
             * <strong>example:</strong>
             * <p>sip-xxxxx</p>
             */
            public Builder ipName(String ipName) {
                this.ipName = ipName;
                return this;
            }

            /**
             * <p>Lingjun network interface controller ID</p>
             * 
             * <strong>example:</strong>
             * <p>lni-bp164jwjpdq4lnsy83s5</p>
             */
            public Builder networkInterfaceId(String networkInterfaceId) {
                this.networkInterfaceId = networkInterfaceId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
