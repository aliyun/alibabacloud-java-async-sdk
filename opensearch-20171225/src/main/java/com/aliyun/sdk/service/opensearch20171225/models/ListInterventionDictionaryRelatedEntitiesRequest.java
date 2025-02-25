// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInterventionDictionaryRelatedEntitiesRequest} extends {@link RequestModel}
 *
 * <p>ListInterventionDictionaryRelatedEntitiesRequest</p>
 */
public class ListInterventionDictionaryRelatedEntitiesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private ListInterventionDictionaryRelatedEntitiesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterventionDictionaryRelatedEntitiesRequest create() {
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

    public static final class Builder extends Request.Builder<ListInterventionDictionaryRelatedEntitiesRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListInterventionDictionaryRelatedEntitiesRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * my_dict
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListInterventionDictionaryRelatedEntitiesRequest build() {
            return new ListInterventionDictionaryRelatedEntitiesRequest(this);
        } 

    } 

}
