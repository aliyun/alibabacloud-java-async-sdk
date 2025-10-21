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
 * {@link ListPolicyRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyRequest</p>
 */
public class ListPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsSidecarPolicy")
    private Integer isSidecarPolicy;

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
    @com.aliyun.core.annotation.NameInMap("PolicyIdentifier")
    private String policyIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private Integer sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private ListPolicyRequest(Builder builder) {
        super(builder);
        this.isSidecarPolicy = builder.isSidecarPolicy;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyIdentifier = builder.policyIdentifier;
        this.policyName = builder.policyName;
        this.regionId = builder.regionId;
        this.sceneType = builder.sceneType;
        this.sortBy = builder.sortBy;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isSidecarPolicy
     */
    public Integer getIsSidecarPolicy() {
        return this.isSidecarPolicy;
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
     * @return policyIdentifier
     */
    public String getPolicyIdentifier() {
        return this.policyIdentifier;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sceneType
     */
    public Integer getSceneType() {
        return this.sceneType;
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

    public static final class Builder extends Request.Builder<ListPolicyRequest, Builder> {
        private Integer isSidecarPolicy; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyIdentifier; 
        private String policyName; 
        private String regionId; 
        private Integer sceneType; 
        private String sortBy; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyRequest request) {
            super(request);
            this.isSidecarPolicy = request.isSidecarPolicy;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyIdentifier = request.policyIdentifier;
            this.policyName = request.policyName;
            this.regionId = request.regionId;
            this.sceneType = request.sceneType;
            this.sortBy = request.sortBy;
            this.workspaceId = request.workspaceId;
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
         * <p>Sort order. The value range is as follows:</p>
         * <ul>
         * <li><p>asc (default): ascending</p>
         * </li>
         * <li><p>desc: descending</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>Page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>Page size, the maximum number of results returned per page.
         * Maximum limit: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Policy identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>x1bc5xgs4uhx</p>
         */
        public Builder policyIdentifier(String policyIdentifier) {
            this.putQueryParameter("PolicyIdentifier", policyIdentifier);
            this.policyIdentifier = policyIdentifier;
            return this;
        }

        /**
         * <p>Detection policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>testPolicy</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SceneType.
         */
        public Builder sceneType(Integer sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * <p>Sort field.</p>
         * 
         * <strong>example:</strong>
         * <p>GmtModified</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>62****</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListPolicyRequest build() {
            return new ListPolicyRequest(this);
        } 

    } 

}
