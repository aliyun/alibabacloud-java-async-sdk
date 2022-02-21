// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInterventionDictionaryRequest} extends {@link RequestModel}
 *
 * <p>CreateInterventionDictionaryRequest</p>
 */
public class CreateInterventionDictionaryRequest extends Request {
    private CreateInterventionDictionaryRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInterventionDictionaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<CreateInterventionDictionaryRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(CreateInterventionDictionaryRequest response) {
            super(response);
        } 

        @Override
        public CreateInterventionDictionaryRequest build() {
            return new CreateInterventionDictionaryRequest(this);
        } 

    } 

}
