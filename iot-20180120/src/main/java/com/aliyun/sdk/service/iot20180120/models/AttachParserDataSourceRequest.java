// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachParserDataSourceRequest} extends {@link RequestModel}
 *
 * <p>AttachParserDataSourceRequest</p>
 */
public class AttachParserDataSourceRequest extends Request {
    @Query
    @NameInMap("DataSourceId")
    @Validation(required = true, maximum = 9999999)
    private Long dataSourceId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ParserId")
    @Validation(required = true, maximum = 99999999999D, minimum = 1)
    private Long parserId;

    private AttachParserDataSourceRequest(Builder builder) {
        super(builder);
        this.dataSourceId = builder.dataSourceId;
        this.iotInstanceId = builder.iotInstanceId;
        this.parserId = builder.parserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachParserDataSourceRequest create() {
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

    /**
     * @return parserId
     */
    public Long getParserId() {
        return this.parserId;
    }

    public static final class Builder extends Request.Builder<AttachParserDataSourceRequest, Builder> {
        private Long dataSourceId; 
        private String iotInstanceId; 
        private Long parserId; 

        private Builder() {
            super();
        } 

        private Builder(AttachParserDataSourceRequest request) {
            super(request);
            this.dataSourceId = request.dataSourceId;
            this.iotInstanceId = request.iotInstanceId;
            this.parserId = request.parserId;
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

        /**
         * ParserId.
         */
        public Builder parserId(Long parserId) {
            this.putQueryParameter("ParserId", parserId);
            this.parserId = parserId;
            return this;
        }

        @Override
        public AttachParserDataSourceRequest build() {
            return new AttachParserDataSourceRequest(this);
        } 

    } 

}
