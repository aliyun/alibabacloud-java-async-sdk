// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedBlockStorageClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDedicatedBlockStorageClusterRequest</p>
 */
public class CreateDedicatedBlockStorageClusterRequest extends Request {
    @Query
    @NameInMap("Azone")
    @Validation(required = true)
    private String azone;

    @Query
    @NameInMap("Capacity")
    @Validation(required = true, maximum = 2334720, minimum = 61440)
    private Long capacity;

    @Query
    @NameInMap("DbscId")
    private String dbscId;

    @Query
    @NameInMap("DbscName")
    @Validation(required = true)
    private String dbscName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateDedicatedBlockStorageClusterRequest(Builder builder) {
        super(builder);
        this.azone = builder.azone;
        this.capacity = builder.capacity;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDedicatedBlockStorageClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return azone
     */
    public String getAzone() {
        return this.azone;
    }

    /**
     * @return capacity
     */
    public Long getCapacity() {
        return this.capacity;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return dbscName
     */
    public String getDbscName() {
        return this.dbscName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedBlockStorageClusterRequest, Builder> {
        private String azone; 
        private Long capacity; 
        private String dbscId; 
        private String dbscName; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedBlockStorageClusterRequest request) {
            super(request);
            this.azone = request.azone;
            this.capacity = request.capacity;
            this.dbscId = request.dbscId;
            this.dbscName = request.dbscName;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * 专属块存储集群所在的可用区ID。您可以调用DescribeZones
         * <p>
         * 查看阿里云地域下的可用区。
         */
        public Builder azone(String azone) {
            this.putQueryParameter("Azone", azone);
            this.azone = azone;
            return this;
        }

        /**
         * 专属集群容量，单位为GiB，范围为[61440, 2334720]，最小递增步长为12288GiB
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * 专属集群虚拟ID，可填任意字符串，不影响最终生成的专属集群ID
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * 专属集群名称
         */
        public Builder dbscName(String dbscName) {
            this.putQueryParameter("DbscName", dbscName);
            this.dbscName = dbscName;
            return this;
        }

        /**
         * 专属块存储集群所在的地域ID。您可以调用DescribeRegions
         * <p>
         * 查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 专属块存储集群性能类型。可能值：
         * <p>
         * Standard：基础型。该类型的专属块存储集群中可创建ESSD PL0云盘。
         * Premium：性能型。该类型的专属块存储集群中可创建ESSD PL1云盘。
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateDedicatedBlockStorageClusterRequest build() {
            return new CreateDedicatedBlockStorageClusterRequest(this);
        } 

    } 

}
