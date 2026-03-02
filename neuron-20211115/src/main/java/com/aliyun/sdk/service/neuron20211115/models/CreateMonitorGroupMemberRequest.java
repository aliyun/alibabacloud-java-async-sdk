// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateMonitorGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorGroupMemberRequest</p>
 */
public class CreateMonitorGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorGroupMemberCreateCmd body;

    private CreateMonitorGroupMemberRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorGroupMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return body
     */
    public MonitorGroupMemberCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMonitorGroupMemberRequest, Builder> {
        private String groupId; 
        private MonitorGroupMemberCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorGroupMemberRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>71234</p>
         */
        public Builder groupId(String groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorGroupMemberCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorGroupMemberRequest build() {
            return new CreateMonitorGroupMemberRequest(this);
        } 

    } 

}
