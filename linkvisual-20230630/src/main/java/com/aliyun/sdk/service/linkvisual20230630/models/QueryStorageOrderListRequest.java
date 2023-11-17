// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryStorageOrderListRequest} extends {@link RequestModel}
 *
 * <p>QueryStorageOrderListRequest</p>
 */
public class QueryStorageOrderListRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("DeviceNoOwner")
    private Boolean deviceNoOwner;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("PageNo")
    @Validation(required = true, maximum = 1000, minimum = 1)
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private QueryStorageOrderListRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.deviceNoOwner = builder.deviceNoOwner;
        this.iotId = builder.iotId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryStorageOrderListRequest create() {
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
     * @return deviceNoOwner
     */
    public Boolean getDeviceNoOwner() {
        return this.deviceNoOwner;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
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

    public static final class Builder extends Request.Builder<QueryStorageOrderListRequest, Builder> {
        private String deviceName; 
        private Boolean deviceNoOwner; 
        private String iotId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryStorageOrderListRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.deviceNoOwner = request.deviceNoOwner;
            this.iotId = request.iotId;
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
         * DeviceNoOwner.
         */
        public Builder deviceNoOwner(Boolean deviceNoOwner) {
            this.putQueryParameter("DeviceNoOwner", deviceNoOwner);
            this.deviceNoOwner = deviceNoOwner;
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
        public QueryStorageOrderListRequest build() {
            return new QueryStorageOrderListRequest(this);
        } 

    } 

}
