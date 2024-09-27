// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeviceInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceInfoRequest</p>
 */
public class GetDeviceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("factoryId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>pn_69873</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("deviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>The time string in the YYYY-mm-dd format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-26</p>
         */
        public Builder ds(String ds) {
            this.putQueryParameter("ds", ds);
            this.ds = ds;
            return this;
        }

        /**
         * <p>The ID of the site.</p>
         * 
         * <strong>example:</strong>
         * <p>pn_95</p>
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
