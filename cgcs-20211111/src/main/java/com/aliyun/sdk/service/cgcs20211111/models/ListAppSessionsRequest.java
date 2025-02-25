// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppSessionsRequest} extends {@link RequestModel}
 *
 * <p>ListAppSessionsRequest</p>
 */
public class ListAppSessionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSessionIds")
    private java.util.List < String > customSessionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformSessionIds")
    private java.util.List < String > platformSessionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    private ListAppSessionsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.customSessionIds = builder.customSessionIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platformSessionIds = builder.platformSessionIds;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppSessionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return customSessionIds
     */
    public java.util.List < String > getCustomSessionIds() {
        return this.customSessionIds;
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
     * @return platformSessionIds
     */
    public java.util.List < String > getPlatformSessionIds() {
        return this.platformSessionIds;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListAppSessionsRequest, Builder> {
        private String appId; 
        private java.util.List < String > customSessionIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < String > platformSessionIds; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppSessionsRequest request) {
            super(request);
            this.appId = request.appId;
            this.customSessionIds = request.customSessionIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.platformSessionIds = request.platformSessionIds;
            this.projectId = request.projectId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * CustomSessionIds.
         */
        public Builder customSessionIds(java.util.List < String > customSessionIds) {
            this.putQueryParameter("CustomSessionIds", customSessionIds);
            this.customSessionIds = customSessionIds;
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
         * PlatformSessionIds.
         */
        public Builder platformSessionIds(java.util.List < String > platformSessionIds) {
            this.putQueryParameter("PlatformSessionIds", platformSessionIds);
            this.platformSessionIds = platformSessionIds;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListAppSessionsRequest build() {
            return new ListAppSessionsRequest(this);
        } 

    } 

}
