// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduledTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateScheduledTaskRequest</p>
 */
public class CreateScheduledTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private ScheduledTask body;

    private CreateScheduledTaskRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScheduledTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return body
     */
    public ScheduledTask getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateScheduledTaskRequest, Builder> {
        private String appGroupIdentity; 
        private ScheduledTask body; 

        private Builder() {
            super();
        } 

        private Builder(CreateScheduledTaskRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.body = request.body;
        } 

        /**
         * my_app_group_name
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * 请求体
         */
        public Builder body(ScheduledTask body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateScheduledTaskRequest build() {
            return new CreateScheduledTaskRequest(this);
        } 

    } 

}
