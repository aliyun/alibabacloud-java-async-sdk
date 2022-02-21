// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCurrentModeResponseBody} extends {@link TeaModel}
 *
 * <p>GetCurrentModeResponseBody</p>
 */
public class GetCurrentModeResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("EffectiveAt")
    private Integer effectiveAt;

    @NameInMap("EstimateBandwidth")
    private Integer estimateBandwidth;

    @NameInMap("ModeCode")
    private Integer modeCode;

    @NameInMap("PaddingModeCode")
    private Integer paddingModeCode;

    @NameInMap("RequestId")
    private String requestId;

    private GetCurrentModeResponseBody(Builder builder) {
        this.code = builder.code;
        this.effectiveAt = builder.effectiveAt;
        this.estimateBandwidth = builder.estimateBandwidth;
        this.modeCode = builder.modeCode;
        this.paddingModeCode = builder.paddingModeCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCurrentModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return effectiveAt
     */
    public Integer getEffectiveAt() {
        return this.effectiveAt;
    }

    /**
     * @return estimateBandwidth
     */
    public Integer getEstimateBandwidth() {
        return this.estimateBandwidth;
    }

    /**
     * @return modeCode
     */
    public Integer getModeCode() {
        return this.modeCode;
    }

    /**
     * @return paddingModeCode
     */
    public Integer getPaddingModeCode() {
        return this.paddingModeCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private Integer effectiveAt; 
        private Integer estimateBandwidth; 
        private Integer modeCode; 
        private Integer paddingModeCode; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * EffectiveAt.
         */
        public Builder effectiveAt(Integer effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }

        /**
         * EstimateBandwidth.
         */
        public Builder estimateBandwidth(Integer estimateBandwidth) {
            this.estimateBandwidth = estimateBandwidth;
            return this;
        }

        /**
         * ModeCode.
         */
        public Builder modeCode(Integer modeCode) {
            this.modeCode = modeCode;
            return this;
        }

        /**
         * PaddingModeCode.
         */
        public Builder paddingModeCode(Integer paddingModeCode) {
            this.paddingModeCode = paddingModeCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCurrentModeResponseBody build() {
            return new GetCurrentModeResponseBody(this);
        } 

    } 

}
