// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryVoiceIntercomRequest} extends {@link RequestModel}
 *
 * <p>QueryVoiceIntercomRequest</p>
 */
public class QueryVoiceIntercomRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private String deviceName;

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
    @NameInMap("Scheme")
    private String scheme;

    private QueryVoiceIntercomRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.scheme = builder.scheme;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVoiceIntercomRequest create() {
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
     * @return scheme
     */
    public String getScheme() {
        return this.scheme;
    }

    public static final class Builder extends Request.Builder<QueryVoiceIntercomRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String scheme; 

        private Builder() {
            super();
        } 

        private Builder(QueryVoiceIntercomRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.scheme = request.scheme;
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
         * Scheme.
         */
        public Builder scheme(String scheme) {
            this.putQueryParameter("Scheme", scheme);
            this.scheme = scheme;
            return this;
        }

        @Override
        public QueryVoiceIntercomRequest build() {
            return new QueryVoiceIntercomRequest(this);
        } 

    } 

}
