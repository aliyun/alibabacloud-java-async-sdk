// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetIllustrationTaskRequest} extends {@link RequestModel}
 *
 * <p>GetIllustrationTaskRequest</p>
 */
public class GetIllustrationTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("textId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long textId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("illustrationTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long illustrationTaskId;

    private GetIllustrationTaskRequest(Builder builder) {
        super(builder);
        this.textId = builder.textId;
        this.illustrationTaskId = builder.illustrationTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIllustrationTaskRequest create() {
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
     * @return illustrationTaskId
     */
    public Long getIllustrationTaskId() {
        return this.illustrationTaskId;
    }

    public static final class Builder extends Request.Builder<GetIllustrationTaskRequest, Builder> {
        private Long textId; 
        private Long illustrationTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetIllustrationTaskRequest request) {
            super(request);
            this.textId = request.textId;
            this.illustrationTaskId = request.illustrationTaskId;
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
        public Builder illustrationTaskId(Long illustrationTaskId) {
            this.putPathParameter("illustrationTaskId", illustrationTaskId);
            this.illustrationTaskId = illustrationTaskId;
            return this;
        }

        @Override
        public GetIllustrationTaskRequest build() {
            return new GetIllustrationTaskRequest(this);
        } 

    } 

}
