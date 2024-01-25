// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("UpdateType")
    private String updateType;

    @Body
    @NameInMap("body")
    private String body;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.updateType = builder.updateType;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String updateType; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.updateType = request.updateType;
            this.body = request.body;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * The type of the service update. Valid values: merge and replace. By default, merge is used if you do not specify this parameter.
         * <p>
         * 
         * *   merge: If the JSON string configured for the existing service is `{"a":"b"}` and the JSON string specified in the body parameter is `{"c":"d"}`, the JSON string is `{"a":"b","c":"d"}` after the service update.
         * *   replace: If the JSON string configured for the existing service is `{"a":"b"}` and the JSON string specified in the body parameter is `{"c":"d"}`, the JSON string is `{"c":"d"}` after the service update.
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

}
