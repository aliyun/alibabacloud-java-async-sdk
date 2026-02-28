// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateProductFilterConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductFilterConfigRequest</p>
 */
public class UpdateProductFilterConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyTimestampFilter")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean propertyTimestampFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyValueFilter")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(UpdateProductFilterConfigRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.propertyTimestampFilter = request.propertyTimestampFilter;
            this.propertyValueFilter = request.propertyValueFilter;
        } 

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ProductKey of the product. A ProductKey is a GUID that is issued by IoT Platform to a product.</p>
         * <p>You can use the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products within the current account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>Specifies whether to deduplicate messages based on the submission time of each property. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deduplicates property messages that have the same timestamp.</li>
         * <li><strong>false</strong>: does not deduplicate messages based on timestamps.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder propertyTimestampFilter(Boolean propertyTimestampFilter) {
            this.putQueryParameter("PropertyTimestampFilter", propertyTimestampFilter);
            this.propertyTimestampFilter = propertyTimestampFilter;
            return this;
        }

        /**
         * <p>Specifies whether to deduplicate messages based on the value of each property. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: deduplicates property messages that have the same property value.</li>
         * <li><strong>false</strong>: does not deduplicate messages based on property values.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
