// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleDeviceRequest} extends {@link RequestModel}
 *
 * <p>GetCommercialVehicleDeviceRequest</p>
 */
public class GetCommercialVehicleDeviceRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private GetCommercialVehicleDeviceRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialVehicleDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetCommercialVehicleDeviceRequest, Builder> {
        private String clientId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetCommercialVehicleDeviceRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.projectId = response.projectId;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public GetCommercialVehicleDeviceRequest build() {
            return new GetCommercialVehicleDeviceRequest(this);
        } 

    } 

}
