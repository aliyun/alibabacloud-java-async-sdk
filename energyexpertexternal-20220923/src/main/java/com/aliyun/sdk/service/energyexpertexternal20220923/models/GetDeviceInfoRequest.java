// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceInfoRequest</p>
 */
public class GetDeviceInfoRequest extends Request {
    @Query
    @NameInMap("deviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("ds")
    @Validation(required = true)
    private String ds;

    @Query
    @NameInMap("factoryId")
    @Validation(required = true)
    private String factoryId;

    private GetDeviceInfoRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.ds = builder.ds;
        this.factoryId = builder.factoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return ds
     */
    public String getDs() {
        return this.ds;
    }

    /**
     * @return factoryId
     */
    public String getFactoryId() {
        return this.factoryId;
    }

    public static final class Builder extends Request.Builder<GetDeviceInfoRequest, Builder> {
        private String deviceId; 
        private String ds; 
        private String factoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceInfoRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.ds = request.ds;
            this.factoryId = request.factoryId;
        } 

        /**
         * deviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("deviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * ds.
         */
        public Builder ds(String ds) {
            this.putQueryParameter("ds", ds);
            this.ds = ds;
            return this;
        }

        /**
         * factoryId.
         */
        public Builder factoryId(String factoryId) {
            this.putQueryParameter("factoryId", factoryId);
            this.factoryId = factoryId;
            return this;
        }

        @Override
        public GetDeviceInfoRequest build() {
            return new GetDeviceInfoRequest(this);
        } 

    } 

}
