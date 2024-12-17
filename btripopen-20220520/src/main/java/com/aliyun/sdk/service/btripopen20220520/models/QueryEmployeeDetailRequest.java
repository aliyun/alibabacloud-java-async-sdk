// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryEmployeeDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryEmployeeDetailRequest</p>
 */
public class QueryEmployeeDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("out_employee_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outEmployeeId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private QueryEmployeeDetailRequest(Builder builder) {
        super(builder);
        this.outEmployeeId = builder.outEmployeeId;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEmployeeDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outEmployeeId
     */
    public String getOutEmployeeId() {
        return this.outEmployeeId;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<QueryEmployeeDetailRequest, Builder> {
        private String outEmployeeId; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryEmployeeDetailRequest request) {
            super(request);
            this.outEmployeeId = request.outEmployeeId;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abc12138</p>
         */
        public Builder outEmployeeId(String outEmployeeId) {
            this.putQueryParameter("out_employee_id", outEmployeeId);
            this.outEmployeeId = outEmployeeId;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public QueryEmployeeDetailRequest build() {
            return new QueryEmployeeDetailRequest(this);
        } 

    } 

}
