// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yunjian20211217.models;

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
 * {@link GetUrgentDemandPlanDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetUrgentDemandPlanDetailResponseBody</p>
 */
public class GetUrgentDemandPlanDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private GetUrgentDemandPlanDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUrgentDemandPlanDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private Boolean success; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(GetUrgentDemandPlanDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>body</p>
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
         * <p>success</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>traceId</p>
         * 
         * <strong>example:</strong>
         * <p>1e2b798516402440016572132e1459</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public GetUrgentDemandPlanDetailResponseBody build() {
            return new GetUrgentDemandPlanDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUrgentDemandPlanDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetUrgentDemandPlanDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountDept")
        private String accountDept;

        @com.aliyun.core.annotation.NameInMap("accountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("accountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("approvalUrl")
        private String approvalUrl;

        @com.aliyun.core.annotation.NameInMap("bpmSubstate")
        private java.util.Map<String, ?> bpmSubstate;

        @com.aliyun.core.annotation.NameInMap("commodityTypeCodeList")
        private java.util.List<String> commodityTypeCodeList;

        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("creatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("detailType")
        private String detailType;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("modifierName")
        private String modifierName;

        @com.aliyun.core.annotation.NameInMap("planId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("planName")
        private String planName;

        @com.aliyun.core.annotation.NameInMap("status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("yunzhiProductName")
        private String yunzhiProductName;

        private Data(Builder builder) {
            this.accountDept = builder.accountDept;
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.approvalUrl = builder.approvalUrl;
            this.bpmSubstate = builder.bpmSubstate;
            this.commodityTypeCodeList = builder.commodityTypeCodeList;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.description = builder.description;
            this.detailType = builder.detailType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.modifier = builder.modifier;
            this.modifierName = builder.modifierName;
            this.planId = builder.planId;
            this.planName = builder.planName;
            this.status = builder.status;
            this.yunzhiProductName = builder.yunzhiProductName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountDept
         */
        public String getAccountDept() {
            return this.accountDept;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return approvalUrl
         */
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        /**
         * @return bpmSubstate
         */
        public java.util.Map<String, ?> getBpmSubstate() {
            return this.bpmSubstate;
        }

        /**
         * @return commodityTypeCodeList
         */
        public java.util.List<String> getCommodityTypeCodeList() {
            return this.commodityTypeCodeList;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detailType
         */
        public String getDetailType() {
            return this.detailType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return modifierName
         */
        public String getModifierName() {
            return this.modifierName;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return planName
         */
        public String getPlanName() {
            return this.planName;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return yunzhiProductName
         */
        public String getYunzhiProductName() {
            return this.yunzhiProductName;
        }

        public static final class Builder {
            private String accountDept; 
            private String accountId; 
            private String accountName; 
            private String approvalUrl; 
            private java.util.Map<String, ?> bpmSubstate; 
            private java.util.List<String> commodityTypeCodeList; 
            private String creator; 
            private String creatorName; 
            private String description; 
            private String detailType; 
            private String gmtCreate; 
            private String gmtModified; 
            private String modifier; 
            private String modifierName; 
            private Long planId; 
            private String planName; 
            private Long status; 
            private String yunzhiProductName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountDept = model.accountDept;
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.approvalUrl = model.approvalUrl;
                this.bpmSubstate = model.bpmSubstate;
                this.commodityTypeCodeList = model.commodityTypeCodeList;
                this.creator = model.creator;
                this.creatorName = model.creatorName;
                this.description = model.description;
                this.detailType = model.detailType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.modifier = model.modifier;
                this.modifierName = model.modifierName;
                this.planId = model.planId;
                this.planName = model.planName;
                this.status = model.status;
                this.yunzhiProductName = model.yunzhiProductName;
            } 

            /**
             * accountDept.
             */
            public Builder accountDept(String accountDept) {
                this.accountDept = accountDept;
                return this;
            }

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * accountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * approvalUrl.
             */
            public Builder approvalUrl(String approvalUrl) {
                this.approvalUrl = approvalUrl;
                return this;
            }

            /**
             * bpmSubstate.
             */
            public Builder bpmSubstate(java.util.Map<String, ?> bpmSubstate) {
                this.bpmSubstate = bpmSubstate;
                return this;
            }

            /**
             * commodityTypeCodeList.
             */
            public Builder commodityTypeCodeList(java.util.List<String> commodityTypeCodeList) {
                this.commodityTypeCodeList = commodityTypeCodeList;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * creatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * detailType.
             */
            public Builder detailType(String detailType) {
                this.detailType = detailType;
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
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * modifierName.
             */
            public Builder modifierName(String modifierName) {
                this.modifierName = modifierName;
                return this;
            }

            /**
             * planId.
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * planName.
             */
            public Builder planName(String planName) {
                this.planName = planName;
                return this;
            }

            /**
             * status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * yunzhiProductName.
             */
            public Builder yunzhiProductName(String yunzhiProductName) {
                this.yunzhiProductName = yunzhiProductName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
