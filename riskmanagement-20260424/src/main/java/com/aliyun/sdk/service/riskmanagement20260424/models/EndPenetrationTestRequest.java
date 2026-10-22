// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.riskmanagement20260424.models;

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
 * {@link EndPenetrationTestRequest} extends {@link RequestModel}
 *
 * <p>EndPenetrationTestRequest</p>
 */
public class EndPenetrationTestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private EndPenetrationTestRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EndPenetrationTestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<EndPenetrationTestRequest, Builder> {
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(EndPenetrationTestRequest request) {
            super(request);
            this.id = request.id;
        } 

        /**
         * <p>The unique identity sequence of the application record.</p>
         * <blockquote>
         * <p>The field type is Long. Precision loss may occur during the procedure to serialize or deserialize. Make sure that the value does not exceed 9007199254740991.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2398</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public EndPenetrationTestRequest build() {
            return new EndPenetrationTestRequest(this);
        } 

    } 

}
