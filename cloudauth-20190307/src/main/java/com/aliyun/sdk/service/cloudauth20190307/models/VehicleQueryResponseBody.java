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
 * {@link VehicleQueryResponseBody} extends {@link TeaModel}
 *
 * <p>VehicleQueryResponseBody</p>
 */
public class VehicleQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private VehicleQueryResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VehicleQueryResponseBody create() {
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

        private Builder(VehicleQueryResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Return code: 200 for success, others for failure</p>
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
         * <p>D6163397-15C5-419C-9ACC-B7C83*******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Request result</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public VehicleQueryResponseBody build() {
            return new VehicleQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link VehicleQueryResponseBody} extends {@link TeaModel}
     *
     * <p>VehicleQueryResponseBody</p>
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
             * <blockquote>
             * <ul>
             * <li>1: Found (charged)</li>
             * <li>3: No record found (not charged)</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>Vehicle information.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;approvedCount&quot;: 7,
             *     &quot;approvedLoad&quot;: 0,
             *     &quot;axleCount&quot;: 2,
             *     &quot;backWheelDistance&quot;: 1585,
             *     &quot;brand&quot;: &quot;雷克萨斯&quot;,
             *     &quot;compulsoryScrapTo&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;displacement&quot;: 4608,
             *     &quot;engineNo&quot;: &quot;1UR0</strong>**</strong>&quot;,
             *     &quot;engineType&quot;: &quot;1**&quot;,
             *     &quot;frontWheelDistance&quot;: 1585,
             *     &quot;fuelType&quot;: &quot;汽油&quot;,
             *     &quot;high&quot;: 1860,
             *     &quot;inspectionResultEffectiveTo&quot;: &quot;<strong><strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;modelNo&quot;: &quot;UR</strong>*</strong>-<strong><strong><strong>&quot;,
             *     &quot;power&quot;: 228,
             *     &quot;registrationDate&quot;: &quot;</strong></strong>-</strong>-** <strong>:</strong>:<strong>&quot;,
             *     &quot;releaseDate&quot;: &quot;&quot;,
             *     &quot;state&quot;: &quot;0&quot;,
             *     &quot;stateDesc&quot;: &quot;正常&quot;,
             *     &quot;totalMass&quot;: 2940,
             *     &quot;unladenMass&quot;: 2350,
             *     &quot;useProperty&quot;: 0,
             *     &quot;usePropertyDesc&quot;: &quot;非营运&quot;,
             *     &quot;long&quot;: 4890,
             *     &quot;vin&quot;: &quot;A</strong>*********&quot;,
             *     &quot;wheelBase&quot;: 2790,
             *     &quot;wide&quot;: 1910
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
