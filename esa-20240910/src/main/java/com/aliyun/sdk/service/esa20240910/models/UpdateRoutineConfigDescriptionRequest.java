// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateRoutineConfigDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateRoutineConfigDescriptionRequest</p>
 */
public class UpdateRoutineConfigDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private UpdateRoutineConfigDescriptionRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoutineConfigDescriptionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateRoutineConfigDescriptionRequest, Builder> {
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRoutineConfigDescriptionRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * <p>The routine description.</p>
         * 
         * <strong>example:</strong>
         * <p>description of this routine</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The routine name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-routine1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateRoutineConfigDescriptionRequest build() {
            return new UpdateRoutineConfigDescriptionRequest(this);
        } 

    } 

}
