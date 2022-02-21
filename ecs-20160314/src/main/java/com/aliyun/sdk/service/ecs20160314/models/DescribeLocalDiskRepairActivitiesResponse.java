// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLocalDiskRepairActivitiesResponse} extends {@link TeaModel}
 *
 * <p>DescribeLocalDiskRepairActivitiesResponse</p>
 */
public class DescribeLocalDiskRepairActivitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLocalDiskRepairActivitiesResponseBody body;

    private DescribeLocalDiskRepairActivitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLocalDiskRepairActivitiesResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public DescribeLocalDiskRepairActivitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLocalDiskRepairActivitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLocalDiskRepairActivitiesResponseBody body);

        @Override
        DescribeLocalDiskRepairActivitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLocalDiskRepairActivitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLocalDiskRepairActivitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLocalDiskRepairActivitiesResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeLocalDiskRepairActivitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLocalDiskRepairActivitiesResponse build() {
            return new DescribeLocalDiskRepairActivitiesResponse(this);
        } 

    } 

}
