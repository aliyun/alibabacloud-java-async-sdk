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
 * {@link DescribeServiceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceEndpointsResponseBody</p>
 */
public class DescribeServiceEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessToken")
    private String accessToken;

    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceEndpointsResponseBody(Builder builder) {
        this.accessToken = builder.accessToken;
        this.endpoints = builder.endpoints;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceEndpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Endpoints> getEndpoints() {
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
        private java.util.List<Endpoints> endpoints; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeServiceEndpointsResponseBody model) {
            this.accessToken = model.accessToken;
            this.endpoints = model.endpoints;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The service token.</p>
         * 
         * <strong>example:</strong>
         * <p>Nzc5N2FhN<strong><strong>TQ0YzBmYTIyN2MxZTUxN2NkYjg4MTJmMWQxZmY1</strong></strong></p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The service endpoints.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>Execution successful.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>739998B5-FB39-12A3-8323-0FA340317298</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceEndpointsResponseBody build() {
            return new DescribeServiceEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceEndpointsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Endpoints model) {
                this.backendId = model.backendId;
                this.endpointType = model.endpointType;
                this.internetEndpoints = model.internetEndpoints;
                this.intranetEndpoints = model.intranetEndpoints;
                this.pathType = model.pathType;
                this.port = model.port;
            } 

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
