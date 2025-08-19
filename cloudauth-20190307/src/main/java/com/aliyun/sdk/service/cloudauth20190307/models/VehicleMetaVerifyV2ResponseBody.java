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
 * {@link VehicleMetaVerifyV2ResponseBody} extends {@link TeaModel}
 *
 * <p>VehicleMetaVerifyV2ResponseBody</p>
 */
public class VehicleMetaVerifyV2ResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private VehicleMetaVerifyV2ResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VehicleMetaVerifyV2ResponseBody create() {
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

        private Builder(VehicleMetaVerifyV2ResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code, <strong>200</strong> indicates successful API response.</p>
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
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>5A6229C0-E156-48E4-B6EC-0F528B******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public VehicleMetaVerifyV2ResponseBody build() {
            return new VehicleMetaVerifyV2ResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VehicleMetaVerifyV2ResponseBody} extends {@link TeaModel}
     *
     * <p>VehicleMetaVerifyV2ResponseBody</p>
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
             * <li><strong>1</strong>: Verification consistent.</li>
             * <li><strong>2</strong>: Verification inconsistent.</li>
             * <li><strong>3</strong>: No record found.</li>
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
             * <p>Detailed vehicle information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;approvedCount&quot;: &quot;7&quot;,
             *     &quot;approvedLoad&quot;: &quot;0&quot;,
             *     &quot;axleCount&quot;: &quot;2&quot;,
             *     &quot;backWheelDistance&quot;: &quot;1585&quot;,
             *     &quot;brand&quot;: &quot;雷克萨斯&quot;,
             *     &quot;displacement&quot;: &quot;4608&quot;,
             *     &quot;engineNum&quot;: &quot;1*********&quot;,
             *     &quot;engineType&quot;: &quot;1**&quot;,
             *     &quot;frontWheelDistance&quot;: &quot;1585&quot;,
             *     &quot;fuelType&quot;: &quot;汽油&quot;,
             *     &quot;inspectionDate&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;modelNum&quot;: &quot;UR</strong>*</strong>-<strong><strong><strong>&quot;,
             *     &quot;power&quot;: &quot;228&quot;,
             *     &quot;registrationDate&quot;: &quot;</strong></strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;retirementDate&quot;: &quot;****-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;totalMass&quot;: &quot;2940&quot;,
             *     &quot;unladenMass&quot;: &quot;2350&quot;,
             *     &quot;useProperty&quot;: &quot;非营运&quot;,
             *     &quot;vehicleState&quot;: &quot;正常&quot;,
             *     &quot;vin&quot;: &quot;JT</strong>*************&quot;,
             *     &quot;wheelBase&quot;: &quot;2790&quot;
             * }</p>
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
