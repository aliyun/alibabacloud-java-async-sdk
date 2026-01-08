// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListMessageCampaignResponseBody} extends {@link TeaModel}
 *
 * <p>ListMessageCampaignResponseBody</p>
 */
public class ListMessageCampaignResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private ListMessageCampaignResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageCampaignResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListMessageCampaignResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListMessageCampaignResponseBody build() {
            return new ListMessageCampaignResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMessageCampaignResponseBody} extends {@link TeaModel}
     *
     * <p>ListMessageCampaignResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdAccountId")
        private String adAccountId;

        @com.aliyun.core.annotation.NameInMap("Budget")
        private Long budget;

        @com.aliyun.core.annotation.NameInMap("BudgetType")
        private String budgetType;

        @com.aliyun.core.annotation.NameInMap("CampaignId")
        private String campaignId;

        @com.aliyun.core.annotation.NameInMap("CampaignName")
        private String campaignName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("PageId")
        private String pageId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.adAccountId = builder.adAccountId;
            this.budget = builder.budget;
            this.budgetType = builder.budgetType;
            this.campaignId = builder.campaignId;
            this.campaignName = builder.campaignName;
            this.createTime = builder.createTime;
            this.pageId = builder.pageId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return adAccountId
         */
        public String getAdAccountId() {
            return this.adAccountId;
        }

        /**
         * @return budget
         */
        public Long getBudget() {
            return this.budget;
        }

        /**
         * @return budgetType
         */
        public String getBudgetType() {
            return this.budgetType;
        }

        /**
         * @return campaignId
         */
        public String getCampaignId() {
            return this.campaignId;
        }

        /**
         * @return campaignName
         */
        public String getCampaignName() {
            return this.campaignName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return pageId
         */
        public String getPageId() {
            return this.pageId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String adAccountId; 
            private Long budget; 
            private String budgetType; 
            private String campaignId; 
            private String campaignName; 
            private Long createTime; 
            private String pageId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.adAccountId = model.adAccountId;
                this.budget = model.budget;
                this.budgetType = model.budgetType;
                this.campaignId = model.campaignId;
                this.campaignName = model.campaignName;
                this.createTime = model.createTime;
                this.pageId = model.pageId;
                this.status = model.status;
            } 

            /**
             * AdAccountId.
             */
            public Builder adAccountId(String adAccountId) {
                this.adAccountId = adAccountId;
                return this;
            }

            /**
             * Budget.
             */
            public Builder budget(Long budget) {
                this.budget = budget;
                return this;
            }

            /**
             * BudgetType.
             */
            public Builder budgetType(String budgetType) {
                this.budgetType = budgetType;
                return this;
            }

            /**
             * CampaignId.
             */
            public Builder campaignId(String campaignId) {
                this.campaignId = campaignId;
                return this;
            }

            /**
             * CampaignName.
             */
            public Builder campaignName(String campaignName) {
                this.campaignName = campaignName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * PageId.
             */
            public Builder pageId(String pageId) {
                this.pageId = pageId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
