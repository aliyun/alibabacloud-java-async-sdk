// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRichTextRequest} extends {@link RequestModel}
 *
 * <p>UpdateRichTextRequest</p>
 */
public class UpdateRichTextRequest extends Request {
    @Body
    @NameInMap("instanceId")
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    @Body
    @NameInMap("richText")
    private String richText;

    @Body
    @NameInMap("richTextId")
    private Long richTextId;

    private UpdateRichTextRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.richText = builder.richText;
        this.richTextId = builder.richTextId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRichTextRequest create() {
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

    /**
     * @return richTextId
     */
    public Long getRichTextId() {
        return this.richTextId;
    }

    public static final class Builder extends Request.Builder<UpdateRichTextRequest, Builder> {
        private Long instanceId; 
        private String instanceType; 
        private String richText; 
        private Long richTextId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRichTextRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.richText = request.richText;
            this.richTextId = request.richTextId;
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

        /**
         * richTextId.
         */
        public Builder richTextId(Long richTextId) {
            this.putBodyParameter("richTextId", richTextId);
            this.richTextId = richTextId;
            return this;
        }

        @Override
        public UpdateRichTextRequest build() {
            return new UpdateRichTextRequest(this);
        } 

    } 

}
