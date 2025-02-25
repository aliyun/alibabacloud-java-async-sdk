// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolarDbReadWeightRequest} extends {@link RequestModel}
 *
 * <p>ModifyPolarDbReadWeightRequest</p>
 */
public class ModifyPolarDbReadWeightRequest extends Request {
    @Query
    @NameInMap("DbInstanceId")
    @Validation(required = true)
    private String dbInstanceId;

    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DbNodeIds")
    @Validation(required = true)
    private String dbNodeIds;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("Weights")
    @Validation(required = true)
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
         * Polar cluster ID.
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.putQueryParameter("DbInstanceId", dbInstanceId);
            this.dbInstanceId = dbInstanceId;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * The node list in the destination apsaradb for PolarDB cluster. The nodes in each cluster are separated with commas (,) and colons (:).
         */
        public Builder dbNodeIds(String dbNodeIds) {
            this.putQueryParameter("DbNodeIds", dbNodeIds);
            this.dbNodeIds = dbNodeIds;
            return this;
        }

        /**
         * The ID of a DRDS instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The weight of the PolarDB cluster. Separate multiple weights with commas (,).
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
