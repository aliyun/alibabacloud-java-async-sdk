// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubSceneRequest} extends {@link RequestModel}
 *
 * <p>UpdateSubSceneRequest</p>
 */
public class UpdateSubSceneRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private UpdateSubSceneRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSubSceneRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateSubSceneRequest, Builder> {
        private String id; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSubSceneRequest response) {
            super(response);
            this.id = response.id;
            this.name = response.name;
        } 

        /**
         * 子场景ID
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 子场景名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateSubSceneRequest build() {
            return new UpdateSubSceneRequest(this);
        } 

    } 

}
