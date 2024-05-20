// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTextTaskRequest} extends {@link RequestModel}
 *
 * <p>GetTextTaskRequest</p>
 */
public class GetTextTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("textTaskId")
    private Long textTaskId;

    private GetTextTaskRequest(Builder builder) {
        super(builder);
        this.textTaskId = builder.textTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTextTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return textTaskId
     */
    public Long getTextTaskId() {
        return this.textTaskId;
    }

    public static final class Builder extends Request.Builder<GetTextTaskRequest, Builder> {
        private Long textTaskId; 

        private Builder() {
            super();
        } 

        private Builder(GetTextTaskRequest request) {
            super(request);
            this.textTaskId = request.textTaskId;
        } 

        /**
         * textTaskId.
         */
        public Builder textTaskId(Long textTaskId) {
            this.putPathParameter("textTaskId", textTaskId);
            this.textTaskId = textTaskId;
            return this;
        }

        @Override
        public GetTextTaskRequest build() {
            return new GetTextTaskRequest(this);
        } 

    } 

}
