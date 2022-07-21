// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateParserDataSourceRequest} extends {@link RequestModel}
 *
 * <p>UpdateParserDataSourceRequest</p>
 */
public class UpdateParserDataSourceRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true, maximum = 9999999999D)
    private Long dataSourceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private UpdateParserDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParserDataSourceRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateParserDataSourceRequest, Builder> {
        private Long dataSourceId; 
        private String description; 
        private String iotInstanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParserDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
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
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateParserDataSourceRequest build() {
            return new UpdateParserDataSourceRequest(this);
        } 

    } 

}
