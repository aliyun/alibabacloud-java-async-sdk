// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersRequest} extends {@link RequestModel}
 *
 * <p>ListClustersRequest</p>
 */
public class ListClustersRequest extends Request {
    @Query
    @NameInMap("ClusterTypeList")
    private java.util.List < String > clusterTypeList;

    @Query
    @NameInMap("CreateType")
    private String createType;

    @Query
    @NameInMap("DefaultStatus")
    private Boolean defaultStatus;

    @Query
    @NameInMap("DepositType")
    private String depositType;

    @Query
    @NameInMap("ExpiredTagList")
    private java.util.List < String > expiredTagList;

    @Query
    @NameInMap("IsDesc")
    private Boolean isDesc;

    @Query
    @NameInMap("MachineType")
    private String machineType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListClustersRequest(Builder builder) {
        super(builder);
        this.clusterTypeList = builder.clusterTypeList;
        this.createType = builder.createType;
        this.defaultStatus = builder.defaultStatus;
        this.depositType = builder.depositType;
        this.expiredTagList = builder.expiredTagList;
        this.isDesc = builder.isDesc;
        this.machineType = builder.machineType;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.statusList = builder.statusList;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterTypeList
     */
    public java.util.List < String > getClusterTypeList() {
        return this.clusterTypeList;
    }

    /**
     * @return createType
     */
    public String getCreateType() {
        return this.createType;
    }

    /**
     * @return defaultStatus
     */
    public Boolean getDefaultStatus() {
        return this.defaultStatus;
    }

    /**
     * @return depositType
     */
    public String getDepositType() {
        return this.depositType;
    }

    /**
     * @return expiredTagList
     */
    public java.util.List < String > getExpiredTagList() {
        return this.expiredTagList;
    }

    /**
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return this.isDesc;
    }

    /**
     * @return machineType
     */
    public String getMachineType() {
        return this.machineType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListClustersRequest, Builder> {
        private java.util.List < String > clusterTypeList; 
        private String createType; 
        private Boolean defaultStatus; 
        private String depositType; 
        private java.util.List < String > expiredTagList; 
        private Boolean isDesc; 
        private String machineType; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private java.util.List < String > statusList; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListClustersRequest response) {
            super(response);
            this.clusterTypeList = response.clusterTypeList;
            this.createType = response.createType;
            this.defaultStatus = response.defaultStatus;
            this.depositType = response.depositType;
            this.expiredTagList = response.expiredTagList;
            this.isDesc = response.isDesc;
            this.machineType = response.machineType;
            this.name = response.name;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.statusList = response.statusList;
            this.tag = response.tag;
        } 

        /**
         * ClusterTypeList.
         */
        public Builder clusterTypeList(java.util.List < String > clusterTypeList) {
            this.putQueryParameter("ClusterTypeList", clusterTypeList);
            this.clusterTypeList = clusterTypeList;
            return this;
        }

        /**
         * CreateType.
         */
        public Builder createType(String createType) {
            this.putQueryParameter("CreateType", createType);
            this.createType = createType;
            return this;
        }

        /**
         * DefaultStatus.
         */
        public Builder defaultStatus(Boolean defaultStatus) {
            this.putQueryParameter("DefaultStatus", defaultStatus);
            this.defaultStatus = defaultStatus;
            return this;
        }

        /**
         * DepositType.
         */
        public Builder depositType(String depositType) {
            this.putQueryParameter("DepositType", depositType);
            this.depositType = depositType;
            return this;
        }

        /**
         * ExpiredTagList.
         */
        public Builder expiredTagList(java.util.List < String > expiredTagList) {
            this.putQueryParameter("ExpiredTagList", expiredTagList);
            this.expiredTagList = expiredTagList;
            return this;
        }

        /**
         * IsDesc.
         */
        public Builder isDesc(Boolean isDesc) {
            this.putQueryParameter("IsDesc", isDesc);
            this.isDesc = isDesc;
            return this;
        }

        /**
         * MachineType.
         */
        public Builder machineType(String machineType) {
            this.putQueryParameter("MachineType", machineType);
            this.machineType = machineType;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
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
        public ListClustersRequest build() {
            return new ListClustersRequest(this);
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
