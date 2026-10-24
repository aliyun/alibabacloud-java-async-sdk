// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link DescribeSimilarEventScenariosRequest} extends {@link RequestModel}
 *
 * <p>DescribeSimilarEventScenariosRequest</p>
 */
public class DescribeSimilarEventScenariosRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityEventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long securityEventId;

    private DescribeSimilarEventScenariosRequest(Builder builder) {
        super(builder);
        this.securityEventId = builder.securityEventId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSimilarEventScenariosRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityEventId
     */
    public Long getSecurityEventId() {
        return this.securityEventId;
    }

    public static final class Builder extends Request.Builder<DescribeSimilarEventScenariosRequest, Builder> {
        private Long securityEventId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSimilarEventScenariosRequest request) {
            super(request);
            this.securityEventId = request.securityEventId;
        } 

        /**
         * <p>The ID of the alert event.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12321</p>
         */
        public Builder securityEventId(Long securityEventId) {
            this.putQueryParameter("SecurityEventId", securityEventId);
            this.securityEventId = securityEventId;
            return this;
        }

        @Override
        public DescribeSimilarEventScenariosRequest build() {
            return new DescribeSimilarEventScenariosRequest(this);
        } 

    } 

}
