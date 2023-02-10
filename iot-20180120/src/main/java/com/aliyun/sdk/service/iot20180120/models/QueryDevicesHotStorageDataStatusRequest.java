// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesHotStorageDataStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicesHotStorageDataStatusRequest</p>
 */
public class QueryDevicesHotStorageDataStatusRequest extends Request {
    @Query
    @NameInMap("Asc")
    @Validation(required = true, maximum = 5)
    private Integer asc;

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
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true, maximum = 201)
    private Integer pageSize;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("UserTopic")
    @Validation(required = true)
    private String userTopic;

    private QueryDevicesHotStorageDataStatusRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.userTopic = builder.userTopic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicesHotStorageDataStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public Integer getAsc() {
        return this.asc;
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
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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
     * @return userTopic
     */
    public String getUserTopic() {
        return this.userTopic;
    }

    public static final class Builder extends Request.Builder<QueryDevicesHotStorageDataStatusRequest, Builder> {
        private Integer asc; 
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String productKey; 
        private String userTopic; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicesHotStorageDataStatusRequest request) {
            super(request);
            this.asc = request.asc;
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.userTopic = request.userTopic;
        } 

        /**
         * Asc.
         */
        public Builder asc(Integer asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
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
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
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

        /**
         * UserTopic.
         */
        public Builder userTopic(String userTopic) {
            this.putQueryParameter("UserTopic", userTopic);
            this.userTopic = userTopic;
            return this;
        }

        @Override
        public QueryDevicesHotStorageDataStatusRequest build() {
            return new QueryDevicesHotStorageDataStatusRequest(this);
        } 

    } 

}
