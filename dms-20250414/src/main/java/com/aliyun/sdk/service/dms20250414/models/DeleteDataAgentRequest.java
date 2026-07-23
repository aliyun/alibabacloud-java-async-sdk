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
 * {@link DeleteDataAgentRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataAgentRequest</p>
 */
public class DeleteDataAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    private DeleteDataAgentRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public static final class Builder extends Request.Builder<DeleteDataAgentRequest, Builder> {
        private String DMSUnit; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataAgentRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        @Override
        public DeleteDataAgentRequest build() {
            return new DeleteDataAgentRequest(this);
        } 

    } 

}
