// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSpecificationRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpecificationRequest</p>
 */
public class DescribeSpecificationRequest extends Request {
    @Query
    @NameInMap("CpuCores")
    @Validation(required = true)
    private Integer cpuCores;

    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StorageType")
    @Validation(required = true)
    private String storageType;

    @Query
    @NameInMap("TotalNodeNum")
    @Validation(required = true)
    private Integer totalNodeNum;

    private DescribeSpecificationRequest(Builder builder) {
        super(builder);
        this.cpuCores = builder.cpuCores;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.storageType = builder.storageType;
        this.totalNodeNum = builder.totalNodeNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpecificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cpuCores
     */
    public Integer getCpuCores() {
        return this.cpuCores;
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

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return totalNodeNum
     */
    public Integer getTotalNodeNum() {
        return this.totalNodeNum;
    }

    public static final class Builder extends Request.Builder<DescribeSpecificationRequest, Builder> {
        private Integer cpuCores; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String storageType; 
        private Integer totalNodeNum; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpecificationRequest response) {
            super(response);
            this.cpuCores = response.cpuCores;
            this.DBInstanceId = response.DBInstanceId;
            this.ownerId = response.ownerId;
            this.storageType = response.storageType;
            this.totalNodeNum = response.totalNodeNum;
        } 

        /**
         * CpuCores.
         */
        public Builder cpuCores(Integer cpuCores) {
            this.putQueryParameter("CpuCores", cpuCores);
            this.cpuCores = cpuCores;
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

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * TotalNodeNum.
         */
        public Builder totalNodeNum(Integer totalNodeNum) {
            this.putQueryParameter("TotalNodeNum", totalNodeNum);
            this.totalNodeNum = totalNodeNum;
            return this;
        }

        @Override
        public DescribeSpecificationRequest build() {
            return new DescribeSpecificationRequest(this);
        } 

    } 

}
