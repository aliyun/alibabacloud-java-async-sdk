// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceGroupListRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceGroupListRequest</p>
 */
public class QueryDeviceGroupListRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("GroupTypes")
    private java.util.List < String > groupTypes;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SuperGroupId")
    private String superGroupId;

    private QueryDeviceGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.groupName = builder.groupName;
        this.groupTypes = builder.groupTypes;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.superGroupId = builder.superGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceGroupListRequest create() {
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
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return groupTypes
     */
    public java.util.List < String > getGroupTypes() {
        return this.groupTypes;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return superGroupId
     */
    public String getSuperGroupId() {
        return this.superGroupId;
    }

    public static final class Builder extends Request.Builder<QueryDeviceGroupListRequest, Builder> {
        private Integer currentPage; 
        private String groupName; 
        private java.util.List < String > groupTypes; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String superGroupId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceGroupListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.groupName = request.groupName;
            this.groupTypes = request.groupTypes;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.superGroupId = request.superGroupId;
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
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * GroupTypes.
         */
        public Builder groupTypes(java.util.List < String > groupTypes) {
            this.putQueryParameter("GroupTypes", groupTypes);
            this.groupTypes = groupTypes;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * SuperGroupId.
         */
        public Builder superGroupId(String superGroupId) {
            this.putQueryParameter("SuperGroupId", superGroupId);
            this.superGroupId = superGroupId;
            return this;
        }

        @Override
        public QueryDeviceGroupListRequest build() {
            return new QueryDeviceGroupListRequest(this);
        } 

    } 

}
