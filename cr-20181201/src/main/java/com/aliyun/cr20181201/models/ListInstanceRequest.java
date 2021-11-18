// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceStatus")
    private String instanceStatus;


    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.pageSize = builder.pageSize;
        this.instanceName = builder.instanceName;
        this.pageNo = builder.pageNo;
        this.regionId = builder.regionId;
        this.instanceStatus = builder.instanceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return this.instanceStatus;
    }

    public static final class Builder extends Request.Builder {
        private Integer pageSize; 
        private String instanceName; 
        private Integer pageNo; 
        private String regionId; 
        private String instanceStatus; 

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Instance name</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Region</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The status of the instance. Valid values:

-"PENDING": initializing

-"Init_error ": initialization failed.

-"STARTING": Starting

-"RUNNING": Running

-"STOPPING": Stopping

-"STOPPED": Stopped

-"DELETING": Deleting

-"DELETED": deleted</p>
         */
        public Builder instanceStatus(String instanceStatus) {
            this.putQueryParameter("InstanceStatus", instanceStatus);
            this.instanceStatus = instanceStatus;
            return this;
        }

        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

}
