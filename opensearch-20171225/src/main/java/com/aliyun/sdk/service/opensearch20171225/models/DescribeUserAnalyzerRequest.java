// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserAnalyzerRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserAnalyzerRequest</p>
 */
public class DescribeUserAnalyzerRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("with")
    private String with;

    private DescribeUserAnalyzerRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.with = builder.with;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserAnalyzerRequest create() {
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

    /**
     * @return with
     */
    public String getWith() {
        return this.with;
    }

    public static final class Builder extends Request.Builder<DescribeUserAnalyzerRequest, Builder> {
        private String name; 
        private String with; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserAnalyzerRequest request) {
            super(request);
            this.name = request.name;
            this.with = request.with;
        } 

        /**
         * kevin_test
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * all
         */
        public Builder with(String with) {
            this.putQueryParameter("with", with);
            this.with = with;
            return this;
        }

        @Override
        public DescribeUserAnalyzerRequest build() {
            return new DescribeUserAnalyzerRequest(this);
        } 

    } 

}
