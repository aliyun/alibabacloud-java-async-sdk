// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferDeviceInstanceRequest} extends {@link RequestModel}
 *
 * <p>TransferDeviceInstanceRequest</p>
 */
public class TransferDeviceInstanceRequest extends Request {
    @Query
    @NameInMap("DeviceNameList")
    @Validation(required = true)
    private java.util.List < String > deviceNameList;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("SourceInstanceId")
    private String sourceInstanceId;

    @Query
    @NameInMap("TargetInstanceId")
    @Validation(required = true)
    private String targetInstanceId;

    private TransferDeviceInstanceRequest(Builder builder) {
        super(builder);
        this.deviceNameList = builder.deviceNameList;
        this.productKey = builder.productKey;
        this.sourceInstanceId = builder.sourceInstanceId;
        this.targetInstanceId = builder.targetInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferDeviceInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceNameList
     */
    public java.util.List < String > getDeviceNameList() {
        return this.deviceNameList;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return sourceInstanceId
     */
    public String getSourceInstanceId() {
        return this.sourceInstanceId;
    }

    /**
     * @return targetInstanceId
     */
    public String getTargetInstanceId() {
        return this.targetInstanceId;
    }

    public static final class Builder extends Request.Builder<TransferDeviceInstanceRequest, Builder> {
        private java.util.List < String > deviceNameList; 
        private String productKey; 
        private String sourceInstanceId; 
        private String targetInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(TransferDeviceInstanceRequest request) {
            super(request);
            this.deviceNameList = request.deviceNameList;
            this.productKey = request.productKey;
            this.sourceInstanceId = request.sourceInstanceId;
            this.targetInstanceId = request.targetInstanceId;
        } 

        /**
         * DeviceNameList.
         */
        public Builder deviceNameList(java.util.List < String > deviceNameList) {
            this.putQueryParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
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

        /**
         * SourceInstanceId.
         */
        public Builder sourceInstanceId(String sourceInstanceId) {
            this.putQueryParameter("SourceInstanceId", sourceInstanceId);
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }

        /**
         * TargetInstanceId.
         */
        public Builder targetInstanceId(String targetInstanceId) {
            this.putQueryParameter("TargetInstanceId", targetInstanceId);
            this.targetInstanceId = targetInstanceId;
            return this;
        }

        @Override
        public TransferDeviceInstanceRequest build() {
            return new TransferDeviceInstanceRequest(this);
        } 

    } 

}
