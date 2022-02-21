// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductFilterConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductFilterConfigRequest</p>
 */
public class UpdateProductFilterConfigRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("PropertyTimestampFilter")
    @Validation(required = true)
    private Boolean propertyTimestampFilter;

    @Query
    @NameInMap("PropertyValueFilter")
    @Validation(required = true)
    private Boolean propertyValueFilter;

    private UpdateProductFilterConfigRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.propertyTimestampFilter = builder.propertyTimestampFilter;
        this.propertyValueFilter = builder.propertyValueFilter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductFilterConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return propertyTimestampFilter
     */
    public Boolean getPropertyTimestampFilter() {
        return this.propertyTimestampFilter;
    }

    /**
     * @return propertyValueFilter
     */
    public Boolean getPropertyValueFilter() {
        return this.propertyValueFilter;
    }

    public static final class Builder extends Request.Builder<UpdateProductFilterConfigRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private Boolean propertyTimestampFilter; 
        private Boolean propertyValueFilter; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductFilterConfigRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.propertyTimestampFilter = response.propertyTimestampFilter;
            this.propertyValueFilter = response.propertyValueFilter;
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
         * PropertyTimestampFilter.
         */
        public Builder propertyTimestampFilter(Boolean propertyTimestampFilter) {
            this.putQueryParameter("PropertyTimestampFilter", propertyTimestampFilter);
            this.propertyTimestampFilter = propertyTimestampFilter;
            return this;
        }

        /**
         * PropertyValueFilter.
         */
        public Builder propertyValueFilter(Boolean propertyValueFilter) {
            this.putQueryParameter("PropertyValueFilter", propertyValueFilter);
            this.propertyValueFilter = propertyValueFilter;
            return this;
        }

        @Override
        public UpdateProductFilterConfigRequest build() {
            return new UpdateProductFilterConfigRequest(this);
        } 

    } 

}
