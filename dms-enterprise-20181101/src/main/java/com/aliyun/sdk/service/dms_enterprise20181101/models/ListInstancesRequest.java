// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesRequest</p>
 */
public class ListInstancesRequest extends Request {
    @Query
    @NameInMap("DbType")
    private String dbType;

    @Query
    @NameInMap("EnvType")
    private String envType;

    @Query
    @NameInMap("InstanceSource")
    private String instanceSource;

    @Query
    @NameInMap("InstanceState")
    private String instanceState;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private ListInstancesRequest(Builder builder) {
        super(builder);
        this.dbType = builder.dbType;
        this.envType = builder.envType;
        this.instanceSource = builder.instanceSource;
        this.instanceState = builder.instanceState;
        this.netType = builder.netType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.searchKey = builder.searchKey;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbType
     */
    public String getDbType() {
        return this.dbType;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return instanceSource
     */
    public String getInstanceSource() {
        return this.instanceSource;
    }

    /**
     * @return instanceState
     */
    public String getInstanceState() {
        return this.instanceState;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
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
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<ListInstancesRequest, Builder> {
        private String dbType; 
        private String envType; 
        private String instanceSource; 
        private String instanceState; 
        private String netType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String searchKey; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesRequest response) {
            super(response);
            this.dbType = response.dbType;
            this.envType = response.envType;
            this.instanceSource = response.instanceSource;
            this.instanceState = response.instanceState;
            this.netType = response.netType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.searchKey = response.searchKey;
            this.tid = response.tid;
        } 

        /**
         * DbType.
         */
        public Builder dbType(String dbType) {
            this.putQueryParameter("DbType", dbType);
            this.dbType = dbType;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * InstanceSource.
         */
        public Builder instanceSource(String instanceSource) {
            this.putQueryParameter("InstanceSource", instanceSource);
            this.instanceSource = instanceSource;
            return this;
        }

        /**
         * InstanceState.
         */
        public Builder instanceState(String instanceState) {
            this.putQueryParameter("InstanceState", instanceState);
            this.instanceState = instanceState;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public ListInstancesRequest build() {
            return new ListInstancesRequest(this);
        } 

    } 

}
