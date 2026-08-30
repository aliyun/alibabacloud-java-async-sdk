// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateSaseUserTagRequest} extends {@link RequestModel}
 *
 * <p>UpdateSaseUserTagRequest</p>
 */
public class UpdateSaseUserTagRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TagId")
    private String tagId;

    private UpdateSaseUserTagRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.tagId = builder.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSaseUserTagRequest create() {
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
     * @return tagId
     */
    public String getTagId() {
        return this.tagId;
    }

    public static final class Builder extends Request.Builder<UpdateSaseUserTagRequest, Builder> {
        private String description; 
        private String name; 
        private String tagId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSaseUserTagRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.tagId = request.tagId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TagId.
         */
        public Builder tagId(String tagId) {
            this.putBodyParameter("TagId", tagId);
            this.tagId = tagId;
            return this;
        }

        @Override
        public UpdateSaseUserTagRequest build() {
            return new UpdateSaseUserTagRequest(this);
        } 

    } 

}
