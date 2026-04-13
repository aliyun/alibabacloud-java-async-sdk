// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paicopilot20250731.models;

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
 * {@link CreateSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateSessionRequest</p>
 */
public class CreateSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private CreateSessionRequest(Builder builder) {
        super(builder);
        this.labels = builder.labels;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateSessionRequest, Builder> {
        private java.util.List<Label> labels; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateSessionRequest request) {
            super(request);
            this.labels = request.labels;
            this.title = request.title;
        } 

        /**
         * Labels.
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateSessionRequest build() {
            return new CreateSessionRequest(this);
        } 

    } 

}
