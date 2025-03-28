// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link ListMeasureDataResponseBody} extends {@link TeaModel}
 *
 * <p>ListMeasureDataResponseBody</p>
 */
public class ListMeasureDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("MeasureDatas")
    private java.util.List<MeasureDatas> measureDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListMeasureDataResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.measureDatas = builder.measureDatas;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMeasureDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return measureDatas
     */
    public java.util.List<MeasureDatas> getMeasureDatas() {
        return this.measureDatas;
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
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private java.util.List<MeasureDatas> measureDatas; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListMeasureDataResponseBody model) {
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.measureDatas = model.measureDatas;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>100001001</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The user is not in tenant.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The measurement results.</p>
         */
        public Builder measureDatas(java.util.List<MeasureDatas> measureDatas) {
            this.measureDatas = measureDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AFAE64E-D1BE-432B-A9****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListMeasureDataResponseBody build() {
            return new ListMeasureDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMeasureDataResponseBody} extends {@link TeaModel}
     *
     * <p>ListMeasureDataResponseBody</p>
     */
    public static class MeasureDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("DomainCode")
        private String domainCode;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private MeasureDatas(Builder builder) {
            this.componentCode = builder.componentCode;
            this.domainCode = builder.domainCode;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeasureDatas create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return domainCode
         */
        public String getDomainCode() {
            return this.domainCode;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String componentCode; 
            private String domainCode; 
            private Long endTime; 
            private Long startTime; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(MeasureDatas model) {
                this.componentCode = model.componentCode;
                this.domainCode = model.domainCode;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
                this.usage = model.usage;
            } 

            /**
             * <p>The measurement component.</p>
             * 
             * <strong>example:</strong>
             * <p>Count</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The item that is measured.</p>
             * 
             * <strong>example:</strong>
             * <p>DideAlarmPhone</p>
             */
            public Builder domainCode(String domainCode) {
                this.domainCode = domainCode;
                return this;
            }

            /**
             * <p>The end timestamp of the measurement period, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1717430400000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start timestamp of the measurement period, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1717344000000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The total quantity used within the measurement period.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public MeasureDatas build() {
                return new MeasureDatas(this);
            } 

        } 

    }
}
