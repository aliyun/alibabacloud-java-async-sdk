// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link CommitContactFlowVersionModificationRequest} extends {@link RequestModel}
 *
 * <p>CommitContactFlowVersionModificationRequest</p>
 */
public class CommitContactFlowVersionModificationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Canvas")
    @com.aliyun.core.annotation.Validation(required = true)
    private String canvas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactFlowVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactFlowVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CommitContactFlowVersionModificationRequest request) {
            super(request);
            this.canvas = request.canvas;
            this.contactFlowVersionId = request.contactFlowVersionId;
            this.content = request.content;
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder canvas(String canvas) {
            this.putBodyParameter("Canvas", canvas);
            this.canvas = canvas;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactFlowVersionId(String contactFlowVersionId) {
            this.putQueryParameter("ContactFlowVersionId", contactFlowVersionId);
            this.contactFlowVersionId = contactFlowVersionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
