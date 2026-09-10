// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link GetValidDeductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>GetValidDeductInstancesResponseBody</p>
 */
public class GetValidDeductInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetValidDeductInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetValidDeductInstancesResponseBody create() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetValidDeductInstancesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The return message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the current API call itself is successful. This does not indicate the success of subsequent business operations.</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetValidDeductInstancesResponseBody build() {
            return new GetValidDeductInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetValidDeductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>GetValidDeductInstancesResponseBody</p>
     */
    public static class DeductPackageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPeriodUsed")
        private Long currentPeriodUsed;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private Double initCapacity;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("PeriodCapacity")
        private Double periodCapacity;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DeductPackageList(Builder builder) {
            this.currentPeriodUsed = builder.currentPeriodUsed;
            this.endTime = builder.endTime;
            this.initCapacity = builder.initCapacity;
            this.instanceId = builder.instanceId;
            this.module = builder.module;
            this.periodCapacity = builder.periodCapacity;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeductPackageList create() {
            return builder().build();
        }

        /**
         * @return currentPeriodUsed
         */
        public Long getCurrentPeriodUsed() {
            return this.currentPeriodUsed;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return initCapacity
         */
        public Double getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return periodCapacity
         */
        public Double getPeriodCapacity() {
            return this.periodCapacity;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long currentPeriodUsed; 
            private Long endTime; 
            private Double initCapacity; 
            private String instanceId; 
            private String module; 
            private Double periodCapacity; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(DeductPackageList model) {
                this.currentPeriodUsed = model.currentPeriodUsed;
                this.endTime = model.endTime;
                this.initCapacity = model.initCapacity;
                this.instanceId = model.instanceId;
                this.module = model.module;
                this.periodCapacity = model.periodCapacity;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The number of authorizations consumed in the current metering cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder currentPeriodUsed(Long currentPeriodUsed) {
                this.currentPeriodUsed = currentPeriodUsed;
                return this;
            }

            /**
             * <p>The end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1737734400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The total capacity of the resource plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder initCapacity(Double initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * <p>The resource plan instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>apigateway-hz-96f6659a1490</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The module code. Valid values:</p>
             * <ul>
             * <li><strong>POST_HOST</strong>: Host and container protection.</li>
             * <li><strong>CSPM</strong>: Cloud product configuration check.</li>
             * <li><strong>VUL</strong>: Vulnerability scanning.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>POST_HOST</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The number of authorizations consumed up to the previous billing cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodCapacity(Double periodCapacity) {
                this.periodCapacity = periodCapacity;
                return this;
            }

            /**
             * <p>The start timestamp, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1737734400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The resource plan status. Valid values:</p>
             * <ul>
             * <li><strong>valid</strong>: Valid.</li>
             * <li><strong>invalid</strong>: Invalid.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CREATE_FAILED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DeductPackageList build() {
                return new DeductPackageList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetValidDeductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>GetValidDeductInstancesResponseBody</p>
     */
    public static class BodyData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanTry")
        private Boolean canTry;

        @com.aliyun.core.annotation.NameInMap("DeductPackageList")
        private java.util.List<DeductPackageList> deductPackageList;

        private BodyData(Builder builder) {
            this.canTry = builder.canTry;
            this.deductPackageList = builder.deductPackageList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyData create() {
            return builder().build();
        }

        /**
         * @return canTry
         */
        public Boolean getCanTry() {
            return this.canTry;
        }

        /**
         * @return deductPackageList
         */
        public java.util.List<DeductPackageList> getDeductPackageList() {
            return this.deductPackageList;
        }

        public static final class Builder {
            private Boolean canTry; 
            private java.util.List<DeductPackageList> deductPackageList; 

            private Builder() {
            } 

            private Builder(BodyData model) {
                this.canTry = model.canTry;
                this.deductPackageList = model.deductPackageList;
            } 

            /**
             * <p>Indicates whether the account is eligible for a trial. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Eligible.</li>
             * <li><strong>false</strong>: Not eligible.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canTry(Boolean canTry) {
                this.canTry = canTry;
                return this;
            }

            /**
             * <p>The resource plan usage details.</p>
             */
            public Builder deductPackageList(java.util.List<DeductPackageList> deductPackageList) {
                this.deductPackageList = deductPackageList;
                return this;
            }

            public BodyData build() {
                return new BodyData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetValidDeductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>GetValidDeductInstancesResponseBody</p>
     */
    public static class DataBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private BodyData data;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        private DataBody(Builder builder) {
            this.data = builder.data;
            this.requestId = builder.requestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataBody create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public BodyData getData() {
            return this.data;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        public static final class Builder {
            private BodyData data; 
            private String requestId; 

            private Builder() {
            } 

            private Builder(DataBody model) {
                this.data = model.data;
                this.requestId = model.requestId;
            } 

            /**
             * <p>The data body.</p>
             */
            public Builder data(BodyData data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The Security Center request ID.</p>
             * 
             * <strong>example:</strong>
             * <p>A6FB9AC3-4431-538F-BA8A-2A13AEA208A4</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            public DataBody build() {
                return new DataBody(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetValidDeductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>GetValidDeductInstancesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Body")
        private DataBody body;

        private Data(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public DataBody getBody() {
            return this.body;
        }

        public static final class Builder {
            private DataBody body; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.body = model.body;
            } 

            /**
             * <p>The message body.</p>
             */
            public Builder body(DataBody body) {
                this.body = body;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
