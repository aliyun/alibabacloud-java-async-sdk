// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateMergedTableRequest} extends {@link RequestModel}
 *
 * <p>GenerateMergedTableRequest</p>
 */
public class GenerateMergedTableRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Schema body;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("spec")
    private String spec;

    private GenerateMergedTableRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
        this.spec = builder.spec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateMergedTableRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public Schema getBody() {
        return this.body;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    public static final class Builder extends Request.Builder<GenerateMergedTableRequest, Builder> {
        private Schema body; 
        private String spec; 

        private Builder() {
            super();
        } 

        private Builder(GenerateMergedTableRequest request) {
            super(request);
            this.body = request.body;
            this.spec = request.spec;
        } 

        /**
         * The request body parameters.
         */
        public Builder body(Schema body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The specifications of the OpenSearch instance. This parameter is used to check whether the OpenSearch instance meets the special limits on an exclusive instance.
         * <p>
         * 
         * Default value: opensearch.share.common.
         * 
         * For more information, see the description of the spec field in the Quota topic.
         */
        public Builder spec(String spec) {
            this.putQueryParameter("spec", spec);
            this.spec = spec;
            return this;
        }

        @Override
        public GenerateMergedTableRequest build() {
            return new GenerateMergedTableRequest(this);
        } 

    } 

}
