// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRichTextRequest} extends {@link RequestModel}
 *
 * <p>CreateRichTextRequest</p>
 */
public class CreateRichTextRequest extends Request {
    @Body
    @NameInMap("instanceId")
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    @Body
    @NameInMap("richText")
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

        private Builder(CreateRichTextRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.instanceType = response.instanceType;
            this.richText = response.richText;
        } 

        /**
         * 资源id
         */
        public Builder instanceId(Long instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 资源类型
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("instanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * 文本内容
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
