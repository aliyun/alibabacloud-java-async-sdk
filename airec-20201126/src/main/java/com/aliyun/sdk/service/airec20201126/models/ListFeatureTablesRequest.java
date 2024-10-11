// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListFeatureTablesRequest} extends {@link RequestModel}
 *
 * <p>ListFeatureTablesRequest</p>
 */
public class ListFeatureTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    private String dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateFrequency")
    private String updateFrequency;

    private ListFeatureTablesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceId = builder.dataSourceId;
        this.type = builder.type;
        this.updateFrequency = builder.updateFrequency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureTablesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateFrequency
     */
    public String getUpdateFrequency() {
        return this.updateFrequency;
    }

    public static final class Builder extends Request.Builder<ListFeatureTablesRequest, Builder> {
        private String instanceId; 
        private String dataSourceId; 
        private String type; 
        private String updateFrequency; 

        private Builder() {
            super();
        } 

        private Builder(ListFeatureTablesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceId = request.dataSourceId;
            this.type = request.type;
            this.updateFrequency = request.updateFrequency;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * dataSourceId.
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putQueryParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * updateFrequency.
         */
        public Builder updateFrequency(String updateFrequency) {
            this.putQueryParameter("updateFrequency", updateFrequency);
            this.updateFrequency = updateFrequency;
            return this;
        }

        @Override
        public ListFeatureTablesRequest build() {
            return new ListFeatureTablesRequest(this);
        } 

    } 

}
