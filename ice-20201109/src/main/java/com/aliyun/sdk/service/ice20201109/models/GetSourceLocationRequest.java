// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetSourceLocationRequest} extends {@link RequestModel}
 *
 * <p>GetSourceLocationRequest</p>
 */
public class GetSourceLocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceLocationName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLocationName;

    private GetSourceLocationRequest(Builder builder) {
        super(builder);
        this.sourceLocationName = builder.sourceLocationName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceLocationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceLocationName
     */
    public String getSourceLocationName() {
        return this.sourceLocationName;
    }

    public static final class Builder extends Request.Builder<GetSourceLocationRequest, Builder> {
        private String sourceLocationName; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceLocationRequest request) {
            super(request);
            this.sourceLocationName = request.sourceLocationName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySourceLocation</p>
         */
        public Builder sourceLocationName(String sourceLocationName) {
            this.putQueryParameter("SourceLocationName", sourceLocationName);
            this.sourceLocationName = sourceLocationName;
            return this;
        }

        @Override
        public GetSourceLocationRequest build() {
            return new GetSourceLocationRequest(this);
        } 

    } 

}
