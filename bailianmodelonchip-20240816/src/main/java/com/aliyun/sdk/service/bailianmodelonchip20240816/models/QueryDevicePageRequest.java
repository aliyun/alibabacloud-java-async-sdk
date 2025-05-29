// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianmodelonchip20240816.models;

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
 * {@link QueryDevicePageRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePageRequest</p>
 */
public class QueryDevicePageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("deviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disableStatus")
    private Integer disableStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageIndex;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productKey")
    private String productKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    private QueryDevicePageRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.disableStatus = builder.disableStatus;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.productName = builder.productName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePageRequest create() {
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
     * @return disableStatus
     */
    public Integer getDisableStatus() {
        return this.disableStatus;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
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

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryDevicePageRequest, Builder> {
        private String deviceName; 
        private Integer disableStatus; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String productKey; 
        private String productName; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePageRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.disableStatus = request.disableStatus;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.productName = request.productName;
            this.status = request.status;
        } 

        /**
         * deviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("deviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * disableStatus.
         */
        public Builder disableStatus(Integer disableStatus) {
            this.putBodyParameter("disableStatus", disableStatus);
            this.disableStatus = disableStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putBodyParameter("pageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * productKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("productKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.putBodyParameter("productName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryDevicePageRequest build() {
            return new QueryDevicePageRequest(this);
        } 

    } 

}
