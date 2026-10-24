// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link DeleteClientRuleStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientRuleStrategyRequest</p>
 */
public class DeleteClientRuleStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    private DeleteClientRuleStrategyRequest(Builder builder) {
        super(builder);
        this.idList = builder.idList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientRuleStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idList
     */
    public java.util.List<Long> getIdList() {
        return this.idList;
    }

    public static final class Builder extends Request.Builder<DeleteClientRuleStrategyRequest, Builder> {
        private java.util.List<Long> idList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientRuleStrategyRequest request) {
            super(request);
            this.idList = request.idList;
        } 

        /**
         * <p>The list of IDs of the policies to delete. Use the policy IDs returned by the create operation or obtained from the policy list or details operations.</p>
         */
        public Builder idList(java.util.List<Long> idList) {
            String idListShrink = shrink(idList, "IdList", "json");
            this.putQueryParameter("IdList", idListShrink);
            this.idList = idList;
            return this;
        }

        @Override
        public DeleteClientRuleStrategyRequest build() {
            return new DeleteClientRuleStrategyRequest(this);
        } 

    } 

}
