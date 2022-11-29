// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentRevisionsRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentRevisionsRequest</p>
 */
public class ListEnvironmentRevisionsRequest extends Request {
    @Query
    @NameInMap("environmentName")
    @Validation(required = true)
    private String environmentName;

    private ListEnvironmentRevisionsRequest(Builder builder) {
        super(builder);
        this.environmentName = builder.environmentName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentRevisionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return environmentName
     */
    public String getEnvironmentName() {
        return this.environmentName;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentRevisionsRequest, Builder> {
        private String environmentName; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentRevisionsRequest request) {
            super(request);
            this.environmentName = request.environmentName;
        } 

        /**
         * The name of an environment.
         */
        public Builder environmentName(String environmentName) {
            this.putQueryParameter("environmentName", environmentName);
            this.environmentName = environmentName;
            return this;
        }

        @Override
        public ListEnvironmentRevisionsRequest build() {
            return new ListEnvironmentRevisionsRequest(this);
        } 

    } 

}
