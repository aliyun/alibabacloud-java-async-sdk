// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCorpNumberGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateCorpNumberGroupRequest</p>
 */
public class CreateCorpNumberGroupRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreateCorpNumberGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCorpNumberGroupRequest create() {
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

    public static final class Builder extends Request.Builder<CreateCorpNumberGroupRequest, Builder> {
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreateCorpNumberGroupRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreateCorpNumberGroupRequest build() {
            return new CreateCorpNumberGroupRequest(this);
        } 

    } 

}
