// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetCAInstanceStatusRequest</p>
 */
public class GetCAInstanceStatusRequest extends Request {
    @Query
    @NameInMap("Identifier")
    private String identifier;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    private GetCAInstanceStatusRequest(Builder builder) {
        super(builder);
        this.identifier = builder.identifier;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCAInstanceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCAInstanceStatusRequest, Builder> {
        private String identifier; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCAInstanceStatusRequest request) {
            super(request);
            this.identifier = request.identifier;
            this.instanceId = request.instanceId;
        } 

        /**
         * The unique identifier of the certificate.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * The ID of the private CA instance.
         * <p>
         * 
         * >  After you purchase a private CA instance by using the [SSL Certificates Service console](https://yundun.console.aliyun.com/?p=cas#/pca/rootlist), you can click **Details** for the private CA instance on the **Private Certificates** page to query the ID of the private CA instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetCAInstanceStatusRequest build() {
            return new GetCAInstanceStatusRequest(this);
        } 

    } 

}
