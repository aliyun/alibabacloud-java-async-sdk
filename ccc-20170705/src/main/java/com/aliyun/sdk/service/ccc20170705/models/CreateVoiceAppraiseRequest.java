// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVoiceAppraiseRequest} extends {@link RequestModel}
 *
 * <p>CreateVoiceAppraiseRequest</p>
 */
public class CreateVoiceAppraiseRequest extends Request {
    @Query
    @NameInMap("ContactFlowVersionId")
    @Validation(required = true)
    private String contactFlowVersionId;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("IsAppraise")
    private Boolean isAppraise;

    private CreateVoiceAppraiseRequest(Builder builder) {
        super(builder);
        this.contactFlowVersionId = builder.contactFlowVersionId;
        this.content = builder.content;
        this.instanceId = builder.instanceId;
        this.isAppraise = builder.isAppraise;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVoiceAppraiseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowVersionId
     */
    public String getContactFlowVersionId() {
        return this.contactFlowVersionId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isAppraise
     */
    public Boolean getIsAppraise() {
        return this.isAppraise;
    }

    public static final class Builder extends Request.Builder<CreateVoiceAppraiseRequest, Builder> {
        private String contactFlowVersionId; 
        private String content; 
        private String instanceId; 
        private Boolean isAppraise; 

        private Builder() {
            super();
        } 

        private Builder(CreateVoiceAppraiseRequest response) {
            super(response);
            this.contactFlowVersionId = response.contactFlowVersionId;
            this.content = response.content;
            this.instanceId = response.instanceId;
            this.isAppraise = response.isAppraise;
        } 

        /**
         * ContactFlowVersionId.
         */
        public Builder contactFlowVersionId(String contactFlowVersionId) {
            this.putQueryParameter("ContactFlowVersionId", contactFlowVersionId);
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
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

        /**
         * IsAppraise.
         */
        public Builder isAppraise(Boolean isAppraise) {
            this.putQueryParameter("IsAppraise", isAppraise);
            this.isAppraise = isAppraise;
            return this;
        }

        @Override
        public CreateVoiceAppraiseRequest build() {
            return new CreateVoiceAppraiseRequest(this);
        } 

    } 

}
