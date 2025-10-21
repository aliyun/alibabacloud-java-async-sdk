// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rai20240701.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListModelInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListModelInstanceRequest</p>
 */
public class ListModelInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EasServiceName")
    private String easServiceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSidecarPolicy")
    private Integer isSidecarPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportContentSafe")
    private Integer isSupportContentSafe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportPromptAttack")
    private Integer isSupportPromptAttack;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSupportSensitiveTopic")
    private Integer isSupportSensitiveTopic;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSource")
    private String modelSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private ListModelInstanceRequest(Builder builder) {
        super(builder);
        this.easServiceName = builder.easServiceName;
        this.isSidecarPolicy = builder.isSidecarPolicy;
        this.isSupportContentSafe = builder.isSupportContentSafe;
        this.isSupportPromptAttack = builder.isSupportPromptAttack;
        this.isSupportSensitiveTopic = builder.isSupportSensitiveTopic;
        this.modelSource = builder.modelSource;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return easServiceName
     */
    public String getEasServiceName() {
        return this.easServiceName;
    }

    /**
     * @return isSidecarPolicy
     */
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
    }

    /**
     * @return isSupportContentSafe
     */
    public Integer getIsSupportContentSafe() {
        return this.isSupportContentSafe;
    }

    /**
     * @return isSupportPromptAttack
     */
    public Integer getIsSupportPromptAttack() {
        return this.isSupportPromptAttack;
    }

    /**
     * @return isSupportSensitiveTopic
     */
    public Integer getIsSupportSensitiveTopic() {
        return this.isSupportSensitiveTopic;
    }

    /**
     * @return modelSource
     */
    public String getModelSource() {
        return this.modelSource;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListModelInstanceRequest, Builder> {
        private String easServiceName; 
        private Integer isSidecarPolicy; 
        private Integer isSupportContentSafe; 
        private Integer isSupportPromptAttack; 
        private Integer isSupportSensitiveTopic; 
        private String modelSource; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String sortBy; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListModelInstanceRequest request) {
            super(request);
            this.easServiceName = request.easServiceName;
            this.isSidecarPolicy = request.isSidecarPolicy;
            this.isSupportContentSafe = request.isSupportContentSafe;
            this.isSupportPromptAttack = request.isSupportPromptAttack;
            this.isSupportSensitiveTopic = request.isSupportSensitiveTopic;
            this.modelSource = request.modelSource;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * EasServiceName.
         */
        public Builder easServiceName(String easServiceName) {
            this.putQueryParameter("EasServiceName", easServiceName);
            this.easServiceName = easServiceName;
            return this;
        }

        /**
         * IsSidecarPolicy.
         */
        public Builder isSidecarPolicy(Integer isSidecarPolicy) {
            this.putQueryParameter("IsSidecarPolicy", isSidecarPolicy);
            this.isSidecarPolicy = isSidecarPolicy;
            return this;
        }

        /**
         * IsSupportContentSafe.
         */
        public Builder isSupportContentSafe(Integer isSupportContentSafe) {
            this.putQueryParameter("IsSupportContentSafe", isSupportContentSafe);
            this.isSupportContentSafe = isSupportContentSafe;
            return this;
        }

        /**
         * IsSupportPromptAttack.
         */
        public Builder isSupportPromptAttack(Integer isSupportPromptAttack) {
            this.putQueryParameter("IsSupportPromptAttack", isSupportPromptAttack);
            this.isSupportPromptAttack = isSupportPromptAttack;
            return this;
        }

        /**
         * IsSupportSensitiveTopic.
         */
        public Builder isSupportSensitiveTopic(Integer isSupportSensitiveTopic) {
            this.putQueryParameter("IsSupportSensitiveTopic", isSupportSensitiveTopic);
            this.isSupportSensitiveTopic = isSupportSensitiveTopic;
            return this;
        }

        /**
         * ModelSource.
         */
        public Builder modelSource(String modelSource) {
            this.putQueryParameter("ModelSource", modelSource);
            this.modelSource = modelSource;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListModelInstanceRequest build() {
            return new ListModelInstanceRequest(this);
        } 

    } 

}
