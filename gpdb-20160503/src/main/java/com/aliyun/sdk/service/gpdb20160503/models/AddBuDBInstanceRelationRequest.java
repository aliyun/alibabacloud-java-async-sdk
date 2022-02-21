// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBuDBInstanceRelationRequest} extends {@link RequestModel}
 *
 * <p>AddBuDBInstanceRelationRequest</p>
 */
public class AddBuDBInstanceRelationRequest extends Request {
    @Query
    @NameInMap("BusinessUnit")
    @Validation(required = true)
    private String businessUnit;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private AddBuDBInstanceRelationRequest(Builder builder) {
        super(builder);
        this.businessUnit = builder.businessUnit;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBuDBInstanceRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessUnit
     */
    public String getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<AddBuDBInstanceRelationRequest, Builder> {
        private String businessUnit; 
        private String DBInstanceId; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(AddBuDBInstanceRelationRequest response) {
            super(response);
            this.businessUnit = response.businessUnit;
            this.DBInstanceId = response.DBInstanceId;
            this.ownerId = response.ownerId;
        } 

        /**
         * BusinessUnit.
         */
        public Builder businessUnit(String businessUnit) {
            this.putQueryParameter("BusinessUnit", businessUnit);
            this.businessUnit = businessUnit;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public AddBuDBInstanceRelationRequest build() {
            return new AddBuDBInstanceRelationRequest(this);
        } 

    } 

}
