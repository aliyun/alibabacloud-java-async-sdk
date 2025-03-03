// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link ListFundAccountRequest} extends {@link RequestModel}
 *
 * <p>ListFundAccountRequest</p>
 */
public class ListFundAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryOnlyInUse")
    private Boolean queryOnlyInUse;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryOnlyManage")
    private Boolean queryOnlyManage;

    private ListFundAccountRequest(Builder builder) {
        super(builder);
        this.nbid = builder.nbid;
        this.queryOnlyInUse = builder.queryOnlyInUse;
        this.queryOnlyManage = builder.queryOnlyManage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFundAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nbid
     */
    public String getNbid() {
        return this.nbid;
    }

    /**
     * @return queryOnlyInUse
     */
    public Boolean getQueryOnlyInUse() {
        return this.queryOnlyInUse;
    }

    /**
     * @return queryOnlyManage
     */
    public Boolean getQueryOnlyManage() {
        return this.queryOnlyManage;
    }

    public static final class Builder extends Request.Builder<ListFundAccountRequest, Builder> {
        private String nbid; 
        private Boolean queryOnlyInUse; 
        private Boolean queryOnlyManage; 

        private Builder() {
            super();
        } 

        private Builder(ListFundAccountRequest request) {
            super(request);
            this.nbid = request.nbid;
            this.queryOnlyInUse = request.queryOnlyInUse;
            this.queryOnlyManage = request.queryOnlyManage;
        } 

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        /**
         * QueryOnlyInUse.
         */
        public Builder queryOnlyInUse(Boolean queryOnlyInUse) {
            this.putBodyParameter("QueryOnlyInUse", queryOnlyInUse);
            this.queryOnlyInUse = queryOnlyInUse;
            return this;
        }

        /**
         * QueryOnlyManage.
         */
        public Builder queryOnlyManage(Boolean queryOnlyManage) {
            this.putBodyParameter("QueryOnlyManage", queryOnlyManage);
            this.queryOnlyManage = queryOnlyManage;
            return this;
        }

        @Override
        public ListFundAccountRequest build() {
            return new ListFundAccountRequest(this);
        } 

    } 

}
