// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDefenceCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetDefenceCountResponseBody</p>
 */
public class GetDefenceCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefenceCount15Days")
    private Integer defenceCount15Days;

    @com.aliyun.core.annotation.NameInMap("DefenceCountTotal")
    private Integer defenceCountTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TamperProof15Days")
    private Integer tamperProof15Days;

    @com.aliyun.core.annotation.NameInMap("TamperProofTotal")
    private Integer tamperProofTotal;

    private GetDefenceCountResponseBody(Builder builder) {
        this.defenceCount15Days = builder.defenceCount15Days;
        this.defenceCountTotal = builder.defenceCountTotal;
        this.requestId = builder.requestId;
        this.tamperProof15Days = builder.tamperProof15Days;
        this.tamperProofTotal = builder.tamperProofTotal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDefenceCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return defenceCount15Days
     */
    public Integer getDefenceCount15Days() {
        return this.defenceCount15Days;
    }

    /**
     * @return defenceCountTotal
     */
    public Integer getDefenceCountTotal() {
        return this.defenceCountTotal;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tamperProof15Days
     */
    public Integer getTamperProof15Days() {
        return this.tamperProof15Days;
    }

    /**
     * @return tamperProofTotal
     */
    public Integer getTamperProofTotal() {
        return this.tamperProofTotal;
    }

    public static final class Builder {
        private Integer defenceCount15Days; 
        private Integer defenceCountTotal; 
        private String requestId; 
        private Integer tamperProof15Days; 
        private Integer tamperProofTotal; 

        /**
         * <p>The number of handled alerts of the precise defense type in the last 15 days.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defenceCount15Days(Integer defenceCount15Days) {
            this.defenceCount15Days = defenceCount15Days;
            return this;
        }

        /**
         * <p>The number of handled alerts of the precision defense type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defenceCountTotal(Integer defenceCountTotal) {
            this.defenceCountTotal = defenceCountTotal;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>89AD16CC-97EE-50F3-9B12-9E28E5C8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of handled alerts of the web tamper proofing type in the last 15 days.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tamperProof15Days(Integer tamperProof15Days) {
            this.tamperProof15Days = tamperProof15Days;
            return this;
        }

        /**
         * <p>The number of handled alerts of the web tamper proofing type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tamperProofTotal(Integer tamperProofTotal) {
            this.tamperProofTotal = tamperProofTotal;
            return this;
        }

        public GetDefenceCountResponseBody build() {
            return new GetDefenceCountResponseBody(this);
        } 

    } 

}
