// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContactFlowRequest} extends {@link RequestModel}
 *
 * <p>CommitContactFlowRequest</p>
 */
public class CommitContactFlowRequest extends Request {
    @Query
    @NameInMap("ContactFlowId")
    @Validation(required = true)
    private String contactFlowId;

    @Query
    @NameInMap("Definition")
    @Validation(required = true)
    private String definition;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("DraftId")
    @Validation(required = true)
    private String draftId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private CommitContactFlowRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.definition = builder.definition;
        this.description = builder.description;
        this.draftId = builder.draftId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitContactFlowRequest create() {
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
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CommitContactFlowRequest, Builder> {
        private String contactFlowId; 
        private String definition; 
        private String description; 
        private String draftId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CommitContactFlowRequest request) {
            super(request);
            this.contactFlowId = request.contactFlowId;
            this.definition = request.definition;
            this.description = request.description;
            this.draftId = request.draftId;
            this.instanceId = request.instanceId;
        } 

        /**
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.putQueryParameter("Definition", definition);
            this.definition = definition;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DraftId.
         */
        public Builder draftId(String draftId) {
            this.putQueryParameter("DraftId", draftId);
            this.draftId = draftId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public CommitContactFlowRequest build() {
            return new CommitContactFlowRequest(this);
        } 

    } 

}
