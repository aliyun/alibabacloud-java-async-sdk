// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link QueryRedemptionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRedemptionRecordsResponseBody</p>
 */
public class QueryRedemptionRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("retryAble")
    private Boolean retryAble;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private QueryRedemptionRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.retryAble = builder.retryAble;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRedemptionRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return retryAble
     */
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private Boolean retryAble; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryRedemptionRecordsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.retryAble = model.retryAble;
            this.success = model.success;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * retryAble.
         */
        public Builder retryAble(Boolean retryAble) {
            this.retryAble = retryAble;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRedemptionRecordsResponseBody build() {
            return new QueryRedemptionRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryRedemptionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRedemptionRecordsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("allowedModels")
        private java.util.List<String> allowedModels;

        @com.aliyun.core.annotation.NameInMap("effectiveAt")
        private String effectiveAt;

        @com.aliyun.core.annotation.NameInMap("expireAt")
        private String expireAt;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("keyHash")
        private String keyHash;

        @com.aliyun.core.annotation.NameInMap("outBizNo")
        private String outBizNo;

        @com.aliyun.core.annotation.NameInMap("quotaBalance")
        private Long quotaBalance;

        @com.aliyun.core.annotation.NameInMap("quotaStatus")
        private String quotaStatus;

        @com.aliyun.core.annotation.NameInMap("redemptionOrderNo")
        private String redemptionOrderNo;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("tenantId")
        private Long tenantId;

        private Items(Builder builder) {
            this.allowedModels = builder.allowedModels;
            this.effectiveAt = builder.effectiveAt;
            this.expireAt = builder.expireAt;
            this.gmtCreate = builder.gmtCreate;
            this.id = builder.id;
            this.keyHash = builder.keyHash;
            this.outBizNo = builder.outBizNo;
            this.quotaBalance = builder.quotaBalance;
            this.quotaStatus = builder.quotaStatus;
            this.redemptionOrderNo = builder.redemptionOrderNo;
            this.status = builder.status;
            this.templateId = builder.templateId;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return allowedModels
         */
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        /**
         * @return effectiveAt
         */
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        /**
         * @return expireAt
         */
        public String getExpireAt() {
            return this.expireAt;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return keyHash
         */
        public String getKeyHash() {
            return this.keyHash;
        }

        /**
         * @return outBizNo
         */
        public String getOutBizNo() {
            return this.outBizNo;
        }

        /**
         * @return quotaBalance
         */
        public Long getQuotaBalance() {
            return this.quotaBalance;
        }

        /**
         * @return quotaStatus
         */
        public String getQuotaStatus() {
            return this.quotaStatus;
        }

        /**
         * @return redemptionOrderNo
         */
        public String getRedemptionOrderNo() {
            return this.redemptionOrderNo;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private java.util.List<String> allowedModels; 
            private String effectiveAt; 
            private String expireAt; 
            private String gmtCreate; 
            private Long id; 
            private String keyHash; 
            private String outBizNo; 
            private Long quotaBalance; 
            private String quotaStatus; 
            private String redemptionOrderNo; 
            private String status; 
            private Long templateId; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.allowedModels = model.allowedModels;
                this.effectiveAt = model.effectiveAt;
                this.expireAt = model.expireAt;
                this.gmtCreate = model.gmtCreate;
                this.id = model.id;
                this.keyHash = model.keyHash;
                this.outBizNo = model.outBizNo;
                this.quotaBalance = model.quotaBalance;
                this.quotaStatus = model.quotaStatus;
                this.redemptionOrderNo = model.redemptionOrderNo;
                this.status = model.status;
                this.templateId = model.templateId;
                this.tenantId = model.tenantId;
            } 

            /**
             * allowedModels.
             */
            public Builder allowedModels(java.util.List<String> allowedModels) {
                this.allowedModels = allowedModels;
                return this;
            }

            /**
             * effectiveAt.
             */
            public Builder effectiveAt(String effectiveAt) {
                this.effectiveAt = effectiveAt;
                return this;
            }

            /**
             * expireAt.
             */
            public Builder expireAt(String expireAt) {
                this.expireAt = expireAt;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * keyHash.
             */
            public Builder keyHash(String keyHash) {
                this.keyHash = keyHash;
                return this;
            }

            /**
             * outBizNo.
             */
            public Builder outBizNo(String outBizNo) {
                this.outBizNo = outBizNo;
                return this;
            }

            /**
             * quotaBalance.
             */
            public Builder quotaBalance(Long quotaBalance) {
                this.quotaBalance = quotaBalance;
                return this;
            }

            /**
             * quotaStatus.
             */
            public Builder quotaStatus(String quotaStatus) {
                this.quotaStatus = quotaStatus;
                return this;
            }

            /**
             * redemptionOrderNo.
             */
            public Builder redemptionOrderNo(String redemptionOrderNo) {
                this.redemptionOrderNo = redemptionOrderNo;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * tenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryRedemptionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryRedemptionRecordsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total")
        private Long total;

        @com.aliyun.core.annotation.NameInMap("totalPages")
        private Integer totalPages;

        private Data(Builder builder) {
            this.items = builder.items;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
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
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Integer page; 
            private Integer pageSize; 
            private Long total; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.items = model.items;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.total = model.total;
                this.totalPages = model.totalPages;
            } 

            /**
             * items.
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            /**
             * totalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
