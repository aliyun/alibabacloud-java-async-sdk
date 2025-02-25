// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateLabelRequest</p>
 */
public class UpdateLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    private UpdateLabelRequest(Builder builder) {
        super(builder);
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelContent
     */
    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    public static final class Builder extends Request.Builder<UpdateLabelRequest, Builder> {
        private String labelContent; 
        private String labelId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLabelRequest request) {
            super(request);
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
        } 

        /**
         * LabelContent.
         */
        public Builder labelContent(String labelContent) {
            this.putBodyParameter("LabelContent", labelContent);
            this.labelContent = labelContent;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        @Override
        public UpdateLabelRequest build() {
            return new UpdateLabelRequest(this);
        } 

    } 

}
