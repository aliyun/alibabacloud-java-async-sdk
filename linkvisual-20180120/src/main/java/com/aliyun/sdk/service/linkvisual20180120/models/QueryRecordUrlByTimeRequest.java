// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordUrlByTimeRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordUrlByTimeRequest</p>
 */
public class QueryRecordUrlByTimeRequest extends Request {
    @Query
    @NameInMap("BeginTime")
    @Validation(required = true, maximum = 2147483647)
    private Integer beginTime;

    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true, maximum = 2147483647)
    private Integer endTime;

    @Query
    @NameInMap("IotId")
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("StreamType")
    private Integer streamType;

    @Query
    @NameInMap("UrlValidDuration")
    @Validation(maximum = 3600, minimum = 10)
    private Integer urlValidDuration;

    private QueryRecordUrlByTimeRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.streamType = builder.streamType;
        this.urlValidDuration = builder.urlValidDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordUrlByTimeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public Integer getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
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
     * @return streamType
     */
    public Integer getStreamType() {
        return this.streamType;
    }

    /**
     * @return urlValidDuration
     */
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public static final class Builder extends Request.Builder<QueryRecordUrlByTimeRequest, Builder> {
        private Integer beginTime; 
        private String deviceName; 
        private Integer endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer streamType; 
        private Integer urlValidDuration; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordUrlByTimeRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.streamType = request.streamType;
            this.urlValidDuration = request.urlValidDuration;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
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
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * StreamType.
         */
        public Builder streamType(Integer streamType) {
            this.putQueryParameter("StreamType", streamType);
            this.streamType = streamType;
            return this;
        }

        /**
         * UrlValidDuration.
         */
        public Builder urlValidDuration(Integer urlValidDuration) {
            this.putQueryParameter("UrlValidDuration", urlValidDuration);
            this.urlValidDuration = urlValidDuration;
            return this;
        }

        @Override
        public QueryRecordUrlByTimeRequest build() {
            return new QueryRecordUrlByTimeRequest(this);
        } 

    } 

}
