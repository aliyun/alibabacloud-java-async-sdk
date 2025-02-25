// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserAnalyzerRequest</p>
 */
public class RemoveUserAnalyzerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private RemoveUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserAnalyzerRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveUserAnalyzerRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserAnalyzerRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the analyzer.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public RemoveUserAnalyzerRequest build() {
            return new RemoveUserAnalyzerRequest(this);
        } 

    } 

}
