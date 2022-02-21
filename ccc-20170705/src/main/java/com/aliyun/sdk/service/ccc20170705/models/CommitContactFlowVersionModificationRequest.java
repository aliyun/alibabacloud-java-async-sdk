// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CommitContactFlowVersionModificationRequest} extends {@link RequestModel}
 *
 * <p>CommitContactFlowVersionModificationRequest</p>
 */
public class CommitContactFlowVersionModificationRequest extends Request {
    @Body
    @NameInMap("Canvas")
    @Validation(required = true)
    private String canvas;

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

    private CommitContactFlowVersionModificationRequest(Builder builder) {
        super(builder);
        this.canvas = builder.canvas;
        this.contactFlowVersionId = builder.contactFlowVersionId;
        this.content = builder.content;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitContactFlowVersionModificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canvas
     */
    public String getCanvas() {
        return this.canvas;
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

    public static final class Builder extends Request.Builder<CommitContactFlowVersionModificationRequest, Builder> {
        private String canvas; 
        private String contactFlowVersionId; 
        private String content; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CommitContactFlowVersionModificationRequest response) {
            super(response);
            this.canvas = response.canvas;
            this.contactFlowVersionId = response.contactFlowVersionId;
            this.content = response.content;
            this.instanceId = response.instanceId;
        } 

        /**
         * Canvas.
         */
        public Builder canvas(String canvas) {
            this.putBodyParameter("Canvas", canvas);
            this.canvas = canvas;
            return this;
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

        @Override
        public CommitContactFlowVersionModificationRequest build() {
            return new CommitContactFlowVersionModificationRequest(this);
        } 

    } 

}
