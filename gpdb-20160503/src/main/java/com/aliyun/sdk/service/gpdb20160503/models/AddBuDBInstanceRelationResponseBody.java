// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBuDBInstanceRelationResponseBody} extends {@link TeaModel}
 *
 * <p>AddBuDBInstanceRelationResponseBody</p>
 */
public class AddBuDBInstanceRelationResponseBody extends TeaModel {
    @NameInMap("BusinessUnit")
    private String businessUnit;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("RequestId")
    private String requestId;

    private AddBuDBInstanceRelationResponseBody(Builder builder) {
        this.businessUnit = builder.businessUnit;
        this.DBInstanceName = builder.DBInstanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddBuDBInstanceRelationResponseBody create() {
        return builder().build();
    }

    /**
     * @return businessUnit
     */
    public String getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String businessUnit; 
        private String DBInstanceName; 
        private String requestId; 

        /**
         * BusinessUnit.
         */
        public Builder businessUnit(String businessUnit) {
            this.businessUnit = businessUnit;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddBuDBInstanceRelationResponseBody build() {
            return new AddBuDBInstanceRelationResponseBody(this);
        } 

    } 

}
