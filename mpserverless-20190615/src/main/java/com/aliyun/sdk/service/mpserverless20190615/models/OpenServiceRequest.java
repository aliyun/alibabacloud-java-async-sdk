// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenServiceRequest} extends {@link RequestModel}
 *
 * <p>OpenServiceRequest</p>
 */
public class OpenServiceRequest extends Request {
    @Body
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private OpenServiceRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceRequest create() {
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<OpenServiceRequest, Builder> {
        private String serviceName; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(OpenServiceRequest request) {
            super(request);
            this.serviceName = request.serviceName;
            this.spaceId = request.spaceId;
        } 

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public OpenServiceRequest build() {
            return new OpenServiceRequest(this);
        } 

    } 

}
