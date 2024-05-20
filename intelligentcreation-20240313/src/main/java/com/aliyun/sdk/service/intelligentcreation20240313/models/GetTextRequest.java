// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTextRequest} extends {@link RequestModel}
 *
 * <p>GetTextRequest</p>
 */
public class GetTextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("textId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long textId;

    private GetTextRequest(Builder builder) {
        super(builder);
        this.textId = builder.textId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return textId
     */
    public Long getTextId() {
        return this.textId;
    }

    public static final class Builder extends Request.Builder<GetTextRequest, Builder> {
        private Long textId; 

        private Builder() {
            super();
        } 

        private Builder(GetTextRequest request) {
            super(request);
            this.textId = request.textId;
        } 

        /**
         * textId.
         */
        public Builder textId(Long textId) {
            this.putPathParameter("textId", textId);
            this.textId = textId;
            return this;
        }

        @Override
        public GetTextRequest build() {
            return new GetTextRequest(this);
        } 

    } 

}
