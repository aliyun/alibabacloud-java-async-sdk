// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneApiRequest} extends {@link RequestModel}
 *
 * <p>CloneApiRequest</p>
 */
public class CloneApiRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Query
    @NameInMap("newConnectionId")
    @Validation(required = true)
    private Long newConnectionId;

    @Query
    @NameInMap("newOrgId")
    private String newOrgId;

    @Query
    @NameInMap("newRegionId")
    private Long newRegionId;

    @Query
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    private CloneApiRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.newConnectionId = builder.newConnectionId;
        this.newOrgId = builder.newOrgId;
        this.newRegionId = builder.newRegionId;
        this.pipelineId = builder.pipelineId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneApiRequest create() {
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
     * @return newConnectionId
     */
    public Long getNewConnectionId() {
        return this.newConnectionId;
    }

    /**
     * @return newOrgId
     */
    public String getNewOrgId() {
        return this.newOrgId;
    }

    /**
     * @return newRegionId
     */
    public Long getNewRegionId() {
        return this.newRegionId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    public static final class Builder extends Request.Builder<CloneApiRequest, Builder> {
        private String organizationId; 
        private Long newConnectionId; 
        private String newOrgId; 
        private Long newRegionId; 
        private Long pipelineId; 

        private Builder() {
            super();
        } 

        private Builder(CloneApiRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.newConnectionId = request.newConnectionId;
            this.newOrgId = request.newOrgId;
            this.newRegionId = request.newRegionId;
            this.pipelineId = request.pipelineId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如  https:// devops.aliyun.com/organization/【OrgId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 流水线运行实例id
         */
        public Builder newConnectionId(Long newConnectionId) {
            this.putQueryParameter("newConnectionId", newConnectionId);
            this.newConnectionId = newConnectionId;
            return this;
        }

        /**
         * newOrgId.
         */
        public Builder newOrgId(String newOrgId) {
            this.putQueryParameter("newOrgId", newOrgId);
            this.newOrgId = newOrgId;
            return this;
        }

        /**
         * newRegionId.
         */
        public Builder newRegionId(Long newRegionId) {
            this.putQueryParameter("newRegionId", newRegionId);
            this.newRegionId = newRegionId;
            return this;
        }

        /**
         * 流水线id
         */
        public Builder pipelineId(Long pipelineId) {
            this.putQueryParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        @Override
        public CloneApiRequest build() {
            return new CloneApiRequest(this);
        } 

    } 

}
