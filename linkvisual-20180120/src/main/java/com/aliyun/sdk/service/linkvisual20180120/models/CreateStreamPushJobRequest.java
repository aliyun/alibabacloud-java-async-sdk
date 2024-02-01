// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStreamPushJobRequest} extends {@link RequestModel}
 *
 * <p>CreateStreamPushJobRequest</p>
 */
public class CreateStreamPushJobRequest extends Request {
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
    @NameInMap("JobType")
    private Integer jobType;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("PushUrl")
    @Validation(required = true)
    private String pushUrl;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    private CreateStreamPushJobRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.jobType = builder.jobType;
        this.productKey = builder.productKey;
        this.pushUrl = builder.pushUrl;
        this.streamType = builder.streamType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamPushJobRequest create() {
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
     * @return jobType
     */
    public Integer getJobType() {
        return this.jobType;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return pushUrl
     */
    public String getPushUrl() {
        return this.pushUrl;
    }

    /**
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    public static final class Builder extends Request.Builder<CreateStreamPushJobRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer jobType; 
        private String productKey; 
        private String pushUrl; 
        private Integer streamType; 

        private Builder() {
            super();
        } 

        private Builder(CreateStreamPushJobRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.jobType = request.jobType;
            this.productKey = request.productKey;
            this.pushUrl = request.pushUrl;
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
         * JobType.
         */
        public Builder jobType(Integer jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
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
         * PushUrl.
         */
        public Builder pushUrl(String pushUrl) {
            this.putQueryParameter("PushUrl", pushUrl);
            this.pushUrl = pushUrl;
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
        public CreateStreamPushJobRequest build() {
            return new CreateStreamPushJobRequest(this);
        } 

    } 

}
