// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListWorkItemWorkFlowStatusRequest} extends {@link RequestModel}
 *
 * <p>ListWorkItemWorkFlowStatusRequest</p>
 */
public class ListWorkItemWorkFlowStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spaceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workitemCategoryIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workitemCategoryIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workitemTypeIdentifier")
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>例：5e70xxxxxxcd000xxxxe96</p>
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putQueryParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Project</p>
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Req</p>
         */
        public Builder workitemCategoryIdentifier(String workitemCategoryIdentifier) {
            this.putQueryParameter("workitemCategoryIdentifier", workitemCategoryIdentifier);
            this.workitemCategoryIdentifier = workitemCategoryIdentifier;
            return this;
        }

        /**
         * workitemTypeIdentifier.
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
