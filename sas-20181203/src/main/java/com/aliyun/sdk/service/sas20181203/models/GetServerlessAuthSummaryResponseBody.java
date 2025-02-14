// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetServerlessAuthSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetServerlessAuthSummaryResponseBody</p>
 */
public class GetServerlessAuthSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServerlessAuthSummaryResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServerlessAuthSummaryResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public GetServerlessAuthSummaryResponseBody build() {
            return new GetServerlessAuthSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServerlessAuthSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerlessAuthSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoBind")
        private Integer autoBind;

        @com.aliyun.core.annotation.NameInMap("HasPreBindSetting")
        private Boolean hasPreBindSetting;

        @com.aliyun.core.annotation.NameInMap("IsPostPaid")
        private Boolean isPostPaid;

        @com.aliyun.core.annotation.NameInMap("IsServerlessPostPaidValid")
        private Boolean isServerlessPostPaidValid;

        @com.aliyun.core.annotation.NameInMap("PostPaidModuleSwitch")
        private String postPaidModuleSwitch;

        @com.aliyun.core.annotation.NameInMap("PostPaidOpenTime")
        private Long postPaidOpenTime;

        @com.aliyun.core.annotation.NameInMap("PostPaidStatus")
        private Integer postPaidStatus;

        @com.aliyun.core.annotation.NameInMap("PostpaidInstanceId")
        private String postpaidInstanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("TotalBindAppCount")
        private Integer totalBindAppCount;

        @com.aliyun.core.annotation.NameInMap("TotalBindCoreCount")
        private Integer totalBindCoreCount;

        @com.aliyun.core.annotation.NameInMap("TotalBindInstanceCount")
        private Integer totalBindInstanceCount;

        @com.aliyun.core.annotation.NameInMap("TotalUnBindAppCount")
        private Integer totalUnBindAppCount;

        @com.aliyun.core.annotation.NameInMap("TotalUnBindCoreCount")
        private Integer totalUnBindCoreCount;

        @com.aliyun.core.annotation.NameInMap("TotalUnBindInstanceCount")
        private Integer totalUnBindInstanceCount;

