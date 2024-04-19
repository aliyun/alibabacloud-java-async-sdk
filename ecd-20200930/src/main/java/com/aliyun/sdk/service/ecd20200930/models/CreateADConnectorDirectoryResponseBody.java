// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateADConnectorDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateADConnectorDirectoryResponseBody</p>
 */
public class CreateADConnectorDirectoryResponseBody extends TeaModel {
    @NameInMap("AdConnectors")
    private java.util.List < AdConnectors> adConnectors;

    @NameInMap("DirectoryId")
    private String directoryId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrustPassword")
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
         * The details of AD connectors.
         */
        public Builder adConnectors(java.util.List < AdConnectors> adConnectors) {
            this.adConnectors = adConnectors;
            return this;
        }

        /**
         * The ID of the AD directory.
         */
        public Builder directoryId(String directoryId) {
            this.directoryId = directoryId;
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
         * The AD trust password.
         */
        public Builder trustPassword(String trustPassword) {
            this.trustPassword = trustPassword;
            return this;
        }

        public CreateADConnectorDirectoryResponseBody build() {
            return new CreateADConnectorDirectoryResponseBody(this);
        } 

    } 

    public static class AdConnectors extends TeaModel {
        @NameInMap("Address")
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
             * The connection address.
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
