// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceRequest</p>
 */
public class ListDeviceRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("BizChainId")
    @Validation(required = true)
    private String bizChainId;

    @Query
    @NameInMap("DeviceGroupId")
    @Validation(required = true)
    private String deviceGroupId;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("Num")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer num;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Integer size;

    private ListDeviceRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.bizChainId = builder.bizChainId;
        this.deviceGroupId = builder.deviceGroupId;
        this.iotId = builder.iotId;
        this.num = builder.num;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return bizChainId
     */
    public String getBizChainId() {
        return this.bizChainId;
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return num
     */
    public Integer getNum() {
        return this.num;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListDeviceRequest, Builder> {
        private String apiVersion; 
        private String bizChainId; 
        private String deviceGroupId; 
        private String iotId; 
        private Integer num; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.bizChainId = request.bizChainId;
            this.deviceGroupId = request.deviceGroupId;
            this.iotId = request.iotId;
            this.num = request.num;
            this.size = request.size;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * BizChainId.
         */
        public Builder bizChainId(String bizChainId) {
            this.putQueryParameter("BizChainId", bizChainId);
            this.bizChainId = bizChainId;
            return this;
        }

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putQueryParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * Num.
         */
        public Builder num(Integer num) {
            this.putQueryParameter("Num", num);
            this.num = num;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListDeviceRequest build() {
            return new ListDeviceRequest(this);
        } 

    } 

}
