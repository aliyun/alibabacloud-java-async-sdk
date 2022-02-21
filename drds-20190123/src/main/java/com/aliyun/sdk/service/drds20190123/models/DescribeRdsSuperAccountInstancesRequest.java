// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRdsSuperAccountInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeRdsSuperAccountInstancesRequest</p>
 */
public class DescribeRdsSuperAccountInstancesRequest extends Request {
    @Query
    @NameInMap("DbInstType")
    private String dbInstType;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("RdsInstance")
    @Validation(required = true)
    private java.util.List < String > rdsInstance;

    private DescribeRdsSuperAccountInstancesRequest(Builder builder) {
        super(builder);
        this.dbInstType = builder.dbInstType;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.rdsInstance = builder.rdsInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRdsSuperAccountInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbInstType
     */
    public String getDbInstType() {
        return this.dbInstType;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return rdsInstance
     */
    public java.util.List < String > getRdsInstance() {
        return this.rdsInstance;
    }

    public static final class Builder extends Request.Builder<DescribeRdsSuperAccountInstancesRequest, Builder> {
        private String dbInstType; 
        private String drdsInstanceId; 
        private java.util.List < String > rdsInstance; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRdsSuperAccountInstancesRequest response) {
            super(response);
            this.dbInstType = response.dbInstType;
            this.drdsInstanceId = response.drdsInstanceId;
            this.rdsInstance = response.rdsInstance;
        } 

        /**
         * DbInstType.
         */
        public Builder dbInstType(String dbInstType) {
            this.putQueryParameter("DbInstType", dbInstType);
            this.dbInstType = dbInstType;
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
         * RdsInstance.
         */
        public Builder rdsInstance(java.util.List < String > rdsInstance) {
            this.putQueryParameter("RdsInstance", rdsInstance);
            this.rdsInstance = rdsInstance;
            return this;
        }

        @Override
        public DescribeRdsSuperAccountInstancesRequest build() {
            return new DescribeRdsSuperAccountInstancesRequest(this);
        } 

    } 

}
