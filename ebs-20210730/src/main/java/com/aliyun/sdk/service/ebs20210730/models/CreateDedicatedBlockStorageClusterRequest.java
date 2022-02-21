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
    @Validation(required = true, maximum = 2359296, minimum = 71680)
    private Long capacity;

    @Query
    @NameInMap("DbscId")
    @Validation(required = true)
    private String dbscId;

    @Query
    @NameInMap("DbscName")
    @Validation(required = true)
    private String dbscName;

    @Query
    @NameInMap("IoType")
    @Validation(required = true)
    private String ioType;

    @Query
    @NameInMap("PerformanceLevel")
    @Validation(required = true)
    private String performanceLevel;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateDedicatedBlockStorageClusterRequest(Builder builder) {
        super(builder);
        this.azone = builder.azone;
        this.capacity = builder.capacity;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.ioType = builder.ioType;
        this.performanceLevel = builder.performanceLevel;
        this.regionId = builder.regionId;
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
     * @return ioType
     */
    public String getIoType() {
        return this.ioType;
    }

    /**
     * @return performanceLevel
     */
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateDedicatedBlockStorageClusterRequest, Builder> {
        private String azone; 
        private Long capacity; 
        private String dbscId; 
        private String dbscName; 
        private String ioType; 
        private String performanceLevel; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDedicatedBlockStorageClusterRequest response) {
            super(response);
            this.azone = response.azone;
            this.capacity = response.capacity;
            this.dbscId = response.dbscId;
            this.dbscName = response.dbscName;
            this.ioType = response.ioType;
            this.performanceLevel = response.performanceLevel;
            this.regionId = response.regionId;
        } 

        /**
         * Azone.
         */
        public Builder azone(String azone) {
            this.putQueryParameter("Azone", azone);
            this.azone = azone;
            return this;
        }

        /**
         * Capacity.
         */
        public Builder capacity(Long capacity) {
            this.putQueryParameter("Capacity", capacity);
            this.capacity = capacity;
            return this;
        }

        /**
         * DbscId.
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * DbscName.
         */
        public Builder dbscName(String dbscName) {
            this.putQueryParameter("DbscName", dbscName);
            this.dbscName = dbscName;
            return this;
        }

        /**
         * IoType.
         */
        public Builder ioType(String ioType) {
            this.putQueryParameter("IoType", ioType);
            this.ioType = ioType;
            return this;
        }

        /**
         * PerformanceLevel.
         */
        public Builder performanceLevel(String performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateDedicatedBlockStorageClusterRequest build() {
            return new CreateDedicatedBlockStorageClusterRequest(this);
        } 

    } 

}
