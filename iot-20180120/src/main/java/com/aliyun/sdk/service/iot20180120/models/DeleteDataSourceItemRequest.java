// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataSourceItemRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataSourceItemRequest</p>
 */
public class DeleteDataSourceItemRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true, maximum = 99999999)
    private Long dataSourceId;

    @Query
    @NameInMap("DataSourceItemId")
    @Validation(required = true, maximum = 99999999)
    private Long dataSourceItemId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private DeleteDataSourceItemRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.dataSourceItemId = builder.dataSourceItemId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataSourceItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return dataSourceItemId
     */
    public Long getDataSourceItemId() {
        return this.dataSourceItemId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<DeleteDataSourceItemRequest, Builder> {
        private Long dataSourceId; 
        private Long dataSourceItemId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataSourceItemRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.dataSourceItemId = request.dataSourceItemId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * DataSourceId.
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * DataSourceItemId.
         */
        public Builder dataSourceItemId(Long dataSourceItemId) {
            this.putQueryParameter("DataSourceItemId", dataSourceItemId);
            this.dataSourceItemId = dataSourceItemId;
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

        @Override
        public DeleteDataSourceItemRequest build() {
            return new DeleteDataSourceItemRequest(this);
        } 

    } 

}
