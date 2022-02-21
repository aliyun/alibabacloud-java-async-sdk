// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EvaluateDedicatedHostInstanceResourceResponseBody} extends {@link TeaModel}
 *
 * <p>EvaluateDedicatedHostInstanceResourceResponseBody</p>
 */
public class EvaluateDedicatedHostInstanceResourceResponseBody extends TeaModel {
    @NameInMap("Available")
    private Integer available;

    @NameInMap("DBInstanceClass")
    private String DBInstanceClass;

    @NameInMap("RequestId")
    private String requestId;

    private EvaluateDedicatedHostInstanceResourceResponseBody(Builder builder) {
        this.available = builder.available;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EvaluateDedicatedHostInstanceResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return available
     */
    public Integer getAvailable() {
        return this.available;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer available; 
        private String DBInstanceClass; 
        private String requestId; 

        /**
         * Available.
         */
        public Builder available(Integer available) {
            this.available = available;
            return this;
        }

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EvaluateDedicatedHostInstanceResourceResponseBody build() {
            return new EvaluateDedicatedHostInstanceResourceResponseBody(this);
        } 

    } 

}
