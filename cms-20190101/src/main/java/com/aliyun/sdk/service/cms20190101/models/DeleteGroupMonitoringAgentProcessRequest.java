// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGroupMonitoringAgentProcessRequest} extends {@link RequestModel}
 *
 * <p>DeleteGroupMonitoringAgentProcessRequest</p>
 */
public class DeleteGroupMonitoringAgentProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    private DeleteGroupMonitoringAgentProcessRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGroupMonitoringAgentProcessRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder extends Request.Builder<DeleteGroupMonitoringAgentProcessRequest, Builder> {
        private String groupId; 
        private String id; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGroupMonitoringAgentProcessRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.id = request.id;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the process monitoring task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>48F83746-C817-478C-9B06-7158F56B****</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public DeleteGroupMonitoringAgentProcessRequest build() {
            return new DeleteGroupMonitoringAgentProcessRequest(this);
        } 

    } 

}
