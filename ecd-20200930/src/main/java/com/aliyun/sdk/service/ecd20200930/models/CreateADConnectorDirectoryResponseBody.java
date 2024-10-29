// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateADConnectorDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateADConnectorDirectoryResponseBody</p>
 */
public class CreateADConnectorDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdConnectors")
    private java.util.List < AdConnectors> adConnectors;

    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrustPassword")
    private String trustPassword;

    private CreateADConnectorDirectoryResponseBody(Builder builder) {
        this.adConnectors = builder.adConnectors;
        this.directoryId = builder.directoryId;
        this.requestId = builder.requestId;
        this.trustPassword = builder.trustPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateADConnectorDirectoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return adConnectors
     */
    public java.util.List < AdConnectors> getAdConnectors() {
        return this.adConnectors;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trustPassword
     */
    public String getTrustPassword() {
        return this.trustPassword;
    }

    public static final class Builder {
        private java.util.List < AdConnectors> adConnectors; 
        private String directoryId; 
        private String requestId; 
        private String trustPassword; 

        /**
         * <p>The details of AD connectors.</p>
         */
        public Builder adConnectors(java.util.List < AdConnectors> adConnectors) {
            this.adConnectors = adConnectors;
            return this;
        }

        /**
         * <p>The ID of the AD directory.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-gx2x1dhsmu52rd****</p>
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3FE99D5E-93A1-493F-B1CB-0ABD4D05BEFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The AD trust password.</p>
         * 
         * <strong>example:</strong>
         * <p>82Tg****</p>
         */
        public Builder trustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }

        public CreateADConnectorDirectoryResponseBody build() {
            return new CreateADConnectorDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateADConnectorDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>CreateADConnectorDirectoryResponseBody</p>
     */
    public static class AdConnectors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        private AdConnectors(Builder builder) {
            this.address = builder.address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdConnectors create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        public static final class Builder {
            private String address; 

            /**
             * <p>The connection address.</p>
             * 
             * <strong>example:</strong>
             * <p><code>127.0.**.**</code></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            public AdConnectors build() {
                return new AdConnectors(this);
            } 

        } 

    }
}
