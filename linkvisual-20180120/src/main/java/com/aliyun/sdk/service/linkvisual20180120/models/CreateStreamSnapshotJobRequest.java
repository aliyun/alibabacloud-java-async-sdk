// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStreamSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>CreateStreamSnapshotJobRequest</p>
 */
public class CreateStreamSnapshotJobRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    @Validation(required = true)
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("SnapshotInterval")
    @Validation(required = true, maximum = 1800, minimum = 60)
    private Integer snapshotInterval;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    private CreateStreamSnapshotJobRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.snapshotInterval = builder.snapshotInterval;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamSnapshotJobRequest create() {
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
     * @return snapshotInterval
     */
    public Integer getSnapshotInterval() {
        return this.snapshotInterval;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<CreateStreamSnapshotJobRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer snapshotInterval; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(CreateStreamSnapshotJobRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.snapshotInterval = request.snapshotInterval;
            this.streamType = request.streamType;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * SnapshotInterval.
         */
        public Builder snapshotInterval(Integer snapshotInterval) {
            this.putQueryParameter("SnapshotInterval", snapshotInterval);
            this.snapshotInterval = snapshotInterval;
            return this;
        }

        /**
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        @Override
        public CreateStreamSnapshotJobRequest build() {
            return new CreateStreamSnapshotJobRequest(this);
        } 

    } 

}
