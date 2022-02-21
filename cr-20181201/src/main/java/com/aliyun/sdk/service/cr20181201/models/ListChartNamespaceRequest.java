// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListChartNamespaceRequest} extends {@link RequestModel}
 *
 * <p>ListChartNamespaceRequest</p>
 */
public class ListChartNamespaceRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Query
    @NameInMap("NamespaceStatus")
    private String namespaceStatus;

    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private ListChartNamespaceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.namespaceName = builder.namespaceName;
        this.namespaceStatus = builder.namespaceStatus;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return namespaceStatus
     */
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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

    public static final class Builder extends Request.Builder<ListChartNamespaceRequest, Builder> {
        private String instanceId; 
        private String namespaceName; 
        private String namespaceStatus; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListChartNamespaceRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.namespaceName = response.namespaceName;
            this.namespaceStatus = response.namespaceStatus;
            this.pageNo = response.pageNo;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
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
         * NamespaceName.
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * NamespaceStatus.
         */
        public Builder namespaceStatus(String namespaceStatus) {
            this.putQueryParameter("NamespaceStatus", namespaceStatus);
            this.namespaceStatus = namespaceStatus;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
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

        @Override
        public ListChartNamespaceRequest build() {
            return new ListChartNamespaceRequest(this);
        } 

    } 

}
