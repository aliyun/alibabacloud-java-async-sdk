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

        private Builder(UpdatePrivateRdsClassRequest response) {
            super(response);
            this.autoUseCoupon = response.autoUseCoupon;
            this.DBInstanceId = response.DBInstanceId;
            this.drdsInstanceId = response.drdsInstanceId;
            this.prePayDuration = response.prePayDuration;
            this.rdsClass = response.rdsClass;
            this.storage = response.storage;
        } 

        /**
         * AutoUseCoupon.
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
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
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * PrePayDuration.
         */
        public Builder prePayDuration(Integer prePayDuration) {
            this.putQueryParameter("PrePayDuration", prePayDuration);
            this.prePayDuration = prePayDuration;
            return this;
        }

        /**
         * RdsClass.
         */
        public Builder rdsClass(String rdsClass) {
            this.putQueryParameter("RdsClass", rdsClass);
            this.rdsClass = rdsClass;
            return this;
        }

        /**
         * Storage.
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
