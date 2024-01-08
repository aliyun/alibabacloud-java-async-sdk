// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePictureSearchAppRequest} extends {@link RequestModel}
 *
 * <p>UpdatePictureSearchAppRequest</p>
 */
public class UpdatePictureSearchAppRequest extends Request {
    @Query
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    private String appInstanceId;

    @Query
    @NameInMap("Description")
    @Validation(required = true)
    private String description;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private UpdatePictureSearchAppRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePictureSearchAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
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

    public static final class Builder extends Request.Builder<UpdatePictureSearchAppRequest, Builder> {
        private String appInstanceId; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePictureSearchAppRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
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
        public UpdatePictureSearchAppRequest build() {
            return new UpdatePictureSearchAppRequest(this);
        } 

    } 

}
