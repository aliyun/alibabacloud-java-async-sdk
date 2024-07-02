// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFileRequest} extends {@link RequestModel}
 *
 * <p>AddFileRequest</p>
 */
public class AddFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LeaseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String leaseId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parser")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parser;

    private AddFileRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.categoryId = builder.categoryId;
        this.leaseId = builder.leaseId;
        this.parser = builder.parser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return leaseId
     */
    public String getLeaseId() {
        return this.leaseId;
    }

    /**
     * @return parser
     */
    public String getParser() {
        return this.parser;
    }

    public static final class Builder extends Request.Builder<AddFileRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String categoryId; 
        private String leaseId; 
        private String parser; 

        private Builder() {
            super();
        } 

        private Builder(AddFileRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.categoryId = request.categoryId;
            this.leaseId = request.leaseId;
            this.parser = request.parser;
        } 

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * LeaseId.
         */
        public Builder leaseId(String leaseId) {
            this.putBodyParameter("LeaseId", leaseId);
            this.leaseId = leaseId;
            return this;
        }

        /**
         * Parser.
         */
        public Builder parser(String parser) {
            this.putBodyParameter("Parser", parser);
            this.parser = parser;
            return this;
        }

        @Override
        public AddFileRequest build() {
            return new AddFileRequest(this);
        } 

    } 

}
