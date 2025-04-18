// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link GetReductionProposalResponseBody} extends {@link TeaModel}
 *
 * <p>GetReductionProposalResponseBody</p>
 */
public class GetReductionProposalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetReductionProposalResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReductionProposalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetReductionProposalResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The value is unique for each request. This facilitates subsequent troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetReductionProposalResponseBody build() {
            return new GetReductionProposalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReductionProposalResponseBody} extends {@link TeaModel}
     *
     * <p>GetReductionProposalResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reduction")
        private String reduction;

        @com.aliyun.core.annotation.NameInMap("reductionEvaluation")
        private String reductionEvaluation;

        private Data(Builder builder) {
            this.reduction = builder.reduction;
            this.reductionEvaluation = builder.reductionEvaluation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return reduction
         */
        public String getReduction() {
            return this.reduction;
        }

        /**
         * @return reductionEvaluation
         */
        public String getReductionEvaluation() {
            return this.reductionEvaluation;
        }

        public static final class Builder {
            private String reduction; 
            private String reductionEvaluation; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.reduction = model.reduction;
                this.reductionEvaluation = model.reductionEvaluation;
            } 

            /**
             * <p>Proactive carbon reduction recommendations and advice.</p>
             * 
             * <strong>example:</strong>
             * <p>Reduce one-drop usage</p>
             */
            public Builder reduction(String reduction) {
                this.reduction = reduction;
                return this;
            }

            /**
             * <p>Active carbon reduction assessment.</p>
             * 
             * <strong>example:</strong>
             * <p>Trying Energy Expert for a more detailed assessment.</p>
             */
            public Builder reductionEvaluation(String reductionEvaluation) {
                this.reductionEvaluation = reductionEvaluation;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
