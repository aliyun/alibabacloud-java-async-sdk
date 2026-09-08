// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link PublishContactFlowRequest} extends {@link RequestModel}
 *
 * <p>PublishContactFlowRequest</p>
 */
public class PublishContactFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactFlowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String draftId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private PublishContactFlowRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.draftId = builder.draftId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishContactFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return draftId
     */
    public String getDraftId() {
        return this.draftId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<PublishContactFlowRequest, Builder> {
        private String contactFlowId; 
        private String draftId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(PublishContactFlowRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.draftId = request.draftId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The contact flow ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b0a063bf-f138-42a4-ad9f-9babe3ec1a9e</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>The draft ID. This is the ID of the draft version that corresponds to the current contact flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0e0b8e78-af3e-4360-a5c5-f9bb5c2b8af2</p>
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public PublishContactFlowRequest build() {
            return new PublishContactFlowRequest(this);
        } 

    } 

}
