// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIllustrationRequest} extends {@link RequestModel}
 *
 * <p>GetIllustrationRequest</p>
 */
public class GetIllustrationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("textId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long textId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("illustrationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long illustrationId;

    private GetIllustrationRequest(Builder builder) {
        super(builder);
        this.textId = builder.textId;
        this.illustrationId = builder.illustrationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIllustrationRequest create() {
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

    /**
     * @return illustrationId
     */
    public Long getIllustrationId() {
        return this.illustrationId;
    }

    public static final class Builder extends Request.Builder<GetIllustrationRequest, Builder> {
        private Long textId; 
        private Long illustrationId; 

        private Builder() {
            super();
        } 

        private Builder(GetIllustrationRequest request) {
            super(request);
            this.textId = request.textId;
            this.illustrationId = request.illustrationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder textId(Long textId) {
            this.putPathParameter("textId", textId);
            this.textId = textId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder illustrationId(Long illustrationId) {
            this.putPathParameter("illustrationId", illustrationId);
            this.illustrationId = illustrationId;
            return this;
        }

        @Override
        public GetIllustrationRequest build() {
            return new GetIllustrationRequest(this);
        } 

    } 

}
