// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEmrMainVersionRequest} extends {@link RequestModel}
 *
 * <p>ListEmrMainVersionRequest</p>
 */
public class ListEmrMainVersionRequest extends Request {
    @Query
    @NameInMap("EmrVersion")
    private String emrVersion;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StackName")
    private String stackName;

    @Query
    @NameInMap("StackVersion")
    private String stackVersion;

    private ListEmrMainVersionRequest(Builder builder) {
        super(builder);
        this.emrVersion = builder.emrVersion;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.stackName = builder.stackName;
        this.stackVersion = builder.stackVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEmrMainVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emrVersion
     */
    public String getEmrVersion() {
        return this.emrVersion;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return stackName
     */
    public String getStackName() {
        return this.stackName;
    }

    /**
     * @return stackVersion
     */
    public String getStackVersion() {
        return this.stackVersion;
    }

    public static final class Builder extends Request.Builder<ListEmrMainVersionRequest, Builder> {
        private String emrVersion; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String stackName; 
        private String stackVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListEmrMainVersionRequest response) {
            super(response);
            this.emrVersion = response.emrVersion;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.stackName = response.stackName;
            this.stackVersion = response.stackVersion;
        } 

        /**
         * EmrVersion.
         */
        public Builder emrVersion(String emrVersion) {
            this.putQueryParameter("EmrVersion", emrVersion);
            this.emrVersion = emrVersion;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StackName.
         */
        public Builder stackName(String stackName) {
            this.putQueryParameter("StackName", stackName);
            this.stackName = stackName;
            return this;
        }

        /**
         * StackVersion.
         */
        public Builder stackVersion(String stackVersion) {
            this.putQueryParameter("StackVersion", stackVersion);
            this.stackVersion = stackVersion;
            return this;
        }

        @Override
        public ListEmrMainVersionRequest build() {
            return new ListEmrMainVersionRequest(this);
        } 

    } 

}
