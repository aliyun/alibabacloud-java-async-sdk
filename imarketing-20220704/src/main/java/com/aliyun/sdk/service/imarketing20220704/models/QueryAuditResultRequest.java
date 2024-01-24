// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuditResultRequest} extends {@link RequestModel}
 *
 * <p>QueryAuditResultRequest</p>
 */
public class QueryAuditResultRequest extends Request {
    @Query
    @NameInMap("DspId")
    private String dspId;

    @Query
    @NameInMap("Ids")
    private java.util.List < String > ids;

    private QueryAuditResultRequest(Builder builder) {
        super(builder);
        this.dspId = builder.dspId;
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAuditResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dspId
     */
    public String getDspId() {
        return this.dspId;
    }

    /**
     * @return ids
     */
    public java.util.List < String > getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<QueryAuditResultRequest, Builder> {
        private String dspId; 
        private java.util.List < String > ids; 

        private Builder() {
            super();
        } 

        private Builder(QueryAuditResultRequest request) {
            super(request);
            this.dspId = request.dspId;
            this.ids = request.ids;
        } 

        /**
         * DspId.
         */
        public Builder dspId(String dspId) {
            this.putQueryParameter("DspId", dspId);
            this.dspId = dspId;
            return this;
        }

        /**
         * Ids.
         */
        public Builder ids(java.util.List < String > ids) {
            this.putQueryParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public QueryAuditResultRequest build() {
            return new QueryAuditResultRequest(this);
        } 

    } 

}
