// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @Query
    @NameInMap("ApiVersion")
    private String apiVersion;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IsAliYunEcs")
    private String isAliYunEcs;

    @Query
    @NameInMap("MachineRegion")
    private String machineRegion;

    @Query
    @NameInMap("MachineRemark")
    private String machineRemark;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("Uuid")
    private String uuid;


    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.apiVersion = builder.apiVersion;
        this.currentPage = builder.currentPage;
        this.isAliYunEcs = builder.isAliYunEcs;
        this.machineRegion = builder.machineRegion;
        this.machineRemark = builder.machineRemark;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.statusList = builder.statusList;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsRequest create() {
        return builder().build();
    }

    /**
     * @return apiVersion
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return isAliYunEcs
     */
    public String getIsAliYunEcs() {
        return this.isAliYunEcs;
    }

    /**
     * @return machineRegion
     */
    public String getMachineRegion() {
        return this.machineRegion;
    }

    /**
     * @return machineRemark
     */
    public String getMachineRemark() {
        return this.machineRemark;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder {
        private String apiVersion; 
        private Integer currentPage; 
        private String isAliYunEcs; 
        private String machineRegion; 
        private String machineRemark; 
        private String nextToken; 
        private Integer pageSize; 
        private String statusList; 
        private String uuid; 

        /**
         * <p>ApiVersion.</p>
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * <p>CurrentPage.</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>IsAliYunEcs.</p>
         */
        public Builder isAliYunEcs(String isAliYunEcs) {
            this.putQueryParameter("IsAliYunEcs", isAliYunEcs);
            this.isAliYunEcs = isAliYunEcs;
            return this;
        }

        /**
         * <p>MachineRegion.</p>
         */
        public Builder machineRegion(String machineRegion) {
            this.putQueryParameter("MachineRegion", machineRegion);
            this.machineRegion = machineRegion;
            return this;
        }

        /**
         * <p>MachineRemark.</p>
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * <p>NextToken.</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>PageSize.</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>StatusList.</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

}
