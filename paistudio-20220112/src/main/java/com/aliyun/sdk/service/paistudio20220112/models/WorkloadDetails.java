// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link WorkloadDetails} extends {@link TeaModel}
 *
 * <p>WorkloadDetails</p>
 */
public class WorkloadDetails extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DLC")
    private QuotaJob DLC;

    @com.aliyun.core.annotation.NameInMap("DSW")
    private QuotaJob DSW;

    @com.aliyun.core.annotation.NameInMap("EAS")
    private QuotaJob EAS;

    @com.aliyun.core.annotation.NameInMap("Summary")
    private QuotaJob summary;

    private WorkloadDetails(Builder builder) {
        this.DLC = builder.DLC;
        this.DSW = builder.DSW;
        this.EAS = builder.EAS;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WorkloadDetails create() {
        return builder().build();
    }

    /**
     * @return DLC
     */
    public QuotaJob getDLC() {
        return this.DLC;
    }

    /**
     * @return DSW
     */
    public QuotaJob getDSW() {
        return this.DSW;
    }

    /**
     * @return EAS
     */
    public QuotaJob getEAS() {
        return this.EAS;
    }

    /**
     * @return summary
     */
    public QuotaJob getSummary() {
        return this.summary;
    }

    public static final class Builder {
        private QuotaJob DLC; 
        private QuotaJob DSW; 
        private QuotaJob EAS; 
        private QuotaJob summary; 

        /**
         * DLC.
         */
        public Builder DLC(QuotaJob DLC) {
            this.DLC = DLC;
            return this;
        }

        /**
         * DSW.
         */
        public Builder DSW(QuotaJob DSW) {
            this.DSW = DSW;
            return this;
        }

        /**
         * EAS.
         */
        public Builder EAS(QuotaJob EAS) {
            this.EAS = EAS;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(QuotaJob summary) {
            this.summary = summary;
            return this;
        }

        public WorkloadDetails build() {
            return new WorkloadDetails(this);
        } 

    } 

}
