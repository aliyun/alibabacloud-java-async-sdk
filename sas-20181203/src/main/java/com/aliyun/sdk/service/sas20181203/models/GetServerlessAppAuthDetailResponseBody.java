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
 * {@link GetServerlessAppAuthDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetServerlessAppAuthDetailResponseBody</p>
 */
public class GetServerlessAppAuthDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetServerlessAppAuthDetailResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServerlessAppAuthDetailResponseBody create() {
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

        public GetServerlessAppAuthDetailResponseBody build() {
            return new GetServerlessAppAuthDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServerlessAppAuthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetServerlessAppAuthDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CoreCount")
        private Integer coreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("IsBind")
        private Boolean isBind;

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

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.coreCount = builder.coreCount;
            this.instanceCount = builder.instanceCount;
            this.isBind = builder.isBind;
            this.isPostPaid = builder.isPostPaid;
            this.isServerlessPostPaidValid = builder.isServerlessPostPaidValid;
            this.postPaidModuleSwitch = builder.postPaidModuleSwitch;
            this.postPaidOpenTime = builder.postPaidOpenTime;
            this.postPaidStatus = builder.postPaidStatus;
            this.postpaidInstanceId = builder.postpaidInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return coreCount
         */
        public Integer getCoreCount() {
            return this.coreCount;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return isBind
         */
        public Boolean getIsBind() {
            return this.isBind;
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

        public static final class Builder {
            private String appId; 
            private Integer coreCount; 
            private Integer instanceCount; 
            private Boolean isBind; 
            private Boolean isPostPaid; 
            private Boolean isServerlessPostPaidValid; 
            private String postPaidModuleSwitch; 
            private Long postPaidOpenTime; 
            private Integer postPaidStatus; 
            private String postpaidInstanceId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CoreCount.
             */
            public Builder coreCount(Integer coreCount) {
                this.coreCount = coreCount;
                return this;
            }

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * IsBind.
             */
            public Builder isBind(Boolean isBind) {
                this.isBind = isBind;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
