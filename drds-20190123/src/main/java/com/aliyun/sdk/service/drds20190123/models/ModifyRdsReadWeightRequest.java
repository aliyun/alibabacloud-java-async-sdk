// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRdsReadWeightRequest} extends {@link RequestModel}
 *
 * <p>ModifyRdsReadWeightRequest</p>
 */
public class ModifyRdsReadWeightRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("InstanceNames")
    @Validation(required = true)
    private String instanceNames;

    @Query
    @NameInMap("Weights")
    @Validation(required = true)
    private String weights;

    private ModifyRdsReadWeightRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.instanceNames = builder.instanceNames;
        this.weights = builder.weights;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRdsReadWeightRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return instanceNames
     */
    public String getInstanceNames() {
        return this.instanceNames;
    }

    /**
     * @return weights
     */
    public String getWeights() {
        return this.weights;
    }

    public static final class Builder extends Request.Builder<ModifyRdsReadWeightRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String instanceNames; 
        private String weights; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRdsReadWeightRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.instanceNames = response.instanceNames;
            this.weights = response.weights;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * InstanceNames.
         */
        public Builder instanceNames(String instanceNames) {
            this.putQueryParameter("InstanceNames", instanceNames);
            this.instanceNames = instanceNames;
            return this;
        }

        /**
         * Weights.
         */
        public Builder weights(String weights) {
            this.putQueryParameter("Weights", weights);
            this.weights = weights;
            return this;
        }

        @Override
        public ModifyRdsReadWeightRequest build() {
            return new ModifyRdsReadWeightRequest(this);
        } 

    } 

}