        private Data(Builder builder) {
            this.autoBind = builder.autoBind;
            this.hasPreBindSetting = builder.hasPreBindSetting;
            this.isPostPaid = builder.isPostPaid;
            this.isServerlessPostPaidValid = builder.isServerlessPostPaidValid;
            this.postPaidModuleSwitch = builder.postPaidModuleSwitch;
            this.postPaidOpenTime = builder.postPaidOpenTime;
            this.postPaidStatus = builder.postPaidStatus;
            this.postpaidInstanceId = builder.postpaidInstanceId;
            this.regionId = builder.regionId;
            this.totalBindAppCount = builder.totalBindAppCount;
            this.totalBindCoreCount = builder.totalBindCoreCount;
            this.totalBindInstanceCount = builder.totalBindInstanceCount;
            this.totalUnBindAppCount = builder.totalUnBindAppCount;
            this.totalUnBindCoreCount = builder.totalUnBindCoreCount;
            this.totalUnBindInstanceCount = builder.totalUnBindInstanceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return autoBind
         */
        public Integer getAutoBind() {
            return this.autoBind;
        }

        /**
         * @return hasPreBindSetting
         */
        public Boolean getHasPreBindSetting() {
            return this.hasPreBindSetting;
        }

        /**
         * @return isPostPaid
         */
        public Boolean getIsPostPaid() {
            return this.isPostPaid;
        }

        /**
         * @return isServerlessPostPaidValid
         */
        public Boolean getIsServerlessPostPaidValid() {
            return this.isServerlessPostPaidValid;
        }

        /**
         * @return postPaidModuleSwitch
         */
        public String getPostPaidModuleSwitch() {
            return this.postPaidModuleSwitch;
        }

        /**
         * @return postPaidOpenTime
         */
        public Long getPostPaidOpenTime() {
            return this.postPaidOpenTime;
        }

        /**
         * @return postPaidStatus
         */
        public Integer getPostPaidStatus() {
            return this.postPaidStatus;
        }

        /**
         * @return postpaidInstanceId
         */
        public String getPostpaidInstanceId() {
            return this.postpaidInstanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return totalBindAppCount
         */
        public Integer getTotalBindAppCount() {
            return this.totalBindAppCount;
        }

        /**
         * @return totalBindCoreCount
         */
        public Integer getTotalBindCoreCount() {
            return this.totalBindCoreCount;
        }

        /**
         * @return totalBindInstanceCount
         */
        public Integer getTotalBindInstanceCount() {
            return this.totalBindInstanceCount;
        }

        /**
         * @return totalUnBindAppCount
         */
        public Integer getTotalUnBindAppCount() {
            return this.totalUnBindAppCount;
        }

        /**
         * @return totalUnBindCoreCount
         */
        public Integer getTotalUnBindCoreCount() {
            return this.totalUnBindCoreCount;
        }

        /**
         * @return totalUnBindInstanceCount
         */
        public Integer getTotalUnBindInstanceCount() {
            return this.totalUnBindInstanceCount;
        }

        public static final class Builder {
            private Integer autoBind; 
            private Boolean hasPreBindSetting; 
            private Boolean isPostPaid; 
            private Boolean isServerlessPostPaidValid; 
            private String postPaidModuleSwitch; 
            private Long postPaidOpenTime; 
            private Integer postPaidStatus; 
            private String postpaidInstanceId; 
            private String regionId; 
            private Integer totalBindAppCount; 
            private Integer totalBindCoreCount; 
            private Integer totalBindInstanceCount; 
            private Integer totalUnBindAppCount; 
            private Integer totalUnBindCoreCount; 
            private Integer totalUnBindInstanceCount; 

            /**
             * AutoBind.
             */
            public Builder autoBind(Integer autoBind) {
                this.autoBind = autoBind;
                return this;
            }

            /**
             * HasPreBindSetting.
             */
            public Builder hasPreBindSetting(Boolean hasPreBindSetting) {
                this.hasPreBindSetting = hasPreBindSetting;
                return this;
            }

            /**
             * IsPostPaid.
             */
            public Builder isPostPaid(Boolean isPostPaid) {
                this.isPostPaid = isPostPaid;
                return this;
            }

            /**
             * IsServerlessPostPaidValid.
             */
            public Builder isServerlessPostPaidValid(Boolean isServerlessPostPaidValid) {
                this.isServerlessPostPaidValid = isServerlessPostPaidValid;
                return this;
            }

            /**
             * PostPaidModuleSwitch.
             */
            public Builder postPaidModuleSwitch(String postPaidModuleSwitch) {
                this.postPaidModuleSwitch = postPaidModuleSwitch;
                return this;
            }

            /**
             * PostPaidOpenTime.
             */
            public Builder postPaidOpenTime(Long postPaidOpenTime) {
                this.postPaidOpenTime = postPaidOpenTime;
                return this;
            }

            /**
             * PostPaidStatus.
             */
            public Builder postPaidStatus(Integer postPaidStatus) {
                this.postPaidStatus = postPaidStatus;
                return this;
            }

            /**
             * PostpaidInstanceId.
             */
            public Builder postpaidInstanceId(String postpaidInstanceId) {
                this.postpaidInstanceId = postpaidInstanceId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * TotalBindAppCount.
             */
            public Builder totalBindAppCount(Integer totalBindAppCount) {
                this.totalBindAppCount = totalBindAppCount;
                return this;
            }

            /**
             * TotalBindCoreCount.
             */
            public Builder totalBindCoreCount(Integer totalBindCoreCount) {
                this.totalBindCoreCount = totalBindCoreCount;
                return this;
            }

            /**
             * TotalBindInstanceCount.
             */
            public Builder totalBindInstanceCount(Integer totalBindInstanceCount) {
                this.totalBindInstanceCount = totalBindInstanceCount;
                return this;
            }

            /**
             * TotalUnBindAppCount.
             */
            public Builder totalUnBindAppCount(Integer totalUnBindAppCount) {
                this.totalUnBindAppCount = totalUnBindAppCount;
                return this;
            }

            /**
             * TotalUnBindCoreCount.
             */
            public Builder totalUnBindCoreCount(Integer totalUnBindCoreCount) {
                this.totalUnBindCoreCount = totalUnBindCoreCount;
                return this;
            }

            /**
             * TotalUnBindInstanceCount.
             */
            public Builder totalUnBindInstanceCount(Integer totalUnBindInstanceCount) {
                this.totalUnBindInstanceCount = totalUnBindInstanceCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
