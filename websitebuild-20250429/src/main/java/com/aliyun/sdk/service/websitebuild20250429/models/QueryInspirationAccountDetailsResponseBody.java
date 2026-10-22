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
 * {@link QueryInspirationAccountDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInspirationAccountDetailsResponseBody</p>
 */
public class QueryInspirationAccountDetailsResponseBody extends TeaModel {
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

    private QueryInspirationAccountDetailsResponseBody(Builder builder) {
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

    public static QueryInspirationAccountDetailsResponseBody create() {
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

        private Builder(QueryInspirationAccountDetailsResponseBody model) {
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
         * <p>The details of the permission verification failure.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Specifies whether to allow retries. Valid values:</p>
         * <ul>
         * <li>false: Retries are not allowed.</li>
         * <li>true: Retries are allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the application to query.</p>
         * 
         * <strong>example:</strong>
         * <p>or</p>
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
         * <p>The dynamic message.</p>
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
         * <p>The response data.</p>
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
         * <p>System error</p>
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

        public QueryInspirationAccountDetailsResponseBody build() {
            return new QueryInspirationAccountDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInspirationAccountDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInspirationAccountDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcquisitionTime")
        private String acquisitionTime;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private Long balance;

        @com.aliyun.core.annotation.NameInMap("BalanceStr")
        private String balanceStr;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("InitQuota")
        private Long initQuota;

        @com.aliyun.core.annotation.NameInMap("InitQuotaStr")
        private String initQuotaStr;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SourceTypeName")
        private String sourceTypeName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.acquisitionTime = builder.acquisitionTime;
            this.balance = builder.balance;
            this.balanceStr = builder.balanceStr;
            this.endDate = builder.endDate;
            this.expired = builder.expired;
            this.initQuota = builder.initQuota;
            this.initQuotaStr = builder.initQuotaStr;
            this.sourceType = builder.sourceType;
            this.sourceTypeName = builder.sourceTypeName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return acquisitionTime
         */
        public String getAcquisitionTime() {
            return this.acquisitionTime;
        }

        /**
         * @return balance
         */
        public Long getBalance() {
            return this.balance;
        }

        /**
         * @return balanceStr
         */
        public String getBalanceStr() {
            return this.balanceStr;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return initQuota
         */
        public Long getInitQuota() {
            return this.initQuota;
        }

        /**
         * @return initQuotaStr
         */
        public String getInitQuotaStr() {
            return this.initQuotaStr;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceTypeName
         */
        public String getSourceTypeName() {
            return this.sourceTypeName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String acquisitionTime; 
            private Long balance; 
            private String balanceStr; 
            private String endDate; 
            private Boolean expired; 
            private Long initQuota; 
            private String initQuotaStr; 
            private String sourceType; 
            private String sourceTypeName; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.acquisitionTime = model.acquisitionTime;
                this.balance = model.balance;
                this.balanceStr = model.balanceStr;
                this.endDate = model.endDate;
                this.expired = model.expired;
                this.initQuota = model.initQuota;
                this.initQuotaStr = model.initQuotaStr;
                this.sourceType = model.sourceType;
                this.sourceTypeName = model.sourceTypeName;
                this.status = model.status;
            } 

            /**
             * <p>The acquisition time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-03 12:00:00</p>
             */
            public Builder acquisitionTime(String acquisitionTime) {
                this.acquisitionTime = acquisitionTime;
                return this;
            }

            /**
             * <p>The balance, calculated by subtracting the used amount from the initial quota.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder balance(Long balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>The exact balance. The value is a string to support the display of decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder balanceStr(String balanceStr) {
                this.balanceStr = balanceStr;
                return this;
            }

            /**
             * <p>The expiration time of the validity period. The time is in the YYYY-MM-DD HH:mm:ss Z format, where Z represents the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-04-11 10:26:27 +0800</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>Indicates whether the quota has expired. A quota is expired if the expiration time is earlier than the current time. The frontend displays expired quotas in gray based on this value.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The acquired amount, which is the initial quota.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder initQuota(Long initQuota) {
                this.initQuota = initQuota;
                return this;
            }

            /**
             * <p>The exact acquired amount. The value is a string to support the display of decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder initQuotaStr(String initQuotaStr) {
                this.initQuotaStr = initQuotaStr;
                return this;
            }

            /**
             * <p>The source type code, such as FREE_TRIAL_GIFT, INSTANCE_GIFT, UPGRADE_GRANT, or PURCHASED.</p>
             * 
             * <strong>example:</strong>
             * <p>MARKET_CLOUD_DREAM</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The Chinese name of the source type.</p>
             * 
             * <strong>example:</strong>
             * <p>FREE_TRIAL_GIFT</p>
             */
            public Builder sourceTypeName(String sourceTypeName) {
                this.sourceTypeName = sourceTypeName;
                return this;
            }

            /**
             * <p>The status of the inspiration point account.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
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
    /**
     * 
     * {@link QueryInspirationAccountDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInspirationAccountDetailsResponseBody</p>
     */
    public static class Next extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcquisitionTime")
        private String acquisitionTime;

        @com.aliyun.core.annotation.NameInMap("Balance")
        private Long balance;

        @com.aliyun.core.annotation.NameInMap("BalanceStr")
        private String balanceStr;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("InitQuota")
        private Long initQuota;

        @com.aliyun.core.annotation.NameInMap("InitQuotaStr")
        private String initQuotaStr;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("SourceTypeName")
        private String sourceTypeName;

        private Next(Builder builder) {
            this.acquisitionTime = builder.acquisitionTime;
            this.balance = builder.balance;
            this.balanceStr = builder.balanceStr;
            this.endDate = builder.endDate;
            this.expired = builder.expired;
            this.initQuota = builder.initQuota;
            this.initQuotaStr = builder.initQuotaStr;
            this.sourceType = builder.sourceType;
            this.sourceTypeName = builder.sourceTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Next create() {
            return builder().build();
        }

        /**
         * @return acquisitionTime
         */
        public String getAcquisitionTime() {
            return this.acquisitionTime;
        }

        /**
         * @return balance
         */
        public Long getBalance() {
            return this.balance;
        }

        /**
         * @return balanceStr
         */
        public String getBalanceStr() {
            return this.balanceStr;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return initQuota
         */
        public Long getInitQuota() {
            return this.initQuota;
        }

        /**
         * @return initQuotaStr
         */
        public String getInitQuotaStr() {
            return this.initQuotaStr;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return sourceTypeName
         */
        public String getSourceTypeName() {
            return this.sourceTypeName;
        }

        public static final class Builder {
            private String acquisitionTime; 
            private Long balance; 
            private String balanceStr; 
            private String endDate; 
            private Boolean expired; 
            private Long initQuota; 
            private String initQuotaStr; 
            private String sourceType; 
            private String sourceTypeName; 

            private Builder() {
            } 

            private Builder(Next model) {
                this.acquisitionTime = model.acquisitionTime;
                this.balance = model.balance;
                this.balanceStr = model.balanceStr;
                this.endDate = model.endDate;
                this.expired = model.expired;
                this.initQuota = model.initQuota;
                this.initQuotaStr = model.initQuotaStr;
                this.sourceType = model.sourceType;
                this.sourceTypeName = model.sourceTypeName;
            } 

            /**
             * <p>The acquisition time. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-03 12:00:00</p>
             */
            public Builder acquisitionTime(String acquisitionTime) {
                this.acquisitionTime = acquisitionTime;
                return this;
            }

            /**
             * <p>The balance, calculated by subtracting the used amount from the initial quota.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder balance(Long balance) {
                this.balance = balance;
                return this;
            }

            /**
             * <p>The exact balance. The value is a string to support the display of decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder balanceStr(String balanceStr) {
                this.balanceStr = balanceStr;
                return this;
            }

            /**
             * <p>The expiration time of the validity period. The time is in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-25 10:11:25</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>Indicates whether the quota has expired. A quota is expired if the expiration time is earlier than the current time. The frontend displays expired quotas in gray based on this value.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The acquired amount, which is the initial quota.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder initQuota(Long initQuota) {
                this.initQuota = initQuota;
                return this;
            }

            /**
             * <p>The exact acquired amount. The value is a string to support the display of decimal places.</p>
             * 
             * <strong>example:</strong>
             * <p>123123</p>
             */
            public Builder initQuotaStr(String initQuotaStr) {
                this.initQuotaStr = initQuotaStr;
                return this;
            }

            /**
             * <p>The source type code, such as FREE_TRIAL_GIFT, INSTANCE_GIFT, UPGRADE_GRANT, or PURCHASED.</p>
             * 
             * <strong>example:</strong>
             * <p>MARKET_CLOUD_DREAM</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The Chinese name of the source type.</p>
             * 
             * <strong>example:</strong>
             * <p>FREE_TRIAL_GIFT</p>
             */
            public Builder sourceTypeName(String sourceTypeName) {
                this.sourceTypeName = sourceTypeName;
                return this;
            }

            public Next build() {
                return new Next(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryInspirationAccountDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInspirationAccountDetailsResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPageNum")
        private Integer currentPageNum;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("Next")
        private Next next;

        @com.aliyun.core.annotation.NameInMap("NextPage")
        private Boolean nextPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PrePage")
        private Boolean prePage;

        @com.aliyun.core.annotation.NameInMap("ResultLimit")
        private Boolean resultLimit;

        @com.aliyun.core.annotation.NameInMap("TotalItemNum")
        private Integer totalItemNum;

        @com.aliyun.core.annotation.NameInMap("TotalPageNum")
        private Integer totalPageNum;

        private Module(Builder builder) {
            this.currentPageNum = builder.currentPageNum;
            this.data = builder.data;
            this.next = builder.next;
            this.nextPage = builder.nextPage;
            this.pageSize = builder.pageSize;
            this.prePage = builder.prePage;
            this.resultLimit = builder.resultLimit;
            this.totalItemNum = builder.totalItemNum;
            this.totalPageNum = builder.totalPageNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPageNum
         */
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return next
         */
        public Next getNext() {
            return this.next;
        }

        /**
         * @return nextPage
         */
        public Boolean getNextPage() {
            return this.nextPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return prePage
         */
        public Boolean getPrePage() {
            return this.prePage;
        }

        /**
         * @return resultLimit
         */
        public Boolean getResultLimit() {
            return this.resultLimit;
        }

        /**
         * @return totalItemNum
         */
        public Integer getTotalItemNum() {
            return this.totalItemNum;
        }

        /**
         * @return totalPageNum
         */
        public Integer getTotalPageNum() {
            return this.totalPageNum;
        }

        public static final class Builder {
            private Integer currentPageNum; 
            private java.util.List<Data> data; 
            private Next next; 
            private Boolean nextPage; 
            private Integer pageSize; 
            private Boolean prePage; 
            private Boolean resultLimit; 
            private Integer totalItemNum; 
            private Integer totalPageNum; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currentPageNum = model.currentPageNum;
                this.data = model.data;
                this.next = model.next;
                this.nextPage = model.nextPage;
                this.pageSize = model.pageSize;
                this.prePage = model.prePage;
                this.resultLimit = model.resultLimit;
                this.totalItemNum = model.totalItemNum;
                this.totalPageNum = model.totalPageNum;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder currentPageNum(Integer currentPageNum) {
                this.currentPageNum = currentPageNum;
                return this;
            }

            /**
             * <p>The request results.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The decision weight.</p>
             */
            public Builder next(Next next) {
                this.next = next;
                return this;
            }

            /**
             * <p>Indicates whether a next page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder nextPage(Boolean nextPage) {
                this.nextPage = nextPage;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Indicates whether a previous page exists.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder prePage(Boolean prePage) {
                this.prePage = prePage;
                return this;
            }

            /**
             * <p>In addition to the pagination limit, the server processes a maximum of the latest 1,000 records for the current query. If the number of results exceeds 1,000, <strong>ResultLimit</strong> is <strong>true</strong>. In this case, narrow the time range and search again. Otherwise, <strong>ResultLimit</strong> is <strong>false</strong>.</p>
             */
            public Builder resultLimit(Boolean resultLimit) {
                this.resultLimit = resultLimit;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalItemNum(Integer totalItemNum) {
                this.totalItemNum = totalItemNum;
                return this;
            }

            /**
             * <p>The total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalPageNum(Integer totalPageNum) {
                this.totalPageNum = totalPageNum;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
