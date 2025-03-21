// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteClientUserDefineRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteClientUserDefineRuleRequest</p>
 */
public class DeleteClientUserDefineRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Long> idList;

    private DeleteClientUserDefineRuleRequest(Builder builder) {
        super(builder);
        this.idList = builder.idList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClientUserDefineRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteClientUserDefineRuleRequest, Builder> {
        private java.util.List<Long> idList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClientUserDefineRuleRequest request) {
            super(request);
            this.idList = request.idList;
        } 

        /**
         * <p>The IDs of the custom defense rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        @Override
        public DeleteClientUserDefineRuleRequest build() {
            return new DeleteClientUserDefineRuleRequest(this);
        } 

    } 

}
