// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListAppInstancesRequest</p>
 */
public class ListAppInstancesRequest extends Request {
    @Query
    @NameInMap("AppInstanceGroupId")
    @Validation(required = true)
    private String appInstanceGroupId;

    @Query
    @NameInMap("AppInstanceId")
    private String appInstanceId;

    @Body
    @NameInMap("AppInstanceIdList")
    private java.util.List < String > appInstanceIdList;

    @Query
    @NameInMap("IncludeDeleted")
    private Boolean includeDeleted;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Body
    @NameInMap("Status")
    private java.util.List < String > status;

    private ListAppInstancesRequest(Builder builder) {
        super(builder);
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.appInstanceIdList = builder.appInstanceIdList;
        this.includeDeleted = builder.includeDeleted;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return appInstanceIdList
     */
    public java.util.List < String > getAppInstanceIdList() {
        return this.appInstanceIdList;
    }

    /**
     * @return includeDeleted
     */
    public Boolean getIncludeDeleted() {
        return this.includeDeleted;
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
     * @return status
     */
    public java.util.List < String > getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListAppInstancesRequest, Builder> {
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private java.util.List < String > appInstanceIdList; 
        private Boolean includeDeleted; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > status; 

        private Builder() {
            super();
        } 

        private Builder(ListAppInstancesRequest request) {
            super(request);
            this.appInstanceGroupId = request.appInstanceGroupId;
            this.appInstanceId = request.appInstanceId;
            this.appInstanceIdList = request.appInstanceIdList;
            this.includeDeleted = request.includeDeleted;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.status = request.status;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.putQueryParameter("AppInstanceGroupId", appInstanceGroupId);
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * AppInstanceIdList.
         */
        public Builder appInstanceIdList(java.util.List < String > appInstanceIdList) {
            this.putBodyParameter("AppInstanceIdList", appInstanceIdList);
            this.appInstanceIdList = appInstanceIdList;
            return this;
        }

        /**
         * IncludeDeleted.
         */
        public Builder includeDeleted(Boolean includeDeleted) {
            this.putQueryParameter("IncludeDeleted", includeDeleted);
            this.includeDeleted = includeDeleted;
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
         * Status.
         */
        public Builder status(java.util.List < String > status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListAppInstancesRequest build() {
            return new ListAppInstancesRequest(this);
        } 

    } 

}
