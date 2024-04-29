// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSasContainerWebDefenseRuleCriteriaRequest} extends {@link RequestModel}
 *
 * <p>GetSasContainerWebDefenseRuleCriteriaRequest</p>
 */
public class GetSasContainerWebDefenseRuleCriteriaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private GetSasContainerWebDefenseRuleCriteriaRequest(Builder builder) {
        super(builder);
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSasContainerWebDefenseRuleCriteriaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<GetSasContainerWebDefenseRuleCriteriaRequest, Builder> {
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(GetSasContainerWebDefenseRuleCriteriaRequest request) {
            super(request);
            this.value = request.value;
        } 

        /**
         * The value of the search condition. Fuzzy match is supported.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public GetSasContainerWebDefenseRuleCriteriaRequest build() {
            return new GetSasContainerWebDefenseRuleCriteriaRequest(this);
        } 

    } 

}
