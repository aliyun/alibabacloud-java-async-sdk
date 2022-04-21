// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionRequest</p>
 */
public class DeleteFunctionRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DeleteFunctionRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DeleteFunctionRequest, Builder> {
        private String name; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionRequest request) {
            super(request);
            this.name = request.name;
            this.spaceId = request.spaceId;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DeleteFunctionRequest build() {
            return new DeleteFunctionRequest(this);
        } 

    } 

}
