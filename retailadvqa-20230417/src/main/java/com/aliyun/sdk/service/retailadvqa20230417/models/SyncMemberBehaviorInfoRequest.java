// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncMemberBehaviorInfoRequest} extends {@link RequestModel}
 *
 * <p>SyncMemberBehaviorInfoRequest</p>
 */
public class SyncMemberBehaviorInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private SyncMemberBehaviorInfoRequestBody body;

    private SyncMemberBehaviorInfoRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncMemberBehaviorInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public SyncMemberBehaviorInfoRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<SyncMemberBehaviorInfoRequest, Builder> {
        private SyncMemberBehaviorInfoRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(SyncMemberBehaviorInfoRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(SyncMemberBehaviorInfoRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public SyncMemberBehaviorInfoRequest build() {
            return new SyncMemberBehaviorInfoRequest(this);
        } 

    } 

    public static class SyncMemberBehaviorInfoRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionDuration")
        private String actionDuration;

        @com.aliyun.core.annotation.NameInMap("ActionEndDate")
        private String actionEndDate;

        @com.aliyun.core.annotation.NameInMap("ActionResult")
        private Boolean actionResult;

        @com.aliyun.core.annotation.NameInMap("ActionStartDate")
        private String actionStartDate;

        @com.aliyun.core.annotation.NameInMap("ActionSubType")
        private String actionSubType;

        @com.aliyun.core.annotation.NameInMap("ActionType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("Extra")
        private String extra;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("PlatFormType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platFormType;

        private SyncMemberBehaviorInfoRequestBody(Builder builder) {
            this.actionDuration = builder.actionDuration;
            this.actionEndDate = builder.actionEndDate;
            this.actionResult = builder.actionResult;
            this.actionStartDate = builder.actionStartDate;
            this.actionSubType = builder.actionSubType;
            this.actionType = builder.actionType;
            this.extra = builder.extra;
            this.openMerchantId = builder.openMerchantId;
            this.outerMemberId = builder.outerMemberId;
            this.platFormType = builder.platFormType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncMemberBehaviorInfoRequestBody create() {
            return builder().build();
        }

        /**
         * @return actionDuration
         */
        public String getActionDuration() {
            return this.actionDuration;
        }

        /**
         * @return actionEndDate
         */
        public String getActionEndDate() {
            return this.actionEndDate;
        }

        /**
         * @return actionResult
         */
        public Boolean getActionResult() {
            return this.actionResult;
        }

        /**
         * @return actionStartDate
         */
        public String getActionStartDate() {
            return this.actionStartDate;
        }

        /**
         * @return actionSubType
         */
        public String getActionSubType() {
            return this.actionSubType;
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return extra
         */
        public String getExtra() {
            return this.extra;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return outerMemberId
         */
        public String getOuterMemberId() {
            return this.outerMemberId;
        }

        /**
         * @return platFormType
         */
        public String getPlatFormType() {
            return this.platFormType;
        }

        public static final class Builder {
            private String actionDuration; 
            private String actionEndDate; 
            private Boolean actionResult; 
            private String actionStartDate; 
            private String actionSubType; 
            private String actionType; 
            private String extra; 
            private String openMerchantId; 
            private String outerMemberId; 
            private String platFormType; 

            /**
             * ActionDuration.
             */
            public Builder actionDuration(String actionDuration) {
                this.actionDuration = actionDuration;
                return this;
            }

            /**
             * ActionEndDate.
             */
            public Builder actionEndDate(String actionEndDate) {
                this.actionEndDate = actionEndDate;
                return this;
            }

            /**
             * ActionResult.
             */
            public Builder actionResult(Boolean actionResult) {
                this.actionResult = actionResult;
                return this;
            }

            /**
             * ActionStartDate.
             */
            public Builder actionStartDate(String actionStartDate) {
                this.actionStartDate = actionStartDate;
                return this;
            }

            /**
             * ActionSubType.
             */
            public Builder actionSubType(String actionSubType) {
                this.actionSubType = actionSubType;
                return this;
            }

            /**
             * ActionType.
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * Extra.
             */
            public Builder extra(String extra) {
                this.extra = extra;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OuterMemberId.
             */
            public Builder outerMemberId(String outerMemberId) {
                this.outerMemberId = outerMemberId;
                return this;
            }

            /**
             * PlatFormType.
             */
            public Builder platFormType(String platFormType) {
                this.platFormType = platFormType;
                return this;
            }

            public SyncMemberBehaviorInfoRequestBody build() {
                return new SyncMemberBehaviorInfoRequestBody(this);
            } 

        } 

    }
}
