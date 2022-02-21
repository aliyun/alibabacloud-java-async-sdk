// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstanceDescriptionRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceDescriptionRequest</p>
 */
public class ModifyDBInstanceDescriptionRequest extends Request {
    @Query
    @NameInMap("DBInstanceDescription")
    @Validation(required = true)
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    private ModifyDBInstanceDescriptionRequest(Builder builder) {
        super(builder);
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceDescriptionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceDescriptionRequest, Builder> {
        private String DBInstanceDescription; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceDescriptionRequest response) {
            super(response);
            this.DBInstanceDescription = response.DBInstanceDescription;
            this.DBInstanceId = response.DBInstanceId;
        } 

        /**
         * DBInstanceDescription.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
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

        @Override
        public ModifyDBInstanceDescriptionRequest build() {
            return new ModifyDBInstanceDescriptionRequest(this);
        } 

    } 

}
