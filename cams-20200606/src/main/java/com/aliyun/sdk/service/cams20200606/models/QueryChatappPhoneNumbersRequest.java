// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryChatappPhoneNumbersRequest} extends {@link RequestModel}
 *
 * <p>QueryChatappPhoneNumbersRequest</p>
 */
public class QueryChatappPhoneNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private QueryChatappPhoneNumbersRequest(Builder builder) {
        super(builder);
        this.custSpaceId = builder.custSpaceId;
        this.isvCode = builder.isvCode;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryChatappPhoneNumbersRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<QueryChatappPhoneNumbersRequest, Builder> {
        private String custSpaceId; 
        private String isvCode; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(QueryChatappPhoneNumbersRequest request) {
            super(request);
            this.custSpaceId = request.custSpaceId;
            this.isvCode = request.isvCode;
            this.status = request.status;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public QueryChatappPhoneNumbersRequest build() {
            return new QueryChatappPhoneNumbersRequest(this);
        } 

    } 

}
