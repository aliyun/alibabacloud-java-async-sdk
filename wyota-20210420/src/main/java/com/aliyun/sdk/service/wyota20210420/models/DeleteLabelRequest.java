// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteLabelRequest</p>
 */
public class DeleteLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    @com.aliyun.core.annotation.Validation(required = true)
    private String force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    private DeleteLabelRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLabelRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public String getForce() {
        return this.force;
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

    public static final class Builder extends Request.Builder<DeleteLabelRequest, Builder> {
        private String force; 
        private String labelContent; 
        private String labelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLabelRequest request) {
            super(request);
            this.force = request.force;
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
        } 

        /**
         * Force.
         */
        public Builder force(String force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
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
        public DeleteLabelRequest build() {
            return new DeleteLabelRequest(this);
        } 

    } 

}
