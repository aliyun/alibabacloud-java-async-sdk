// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIndexTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeIndexTemplateRequest</p>
 */
public class DescribeIndexTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("IndexTemplate")
    @Validation(required = true)
    private String indexTemplate;

    private DescribeIndexTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexTemplate = builder.indexTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIndexTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return indexTemplate
     */
    public String getIndexTemplate() {
        return this.indexTemplate;
    }

    public static final class Builder extends Request.Builder<DescribeIndexTemplateRequest, Builder> {
        private String instanceId; 
        private String indexTemplate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIndexTemplateRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.indexTemplate = response.indexTemplate;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IndexTemplate.
         */
        public Builder indexTemplate(String indexTemplate) {
            this.putPathParameter("IndexTemplate", indexTemplate);
            this.indexTemplate = indexTemplate;
            return this;
        }

        @Override
        public DescribeIndexTemplateRequest build() {
            return new DescribeIndexTemplateRequest(this);
        } 

    } 

}
