// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>PublishServiceVersionRequest</p>
 */
public class PublishServiceVersionRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Header
    @NameInMap("If-Match")
    private String ifMatch;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Body
    @NameInMap("description")
    private String description;

    private PublishServiceVersionRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.ifMatch = builder.ifMatch;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.description = builder.description;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishServiceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return ifMatch
     */
    public String getIfMatch() {
        return this.ifMatch;
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    public static final class Builder extends Request.Builder<PublishServiceVersionRequest, Builder> {
        private String serviceName; 
        private String ifMatch; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String description; 

        private Builder() {
            super();
        } 

        private Builder(PublishServiceVersionRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.ifMatch = request.ifMatch;
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.description = request.description;
        } 

        /**
         * The name of the service.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The ETag value of the service. This value is used to ensure that the modified service is consistent with the service to be modified. The ETag value is returned in the responses of the [CreateService](~~175256~~), [UpdateService](~~188167~~), and [GetService](~~189225~~) operations.
         */
        public Builder ifMatch(String ifMatch) {
            this.putHeaderParameter("If-Match", ifMatch);
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The start time when the function is invoked. Specify the time in the yyyy-mm-ddhh:mm:ss format.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * 2020-12-1210:00:00
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The description of the service version.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        @Override
        public PublishServiceVersionRequest build() {
            return new PublishServiceVersionRequest(this);
        } 

    } 

}
