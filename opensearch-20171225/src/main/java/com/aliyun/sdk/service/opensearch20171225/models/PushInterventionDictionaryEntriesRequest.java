// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushInterventionDictionaryEntriesRequest} extends {@link RequestModel}
 *
 * <p>PushInterventionDictionaryEntriesRequest</p>
 */
public class PushInterventionDictionaryEntriesRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    private PushInterventionDictionaryEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushInterventionDictionaryEntriesRequest create() {
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

    public static final class Builder extends Request.Builder<PushInterventionDictionaryEntriesRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(PushInterventionDictionaryEntriesRequest response) {
            super(response);
            this.name = response.name;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public PushInterventionDictionaryEntriesRequest build() {
            return new PushInterventionDictionaryEntriesRequest(this);
        } 

    } 

}
