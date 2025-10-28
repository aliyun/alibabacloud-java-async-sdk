// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link ListSummariesRequest} extends {@link RequestModel}
 *
 * <p>ListSummariesRequest</p>
 */
public class ListSummariesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Option")
    private String option;

    private ListSummariesRequest(Builder builder) {
        super(builder);
        this.option = builder.option;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSummariesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    public static final class Builder extends Request.Builder<ListSummariesRequest, Builder> {
        private String option; 

        private Builder() {
            super();
        } 

        private Builder(ListSummariesRequest request) {
            super(request);
            this.option = request.option;
        } 

        /**
         * Option.
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        @Override
        public ListSummariesRequest build() {
            return new ListSummariesRequest(this);
        } 

    } 

}
