// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetDataAgentSubAccountInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDataAgentSubAccountInfoRequest</p>
 */
public class GetDataAgentSubAccountInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DmsUnit")
    private String dmsUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubAccountId")
    private String subAccountId;

    private GetDataAgentSubAccountInfoRequest(Builder builder) {
        super(builder);
        this.dmsUnit = builder.dmsUnit;
        this.subAccountId = builder.subAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAgentSubAccountInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dmsUnit
     */
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    /**
     * @return subAccountId
     */
    public String getSubAccountId() {
        return this.subAccountId;
    }

    public static final class Builder extends Request.Builder<GetDataAgentSubAccountInfoRequest, Builder> {
        private String dmsUnit; 
        private String subAccountId; 

        private Builder() {
            super();
        } 

        private Builder(GetDataAgentSubAccountInfoRequest request) {
            super(request);
            this.dmsUnit = request.dmsUnit;
            this.subAccountId = request.subAccountId;
        } 

        /**
         * DmsUnit.
         */
        public Builder dmsUnit(String dmsUnit) {
            this.putQueryParameter("DmsUnit", dmsUnit);
            this.dmsUnit = dmsUnit;
            return this;
        }

        /**
         * SubAccountId.
         */
        public Builder subAccountId(String subAccountId) {
            this.putQueryParameter("SubAccountId", subAccountId);
            this.subAccountId = subAccountId;
            return this;
        }

        @Override
        public GetDataAgentSubAccountInfoRequest build() {
            return new GetDataAgentSubAccountInfoRequest(this);
        } 

    } 

}
