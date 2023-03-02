// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryDataCountRequest} extends {@link RequestModel}
 *
 * <p>GetHistoryDataCountRequest</p>
 */
public class GetHistoryDataCountRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    @Validation(required = true)
    private String apiVersion;

    @Query
    @NameInMap("EndTime")
    @Validation(maximum = 9594629196518D)
    private Long endTime;

    @Query
    @NameInMap("Key")
    @Validation(required = true)
    private String key;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("StartTime")
    @Validation(maximum = 9594629196518D)
    private Long startTime;

    private GetHistoryDataCountRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.productKey = builder.productKey;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHistoryDataCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetHistoryDataCountRequest, Builder> {
        private String apiVersion; 
        private Long endTime; 
        private String key; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetHistoryDataCountRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.endTime = request.endTime;
            this.key = request.key;
            this.productKey = request.productKey;
            this.startTime = request.startTime;
        } 

        /**
         * ApiVersion.
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
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
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetHistoryDataCountRequest build() {
            return new GetHistoryDataCountRequest(this);
        } 

    } 

}
