// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSasModuleTrialResponseBody} extends {@link TeaModel}
 *
 * <p>AddSasModuleTrialResponseBody</p>
 */
public class AddSasModuleTrialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AddSasModuleTrialResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSasModuleTrialResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddSasModuleTrialResponseBody build() {
            return new AddSasModuleTrialResponseBody(this);
        } 

    } 

    public static class TrialRecordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthLimit")
        private Long authLimit;

        @com.aliyun.core.annotation.NameInMap("AuthLimitList")
        private String authLimitList;

        @com.aliyun.core.annotation.NameInMap("GmtEnd")
        private Long gmtEnd;

        @com.aliyun.core.annotation.NameInMap("GmtStart")
        private Long gmtStart;

        @com.aliyun.core.annotation.NameInMap("ModuleCode")
        private String moduleCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private TrialRecordList(Builder builder) {
            this.authLimit = builder.authLimit;
            this.authLimitList = builder.authLimitList;
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.moduleCode = builder.moduleCode;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialRecordList create() {
            return builder().build();
        }

        /**
         * @return authLimit
         */
        public Long getAuthLimit() {
            return this.authLimit;
        }

        /**
         * @return authLimitList
         */
        public String getAuthLimitList() {
            return this.authLimitList;
        }

        /**
         * @return gmtEnd
         */
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return moduleCode
         */
        public String getModuleCode() {
            return this.moduleCode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long authLimit; 
            private String authLimitList; 
            private Long gmtEnd; 
            private Long gmtStart; 
            private String moduleCode; 
            private Integer status; 

            /**
             * The purchased quota.
             */
            public Builder authLimit(Long authLimit) {
                this.authLimit = authLimit;
                return this;
            }

            /**
             * List of purchased quotas.
             */
            public Builder authLimitList(String authLimitList) {
                this.authLimitList = authLimitList;
                return this;
            }

            /**
             * The end time of the trial use.
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * The start time of the trial use.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * The code of the module. Valid values:
             * <p>
             * 
             * *   **vulFix**: vulnerability fixing
             * *   **cloudSiem**: threat analysis
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * The status of the trial use. Valid values:
             * <p>
             * 
             * *   **1**: enabled
             * *   **0**: finished
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public TrialRecordList build() {
                return new TrialRecordList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrialRecordList")
        private java.util.List < TrialRecordList> trialRecordList;

        private Data(Builder builder) {
            this.trialRecordList = builder.trialRecordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return trialRecordList
         */
        public java.util.List < TrialRecordList> getTrialRecordList() {
            return this.trialRecordList;
        }

        public static final class Builder {
            private java.util.List < TrialRecordList> trialRecordList; 

            /**
             * The information about the trial use.
             */
            public Builder trialRecordList(java.util.List < TrialRecordList> trialRecordList) {
                this.trialRecordList = trialRecordList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
