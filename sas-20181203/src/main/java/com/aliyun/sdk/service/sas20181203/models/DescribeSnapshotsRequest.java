// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAliYunEcs")
    private String isAliYunEcs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineRegion")
    private String machineRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MachineRemark")
    private String machineRemark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private String statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private String apiVersion; 
        private Integer currentPage; 
        private String isAliYunEcs; 
        private String machineRegion; 
        private String machineRemark; 
        private String nextToken; 
        private Integer pageSize; 
        private String statusList; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest request) {
            super(request);
            this.apiVersion = request.apiVersion;
            this.currentPage = request.currentPage;
            this.isAliYunEcs = request.isAliYunEcs;
            this.machineRegion = request.machineRegion;
            this.machineRemark = request.machineRemark;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.statusList = request.statusList;
            this.uuid = request.uuid;
        } 

        /**
         * The version of the anti-ransomware policy. Valid values:
         * <p>
         * 
         * *   **1.0.0**
         * *   **2.0.0**
         */
        public Builder apiVersion(String apiVersion) {
            this.putQueryParameter("ApiVersion", apiVersion);
            this.apiVersion = apiVersion;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether the server is an Elastic Compute Service (ECS) instance. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder isAliYunEcs(String isAliYunEcs) {
            this.putQueryParameter("IsAliYunEcs", isAliYunEcs);
            this.isAliYunEcs = isAliYunEcs;
            return this;
        }

        /**
         * The region in which the server resides.
         * <p>
         * 
         * >  If the Uuid parameter is not specified, this parameter is required.
         */
        public Builder machineRegion(String machineRegion) {
            this.putQueryParameter("MachineRegion", machineRegion);
            this.machineRegion = machineRegion;
            return this;
        }

        /**
         * The name or IP address of the server.
         */
        public Builder machineRemark(String machineRemark) {
            this.putQueryParameter("MachineRemark", machineRemark);
            this.machineRemark = machineRemark;
            return this;
        }

        /**
         * The starting position of the query. If this parameter is left empty, the query starts from the beginning.
         * <p>
         * 
         * >  If you call the operation for the first time, you do not need to specify the parameter. The response to the first call contains the token that can be used for the second call. Each subsequent response contains the token that can be used for the next call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of backup snapshots from which data can be restored. Valid values:
         * <p>
         * 
         * *   **COMPLETE**: complete
         * *   **PARTIAL_COMPLETE**: partial complete
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * The UUID of the server.
         * <p>
         * 
         * >  You can call the [DescribeBackupPolicy](~~DescribeBackupPolicy~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

}
