// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePrivateRdsClassRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateRdsClassRequest</p>
 */
public class UpdatePrivateRdsClassRequest extends Request {
    @Query
    @NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("PrePayDuration")
    private Integer prePayDuration;

    @Query
    @NameInMap("RdsClass")
    private String rdsClass;

    @Query
    @NameInMap("Storage")
    private String storage;

    private UpdatePrivateRdsClassRequest(Builder builder) {
        super(builder);
        this.autoUseCoupon = builder.autoUseCoupon;
        this.DBInstanceId = builder.DBInstanceId;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.prePayDuration = builder.prePayDuration;
        this.rdsClass = builder.rdsClass;
        this.storage = builder.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateRdsClassRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return prePayDuration
     */
    public Integer getPrePayDuration() {
        return this.prePayDuration;
    }

    /**
     * @return rdsClass
     */
    public String getRdsClass() {
        return this.rdsClass;
    }

    /**
     * @return storage
     */
    public String getStorage() {
        return this.storage;
    }

    public static final class Builder extends Request.Builder<UpdatePrivateRdsClassRequest, Builder> {
        private Boolean autoUseCoupon; 
        private String DBInstanceId; 
        private String drdsInstanceId; 
        private Integer prePayDuration; 
        private String rdsClass; 
        private String storage; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateRdsClassRequest request) {
            super(request);
            this.autoUseCoupon = request.autoUseCoupon;
            this.DBInstanceId = request.DBInstanceId;
            this.drdsInstanceId = request.drdsInstanceId;
            this.prePayDuration = request.prePayDuration;
            this.rdsClass = request.rdsClass;
            this.storage = request.storage;
        } 

        /**
         * Specifies whether to use vouchers to offset the purchase fees. Valid values: **true** and **false**. Default value: false.
         * <p>
         * 
         * > If you downgrade the specifications of an instance after you use the vouchers, the vouchers used for the purchase cannot be refunded.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * The ID of the custom ApsaraDB RDS instance at the storage layer.
         * <p>
         * 
         * > You can call the [DescribeDrdsRdsInstances](~~xxxx~~) operation to query the details of all ApsaraDB RDS instances at the storage layer of a PolarDB-X 1.0 instance, including the IDs of the ApsaraDB RDS instances.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The ID of the PolarDB-X 1.0 instance.
         * <p>
         * 
         * > You can call the [DescribeDrdsInstances](~~139284~~) operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * This parameter is discontinued.
         */
        public Builder prePayDuration(Integer prePayDuration) {
            this.putQueryParameter("PrePayDuration", prePayDuration);
            this.prePayDuration = prePayDuration;
            return this;
        }

        /**
         * The new instance type of the custom ApsaraDB RDS instance at the storage layer.
         * <p>
         * 
         * > You can call the [DescribeAvailableClasses](~~196546~~) operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.
         */
        public Builder rdsClass(String rdsClass) {
            this.putQueryParameter("RdsClass", rdsClass);
            this.rdsClass = rdsClass;
            return this;
        }

        /**
         * The new storage capacity of the custom ApsaraDB RDS instance at the storage layer.
         * <p>
         * 
         * > You can call the [DescribeAvailableClasses](~~196546~~) operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.
         */
        public Builder storage(String storage) {
            this.putQueryParameter("Storage", storage);
            this.storage = storage;
            return this;
        }

        @Override
        public UpdatePrivateRdsClassRequest build() {
            return new UpdatePrivateRdsClassRequest(this);
        } 

    } 

}
