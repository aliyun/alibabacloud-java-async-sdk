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
 * {@link ModifyRdsReadWeightRequest} extends {@link RequestModel}
 *
 * <p>ModifyRdsReadWeightRequest</p>
 */
public class ModifyRdsReadWeightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Weights")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ModifyRdsReadWeightRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.instanceNames = request.instanceNames;
            this.weights = request.weights;
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
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
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
         * <p>The names of the ApsaraDB RDS for MySQL instances. Separate the names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-<strong><strong><strong><strong><strong><strong><strong><strong>,rm-</strong></strong></strong></strong></strong></strong></strong></strong></p>
         */
        public Builder instanceNames(String instanceNames) {
            this.putQueryParameter("InstanceNames", instanceNames);
            this.instanceNames = instanceNames;
            return this;
        }

        /**
         * <p>The weights of the ApsaraDB RDS for MySQL instances. Separate the weights with commas (,).</p>
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
        public ModifyRdsReadWeightRequest build() {
            return new ModifyRdsReadWeightRequest(this);
        } 

    } 

}
