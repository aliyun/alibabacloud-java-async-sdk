// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @Query
    @NameInMap("Filter")
    private String filter;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("Label")
    private java.util.Map < String, String > label;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ParentServiceUid")
    private String parentServiceUid;

    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    @Query
    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @Query
    @NameInMap("ServiceType")
    private String serviceType;

    @Query
    @NameInMap("ServiceUid")
    private String serviceUid;

    @Query
    @NameInMap("Sort")
    private String sort;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.groupName = builder.groupName;
        this.label = builder.label;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.parentServiceUid = builder.parentServiceUid;
        this.resourceName = builder.resourceName;
        this.serviceName = builder.serviceName;
        this.serviceStatus = builder.serviceStatus;
        this.serviceType = builder.serviceType;
        this.serviceUid = builder.serviceUid;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return label
     */
    public java.util.Map < String, String > getLabel() {
        return this.label;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return parentServiceUid
     */
    public String getParentServiceUid() {
        return this.parentServiceUid;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return serviceUid
     */
    public String getServiceUid() {
        return this.serviceUid;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private String filter; 
        private String groupName; 
        private java.util.Map < String, String > label; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String parentServiceUid; 
        private String resourceName; 
        private String serviceName; 
        private String serviceStatus; 
        private String serviceType; 
        private String serviceUid; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.filter = request.filter;
            this.groupName = request.groupName;
            this.label = request.label;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.parentServiceUid = request.parentServiceUid;
            this.resourceName = request.resourceName;
            this.serviceName = request.serviceName;
            this.serviceStatus = request.serviceStatus;
            this.serviceType = request.serviceType;
            this.serviceUid = request.serviceUid;
            this.sort = request.sort;
        } 

        /**
         * {
         * <p>
         *   "RequestId": "40325405-579C-4D82-9624-EC2B1779848E",
         *   "Services": [
         *     {
         *       "ServiceId": "200516454695942578",
         *       "ServiceName": "vipserver",
         *       "ParentUid": "1628454689805075",
         *       "CallerUid": "eas",
         *       "CurrentVersion": 1,
         *       "Cpu": 1,
         *       "Gpu": 0,
         *       "Memory": 900,
         *       "Image": "registry.cn-zhangjiakou.aliyuncs.com/eas/ndisearch_v1_inner_zhangbei:v0.0.3-20200302145109",
         *       "Resource": "seccontent_inner_2080ti_5",
         *       "Namespace": "vipserver",
         *       "CreateTime": "2019-10-25T10:37:53Z",
         *       "UpdateTime": "2019-10-30T16:50:59Z",
         *       "TotalInstance": 1,
         *       "RunningInstance": 1,
         *       "PendingInstance": 0,
         *       "LatestVersion": 1,
         *       "Status": "Running",
         *       "Reason": "RUNNING",
         *       "Message": "Service is now scaling",
         *       "AccessToken": "",
         *       "Weight": 0
         *     },
         *     {
         *       "ServiceId": 97097,
         *       "ServiceName": "a1",
         *       "CallerUid": "eas",
         *       "CurrentVersion": 1,
         *       "Cpu": 1,
         *       "Gpu": 0,
         *       "Memory": 900,
         *       "Image": "registry.cn-hangzhou.aliyuncs.com/eas/pi_imemb_tb:v0.0.1-20191023130701",
         *       "Resource": "seccontent_inner_b",
         *       "Namespace": "a1",
         *       "CreateTime": "2020-05-26T18:03:11Z",
         *       "UpdateTime": "2020-05-26T18:03:11Z",
         *       "TotalInstance": 1,
         *       "RunningInstance": 0,
         *       "PendingInstance": 1,
         *       "LatestVersion": 1,
         *       "Status": "Failed",
         *       "Reason": "FAILED",
         *       "Message": "the server could not find the requested resource (post services.meta.k8s.io)",
         *       "AccessToken": "regression_test_token",
         *       "Weight": 0
         *     }
         *   ],
         *   "PageNumber": 1,
         *   "PageSize": 2,
         *   "TotalCount": 2
         * }
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * 服务组名称过滤
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(java.util.Map < String, String > label) {
            String labelShrink = shrink(label, "Label", "json");
            this.putQueryParameter("Label", labelShrink);
            this.label = label;
            return this;
        }

        /**
         * 所属的group。
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * 376577
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页的大小（默认为100）
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ParentServiceUid.
         */
        public Builder parentServiceUid(String parentServiceUid) {
            this.putQueryParameter("ParentServiceUid", parentServiceUid);
            this.parentServiceUid = parentServiceUid;
            return this;
        }

        /**
         * 服务所属的资源组名称或ID。
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * 服务名。
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 服务运行的状态。
         */
        public Builder serviceStatus(String serviceStatus) {
            this.putQueryParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * ServiceUid.
         */
        public Builder serviceUid(String serviceUid) {
            this.putQueryParameter("ServiceUid", serviceUid);
            this.serviceUid = serviceUid;
            return this;
        }

        /**
         * 服务的类型定义。
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

}
