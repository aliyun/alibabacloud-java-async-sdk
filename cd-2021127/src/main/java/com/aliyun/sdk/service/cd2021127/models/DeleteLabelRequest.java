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
 * {@link DeleteLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteLabelRequest</p>
 */
public class DeleteLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String labelId;

    private DeleteLabelRequest(Builder builder) {
        super(builder);
        this.country = builder.country;
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
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    public static final class Builder extends Request.Builder<DeleteLabelRequest, Builder> {
        private String country; 
        private String labelId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLabelRequest request) {
            super(request);
            this.country = request.country;
            this.labelId = request.labelId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef</p>
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
