// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveInterventionDictionaryRequest} extends {@link RequestModel}
 *
 * <p>RemoveInterventionDictionaryRequest</p>
 */
public class RemoveInterventionDictionaryRequest extends Request {
    @Path
    @NameInMap("name")
    private String name;

    private RemoveInterventionDictionaryRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveInterventionDictionaryRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveInterventionDictionaryRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(RemoveInterventionDictionaryRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * "my_dict"
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public RemoveInterventionDictionaryRequest build() {
            return new RemoveInterventionDictionaryRequest(this);
        } 

    } 

}
