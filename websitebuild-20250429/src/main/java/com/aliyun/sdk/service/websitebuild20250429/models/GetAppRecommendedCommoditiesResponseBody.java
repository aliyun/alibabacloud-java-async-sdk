// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppRecommendedCommoditiesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppRecommendedCommoditiesResponseBody</p>
 */
public class GetAppRecommendedCommoditiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private GetAppRecommendedCommoditiesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.module = builder.module;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppRecommendedCommoditiesResponseBody create() {
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
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Module module; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(GetAppRecommendedCommoditiesResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.module = model.module;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * <p>The detailed reason why access is denied.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-b</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message, which is used to replace <code>%s</code> in the error message returned by <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p>If <strong>ErrMessage</strong> returns <strong>The Value of Input Parameter %s is not valid</strong> and <strong>DynamicMessage</strong> returns <strong>DtsJobId</strong>, it indicates that the request parameter <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM_ERROR</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The returned error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The data table module.</p>
         * <ul>
         * <li><p>ABTest: experiment data table</p>
         * </li>
         * <li><p>ExperimentTool: experiment tool table</p>
         * </li>
         * <li><p>DataDiagnosis: data diagnosis</p>
         * </li>
         * </ul>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>Indicates whether the request is processed synchronously.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public GetAppRecommendedCommoditiesResponseBody build() {
            return new GetAppRecommendedCommoditiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAppRecommendedCommoditiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppRecommendedCommoditiesResponseBody</p>
     */
    public static class Commodities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionType")
        private String actionType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Extend")
        private java.util.Map<String, String> extend;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("PromotionCommodityId")
        private String promotionCommodityId;

        @com.aliyun.core.annotation.NameInMap("RecommendType")
        private String recommendType;

        @com.aliyun.core.annotation.NameInMap("RedirectUrl")
        private String redirectUrl;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Commodities(Builder builder) {
            this.actionType = builder.actionType;
            this.commodityCode = builder.commodityCode;
            this.description = builder.description;
            this.extend = builder.extend;
            this.orderType = builder.orderType;
            this.priority = builder.priority;
            this.promotionCommodityId = builder.promotionCommodityId;
            this.recommendType = builder.recommendType;
            this.redirectUrl = builder.redirectUrl;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodities create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extend
         */
        public java.util.Map<String, String> getExtend() {
            return this.extend;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return promotionCommodityId
         */
        public String getPromotionCommodityId() {
            return this.promotionCommodityId;
        }

        /**
         * @return recommendType
         */
        public String getRecommendType() {
            return this.recommendType;
        }

        /**
         * @return redirectUrl
         */
        public String getRedirectUrl() {
            return this.redirectUrl;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String actionType; 
            private String commodityCode; 
            private String description; 
            private java.util.Map<String, String> extend; 
            private String orderType; 
            private Integer priority; 
            private String promotionCommodityId; 
            private String recommendType; 
            private String redirectUrl; 
            private String status; 
            private String title; 

            private Builder() {
            } 

            private Builder(Commodities model) {
                this.actionType = model.actionType;
                this.commodityCode = model.commodityCode;
                this.description = model.description;
                this.extend = model.extend;
                this.orderType = model.orderType;
                this.priority = model.priority;
                this.promotionCommodityId = model.promotionCommodityId;
                this.recommendType = model.recommendType;
                this.redirectUrl = model.redirectUrl;
                this.status = model.status;
                this.title = model.title;
            } 

            /**
             * <p>The click action type. Valid values: CONSULT (add WeCom), BUY (purchase), and AUTO (automatic issuance).</p>
             * 
             * <strong>example:</strong>
             * <p>CONSULT</p>
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * <p>The commodity code. This parameter applies to both resource plans and marketing commodities.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The display description of the recommendation.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extended fields, such as unsupportedReason.</p>
             */
            public Builder extend(java.util.Map<String, String> extend) {
                this.extend = extend;
                return this;
            }

            /**
             * <p>The order type. Valid values: BUY (purchase) and UPGRADE (upgrade).</p>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The sort priority. A smaller value indicates a higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the marketing commodity. This parameter is returned only for new purchases.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder promotionCommodityId(String promotionCommodityId) {
                this.promotionCommodityId = promotionCommodityId;
                return this;
            }

            /**
             * <p>The recommendation type. Valid values: COMMODITY (commodity recommendation) and ACTIVITY (promotion activity recommendation).</p>
             * 
             * <strong>example:</strong>
             * <p>COMMODITY</p>
             */
            public Builder recommendType(String recommendType) {
                this.recommendType = recommendType;
                return this;
            }

            /**
             * <p>The redirect URL. This parameter is returned when a redirect is required in scenarios such as upgrades.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ecs-workbench-disposable.aliyun.com/account/disposable/login/sst/1291612921555690/edvo2gevfh">https://ecs-workbench-disposable.aliyun.com/account/disposable/login/sst/1291612921555690/edvo2gevfh</a></p>
             */
            public Builder redirectUrl(String redirectUrl) {
                this.redirectUrl = redirectUrl;
                return this;
            }

            /**
             * <p>The status of the commodity.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The display title of the recommendation.</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Commodities build() {
                return new Commodities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAppRecommendedCommoditiesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAppRecommendedCommoditiesResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commodities")
        private java.util.List<Commodities> commodities;

        private Module(Builder builder) {
            this.commodities = builder.commodities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return commodities
         */
        public java.util.List<Commodities> getCommodities() {
            return this.commodities;
        }

        public static final class Builder {
            private java.util.List<Commodities> commodities; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.commodities = model.commodities;
            } 

            /**
             * <p>The list of marketing commodities.</p>
             */
            public Builder commodities(java.util.List<Commodities> commodities) {
                this.commodities = commodities;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
