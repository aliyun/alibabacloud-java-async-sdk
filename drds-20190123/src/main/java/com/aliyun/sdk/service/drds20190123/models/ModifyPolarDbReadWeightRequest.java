// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link ModifyPolarDbReadWeightRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolarDbReadWeightRequest</p>
 */
public class ModifyPolarDbReadWeightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbNodeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbNodeIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weights")
    @com.aliyun.core.annotation.Validation(required = true)
    private String weights;

    private ModifyPolarDbReadWeightRequest(Builder builder) {
        super(builder);
        this.dbInstanceId = builder.dbInstanceId;
        this.dbName = builder.dbName;
        this.dbNodeIds = builder.dbNodeIds;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.weights = builder.weights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPolarDbReadWeightRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstanceId
     */
    public String getDbInstanceId() {
        return this.dbInstanceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dbNodeIds
     */
    public String getDbNodeIds() {
        return this.dbNodeIds;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return weights
     */
    public String getWeights() {
        return this.weights;
    }

    public static final class Builder extends Request.Builder<ModifyPolarDbReadWeightRequest, Builder> {
        private String dbInstanceId; 
        private String dbName; 
        private String dbNodeIds; 
        private String drdsInstanceId; 
        private String weights; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPolarDbReadWeightRequest request) {
            super(request);
            this.dbInstanceId = request.dbInstanceId;
            this.dbName = request.dbName;
            this.dbNodeIds = request.dbNodeIds;
            this.drdsInstanceId = request.drdsInstanceId;
            this.weights = request.weights;
        } 

        /**
         * <p>Polar cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-****************</p>
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The node list in the destination apsaradb for PolarDB cluster. The nodes in each cluster are separated with commas (,) and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-<strong><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></strong>:pi-****************</p>
         */
        public Builder dbNodeIds(String dbNodeIds) {
            this.putQueryParameter("DbNodeIds", dbNodeIds);
            this.dbNodeIds = dbNodeIds;
            return this;
        }

        /**
         * <p>The ID of a DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The weight of the PolarDB cluster. Separate multiple weights with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>14,86</p>
         */
        public Builder weights(String weights) {
            this.putQueryParameter("Weights", weights);
            this.weights = weights;
            return this;
        }

        @Override
        public ModifyPolarDbReadWeightRequest build() {
            return new ModifyPolarDbReadWeightRequest(this);
        } 

    } 

}
