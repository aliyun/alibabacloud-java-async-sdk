// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePictureSearchAppRequest} extends {@link RequestModel}
 *
 * <p>CreatePictureSearchAppRequest</p>
 */
public class CreatePictureSearchAppRequest extends Request {
    @Query
    @NameInMap("Desc")
    @Validation(required = true)
    private String desc;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private CreatePictureSearchAppRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePictureSearchAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreatePictureSearchAppRequest, Builder> {
        private String desc; 
        private String iotInstanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreatePictureSearchAppRequest response) {
            super(response);
            this.desc = response.desc;
            this.iotInstanceId = response.iotInstanceId;
            this.name = response.name;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
        public CreatePictureSearchAppRequest build() {
            return new CreatePictureSearchAppRequest(this);
        } 

    } 

}
