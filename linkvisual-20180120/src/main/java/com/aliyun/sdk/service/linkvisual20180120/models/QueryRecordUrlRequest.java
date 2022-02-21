// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordUrlRequest} extends {@link RequestModel}
 *
 * <p>QueryRecordUrlRequest</p>
 */
public class QueryRecordUrlRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

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
    @NameInMap("SeekTime")
    private Integer seekTime;

    @Query
    @NameInMap("UrlValidDuration")
    @Validation(maximum = 3600, minimum = 10)
    private Integer urlValidDuration;

    private QueryRecordUrlRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.fileName = builder.fileName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.seekTime = builder.seekTime;
        this.urlValidDuration = builder.urlValidDuration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRecordUrlRequest create() {
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
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
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
     * @return seekTime
     */
    public Integer getSeekTime() {
        return this.seekTime;
    }

    /**
     * @return urlValidDuration
     */
    public Integer getUrlValidDuration() {
        return this.urlValidDuration;
    }

    public static final class Builder extends Request.Builder<QueryRecordUrlRequest, Builder> {
        private String deviceName; 
        private String fileName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer seekTime; 
        private Integer urlValidDuration; 

        private Builder() {
            super();
        } 

        private Builder(QueryRecordUrlRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.fileName = response.fileName;
            this.iotId = response.iotId;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.seekTime = response.seekTime;
            this.urlValidDuration = response.urlValidDuration;
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
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
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
         * SeekTime.
         */
        public Builder seekTime(Integer seekTime) {
            this.putQueryParameter("SeekTime", seekTime);
            this.seekTime = seekTime;
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
        public QueryRecordUrlRequest build() {
            return new QueryRecordUrlRequest(this);
        } 

    } 

}
