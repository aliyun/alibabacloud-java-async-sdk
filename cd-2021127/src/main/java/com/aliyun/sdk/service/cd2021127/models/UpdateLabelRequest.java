// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link UpdateLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateLabelRequest</p>
 */
public class UpdateLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(maxLength = 32, minLength = 1)
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String labelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32, minLength = 1)
    private String title;

    private UpdateLabelRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
        this.label = builder.label;
        this.labelId = builder.labelId;
        this.title = builder.title;
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
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateLabelRequest, Builder> {
        private String country; 
        private String label; 
        private String labelId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLabelRequest request) {
            super(request);
            this.country = request.country;
            this.label = request.label;
            this.labelId = request.labelId;
            this.title = request.title;
        } 

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putBodyParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef123</p>
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>title</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateLabelRequest build() {
            return new UpdateLabelRequest(this);
        } 

    } 

}
