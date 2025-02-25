// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link RenewInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>RenewInstanceResponseBody</p>
 */
public class RenewInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private RenewInstanceResponseBody(Builder builder) {
        this.chargeType = builder.chargeType;
        this.code = builder.code;
        this.dtsJobId = builder.dtsJobId;
        this.dynamicMessage = builder.dynamicMessage;
        this.endTime = builder.endTime;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String chargeType; 
        private String code; 
        private String dtsJobId; 
        private String dynamicMessage; 
        private String endTime; 
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private String instanceId; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The billing method of the DTS instance. Only <strong>PREPAY</strong> may be returned, which indicates the subscription billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * <blockquote>
         * <p>This parameter will be removed in the future.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the data synchronization or change tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>qi0r643lc31****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The dynamic part in the error message. This parameter is used to replace the <strong>%s</strong> variable in the value of <strong>ErrMessage</strong>.</p>
         * <blockquote>
         * <p>If the return value of <strong>ErrMessage</strong> is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of <strong>DynamicMessage</strong> is <strong>DtsJobId</strong>, the specified value of <strong>DtsJobId</strong> is invalid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DtsJobId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The time when the DTS instance expires after renewal. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ssZZZ</em> format. The time is displayed in UTC.</p>
         * <blockquote>
         * <p><strong>ZZZ</strong> indicates the offset of the time zone, which is displayed in the format of a plus sign (+) or a minus sign (-) followed by hours and minutes, such as <strong>+00:00</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2021-08-04T16:00:00.000+00:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The request processing has failed due to some unknown error.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>dtsqi0r643lc31****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1112E255-0C38-4970-8159-1D54AD92****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public RenewInstanceResponseBody build() {
            return new RenewInstanceResponseBody(this);
        } 

    } 

}
