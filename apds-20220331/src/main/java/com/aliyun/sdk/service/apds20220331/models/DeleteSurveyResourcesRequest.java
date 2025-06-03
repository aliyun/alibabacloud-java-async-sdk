// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apds20220331.models;

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
 * {@link DeleteSurveyResourcesRequest} extends {@link RequestModel}
 *
 * <p>DeleteSurveyResourcesRequest</p>
 */
public class DeleteSurveyResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ids;

    private DeleteSurveyResourcesRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSurveyResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    public static final class Builder extends Request.Builder<DeleteSurveyResourcesRequest, Builder> {
        private String ids; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSurveyResourcesRequest request) {
            super(request);
            this.ids = request.ids;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder ids(String ids) {
            this.putQueryParameter("ids", ids);
            this.ids = ids;
            return this;
        }

        @Override
        public DeleteSurveyResourcesRequest build() {
            return new DeleteSurveyResourcesRequest(this);
        } 

    } 

}
