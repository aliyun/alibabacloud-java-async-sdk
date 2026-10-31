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
 * {@link SubmitRectifyFlowForReviewRequest} extends {@link RequestModel}
 *
 * <p>SubmitRectifyFlowForReviewRequest</p>
 */
public class SubmitRectifyFlowForReviewRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SubmitCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SubmitCommand submitCommand;

    private SubmitRectifyFlowForReviewRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.submitCommand = builder.submitCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitRectifyFlowForReviewRequest create() {
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
     * @return submitCommand
     */
    public SubmitCommand getSubmitCommand() {
        return this.submitCommand;
    }

    public static final class Builder extends Request.Builder<SubmitRectifyFlowForReviewRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private SubmitCommand submitCommand; 

        private Builder() {
            super();
        } 

        private Builder(SubmitRectifyFlowForReviewRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.submitCommand = request.submitCommand;
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
         * <p>The operator user ID.</p>
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
        public Builder submitCommand(SubmitCommand submitCommand) {
            String submitCommandShrink = shrink(submitCommand, "SubmitCommand", "json");
            this.putBodyParameter("SubmitCommand", submitCommandShrink);
            this.submitCommand = submitCommand;
            return this;
        }

        @Override
        public SubmitRectifyFlowForReviewRequest build() {
            return new SubmitRectifyFlowForReviewRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitRectifyFlowForReviewRequest} extends {@link TeaModel}
     *
     * <p>SubmitRectifyFlowForReviewRequest</p>
     */
    public static class SubmitCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String comment;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rectifyId;

        private SubmitCommand(Builder builder) {
            this.comment = builder.comment;
            this.rectifyId = builder.rectifyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitCommand create() {
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

        public static final class Builder {
            private String comment; 
            private Long rectifyId; 

            private Builder() {
            } 

            private Builder(SubmitCommand model) {
                this.comment = model.comment;
                this.rectifyId = model.rectifyId;
            } 

            /**
             * <p>The description of the rectification result. This parameter is required and can be up to 128 characters in length.</p>
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
             * <p>The ID of the rectification process. Submission is allowed only when the process is in the rectifying or re-rectifying state.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>358710058950</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            public SubmitCommand build() {
                return new SubmitCommand(this);
            } 

        } 

    }
}
