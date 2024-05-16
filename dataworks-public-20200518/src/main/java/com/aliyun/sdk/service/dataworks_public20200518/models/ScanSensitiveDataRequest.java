// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScanSensitiveDataRequest} extends {@link RequestModel}
 *
 * <p>ScanSensitiveDataRequest</p>
 */
public class ScanSensitiveDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    private ScanSensitiveDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScanSensitiveDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<ScanSensitiveDataRequest, Builder> {
        private String regionId; 
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(ScanSensitiveDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.data = request.data;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The data that you want to check.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public ScanSensitiveDataRequest build() {
            return new ScanSensitiveDataRequest(this);
        } 

    } 

}
