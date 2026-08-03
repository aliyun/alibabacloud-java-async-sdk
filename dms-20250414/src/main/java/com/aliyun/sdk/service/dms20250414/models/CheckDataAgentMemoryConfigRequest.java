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
 * {@link CheckDataAgentMemoryConfigRequest} extends {@link RequestModel}
 *
 * <p>CheckDataAgentMemoryConfigRequest</p>
 */
public class CheckDataAgentMemoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    private CheckDataAgentMemoryConfigRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckDataAgentMemoryConfigRequest create() {
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

    public static final class Builder extends Request.Builder<CheckDataAgentMemoryConfigRequest, Builder> {
        private String DMSUnit; 

        private Builder() {
            super();
        } 

        private Builder(CheckDataAgentMemoryConfigRequest request) {
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
        public CheckDataAgentMemoryConfigRequest build() {
            return new CheckDataAgentMemoryConfigRequest(this);
        } 

    } 

}
