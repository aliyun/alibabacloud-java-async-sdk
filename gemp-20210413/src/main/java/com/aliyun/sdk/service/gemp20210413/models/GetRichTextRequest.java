// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRichTextRequest} extends {@link RequestModel}
 *
 * <p>GetRichTextRequest</p>
 */
public class GetRichTextRequest extends Request {
    @Body
    @NameInMap("instanceId")
    private Long instanceId;

    @Body
    @NameInMap("instanceType")
    private String instanceType;

    @Body
    @NameInMap("richTextId")
    private Long richTextId;

    private GetRichTextRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.richTextId = builder.richTextId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRichTextRequest create() {
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
     * @return richTextId
     */
    public Long getRichTextId() {
        return this.richTextId;
    }

    public static final class Builder extends Request.Builder<GetRichTextRequest, Builder> {
        private Long instanceId; 
        private String instanceType; 
        private Long richTextId; 

        private Builder() {
            super();
        } 

        private Builder(GetRichTextRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
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
         * richTextId.
         */
        public Builder richTextId(Long richTextId) {
            this.putBodyParameter("richTextId", richTextId);
            this.richTextId = richTextId;
            return this;
        }

        @Override
        public GetRichTextRequest build() {
            return new GetRichTextRequest(this);
        } 

    } 

}
