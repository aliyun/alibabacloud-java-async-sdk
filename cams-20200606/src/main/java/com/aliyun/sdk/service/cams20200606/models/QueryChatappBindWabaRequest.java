// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappBindWabaRequest} extends {@link RequestModel}
 *
 * <p>QueryChatappBindWabaRequest</p>
 */
public class QueryChatappBindWabaRequest extends Request {
    @Query
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Query
    @NameInMap("IsvCode")
    private String isvCode;

    private QueryChatappBindWabaRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.isvCode = builder.isvCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatappBindWabaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    public static final class Builder extends Request.Builder<QueryChatappBindWabaRequest, Builder> {
        private String custSpaceId; 
        private String isvCode; 

        private Builder() {
            super();
        } 

        private Builder(QueryChatappBindWabaRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.isvCode = request.isvCode;
        } 

        /**
         * The space ID of the user under the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The ISV verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        @Override
        public QueryChatappBindWabaRequest build() {
            return new QueryChatappBindWabaRequest(this);
        } 

    } 

}
