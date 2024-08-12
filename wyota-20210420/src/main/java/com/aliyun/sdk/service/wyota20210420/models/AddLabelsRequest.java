// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLabelsRequest} extends {@link RequestModel}
 *
 * <p>AddLabelsRequest</p>
 */
public class AddLabelsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContents")
    private String labelContents;

    private AddLabelsRequest(Builder builder) {
        super(builder);
        this.labelContents = builder.labelContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLabelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labelContents
     */
    public String getLabelContents() {
        return this.labelContents;
    }

    public static final class Builder extends Request.Builder<AddLabelsRequest, Builder> {
        private String labelContents; 

        private Builder() {
            super();
        } 

        private Builder(AddLabelsRequest request) {
            super(request);
            this.labelContents = request.labelContents;
        } 

        /**
         * LabelContents.
         */
        public Builder labelContents(String labelContents) {
            this.putBodyParameter("LabelContents", labelContents);
            this.labelContents = labelContents;
            return this;
        }

        @Override
        public AddLabelsRequest build() {
            return new AddLabelsRequest(this);
        } 

    } 

}
