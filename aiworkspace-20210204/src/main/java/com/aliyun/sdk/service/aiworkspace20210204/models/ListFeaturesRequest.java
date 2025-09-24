// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link ListFeaturesRequest} extends {@link RequestModel}
 *
 * <p>ListFeaturesRequest</p>
 */
public class ListFeaturesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Names")
    private String names;

    private ListFeaturesRequest(Builder builder) {
        super(builder);
        this.names = builder.names;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeaturesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return names
     */
    public String getNames() {
        return this.names;
    }

    public static final class Builder extends Request.Builder<ListFeaturesRequest, Builder> {
        private String names; 

        private Builder() {
            super();
        } 

        private Builder(ListFeaturesRequest request) {
            super(request);
            this.names = request.names;
        } 

        /**
         * Names.
         */
        public Builder names(String names) {
            this.putQueryParameter("Names", names);
            this.names = names;
            return this;
        }

        @Override
        public ListFeaturesRequest build() {
            return new ListFeaturesRequest(this);
        } 

    } 

}
