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
 * {@link DiscardEditingContactFlowRequest} extends {@link RequestModel}
 *
 * <p>DiscardEditingContactFlowRequest</p>
 */
public class DiscardEditingContactFlowRequest extends Request {
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

    private DiscardEditingContactFlowRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.draftId = builder.draftId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiscardEditingContactFlowRequest create() {
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

    public static final class Builder extends Request.Builder<DiscardEditingContactFlowRequest, Builder> {
        private String contactFlowId; 
        private String draftId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DiscardEditingContactFlowRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.draftId = request.draftId;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3ff4e021-fd63-4572-ad8c-10ed69972965</p>
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
         * <p>0aa493d6-58eb-4290-9ba2-e1c2c615b46b</p>
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
        public DiscardEditingContactFlowRequest build() {
            return new DiscardEditingContactFlowRequest(this);
        } 

    } 

}
