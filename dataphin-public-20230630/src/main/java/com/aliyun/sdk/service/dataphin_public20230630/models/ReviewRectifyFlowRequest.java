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
 * {@link ReviewRectifyFlowRequest} extends {@link RequestModel}
 *
 * <p>ReviewRectifyFlowRequest</p>
 */
public class ReviewRectifyFlowRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReviewCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ReviewCommand reviewCommand;

    private ReviewRectifyFlowRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.reviewCommand = builder.reviewCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReviewRectifyFlowRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return reviewCommand
     */
    public ReviewCommand getReviewCommand() {
        return this.reviewCommand;
    }

    public static final class Builder extends Request.Builder<ReviewRectifyFlowRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private ReviewCommand reviewCommand; 

        private Builder() {
            super();
        } 

        private Builder(ReviewRectifyFlowRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.reviewCommand = request.reviewCommand;
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
         * <p>The tenant ID.</p>
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
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The business request parameters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder reviewCommand(ReviewCommand reviewCommand) {
            String reviewCommandShrink = shrink(reviewCommand, "ReviewCommand", "json");
            this.putBodyParameter("ReviewCommand", reviewCommandShrink);
            this.reviewCommand = reviewCommand;
            return this;
        }

        @Override
        public ReviewRectifyFlowRequest build() {
            return new ReviewRectifyFlowRequest(this);
        } 

    } 

    /**
     * 
     * {@link ReviewRectifyFlowRequest} extends {@link TeaModel}
     *
     * <p>ReviewRectifyFlowRequest</p>
     */
    public static class ReviewCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rectifyId;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reviewResult;

        private ReviewCommand(Builder builder) {
            this.comment = builder.comment;
            this.rectifyId = builder.rectifyId;
            this.reviewResult = builder.reviewResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewCommand create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return rectifyId
         */
        public Long getRectifyId() {
            return this.rectifyId;
        }

        /**
         * @return reviewResult
         */
        public String getReviewResult() {
            return this.reviewResult;
        }

        public static final class Builder {
            private String comment; 
            private Long rectifyId; 
            private String reviewResult; 

            private Builder() {
            } 

            private Builder(ReviewCommand model) {
                this.comment = model.comment;
                this.rectifyId = model.rectifyId;
                this.reviewResult = model.reviewResult;
            } 

            /**
             * <p>The acceptance description. This parameter is optional and can contain up to 128 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the rectification process. This operation is allowed only when the process is pending acceptance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>616543434760</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * <p>The acceptance result. Valid values: PASSED and REJECTED.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder reviewResult(String reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            public ReviewCommand build() {
                return new ReviewCommand(this);
            } 

        } 

    }
}
