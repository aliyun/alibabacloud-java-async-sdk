// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GenerateOpsItemRequest} extends {@link RequestModel}
 *
 * <p>GenerateOpsItemRequest</p>
 */
public class GenerateOpsItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigurationId")
    private String configurationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GenerateOpsItemRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.configurationId = builder.configurationId;
        this.data = builder.data;
        this.dataSource = builder.dataSource;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOpsItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return configurationId
     */
    public String getConfigurationId() {
        return this.configurationId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GenerateOpsItemRequest, Builder> {
        private String clientToken; 
        private String configurationId; 
        private String data; 
        private String dataSource; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOpsItemRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.configurationId = request.configurationId;
            this.data = request.data;
            this.dataSource = request.dataSource;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The token that is used to ensure the idempotency.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The configuration ID of the O&amp;M item.</p>
         * 
         * <strong>example:</strong>
         * <p>oic-ae4f******2c682e3</p>
         */
        public Builder configurationId(String configurationId) {
            this.putQueryParameter("ConfigurationId", configurationId);
            this.configurationId = configurationId;
            return this;
        }

        /**
         * <p>The source system data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/aliyun/ecs</p>
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The data source system.</p>
         * 
         * <strong>example:</strong>
         * <p>/aliyun/eventbridge/event</p>
         */
        public Builder dataSource(String dataSource) {
            this.putQueryParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GenerateOpsItemRequest build() {
            return new GenerateOpsItemRequest(this);
        } 

    } 

}
