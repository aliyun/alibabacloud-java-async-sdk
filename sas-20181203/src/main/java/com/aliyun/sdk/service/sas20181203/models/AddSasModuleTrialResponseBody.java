// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddSasModuleTrialResponseBody} extends {@link TeaModel}
 *
 * <p>AddSasModuleTrialResponseBody</p>
 */
public class AddSasModuleTrialResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

        public AddSasModuleTrialResponseBody build() {
            return new AddSasModuleTrialResponseBody(this);
        } 

    } 

    public static class TrialRecordList extends TeaModel {
        @NameInMap("AuthLimit")
        private Long authLimit;

        @NameInMap("GmtEnd")
        private Long gmtEnd;

        @NameInMap("GmtStart")
        private Long gmtStart;

        @NameInMap("ModuleCode")
        private String moduleCode;

        @NameInMap("Status")
        private Integer status;

        private TrialRecordList(Builder builder) {
            this.authLimit = builder.authLimit;
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
            private Long gmtEnd; 
            private Long gmtStart; 
            private String moduleCode; 
            private Integer status; 

            /**
             * AuthLimit.
             */
            public Builder authLimit(Long authLimit) {
                this.authLimit = authLimit;
                return this;
            }

            /**
             * GmtEnd.
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * GmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * ModuleCode.
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * Status.
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
        @NameInMap("TrialRecordList")
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
             * TrialRecordList.
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
