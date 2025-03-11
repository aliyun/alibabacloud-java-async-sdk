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
 * {@link UpdatePrivateRdsClassRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateRdsClassRequest</p>
 */
public class UpdatePrivateRdsClassRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrePayDuration")
    private Integer prePayDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RdsClass")
    private String rdsClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Storage")
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
         * <p>Specifies whether to use vouchers to offset the purchase fees. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: false.</p>
         * <blockquote>
         * <p>If you downgrade the specifications of an instance after you use the vouchers, the vouchers used for the purchase cannot be refunded.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The ID of the custom ApsaraDB RDS instance at the storage layer.</p>
         * <blockquote>
         * <p>You can call the <a href="~~xxxx~~">DescribeDrdsRdsInstances</a> operation to query the details of all ApsaraDB RDS instances at the storage layer of a PolarDB-X 1.0 instance, including the IDs of the ApsaraDB RDS instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to query the details of all PolarDB-X 1.0 instances within an Alibaba Cloud account, including the IDs of the instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds*************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>This parameter is discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder prePayDuration(Integer prePayDuration) {
            this.putQueryParameter("PrePayDuration", prePayDuration);
            this.prePayDuration = prePayDuration;
            return this;
        }

        /**
         * <p>The new instance type of the custom ApsaraDB RDS instance at the storage layer.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196546.html">DescribeAvailableClasses</a> operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.c1.xlarge</p>
         */
        public Builder rdsClass(String rdsClass) {
            this.putQueryParameter("RdsClass", rdsClass);
            this.rdsClass = rdsClass;
            return this;
        }

        /**
         * <p>The new storage capacity of the custom ApsaraDB RDS instance at the storage layer.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196546.html">DescribeAvailableClasses</a> operation to view the specifications that are supported for a custom ApsaraDB RDS instance. The specifications include the instance type and the storage capacity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
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
