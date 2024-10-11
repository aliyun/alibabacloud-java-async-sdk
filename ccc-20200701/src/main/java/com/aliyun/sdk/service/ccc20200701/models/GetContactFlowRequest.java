// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetContactFlowRequest} extends {@link RequestModel}
 *
 * <p>GetContactFlowRequest</p>
 */
public class GetContactFlowRequest extends Request {
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

    private GetContactFlowRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.draftId = builder.draftId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContactFlowRequest create() {
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

    public static final class Builder extends Request.Builder<GetContactFlowRequest, Builder> {
        private String contactFlowId; 
        private String draftId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetContactFlowRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.draftId = request.draftId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>274601be-a6d5-4429-bcef-32b51d031c6e</p>
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>566399d7-5558-447c-a72f-9be2768b6a82</p>
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        /**
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
        public GetContactFlowRequest build() {
            return new GetContactFlowRequest(this);
        } 

    } 

}
