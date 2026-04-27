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
 * {@link DeleteUnknownThreatDetectStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteUnknownThreatDetectStrategyRequest</p>
 */
public class DeleteUnknownThreatDetectStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdList")
    private java.util.List<Long> idList;

    private DeleteUnknownThreatDetectStrategyRequest(Builder builder) {
        super(builder);
        this.idList = builder.idList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUnknownThreatDetectStrategyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteUnknownThreatDetectStrategyRequest, Builder> {
        private java.util.List<Long> idList; 

        private Builder() {
            super();
        } 

        private Builder(DeleteUnknownThreatDetectStrategyRequest request) {
            super(request);
            this.idList = request.idList;
        } 

        /**
         * IdList.
         */
        public Builder idList(java.util.List<Long> idList) {
            this.putQueryParameter("IdList", idList);
            this.idList = idList;
            return this;
        }

        @Override
        public DeleteUnknownThreatDetectStrategyRequest build() {
            return new DeleteUnknownThreatDetectStrategyRequest(this);
        } 

    } 

}
