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

        private Builder() {
        } 

        private Builder(DescribeGroupEndpointsResponseBody model) {
            this.accessToken = model.accessToken;
            this.endpoints = model.endpoints;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The service token.</p>
         * 
         * <strong>example:</strong>
         * <p>Nzc5N2FhNTM4OTQ0YzBmYTIy<strong><strong>ZTUxN2NkYjg4MTJmMWQxZmY1</strong></strong></p>
         */
        public Builder accessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>The endpoints of service groups.</p>
         */
        public Builder endpoints(Endpoints endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The response message.</p>
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
         * <p>890772EF-3AD6-129A-8E15-8F349C944783</p>
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
             * <p>The backend access ID, which varies based on the value of the EndpointType parameter.</p>
             * <ul>
             * <li>If you set EndpointType to DefaultGateway, the value of this parameter is default.</li>
             * <li>If you set EndpointType to PrivateGateway, the value of this parameter is the ID of the dedicated gateway.</li>
             * <li>If you set EndpointType to Nlb, the value of this parameter is the ID of the NLB instance.</li>
             * <li>If you set EndpointType to Nacos, the value of this parameter is the ID of the Nacos instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gw-26340kjxjx8l3r****</p>
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * <p>The service endpoint type. Valid values:</p>
             * <ul>
             * <li>DefaultGateway: the shared gateway.</li>
             * <li>PrivateGateway: the dedicated gateway.</li>
             * <li>Nlb: Associate the service with the Network Load Balancer (NLB) instance.</li>
             * <li>Nacos: Associate the service with the Nacos instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PrivateGateway</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The public endpoints.</p>
             */
            public Builder internetEndpoints(java.util.List<String> internetEndpoints) {
                this.internetEndpoints = internetEndpoints;
                return this;
            }

            /**
             * <p>The internal endpoints.</p>
             */
            public Builder intranetEndpoints(java.util.List<String> intranetEndpoints) {
                this.intranetEndpoints = intranetEndpoints;
                return this;
            }

            /**
             * <p>The path type. Valid values:</p>
             * <ul>
             * <li>Group: the path of the service group.</li>
             * <li>Service: the path of the service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Group</p>
             */
            public Builder pathType(String pathType) {
                this.pathType = pathType;
                return this;
            }

            /**
             * <p>The port number. This parameter takes effect only when you associate the service with an NLB or Nacos instance.</p>
             * 
             * <strong>example:</strong>
             * <p>9090</p>
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
