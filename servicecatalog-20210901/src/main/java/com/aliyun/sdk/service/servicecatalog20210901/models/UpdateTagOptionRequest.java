// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

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
 * {@link UpdateTagOptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateTagOptionRequest</p>
 */
public class UpdateTagOptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Active")
    private Boolean active;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagOptionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagOptionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String value;

    private UpdateTagOptionRequest(Builder builder) {
        super(builder);
        this.active = builder.active;
        this.tagOptionId = builder.tagOptionId;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTagOptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return tagOptionId
     */
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateTagOptionRequest, Builder> {
        private Boolean active; 
        private String tagOptionId; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTagOptionRequest request) {
            super(request);
            this.active = request.active;
            this.tagOptionId = request.tagOptionId;
            this.value = request.value;
        } 

        /**
         * <p>Specifies whether to enable the tag option. Valid values:</p>
         * <ul>
         * <li>true (default)</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder active(Boolean active) {
            this.putBodyParameter("Active", active);
            this.active = active;
            return this;
        }

        /**
         * <p>The ID of the tag option.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag-bp1u6mdf3d****</p>
         */
        public Builder tagOptionId(String tagOptionId) {
            this.putBodyParameter("TagOptionId", tagOptionId);
            this.tagOptionId = tagOptionId;
            return this;
        }

        /**
         * <p>The value of the tag option.</p>
         * <p>The value can be up to 128 characters in length. It cannot start with <code>acs:</code> and cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateTagOptionRequest build() {
            return new UpdateTagOptionRequest(this);
        } 

    } 

}
