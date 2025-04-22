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
 * {@link ListQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListQuotasRequest</p>
 */
public class ListQuotasRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private ListQuotasRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotasRequest create() {
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

    public static final class Builder extends Request.Builder<ListQuotasRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotasRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The quota name. Fuzzy search is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>quota-name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ListQuotasRequest build() {
            return new ListQuotasRequest(this);
        } 

    } 

}
