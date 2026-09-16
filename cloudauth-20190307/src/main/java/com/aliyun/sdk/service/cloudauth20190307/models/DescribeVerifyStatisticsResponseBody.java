// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyStatisticsResponseBody</p>
 */
public class DescribeVerifyStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4E27D502-1287-526A-910C-881A3F023914</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyStatisticsResponseBody build() {
            return new DescribeVerifyStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("InitDevicePassRate")
        private String initDevicePassRate;

        @com.aliyun.core.annotation.NameInMap("InitService")
        private Long initService;

        @com.aliyun.core.annotation.NameInMap("InitServiceConversionRate")
        private String initServiceConversionRate;

        @com.aliyun.core.annotation.NameInMap("InitServicePassRate")
        private String initServicePassRate;

        @com.aliyun.core.annotation.NameInMap("PassRate")
        private String passRate;

        private Items(Builder builder) {
            this.date = builder.date;
            this.initDevicePassRate = builder.initDevicePassRate;
            this.initService = builder.initService;
            this.initServiceConversionRate = builder.initServiceConversionRate;
            this.initServicePassRate = builder.initServicePassRate;
            this.passRate = builder.passRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return initDevicePassRate
         */
        public String getInitDevicePassRate() {
            return this.initDevicePassRate;
        }

        /**
         * @return initService
         */
        public Long getInitService() {
            return this.initService;
        }

        /**
         * @return initServiceConversionRate
         */
        public String getInitServiceConversionRate() {
            return this.initServiceConversionRate;
        }

        /**
         * @return initServicePassRate
         */
        public String getInitServicePassRate() {
            return this.initServicePassRate;
        }

        /**
         * @return passRate
         */
        public String getPassRate() {
            return this.passRate;
        }

        public static final class Builder {
            private String date; 
            private String initDevicePassRate; 
            private Long initService; 
            private String initServiceConversionRate; 
            private String initServicePassRate; 
            private String passRate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.date = model.date;
                this.initDevicePassRate = model.initDevicePassRate;
                this.initService = model.initService;
                this.initServiceConversionRate = model.initServiceConversionRate;
                this.initServicePassRate = model.initServicePassRate;
                this.passRate = model.passRate;
            } 

            /**
             * <p>The date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-11</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The client-side init pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder initDevicePassRate(String initDevicePassRate) {
                this.initDevicePassRate = initDevicePassRate;
                return this;
            }

            /**
             * <p>The number of server-side init requests.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder initService(Long initService) {
                this.initService = initService;
                return this;
            }

            /**
             * <p>The server-side init conversion rate.</p>
             * 
             * <strong>example:</strong>
             * <p>26.67</p>
             */
            public Builder initServiceConversionRate(String initServiceConversionRate) {
                this.initServiceConversionRate = initServiceConversionRate;
                return this;
            }

            /**
             * <p>The server-side init pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder initServicePassRate(String initServicePassRate) {
                this.initServicePassRate = initServicePassRate;
                return this;
            }

            /**
             * <p>The pass rate.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder passRate(String passRate) {
                this.passRate = passRate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InitDevice")
        private Long initDevice;

        @com.aliyun.core.annotation.NameInMap("InitDeviceId")
        private Long initDeviceId;

        @com.aliyun.core.annotation.NameInMap("InitDeviceIdSuccess")
        private Long initDeviceIdSuccess;

        @com.aliyun.core.annotation.NameInMap("InitDeviceSuccess")
        private Long initDeviceSuccess;

        @com.aliyun.core.annotation.NameInMap("InitService")
        private Long initService;

        @com.aliyun.core.annotation.NameInMap("InitServiceId")
        private Long initServiceId;

        @com.aliyun.core.annotation.NameInMap("InitServiceIdSuccess")
        private Long initServiceIdSuccess;

        @com.aliyun.core.annotation.NameInMap("InitServiceSuccess")
        private Long initServiceSuccess;

        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("VerifyDevice")
        private Long verifyDevice;

        @com.aliyun.core.annotation.NameInMap("VerifyDeviceId")
        private Long verifyDeviceId;

        @com.aliyun.core.annotation.NameInMap("VerifyDeviceIdSuccess")
        private Long verifyDeviceIdSuccess;

        @com.aliyun.core.annotation.NameInMap("VerifyDeviceIdSuccessPassed")
        private Long verifyDeviceIdSuccessPassed;

        @com.aliyun.core.annotation.NameInMap("VerifyDeviceSuccess")
        private Long verifyDeviceSuccess;

        @com.aliyun.core.annotation.NameInMap("VerifyDeviceSuccessPassed")
        private Long verifyDeviceSuccessPassed;

        private ResultObject(Builder builder) {
            this.initDevice = builder.initDevice;
            this.initDeviceId = builder.initDeviceId;
            this.initDeviceIdSuccess = builder.initDeviceIdSuccess;
            this.initDeviceSuccess = builder.initDeviceSuccess;
            this.initService = builder.initService;
            this.initServiceId = builder.initServiceId;
            this.initServiceIdSuccess = builder.initServiceIdSuccess;
            this.initServiceSuccess = builder.initServiceSuccess;
            this.items = builder.items;
            this.verifyDevice = builder.verifyDevice;
            this.verifyDeviceId = builder.verifyDeviceId;
            this.verifyDeviceIdSuccess = builder.verifyDeviceIdSuccess;
            this.verifyDeviceIdSuccessPassed = builder.verifyDeviceIdSuccessPassed;
            this.verifyDeviceSuccess = builder.verifyDeviceSuccess;
            this.verifyDeviceSuccessPassed = builder.verifyDeviceSuccessPassed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return initDevice
         */
        public Long getInitDevice() {
            return this.initDevice;
        }

        /**
         * @return initDeviceId
         */
        public Long getInitDeviceId() {
            return this.initDeviceId;
        }

        /**
         * @return initDeviceIdSuccess
         */
        public Long getInitDeviceIdSuccess() {
            return this.initDeviceIdSuccess;
        }

        /**
         * @return initDeviceSuccess
         */
        public Long getInitDeviceSuccess() {
            return this.initDeviceSuccess;
        }

        /**
         * @return initService
         */
        public Long getInitService() {
            return this.initService;
        }

        /**
         * @return initServiceId
         */
        public Long getInitServiceId() {
            return this.initServiceId;
        }

        /**
         * @return initServiceIdSuccess
         */
        public Long getInitServiceIdSuccess() {
            return this.initServiceIdSuccess;
        }

        /**
         * @return initServiceSuccess
         */
        public Long getInitServiceSuccess() {
            return this.initServiceSuccess;
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return verifyDevice
         */
        public Long getVerifyDevice() {
            return this.verifyDevice;
        }

        /**
         * @return verifyDeviceId
         */
        public Long getVerifyDeviceId() {
            return this.verifyDeviceId;
        }

        /**
         * @return verifyDeviceIdSuccess
         */
        public Long getVerifyDeviceIdSuccess() {
            return this.verifyDeviceIdSuccess;
        }

        /**
         * @return verifyDeviceIdSuccessPassed
         */
        public Long getVerifyDeviceIdSuccessPassed() {
            return this.verifyDeviceIdSuccessPassed;
        }

        /**
         * @return verifyDeviceSuccess
         */
        public Long getVerifyDeviceSuccess() {
            return this.verifyDeviceSuccess;
        }

        /**
         * @return verifyDeviceSuccessPassed
         */
        public Long getVerifyDeviceSuccessPassed() {
            return this.verifyDeviceSuccessPassed;
        }

        public static final class Builder {
            private Long initDevice; 
            private Long initDeviceId; 
            private Long initDeviceIdSuccess; 
            private Long initDeviceSuccess; 
            private Long initService; 
            private Long initServiceId; 
            private Long initServiceIdSuccess; 
            private Long initServiceSuccess; 
            private java.util.List<Items> items; 
            private Long verifyDevice; 
            private Long verifyDeviceId; 
            private Long verifyDeviceIdSuccess; 
            private Long verifyDeviceIdSuccessPassed; 
            private Long verifyDeviceSuccess; 
            private Long verifyDeviceSuccessPassed; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.initDevice = model.initDevice;
                this.initDeviceId = model.initDeviceId;
                this.initDeviceIdSuccess = model.initDeviceIdSuccess;
                this.initDeviceSuccess = model.initDeviceSuccess;
                this.initService = model.initService;
                this.initServiceId = model.initServiceId;
                this.initServiceIdSuccess = model.initServiceIdSuccess;
                this.initServiceSuccess = model.initServiceSuccess;
                this.items = model.items;
                this.verifyDevice = model.verifyDevice;
                this.verifyDeviceId = model.verifyDeviceId;
                this.verifyDeviceIdSuccess = model.verifyDeviceIdSuccess;
                this.verifyDeviceIdSuccessPassed = model.verifyDeviceIdSuccessPassed;
                this.verifyDeviceSuccess = model.verifyDeviceSuccess;
                this.verifyDeviceSuccessPassed = model.verifyDeviceSuccessPassed;
            } 

            /**
             * <p>The number of client-side init attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder initDevice(Long initDevice) {
                this.initDevice = initDevice;
                return this;
            }

            /**
             * <p>The number of identity deduplication client-side init requests.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder initDeviceId(Long initDeviceId) {
                this.initDeviceId = initDeviceId;
                return this;
            }

            /**
             * <p>The number of successful identity deduplication client-side init requests.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder initDeviceIdSuccess(Long initDeviceIdSuccess) {
                this.initDeviceIdSuccess = initDeviceIdSuccess;
                return this;
            }

            /**
             * <p>The number of client-side init calls.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder initDeviceSuccess(Long initDeviceSuccess) {
                this.initDeviceSuccess = initDeviceSuccess;
                return this;
            }

            /**
             * <p>The number of server-side init attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>73</p>
             */
            public Builder initService(Long initService) {
                this.initService = initService;
                return this;
            }

            /**
             * <p>The total number of identity deduplication server-side init requests.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder initServiceId(Long initServiceId) {
                this.initServiceId = initServiceId;
                return this;
            }

            /**
             * <p>The number of successful identity deduplication server-side init requests.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder initServiceIdSuccess(Long initServiceIdSuccess) {
                this.initServiceIdSuccess = initServiceIdSuccess;
                return this;
            }

            /**
             * <p>The number of successful server-side init authentications.</p>
             * 
             * <strong>example:</strong>
             * <p>134</p>
             */
            public Builder initServiceSuccess(Long initServiceSuccess) {
                this.initServiceSuccess = initServiceSuccess;
                return this;
            }

            /**
             * <p>The daily pass rate and conversion rate statistics (PV).</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>The number of client-side verification attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder verifyDevice(Long verifyDevice) {
                this.verifyDevice = verifyDevice;
                return this;
            }

            /**
             * <p>The number of identity deduplication client-side authentication attempts.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder verifyDeviceId(Long verifyDeviceId) {
                this.verifyDeviceId = verifyDeviceId;
                return this;
            }

            /**
             * <p>The number of successful identity deduplication client-side verifications.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder verifyDeviceIdSuccess(Long verifyDeviceIdSuccess) {
                this.verifyDeviceIdSuccess = verifyDeviceIdSuccess;
                return this;
            }

            /**
             * <p>The number of successful identity deduplication client-side authentications.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder verifyDeviceIdSuccessPassed(Long verifyDeviceIdSuccessPassed) {
                this.verifyDeviceIdSuccessPassed = verifyDeviceIdSuccessPassed;
                return this;
            }

            /**
             * <p>The number of successful client-side authentications.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder verifyDeviceSuccess(Long verifyDeviceSuccess) {
                this.verifyDeviceSuccess = verifyDeviceSuccess;
                return this;
            }

            /**
             * <p>The number of successful client-side authentications.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder verifyDeviceSuccessPassed(Long verifyDeviceSuccessPassed) {
                this.verifyDeviceSuccessPassed = verifyDeviceSuccessPassed;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
