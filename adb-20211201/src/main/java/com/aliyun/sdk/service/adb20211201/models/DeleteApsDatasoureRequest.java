// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DeleteApsDatasoureRequest} extends {@link RequestModel}
 *
 * <p>DeleteApsDatasoureRequest</p>
 */
public class DeleteApsDatasoureRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long datasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteApsDatasoureRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasourceId = builder.datasourceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApsDatasoureRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasourceId
     */
    public Long getDatasourceId() {
        return this.datasourceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteApsDatasoureRequest, Builder> {
        private String DBClusterId; 
        private Long datasourceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApsDatasoureRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasourceId = request.datasourceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>amv-******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putBodyParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The data source ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder datasourceId(Long datasourceId) {
            this.putBodyParameter("DatasourceId", datasourceId);
            this.datasourceId = datasourceId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteApsDatasoureRequest build() {
            return new DeleteApsDatasoureRequest(this);
        } 

    } 

}
