// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRichTextRequest} extends {@link RequestModel}
 *
 * <p>CreateRichTextRequest</p>
 */
public class CreateRichTextRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private Long instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("richText")
    private String richText;

    private CreateRichTextRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.richText = builder.richText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRichTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return richText
     */
    public String getRichText() {
        return this.richText;
    }

    public static final class Builder extends Request.Builder<CreateRichTextRequest, Builder> {
        private Long instanceId; 
        private String instanceType; 
        private String richText; 

        private Builder() {
            super();
        } 

        private Builder(CreateRichTextRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.richText = request.richText;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * instanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * richText.
         */
        public Builder richText(String richText) {
            this.putBodyParameter("richText", richText);
            this.richText = richText;
            return this;
        }

        @Override
        public CreateRichTextRequest build() {
            return new CreateRichTextRequest(this);
        } 

    } 

}
