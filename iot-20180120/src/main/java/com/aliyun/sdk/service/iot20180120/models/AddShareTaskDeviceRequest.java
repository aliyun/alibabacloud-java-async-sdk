// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddShareTaskDeviceRequest} extends {@link RequestModel}
 *
 * <p>AddShareTaskDeviceRequest</p>
 */
public class AddShareTaskDeviceRequest extends Request {
    @Body
    @NameInMap("IotIdList")
    private java.util.List < String > iotIdList;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    @Body
    @NameInMap("ShareTaskId")
    @Validation(required = true)
    private String shareTaskId;

    private AddShareTaskDeviceRequest(Builder builder) {
        super(builder);
        this.iotIdList = builder.iotIdList;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.shareTaskId = builder.shareTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddShareTaskDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotIdList
     */
    public java.util.List < String > getIotIdList() {
        return this.iotIdList;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return shareTaskId
     */
    public String getShareTaskId() {
        return this.shareTaskId;
    }

    public static final class Builder extends Request.Builder<AddShareTaskDeviceRequest, Builder> {
        private java.util.List < String > iotIdList; 
        private String iotInstanceId; 
        private String productKey; 
        private String shareTaskId; 

        private Builder() {
            super();
        } 

        private Builder(AddShareTaskDeviceRequest request) {
            super(request);
            this.iotIdList = request.iotIdList;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.shareTaskId = request.shareTaskId;
        } 

        /**
         * IotIdList.
         */
        public Builder iotIdList(java.util.List < String > iotIdList) {
            this.putBodyParameter("IotIdList", iotIdList);
            this.iotIdList = iotIdList;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ShareTaskId.
         */
        public Builder shareTaskId(String shareTaskId) {
            this.putBodyParameter("ShareTaskId", shareTaskId);
            this.shareTaskId = shareTaskId;
            return this;
        }

        @Override
        public AddShareTaskDeviceRequest build() {
            return new AddShareTaskDeviceRequest(this);
        } 

    } 

}
