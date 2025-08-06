// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetClientConfigRequest} extends {@link RequestModel}
 *
 * <p>GetClientConfigRequest</p>
 */
public class GetClientConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OsName")
    private String osName;

    private GetClientConfigRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.deviceName = builder.deviceName;
        this.osName = builder.osName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return osName
     */
    public String getOsName() {
        return this.osName;
    }

    public static final class Builder extends Request.Builder<GetClientConfigRequest, Builder> {
        private String brand; 
        private String deviceName; 
        private String osName; 

        private Builder() {
            super();
        } 

        private Builder(GetClientConfigRequest request) {
            super(request);
            this.brand = request.brand;
            this.deviceName = request.deviceName;
            this.osName = request.osName;
        } 

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putQueryParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * OsName.
         */
        public Builder osName(String osName) {
            this.putQueryParameter("OsName", osName);
            this.osName = osName;
            return this;
        }

        @Override
        public GetClientConfigRequest build() {
            return new GetClientConfigRequest(this);
        } 

    } 

}
