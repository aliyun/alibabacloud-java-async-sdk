// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link GetDataServiceConnectionRequest} extends {@link RequestModel}
 *
 * <p>GetDataServiceConnectionRequest</p>
 */
public class GetDataServiceConnectionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    private Long connectionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceType")
    private String dataSourceType;

    private GetDataServiceConnectionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.connectionId = builder.connectionId;
        this.dataSourceType = builder.dataSourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataServiceConnectionRequest create() {
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
     * @return connectionId
     */
    public Long getConnectionId() {
        return this.connectionId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    public static final class Builder extends Request.Builder<GetDataServiceConnectionRequest, Builder> {
        private String regionId; 
        private Long connectionId; 
        private String dataSourceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDataServiceConnectionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.connectionId = request.connectionId;
            this.dataSourceType = request.dataSourceType;
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
         * ConnectionId.
         */
        public Builder connectionId(Long connectionId) {
            this.putQueryParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        /**
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putQueryParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        @Override
        public GetDataServiceConnectionRequest build() {
            return new GetDataServiceConnectionRequest(this);
        } 

    } 

}
