// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDataSourceDeployRequest} extends {@link RequestModel}
 *
 * <p>GetDataSourceDeployRequest</p>
 */
public class GetDataSourceDeployRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deployName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deployName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceName;

    private GetDataSourceDeployRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.deployName = builder.deployName;
        this.dataSourceName = builder.dataSourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataSourceDeployRequest create() {
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
     * @return deployName
     */
    public String getDeployName() {
        return this.deployName;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    public static final class Builder extends Request.Builder<GetDataSourceDeployRequest, Builder> {
        private String instanceId; 
        private String deployName; 
        private String dataSourceName; 

        private Builder() {
            super();
        } 

        private Builder(GetDataSourceDeployRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.deployName = request.deployName;
            this.dataSourceName = request.dataSourceName;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * deployName.
         */
        public Builder deployName(String deployName) {
            this.putPathParameter("deployName", deployName);
            this.deployName = deployName;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putPathParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        @Override
        public GetDataSourceDeployRequest build() {
            return new GetDataSourceDeployRequest(this);
        } 

    } 

}
