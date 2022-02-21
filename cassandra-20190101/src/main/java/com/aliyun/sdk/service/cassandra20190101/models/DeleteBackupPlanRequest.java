// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>DeleteBackupPlanRequest</p>
 */
public class DeleteBackupPlanRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    private DeleteBackupPlanRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataCenterId
     */
    public String getDataCenterId() {
        return this.dataCenterId;
    }

    public static final class Builder extends Request.Builder<DeleteBackupPlanRequest, Builder> {
        private String clusterId; 
        private String dataCenterId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBackupPlanRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DataCenterId.
         */
        public Builder dataCenterId(String dataCenterId) {
            this.putQueryParameter("DataCenterId", dataCenterId);
            this.dataCenterId = dataCenterId;
            return this;
        }

        @Override
        public DeleteBackupPlanRequest build() {
            return new DeleteBackupPlanRequest(this);
        } 

    } 

}
