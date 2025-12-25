// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetSourceRequest} extends {@link RequestModel}
 *
 * <p>GetSourceRequest</p>
 */
public class GetSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    private GetSourceRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    public static final class Builder extends Request.Builder<GetSourceRequest, Builder> {
        private String sourceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceRequest request) {
            super(request);
            this.sourceId = request.sourceId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-d1596kem1hkv3o72qkdg</p>
         */
        public Builder sourceId(String sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        @Override
        public GetSourceRequest build() {
            return new GetSourceRequest(this);
        } 

    } 

}
