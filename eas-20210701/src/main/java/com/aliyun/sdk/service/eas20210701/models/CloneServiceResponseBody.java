// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CloneServiceResponseBody</p>
 */
public class CloneServiceResponseBody extends TeaModel {
    @NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceName")
    private String serviceName;

    @NameInMap("Status")
    private String status;

    private CloneServiceResponseBody(Builder builder) {
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return internetEndpoint
     */
    public String getInternetEndpoint() {
        return this.internetEndpoint;
    }

    /**
     * @return intranetEndpoint
     */
    public String getIntranetEndpoint() {
        return this.intranetEndpoint;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String internetEndpoint; 
        private String intranetEndpoint; 
        private String requestId; 
        private String serviceId; 
        private String serviceName; 
        private String status; 

        /**
         * InternetEndpoint.
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * IntranetEndpoint.
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CloneServiceResponseBody build() {
            return new CloneServiceResponseBody(this);
        } 

    } 

}
