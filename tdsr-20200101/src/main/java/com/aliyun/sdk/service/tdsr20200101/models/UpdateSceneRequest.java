// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneRequest</p>
 */
public class UpdateSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private UpdateSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateSceneRequest, Builder> {
        private String id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneRequest request) {
            super(request);
            this.id = request.id;
            this.name = request.name;
        } 

        /**
         * 场景Id
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 场景名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSceneRequest build() {
            return new UpdateSceneRequest(this);
        } 

    } 

}
