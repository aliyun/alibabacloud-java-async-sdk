// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemWorkFlowStatusRequest} extends {@link RequestModel}
 *
 * <p>ListWorkItemWorkFlowStatusRequest</p>
 */
public class ListWorkItemWorkFlowStatusRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Query
    @NameInMap("spaceType")
    @Validation(required = true)
    private String spaceType;

    @Query
    @NameInMap("workitemCategoryIdentifier")
    @Validation(required = true)
    private String workitemCategoryIdentifier;

    @Query
    @NameInMap("workitemTypeIdentifier")
    private String workitemTypeIdentifier;

    private ListWorkItemWorkFlowStatusRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.spaceType = builder.spaceType;
        this.workitemCategoryIdentifier = builder.workitemCategoryIdentifier;
        this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemWorkFlowStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return spaceIdentifier
     */
    public String getSpaceIdentifier() {
        return this.spaceIdentifier;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    /**
     * @return workitemCategoryIdentifier
     */
    public String getWorkitemCategoryIdentifier() {
        return this.workitemCategoryIdentifier;
    }

    /**
     * @return workitemTypeIdentifier
     */
    public String getWorkitemTypeIdentifier() {
        return this.workitemTypeIdentifier;
    }

    public static final class Builder extends Request.Builder<ListWorkItemWorkFlowStatusRequest, Builder> {
        private String organizationId; 
        private String spaceIdentifier; 
        private String spaceType; 
        private String workitemCategoryIdentifier; 
        private String workitemTypeIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkItemWorkFlowStatusRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.spaceIdentifier = request.spaceIdentifier;
            this.spaceType = request.spaceType;
            this.workitemCategoryIdentifier = request.workitemCategoryIdentifier;
            this.workitemTypeIdentifier = request.workitemTypeIdentifier;
        } 

        /**
         * 企业标识，也称企业id
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 项目id
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * 空间类型
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * 工作项大类型
         */
        public Builder workitemCategoryIdentifier(String workitemCategoryIdentifier) {
            this.putQueryParameter("workitemCategoryIdentifier", workitemCategoryIdentifier);
            this.workitemCategoryIdentifier = workitemCategoryIdentifier;
            return this;
        }

        /**
         * 工作项小类型id
         */
        public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
            this.putQueryParameter("workitemTypeIdentifier", workitemTypeIdentifier);
            this.workitemTypeIdentifier = workitemTypeIdentifier;
            return this;
        }

        @Override
        public ListWorkItemWorkFlowStatusRequest build() {
            return new ListWorkItemWorkFlowStatusRequest(this);
        } 

    } 

}
