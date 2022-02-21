// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstancesRequest</p>
 */
public class DescribeDBInstancesRequest extends Request {
    @Query
    @NameInMap("DBInstanceCategories")
    private java.util.List < String > DBInstanceCategories;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceIds")
    private String DBInstanceIds;

    @Query
    @NameInMap("DBInstanceModes")
    private java.util.List < String > DBInstanceModes;

    @Query
    @NameInMap("DBInstanceStatuses")
    private java.util.List < String > DBInstanceStatuses;

    @Query
    @NameInMap("InstanceDeployTypes")
    private java.util.List < String > instanceDeployTypes;

    @Query
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeDBInstancesRequest(Builder builder) {
        super(builder);
        this.DBInstanceCategories = builder.DBInstanceCategories;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceIds = builder.DBInstanceIds;
        this.DBInstanceModes = builder.DBInstanceModes;
        this.DBInstanceStatuses = builder.DBInstanceStatuses;
        this.instanceDeployTypes = builder.instanceDeployTypes;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceCategories
     */
    public java.util.List < String > getDBInstanceCategories() {
        return this.DBInstanceCategories;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceIds
     */
    public String getDBInstanceIds() {
        return this.DBInstanceIds;
    }

    /**
     * @return DBInstanceModes
     */
    public java.util.List < String > getDBInstanceModes() {
        return this.DBInstanceModes;
    }

    /**
     * @return DBInstanceStatuses
     */
    public java.util.List < String > getDBInstanceStatuses() {
        return this.DBInstanceStatuses;
    }

    /**
     * @return instanceDeployTypes
     */
    public java.util.List < String > getInstanceDeployTypes() {
        return this.instanceDeployTypes;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstancesRequest, Builder> {
        private java.util.List < String > DBInstanceCategories; 
        private String DBInstanceDescription; 
        private String DBInstanceIds; 
        private java.util.List < String > DBInstanceModes; 
        private java.util.List < String > DBInstanceStatuses; 
        private java.util.List < String > instanceDeployTypes; 
        private String instanceNetworkType; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstancesRequest response) {
            super(response);
            this.DBInstanceCategories = response.DBInstanceCategories;
            this.DBInstanceDescription = response.DBInstanceDescription;
            this.DBInstanceIds = response.DBInstanceIds;
            this.DBInstanceModes = response.DBInstanceModes;
            this.DBInstanceStatuses = response.DBInstanceStatuses;
            this.instanceDeployTypes = response.instanceDeployTypes;
            this.instanceNetworkType = response.instanceNetworkType;
            this.ownerId = response.ownerId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.tag = response.tag;
        } 

        /**
         * DBInstanceCategories.
         */
        public Builder DBInstanceCategories(java.util.List < String > DBInstanceCategories) {
            this.putQueryParameter("DBInstanceCategories", DBInstanceCategories);
            this.DBInstanceCategories = DBInstanceCategories;
            return this;
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
         * DBInstanceIds.
         */
        public Builder DBInstanceIds(String DBInstanceIds) {
            this.putQueryParameter("DBInstanceIds", DBInstanceIds);
            this.DBInstanceIds = DBInstanceIds;
            return this;
        }

        /**
         * DBInstanceModes.
         */
        public Builder DBInstanceModes(java.util.List < String > DBInstanceModes) {
            this.putQueryParameter("DBInstanceModes", DBInstanceModes);
            this.DBInstanceModes = DBInstanceModes;
            return this;
        }

        /**
         * DBInstanceStatuses.
         */
        public Builder DBInstanceStatuses(java.util.List < String > DBInstanceStatuses) {
            this.putQueryParameter("DBInstanceStatuses", DBInstanceStatuses);
            this.DBInstanceStatuses = DBInstanceStatuses;
            return this;
        }

        /**
         * InstanceDeployTypes.
         */
        public Builder instanceDeployTypes(java.util.List < String > instanceDeployTypes) {
            this.putQueryParameter("InstanceDeployTypes", instanceDeployTypes);
            this.instanceDeployTypes = instanceDeployTypes;
            return this;
        }

        /**
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeDBInstancesRequest build() {
            return new DescribeDBInstancesRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
