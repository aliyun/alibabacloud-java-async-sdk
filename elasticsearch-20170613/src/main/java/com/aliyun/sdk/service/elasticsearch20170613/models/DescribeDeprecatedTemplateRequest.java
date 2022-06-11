// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeprecatedTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeprecatedTemplateRequest</p>
 */
public class DescribeDeprecatedTemplateRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    private String instanceId;

    @Path
    @NameInMap("name")
    private String name;

    @Body
    @NameInMap("body")
    private String body;

    private DescribeDeprecatedTemplateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeprecatedTemplateRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DescribeDeprecatedTemplateRequest, Builder> {
        private String instanceId; 
        private String name; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeprecatedTemplateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.name = request.name;
            this.body = request.body;
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
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DescribeDeprecatedTemplateRequest build() {
            return new DescribeDeprecatedTemplateRequest(this);
        } 

    } 

}
