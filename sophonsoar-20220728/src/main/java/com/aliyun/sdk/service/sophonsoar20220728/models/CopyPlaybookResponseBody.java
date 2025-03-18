// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link CopyPlaybookResponseBody} extends {@link TeaModel}
 *
 * <p>CopyPlaybookResponseBody</p>
 */
public class CopyPlaybookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Page")
    private Page page;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CopyPlaybookResponseBody(Builder builder) {
        this.data = builder.data;
        this.page = builder.page;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyPlaybookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return page
     */
    public Page getPage() {
        return this.page;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private Page page; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CopyPlaybookResponseBody model) {
            this.data = model.data;
            this.page = model.page;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Page page) {
            this.page = page;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CopyPlaybookResponseBody build() {
            return new CopyPlaybookResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CopyPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>CopyPlaybookResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Active")
        private Integer active;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FailNum")
        private Integer failNum;

        @com.aliyun.core.annotation.NameInMap("FailRate")
        private Double failRate;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("HistoryMd5")
        private Integer historyMd5;

        @com.aliyun.core.annotation.NameInMap("InputParams")
        private String inputParams;

        @com.aliyun.core.annotation.NameInMap("LastRuntime")
        private Long lastRuntime;

        @com.aliyun.core.annotation.NameInMap("LogicReleaseTaskflowMd5")
        private String logicReleaseTaskflowMd5;

        @com.aliyun.core.annotation.NameInMap("OutputParams")
        private String outputParams;

        @com.aliyun.core.annotation.NameInMap("OwnType")
        private String ownType;

        @com.aliyun.core.annotation.NameInMap("Permission")
        private Integer permission;

        @com.aliyun.core.annotation.NameInMap("PlaybookStatus")
        private Integer playbookStatus;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("SuccNum")
        private Integer succNum;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private String tenantId;

        private Data(Builder builder) {
            this.active = builder.active;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.failNum = builder.failNum;
            this.failRate = builder.failRate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.historyMd5 = builder.historyMd5;
            this.inputParams = builder.inputParams;
            this.lastRuntime = builder.lastRuntime;
            this.logicReleaseTaskflowMd5 = builder.logicReleaseTaskflowMd5;
            this.outputParams = builder.outputParams;
            this.ownType = builder.ownType;
            this.permission = builder.permission;
            this.playbookStatus = builder.playbookStatus;
            this.playbookUuid = builder.playbookUuid;
            this.succNum = builder.succNum;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Integer getActive() {
            return this.active;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return failNum
         */
        public Integer getFailNum() {
            return this.failNum;
        }

        /**
         * @return failRate
         */
        public Double getFailRate() {
            return this.failRate;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return historyMd5
         */
        public Integer getHistoryMd5() {
            return this.historyMd5;
        }

        /**
         * @return inputParams
         */
        public String getInputParams() {
            return this.inputParams;
        }

        /**
         * @return lastRuntime
         */
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        /**
         * @return logicReleaseTaskflowMd5
         */
        public String getLogicReleaseTaskflowMd5() {
            return this.logicReleaseTaskflowMd5;
        }

        /**
         * @return outputParams
         */
        public String getOutputParams() {
            return this.outputParams;
        }

        /**
         * @return ownType
         */
        public String getOwnType() {
            return this.ownType;
        }

        /**
         * @return permission
         */
        public Integer getPermission() {
            return this.permission;
        }

        /**
         * @return playbookStatus
         */
        public Integer getPlaybookStatus() {
            return this.playbookStatus;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return succNum
         */
        public Integer getSuccNum() {
            return this.succNum;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private Integer active; 
            private String description; 
            private String displayName; 
            private Integer failNum; 
            private Double failRate; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer historyMd5; 
            private String inputParams; 
            private Long lastRuntime; 
            private String logicReleaseTaskflowMd5; 
            private String outputParams; 
            private String ownType; 
            private Integer permission; 
            private Integer playbookStatus; 
            private String playbookUuid; 
            private Integer succNum; 
            private String tenantId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.active = model.active;
                this.description = model.description;
                this.displayName = model.displayName;
                this.failNum = model.failNum;
                this.failRate = model.failRate;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.historyMd5 = model.historyMd5;
                this.inputParams = model.inputParams;
                this.lastRuntime = model.lastRuntime;
                this.logicReleaseTaskflowMd5 = model.logicReleaseTaskflowMd5;
                this.outputParams = model.outputParams;
                this.ownType = model.ownType;
                this.permission = model.permission;
                this.playbookStatus = model.playbookStatus;
                this.playbookUuid = model.playbookUuid;
                this.succNum = model.succNum;
                this.tenantId = model.tenantId;
            } 

            /**
             * Active.
             */
            public Builder active(Integer active) {
                this.active = active;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * FailNum.
             */
            public Builder failNum(Integer failNum) {
                this.failNum = failNum;
                return this;
            }

            /**
             * FailRate.
             */
            public Builder failRate(Double failRate) {
                this.failRate = failRate;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * HistoryMd5.
             */
            public Builder historyMd5(Integer historyMd5) {
                this.historyMd5 = historyMd5;
                return this;
            }

            /**
             * InputParams.
             */
            public Builder inputParams(String inputParams) {
                this.inputParams = inputParams;
                return this;
            }

            /**
             * LastRuntime.
             */
            public Builder lastRuntime(Long lastRuntime) {
                this.lastRuntime = lastRuntime;
                return this;
            }

            /**
             * LogicReleaseTaskflowMd5.
             */
            public Builder logicReleaseTaskflowMd5(String logicReleaseTaskflowMd5) {
                this.logicReleaseTaskflowMd5 = logicReleaseTaskflowMd5;
                return this;
            }

            /**
             * OutputParams.
             */
            public Builder outputParams(String outputParams) {
                this.outputParams = outputParams;
                return this;
            }

            /**
             * OwnType.
             */
            public Builder ownType(String ownType) {
                this.ownType = ownType;
                return this;
            }

            /**
             * Permission.
             */
            public Builder permission(Integer permission) {
                this.permission = permission;
                return this;
            }

            /**
             * PlaybookStatus.
             */
            public Builder playbookStatus(Integer playbookStatus) {
                this.playbookStatus = playbookStatus;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * SuccNum.
             */
            public Builder succNum(Integer succNum) {
                this.succNum = succNum;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link CopyPlaybookResponseBody} extends {@link TeaModel}
     *
     * <p>CopyPlaybookResponseBody</p>
     */
    public static class Page extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Page(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Page create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Page model) {
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Page build() {
                return new Page(this);
            } 

        } 

    }
}
