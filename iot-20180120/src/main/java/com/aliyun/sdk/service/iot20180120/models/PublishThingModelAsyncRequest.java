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
 * {@link PublishThingModelAsyncRequest} extends {@link RequestModel}
 *
 * <p>PublishThingModelAsyncRequest</p>
 */
public class PublishThingModelAsyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThingModelVersion")
    private String thingModelVersion;

    private PublishThingModelAsyncRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.thingModelVersion = builder.thingModelVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishThingModelAsyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return thingModelVersion
     */
    public String getThingModelVersion() {
        return this.thingModelVersion;
    }

    public static final class Builder extends Request.Builder<PublishThingModelAsyncRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String productKey; 
        private String thingModelVersion; 

        private Builder() {
            super();
        } 

        private Builder(PublishThingModelAsyncRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.thingModelVersion = request.thingModelVersion;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <p>This parameter is required.</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ThingModelVersion.
         */
        public Builder thingModelVersion(String thingModelVersion) {
            this.putQueryParameter("ThingModelVersion", thingModelVersion);
            this.thingModelVersion = thingModelVersion;
            return this;
        }

        @Override
        public PublishThingModelAsyncRequest build() {
            return new PublishThingModelAsyncRequest(this);
        } 

    } 

}
