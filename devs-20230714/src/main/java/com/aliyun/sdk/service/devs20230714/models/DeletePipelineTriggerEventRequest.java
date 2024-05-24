// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelineTriggerEventRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelineTriggerEventRequest</p>
 */
public class DeletePipelineTriggerEventRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private DeletePipelineTriggerEventRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelineTriggerEventRequest create() {
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

    public static final class Builder extends Request.Builder<DeletePipelineTriggerEventRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelineTriggerEventRequest request) {
            super(request);
            this.name = request.name;
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
        public DeletePipelineTriggerEventRequest build() {
            return new DeletePipelineTriggerEventRequest(this);
        } 

    } 

}
