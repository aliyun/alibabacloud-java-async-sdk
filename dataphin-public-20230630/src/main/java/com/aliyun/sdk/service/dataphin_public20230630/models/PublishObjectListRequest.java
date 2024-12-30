// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link PublishObjectListRequest} extends {@link RequestModel}
 *
 * <p>PublishObjectListRequest</p>
 */
public class PublishObjectListRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PublishCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private PublishCommand publishCommand;

    private PublishObjectListRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.publishCommand = builder.publishCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishObjectListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return publishCommand
     */
    public PublishCommand getPublishCommand() {
        return this.publishCommand;
    }

    public static final class Builder extends Request.Builder<PublishObjectListRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private PublishCommand publishCommand; 

        private Builder() {
            super();
        } 

        private Builder(PublishObjectListRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.publishCommand = request.publishCommand;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder publishCommand(PublishCommand publishCommand) {
            String publishCommandShrink = shrink(publishCommand, "PublishCommand", "json");
            this.putBodyParameter("PublishCommand", publishCommandShrink);
            this.publishCommand = publishCommand;
            return this;
        }

        @Override
        public PublishObjectListRequest build() {
            return new PublishObjectListRequest(this);
        } 

    } 

    /**
     * 
     * {@link PublishObjectListRequest} extends {@link TeaModel}
     *
     * <p>PublishObjectListRequest</p>
     */
    public static class PublishCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SubmitIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> submitIdList;

        private PublishCommand(Builder builder) {
            this.comment = builder.comment;
            this.projectId = builder.projectId;
            this.submitIdList = builder.submitIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishCommand create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return submitIdList
         */
        public java.util.List<Long> getSubmitIdList() {
            return this.submitIdList;
        }

        public static final class Builder {
            private String comment; 
            private Long projectId; 
            private java.util.List<Long> submitIdList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>发布</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder submitIdList(java.util.List<Long> submitIdList) {
                this.submitIdList = submitIdList;
                return this;
            }

            public PublishCommand build() {
                return new PublishCommand(this);
            } 

        } 

    }
}
