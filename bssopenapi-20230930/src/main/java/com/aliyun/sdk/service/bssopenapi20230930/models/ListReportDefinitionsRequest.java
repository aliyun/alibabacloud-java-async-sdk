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
 * {@link ListReportDefinitionsRequest} extends {@link RequestModel}
 *
 * <p>ListReportDefinitionsRequest</p>
 */
public class ListReportDefinitionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nbid")
    private String nbid;

    private ListReportDefinitionsRequest(Builder builder) {
        super(builder);
        this.nbid = builder.nbid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportDefinitionsRequest create() {
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

    public static final class Builder extends Request.Builder<ListReportDefinitionsRequest, Builder> {
        private String nbid; 

        private Builder() {
            super();
        } 

        private Builder(ListReportDefinitionsRequest request) {
            super(request);
            this.nbid = request.nbid;
        } 

        /**
         * Nbid.
         */
        public Builder nbid(String nbid) {
            this.putQueryParameter("Nbid", nbid);
            this.nbid = nbid;
            return this;
        }

        @Override
        public ListReportDefinitionsRequest build() {
            return new ListReportDefinitionsRequest(this);
        } 

    } 

}
