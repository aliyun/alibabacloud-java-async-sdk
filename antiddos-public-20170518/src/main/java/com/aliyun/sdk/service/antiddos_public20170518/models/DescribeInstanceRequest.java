// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRequest</p>
 */
public class DescribeInstanceRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("DdosRegionId")
    @Validation(required = true)
    private String ddosRegionId;

    @Query
    @NameInMap("DdosStatus")
    private String ddosStatus;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("InstanceIp")
    private String instanceIp;

    @Query
    @NameInMap("InstanceName")
    private String instanceName;

    @Query
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 50)
    private Integer pageSize;

    private DescribeInstanceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.ddosRegionId = builder.ddosRegionId;
        this.ddosStatus = builder.ddosStatus;
        this.instanceId = builder.instanceId;
        this.instanceIp = builder.instanceIp;
        this.instanceName = builder.instanceName;
        this.instanceType = builder.instanceType;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return ddosRegionId
     */
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

    /**
     * @return ddosStatus
     */
    public String getDdosStatus() {
        return this.ddosStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceIp
     */
    public String getInstanceIp() {
        return this.instanceIp;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRequest, Builder> {
        private Integer currentPage; 
        private String ddosRegionId; 
        private String ddosStatus; 
        private String instanceId; 
        private String instanceIp; 
        private String instanceName; 
        private String instanceType; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.ddosRegionId = request.ddosRegionId;
            this.ddosStatus = request.ddosStatus;
            this.instanceId = request.instanceId;
            this.instanceIp = request.instanceIp;
            this.instanceName = request.instanceName;
            this.instanceType = request.instanceType;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DdosRegionId.
         */
        public Builder ddosRegionId(String ddosRegionId) {
            this.putQueryParameter("DdosRegionId", ddosRegionId);
            this.ddosRegionId = ddosRegionId;
            return this;
        }

        /**
         * DdosStatus.
         */
        public Builder ddosStatus(String ddosStatus) {
            this.putQueryParameter("DdosStatus", ddosStatus);
            this.ddosStatus = ddosStatus;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceIp.
         */
        public Builder instanceIp(String instanceIp) {
            this.putQueryParameter("InstanceIp", instanceIp);
            this.instanceIp = instanceIp;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
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

        @Override
        public DescribeInstanceRequest build() {
            return new DescribeInstanceRequest(this);
        } 

    } 

}
