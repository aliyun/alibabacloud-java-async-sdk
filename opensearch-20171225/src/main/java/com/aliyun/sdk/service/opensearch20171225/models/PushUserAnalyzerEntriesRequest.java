// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushUserAnalyzerEntriesRequest} extends {@link RequestModel}
 *
 * <p>PushUserAnalyzerEntriesRequest</p>
 */
public class PushUserAnalyzerEntriesRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    private PushUserAnalyzerEntriesRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushUserAnalyzerEntriesRequest create() {
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

    public static final class Builder extends Request.Builder<PushUserAnalyzerEntriesRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(PushUserAnalyzerEntriesRequest response) {
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
        public PushUserAnalyzerEntriesRequest build() {
            return new PushUserAnalyzerEntriesRequest(this);
        } 

    } 

}
