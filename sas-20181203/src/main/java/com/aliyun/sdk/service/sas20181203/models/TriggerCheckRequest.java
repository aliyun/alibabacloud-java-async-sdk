// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TriggerCheckRequest} extends {@link RequestModel}
 *
 * <p>TriggerCheckRequest</p>
 */
public class TriggerCheckRequest extends Request {
    private TriggerCheckRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<TriggerCheckRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(TriggerCheckRequest request) {
            super(request);
        } 

        @Override
        public TriggerCheckRequest build() {
            return new TriggerCheckRequest(this);
        } 

    } 

}
