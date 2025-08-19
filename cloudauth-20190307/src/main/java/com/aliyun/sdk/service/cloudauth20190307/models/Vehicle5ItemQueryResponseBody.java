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
 * {@link Vehicle5ItemQueryResponseBody} extends {@link TeaModel}
 *
 * <p>Vehicle5ItemQueryResponseBody</p>
 */
public class Vehicle5ItemQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private Vehicle5ItemQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Vehicle5ItemQueryResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(Vehicle5ItemQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0D******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result information.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public Vehicle5ItemQueryResponseBody build() {
            return new Vehicle5ItemQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link Vehicle5ItemQueryResponseBody} extends {@link TeaModel}
     *
     * <p>Vehicle5ItemQueryResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("VehicleInfo")
        private String vehicleInfo;

        private ResultObject(Builder builder) {
            this.bizCode = builder.bizCode;
            this.vehicleInfo = builder.vehicleInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return vehicleInfo
         */
        public String getVehicleInfo() {
            return this.vehicleInfo;
        }

        public static final class Builder {
            private String bizCode; 
            private String vehicleInfo; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.bizCode = model.bizCode;
                this.vehicleInfo = model.vehicleInfo;
            } 

            /**
             * <p>Verification result code:</p>
             * <ul>
             * <li><strong>1</strong>: Found (charged)</li>
             * <li><strong>3</strong>: No record found (not charged)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Vehicle information</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *         &quot;engineNo&quot;: &quot;F0******&quot;,
             *         &quot;useProperty&quot;: 0,
             *         &quot;registrationDate&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *         &quot;engineType&quot;: &quot;B</strong>**</strong>&quot;,
             *         &quot;vin&quot;: &quot;A********&quot;,
             *         &quot;state&quot;: &quot;0&quot;,
             *         &quot;modelNo&quot;: &quot;B********&quot;,
             *         &quot;type&quot;: &quot;小型轿车&quot;,
             *         &quot;brand&quot;: &quot;宝马&quot;,
             *         &quot;usePropertyDesc&quot;: &quot;非营运&quot;,
             *         &quot;stateDesc&quot;: &quot;正常&quot;
             *     }</p>
             */
            public Builder vehicleInfo(String vehicleInfo) {
                this.vehicleInfo = vehicleInfo;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
