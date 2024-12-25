// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeGroupEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGroupEndpointsResponseBody</p>
 */
public class DescribeGroupEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private Endpoints endpoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGroupEndpointsResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.endpoints = builder.endpoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return endpoints
     */
    public Endpoints getEndpoints() {
        return this.endpoints;
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
        private String accessToken; 
        private Endpoints endpoints; 
        private String message; 
        private String requestId; 

        /**
         * AccessToken.
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * Endpoints.
         */
        public Builder endpoints(Endpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGroupEndpointsResponseBody build() {
            return new DescribeGroupEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGroupEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGroupEndpointsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackendId")
        private String backendId;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("InternetEndpoints")
        private java.util.List<String> internetEndpoints;

        @com.aliyun.core.annotation.NameInMap("IntranetEndpoints")
        private java.util.List<String> intranetEndpoints;

        @com.aliyun.core.annotation.NameInMap("PathType")
        private String pathType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        private Endpoints(Builder builder) {
            this.backendId = builder.backendId;
            this.endpointType = builder.endpointType;
            this.internetEndpoints = builder.internetEndpoints;
            this.intranetEndpoints = builder.intranetEndpoints;
            this.pathType = builder.pathType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return internetEndpoints
         */
        public java.util.List<String> getInternetEndpoints() {
            return this.internetEndpoints;
        }

        /**
         * @return intranetEndpoints
         */
        public java.util.List<String> getIntranetEndpoints() {
            return this.intranetEndpoints;
        }

        /**
         * @return pathType
         */
        public String getPathType() {
            return this.pathType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        public static final class Builder {
            private String backendId; 
            private String endpointType; 
            private java.util.List<String> internetEndpoints; 
            private java.util.List<String> intranetEndpoints; 
            private String pathType; 
            private Integer port; 

            /**
             * BackendId.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * InternetEndpoints.
             */
            public Builder internetEndpoints(java.util.List<String> internetEndpoints) {
                this.internetEndpoints = internetEndpoints;
                return this;
            }

            /**
             * IntranetEndpoints.
             */
            public Builder intranetEndpoints(java.util.List<String> intranetEndpoints) {
                this.intranetEndpoints = intranetEndpoints;
                return this;
            }

            /**
             * PathType.
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
