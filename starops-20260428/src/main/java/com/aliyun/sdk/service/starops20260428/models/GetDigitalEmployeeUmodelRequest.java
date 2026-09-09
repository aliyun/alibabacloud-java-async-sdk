// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link GetDigitalEmployeeUmodelRequest} extends {@link RequestModel}
 *
 * <p>GetDigitalEmployeeUmodelRequest</p>
 */
public class GetDigitalEmployeeUmodelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    private GetDigitalEmployeeUmodelRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDigitalEmployeeUmodelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetDigitalEmployeeUmodelRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetDigitalEmployeeUmodelRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The name of the digital employee whose UModel you want to query.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample-agent</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetDigitalEmployeeUmodelRequest build() {
            return new GetDigitalEmployeeUmodelRequest(this);
        } 

    } 

}
