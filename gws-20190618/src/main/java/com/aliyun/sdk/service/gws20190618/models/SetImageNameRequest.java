// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gws20190618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetImageNameRequest} extends {@link RequestModel}
 *
 * <p>SetImageNameRequest</p>
 */
public class SetImageNameRequest extends Request {
    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private SetImageNameRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetImageNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<SetImageNameRequest, Builder> {
        private String imageId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(SetImageNameRequest response) {
            super(response);
            this.imageId = response.imageId;
            this.name = response.name;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
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
        public SetImageNameRequest build() {
            return new SetImageNameRequest(this);
        } 

    } 

}
