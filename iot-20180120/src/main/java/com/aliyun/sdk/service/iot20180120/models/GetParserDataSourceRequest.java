// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetParserDataSourceRequest} extends {@link RequestModel}
 *
 * <p>GetParserDataSourceRequest</p>
 */
public class GetParserDataSourceRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true, maximum = 9999999)
    private Long dataSourceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private GetParserDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetParserDataSourceRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<GetParserDataSourceRequest, Builder> {
        private Long dataSourceId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetParserDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public GetParserDataSourceRequest build() {
            return new GetParserDataSourceRequest(this);
        } 

    } 

}
