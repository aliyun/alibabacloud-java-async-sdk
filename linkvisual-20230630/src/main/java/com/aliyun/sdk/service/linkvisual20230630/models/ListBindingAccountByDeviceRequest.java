// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingAccountByDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListBindingAccountByDeviceRequest</p>
 */
public class ListBindingAccountByDeviceRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("Owned")
    @Validation(maximum = 1)
    private Integer owned;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 50, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private ListBindingAccountByDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.owned = builder.owned;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingAccountByDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return owned
     */
    public Integer getOwned() {
        return this.owned;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<ListBindingAccountByDeviceRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private Integer owned; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ListBindingAccountByDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.owned = request.owned;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
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
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * Owned.
         */
        public Builder owned(Integer owned) {
            this.putQueryParameter("Owned", owned);
            this.owned = owned;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ListBindingAccountByDeviceRequest build() {
            return new ListBindingAccountByDeviceRequest(this);
        } 

    } 

}
