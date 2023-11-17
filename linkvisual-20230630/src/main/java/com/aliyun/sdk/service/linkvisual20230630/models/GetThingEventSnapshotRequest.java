// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingEventSnapshotRequest} extends {@link RequestModel}
 *
 * <p>GetThingEventSnapshotRequest</p>
 */
public class GetThingEventSnapshotRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("Identifier")
    @Validation(required = true)
    private String identifier;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    private GetThingEventSnapshotRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.identifier = builder.identifier;
        this.iotId = builder.iotId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingEventSnapshotRequest create() {
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
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<GetThingEventSnapshotRequest, Builder> {
        private String deviceName; 
        private String identifier; 
        private String iotId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(GetThingEventSnapshotRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.identifier = request.identifier;
            this.iotId = request.iotId;
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
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public GetThingEventSnapshotRequest build() {
            return new GetThingEventSnapshotRequest(this);
        } 

    } 

}
