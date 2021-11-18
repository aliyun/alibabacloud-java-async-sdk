// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ListChartNamespaceRequest} extends {@link RequestModel}
 *
 * <p>ListChartNamespaceRequest</p>
 */
public class ListChartNamespaceRequest extends Request {
    @Query
    @NameInMap("PageNo")
    private Integer pageNo;

    @Query
    @NameInMap("NamespaceName")
    private String namespaceName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("NamespaceStatus")
    private String namespaceStatus;


    private ListChartNamespaceRequest(Builder builder) {
        super(builder);
        this.pageNo = builder.pageNo;
        this.namespaceName = builder.namespaceName;
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.namespaceStatus = builder.namespaceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChartNamespaceRequest create() {
        return builder().build();
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return namespaceName
     */
    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return namespaceStatus
     */
    public String getNamespaceStatus() {
        return this.namespaceStatus;
    }

    public static final class Builder extends Request.Builder {
        private Integer pageNo; 
        private String namespaceName; 
        private String regionId; 
        private String instanceId; 
        private Integer pageSize; 
        private String namespaceStatus; 

        /**
         * <p>Page number</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>Namespace name</p>
         */
        public Builder namespaceName(String namespaceName) {
            this.putQueryParameter("NamespaceName", namespaceName);
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Instance ID</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Page size</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the namespace. Valid values:

-"NORMAL": Normal

-"DELETING": Deleting</p>
         */
        public Builder namespaceStatus(String namespaceStatus) {
            this.putQueryParameter("NamespaceStatus", namespaceStatus);
            this.namespaceStatus = namespaceStatus;
            return this;
        }

        public ListChartNamespaceRequest build() {
            return new ListChartNamespaceRequest(this);
        } 

    } 

}
