// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAIActionConfigRequest</p>
 */
public class GetAIActionConfigRequest extends Request {
    @Query
    @NameInMap("Algo")
    @Validation(required = true)
    private String algo;

    @Query
    @NameInMap("AlgoAction")
    @Validation(required = true)
    private String algoAction;

    private GetAIActionConfigRequest(Builder builder) {
        super(builder);
        this.algo = builder.algo;
        this.algoAction = builder.algoAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIActionConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algo
     */
    public String getAlgo() {
        return this.algo;
    }

    /**
     * @return algoAction
     */
    public String getAlgoAction() {
        return this.algoAction;
    }

    public static final class Builder extends Request.Builder<GetAIActionConfigRequest, Builder> {
        private String algo; 
        private String algoAction; 

        private Builder() {
            super();
        } 

        private Builder(GetAIActionConfigRequest response) {
            super(response);
            this.algo = response.algo;
            this.algoAction = response.algoAction;
        } 

        /**
         * Algo.
         */
        public Builder algo(String algo) {
            this.putQueryParameter("Algo", algo);
            this.algo = algo;
            return this;
        }

        /**
         * AlgoAction.
         */
        public Builder algoAction(String algoAction) {
            this.putQueryParameter("AlgoAction", algoAction);
            this.algoAction = algoAction;
            return this;
        }

        @Override
        public GetAIActionConfigRequest build() {
            return new GetAIActionConfigRequest(this);
        } 

    } 

}
