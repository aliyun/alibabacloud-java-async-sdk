// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDataCenterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDataCenterRequest</p>
 */
public class ModifyDataCenterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataCenterId")
    @Validation(required = true)
    private String dataCenterId;

    @Query
    @NameInMap("DataCenterName")
    private String dataCenterName;

    private ModifyDataCenterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.dataCenterId = builder.dataCenterId;
        this.dataCenterName = builder.dataCenterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDataCenterRequest create() {
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

    /**
     * @return dataCenterName
     */
    public String getDataCenterName() {
        return this.dataCenterName;
    }

    public static final class Builder extends Request.Builder<ModifyDataCenterRequest, Builder> {
        private String clusterId; 
        private String dataCenterId; 
        private String dataCenterName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDataCenterRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.dataCenterId = response.dataCenterId;
            this.dataCenterName = response.dataCenterName;
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

        /**
         * DataCenterName.
         */
        public Builder dataCenterName(String dataCenterName) {
            this.putQueryParameter("DataCenterName", dataCenterName);
            this.dataCenterName = dataCenterName;
            return this;
        }

        @Override
        public ModifyDataCenterRequest build() {
            return new ModifyDataCenterRequest(this);
        } 

    } 

}
