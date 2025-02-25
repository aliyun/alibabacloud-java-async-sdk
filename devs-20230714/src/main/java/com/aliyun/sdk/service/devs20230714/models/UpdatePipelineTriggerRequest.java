// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePipelineTriggerRequest} extends {@link RequestModel}
 *
 * <p>UpdatePipelineTriggerRequest</p>
 */
public class UpdatePipelineTriggerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private PipelineTrigger body;

    private UpdatePipelineTriggerRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePipelineTriggerRequest create() {
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
     * @return body
     */
    public PipelineTrigger getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePipelineTriggerRequest, Builder> {
        private String name; 
        private PipelineTrigger body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePipelineTriggerRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
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
        public Builder body(PipelineTrigger body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePipelineTriggerRequest build() {
            return new UpdatePipelineTriggerRequest(this);
        } 

    } 

}
