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
 * {@link CreateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceResponseBody</p>
 */
public class CreateServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InternetEndpoint")
    private String internetEndpoint;

    @com.aliyun.core.annotation.NameInMap("IntranetEndpoint")
    private String intranetEndpoint;

    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateServiceResponseBody(Builder builder) {
        this.internetEndpoint = builder.internetEndpoint;
        this.intranetEndpoint = builder.intranetEndpoint;
        this.region = builder.region;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceName = builder.serviceName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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
        private String region; 
        private String requestId; 
        private String serviceId; 
        private String serviceName; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateServiceResponseBody model) {
            this.internetEndpoint = model.internetEndpoint;
            this.intranetEndpoint = model.intranetEndpoint;
            this.region = model.region;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceName = model.serviceName;
            this.status = model.status;
        } 

        /**
         * <p>The public endpoint of the created service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pai-eas.vpc.cn-shanghai">http://pai-eas.vpc.cn-shanghai</a>.****</p>
         */
        public Builder internetEndpoint(String internetEndpoint) {
            this.internetEndpoint = internetEndpoint;
            return this;
        }

        /**
         * <p>The internal endpoint of the created service.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pai-eas.cn-shanghai">http://pai-eas.cn-shanghai</a>.****</p>
         */
        public Builder intranetEndpoint(String intranetEndpoint) {
            this.intranetEndpoint = intranetEndpoint;
            return this;
        }

        /**
         * <p>The region ID of the created service.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the created service.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-m-aaxxxddf</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The name of the created service.</p>
         * 
         * <strong>example:</strong>
         * <p>yourname</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The service state.</p>
         * 
         * <strong>example:</strong>
         * <p>Creating</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateServiceResponseBody build() {
            return new CreateServiceResponseBody(this);
        } 

    } 

}
