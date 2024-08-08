// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MemberAccountDetailPageQueryRequest} extends {@link RequestModel}
 *
 * <p>MemberAccountDetailPageQueryRequest</p>
 */
public class MemberAccountDetailPageQueryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("body")
    private MemberAccountDetailPageQueryRequestBody body;

    private MemberAccountDetailPageQueryRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MemberAccountDetailPageQueryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MemberAccountDetailPageQueryRequestBody getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<MemberAccountDetailPageQueryRequest, Builder> {
        private MemberAccountDetailPageQueryRequestBody body; 

        private Builder() {
            super();
        } 

        private Builder(MemberAccountDetailPageQueryRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(MemberAccountDetailPageQueryRequestBody body) {
            String bodyShrink = shrink(body, "body", "json");
            this.putQueryParameter("body", bodyShrink);
            this.body = body;
            return this;
        }

        @Override
        public MemberAccountDetailPageQueryRequest build() {
            return new MemberAccountDetailPageQueryRequest(this);
        } 

    } 

    public static class MemberAccountDetailPageQueryRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer accountType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OuterMemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String outerMemberId;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PlatFormType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platFormType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MemberAccountDetailPageQueryRequestBody(Builder builder) {
            this.accountType = builder.accountType;
            this.endTime = builder.endTime;
            this.openMerchantId = builder.openMerchantId;
            this.outerMemberId = builder.outerMemberId;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.platFormType = builder.platFormType;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberAccountDetailPageQueryRequestBody create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public Integer getAccountType() {
            return this.accountType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return platFormType
         */
        public String getPlatFormType() {
            return this.platFormType;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Integer accountType; 
            private String endTime; 
            private String openMerchantId; 
            private String outerMemberId; 
            private Integer page; 
            private Integer pageSize; 
            private String platFormType; 
            private String startTime; 

            /**
             * AccountType.
             */
            public Builder accountType(Integer accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PlatFormType.
             */
            public Builder platFormType(String platFormType) {
                this.platFormType = platFormType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MemberAccountDetailPageQueryRequestBody build() {
                return new MemberAccountDetailPageQueryRequestBody(this);
            } 

        } 

    }
}
