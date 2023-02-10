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
    @NameInMap("ServiceType")
    private String serviceType;

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
        this.serviceType = builder.serviceType;
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
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
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
        private String serviceType; 
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
            this.serviceType = request.serviceType;
            this.sort = request.sort;
        } 

        /**
         * 关键字搜索。
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * 所属的group。
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
         * 排序顺序，支持升序或将序。
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * 页号。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页大小。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Band类型服务主服务的UID
         */
        public Builder parentServiceUid(String parentServiceUid) {
            this.putQueryParameter("ParentServiceUid", parentServiceUid);
            this.parentServiceUid = parentServiceUid;
            return this;
        }

        /**
         * 服务的类型，例如Async, OfflineTask和Standard等
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * 排序字段。
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
