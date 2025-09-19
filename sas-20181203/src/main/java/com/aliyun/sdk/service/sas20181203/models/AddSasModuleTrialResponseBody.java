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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AddSasModuleTrialResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddSasModuleTrialResponseBody build() {
            return new AddSasModuleTrialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddSasModuleTrialResponseBody} extends {@link TeaModel}
     *
     * <p>AddSasModuleTrialResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TrialRecordList model) {
                this.authLimit = model.authLimit;
                this.authLimitList = model.authLimitList;
                this.gmtEnd = model.gmtEnd;
                this.gmtStart = model.gmtStart;
                this.moduleCode = model.moduleCode;
                this.status = model.status;
            } 

            /**
             * <p>The quota.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder authLimit(Long authLimit) {
                this.authLimit = authLimit;
                return this;
            }

            /**
             * <p>The list of quotas. This parameter is available if the value of the ModuleCode parameter is cloudSiem. The value of this parameter consists of the log storage capacity for the threat analysis and response feature and the log data to add. Units: GB and GB-day.</p>
             * 
             * <strong>example:</strong>
             * <p>[1,100]</p>
             */
            public Builder authLimitList(String authLimitList) {
                this.authLimitList = authLimitList;
                return this;
            }

            /**
             * <p>The end time of the trial use.</p>
             * 
             * <strong>example:</strong>
             * <p>1638201599999</p>
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * <p>The start time of the trial use.</p>
             * 
             * <strong>example:</strong>
             * <p>1667232000000</p>
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * <p>The code of the feature. Valid values:</p>
             * <ul>
             * <li><strong>vulFix</strong>: vulnerability fixing.</li>
             * <li><strong>cloudSiem</strong>: threat analysis and response.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vulFix</p>
             */
            public Builder moduleCode(String moduleCode) {
                this.moduleCode = moduleCode;
                return this;
            }

            /**
             * <p>The status of the trial use. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The feature is in trial use.</li>
             * <li><strong>0</strong>: The trial use ends.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link AddSasModuleTrialResponseBody} extends {@link TeaModel}
     *
     * <p>AddSasModuleTrialResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrialRecordList")
        private java.util.List<TrialRecordList> trialRecordList;

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
        public java.util.List<TrialRecordList> getTrialRecordList() {
            return this.trialRecordList;
        }

        public static final class Builder {
            private java.util.List<TrialRecordList> trialRecordList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.trialRecordList = model.trialRecordList;
            } 

            /**
             * <p>The information about the trial use.</p>
             */
            public Builder trialRecordList(java.util.List<TrialRecordList> trialRecordList) {
                this.trialRecordList = trialRecordList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
