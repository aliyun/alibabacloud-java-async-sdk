// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBenefitGrantResultRequest} extends {@link RequestModel}
 *
 * <p>QueryBenefitGrantResultRequest</p>
 */
public class QueryBenefitGrantResultRequest extends Request {
    @Body
    @NameInMap("CloducodeFlowNo")
    private String cloducodeFlowNo;

    @Body
    @NameInMap("OuterCustomerId")
    private String outerCustomerId;

    private QueryBenefitGrantResultRequest(Builder builder) {
        super(builder);
        this.cloducodeFlowNo = builder.cloducodeFlowNo;
        this.outerCustomerId = builder.outerCustomerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryBenefitGrantResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloducodeFlowNo
     */
    public String getCloducodeFlowNo() {
        return this.cloducodeFlowNo;
    }

    /**
     * @return outerCustomerId
     */
    public String getOuterCustomerId() {
        return this.outerCustomerId;
    }

    public static final class Builder extends Request.Builder<QueryBenefitGrantResultRequest, Builder> {
        private String cloducodeFlowNo; 
        private String outerCustomerId; 

        private Builder() {
            super();
        } 

        private Builder(QueryBenefitGrantResultRequest request) {
            super(request);
            this.cloducodeFlowNo = request.cloducodeFlowNo;
            this.outerCustomerId = request.outerCustomerId;
        } 

        /**
         * CloducodeFlowNo.
         */
        public Builder cloducodeFlowNo(String cloducodeFlowNo) {
            this.putBodyParameter("CloducodeFlowNo", cloducodeFlowNo);
            this.cloducodeFlowNo = cloducodeFlowNo;
            return this;
        }

        /**
         * OuterCustomerId.
         */
        public Builder outerCustomerId(String outerCustomerId) {
            this.putBodyParameter("OuterCustomerId", outerCustomerId);
            this.outerCustomerId = outerCustomerId;
            return this;
        }

        @Override
        public QueryBenefitGrantResultRequest build() {
            return new QueryBenefitGrantResultRequest(this);
        } 

    } 

}
