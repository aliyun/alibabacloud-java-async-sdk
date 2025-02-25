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
 * {@link CreateRoutineRequest} extends {@link RequestModel}
 *
 * <p>CreateRoutineRequest</p>
 */
public class CreateRoutineRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpecName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String specName;

    private CreateRoutineRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.specName = builder.specName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoutineRequest create() {
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

    /**
     * @return specName
     */
    public String getSpecName() {
        return this.specName;
    }

    public static final class Builder extends Request.Builder<CreateRoutineRequest, Builder> {
        private String description; 
        private String name; 
        private String specName; 

        private Builder() {
            super();
        } 

        private Builder(CreateRoutineRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.specName = request.specName;
        } 

        /**
         * <p>The routine description.</p>
         * 
         * <strong>example:</strong>
         * <p>the description of this routine</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The routine name, which must be unique in the same account.</p>
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

        /**
         * <p>The specification of the routine.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ms</p>
         */
        public Builder specName(String specName) {
            this.putBodyParameter("SpecName", specName);
            this.specName = specName;
            return this;
        }

        @Override
        public CreateRoutineRequest build() {
            return new CreateRoutineRequest(this);
        } 

    } 

}
