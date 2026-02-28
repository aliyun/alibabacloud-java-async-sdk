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
 * {@link UpdateDestinationRequest} extends {@link RequestModel}
 *
 * <p>UpdateDestinationRequest</p>
 */
public class UpdateDestinationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 999999999999D)
    private Long destinationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private UpdateDestinationRequest(Builder builder) {
        super(builder);
        this.configuration = builder.configuration;
        this.description = builder.description;
        this.destinationId = builder.destinationId;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDestinationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destinationId
     */
    public Long getDestinationId() {
        return this.destinationId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<UpdateDestinationRequest, Builder> {
        private String configuration; 
        private String description; 
        private Long destinationId; 
        private String iotInstanceId; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDestinationRequest request) {
            super(request);
            this.configuration = request.configuration;
            this.description = request.description;
            this.destinationId = request.destinationId;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configuration(String configuration) {
            this.putQueryParameter("Configuration", configuration);
            this.configuration = configuration;
            return this;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1002</p>
         */
        public Builder destinationId(Long destinationId) {
            this.putQueryParameter("DestinationId", destinationId);
            this.destinationId = destinationId;
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
         * 
         * <strong>example:</strong>
         * <p>DataPurpose</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPUBLISH</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateDestinationRequest build() {
            return new UpdateDestinationRequest(this);
        } 

    } 

}
