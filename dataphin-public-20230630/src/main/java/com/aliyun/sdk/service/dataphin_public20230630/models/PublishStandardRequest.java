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
 * {@link PublishStandardRequest} extends {@link RequestModel}
 *
 * <p>PublishStandardRequest</p>
 */
public class PublishStandardRequest extends Request {
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

    private PublishStandardRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.publishCommand = builder.publishCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishStandardRequest create() {
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

    public static final class Builder extends Request.Builder<PublishStandardRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private PublishCommand publishCommand; 

        private Builder() {
            super();
        } 

        private Builder(PublishStandardRequest request) {
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
        public PublishStandardRequest build() {
            return new PublishStandardRequest(this);
        } 

    } 

    /**
     * 
     * {@link PublishStandardRequest} extends {@link TeaModel}
     *
     * <p>PublishStandardRequest</p>
     */
    public static class PublishCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPublishAfterApproval")
        private Boolean autoPublishAfterApproval;

        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ReviewerIdList")
        private java.util.List<String> reviewerIdList;

        @com.aliyun.core.annotation.NameInMap("StandardStage")
        private String standardStage;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private PublishCommand(Builder builder) {
            this.autoPublishAfterApproval = builder.autoPublishAfterApproval;
            this.comment = builder.comment;
            this.id = builder.id;
            this.reviewerIdList = builder.reviewerIdList;
            this.standardStage = builder.standardStage;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishCommand create() {
            return builder().build();
        }

        /**
         * @return autoPublishAfterApproval
         */
        public Boolean getAutoPublishAfterApproval() {
            return this.autoPublishAfterApproval;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return reviewerIdList
         */
        public java.util.List<String> getReviewerIdList() {
            return this.reviewerIdList;
        }

        /**
         * @return standardStage
         */
        public String getStandardStage() {
            return this.standardStage;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean autoPublishAfterApproval; 
            private String comment; 
            private Long id; 
            private java.util.List<String> reviewerIdList; 
            private String standardStage; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(PublishCommand model) {
                this.autoPublishAfterApproval = model.autoPublishAfterApproval;
                this.comment = model.comment;
                this.id = model.id;
                this.reviewerIdList = model.reviewerIdList;
                this.standardStage = model.standardStage;
                this.version = model.version;
            } 

            /**
             * AutoPublishAfterApproval.
             */
            public Builder autoPublishAfterApproval(Boolean autoPublishAfterApproval) {
                this.autoPublishAfterApproval = autoPublishAfterApproval;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ReviewerIdList.
             */
            public Builder reviewerIdList(java.util.List<String> reviewerIdList) {
                this.reviewerIdList = reviewerIdList;
                return this;
            }

            /**
             * StandardStage.
             */
            public Builder standardStage(String standardStage) {
                this.standardStage = standardStage;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public PublishCommand build() {
                return new PublishCommand(this);
            } 

        } 

    }
}
