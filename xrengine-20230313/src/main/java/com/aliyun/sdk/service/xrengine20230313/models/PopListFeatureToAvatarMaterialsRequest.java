// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListFeatureToAvatarMaterialsRequest} extends {@link RequestModel}
 *
 * <p>PopListFeatureToAvatarMaterialsRequest</p>
 */
public class PopListFeatureToAvatarMaterialsRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("ListStatus")
    private String listStatus;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Tags")
    private String tags;

    private PopListFeatureToAvatarMaterialsRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.listStatus = builder.listStatus;
        this.size = builder.size;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListFeatureToAvatarMaterialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return current
     */
    public Integer getCurrent() {
        return this.current;
    }

    /**
     * @return listStatus
     */
    public String getListStatus() {
        return this.listStatus;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<PopListFeatureToAvatarMaterialsRequest, Builder> {
        private Integer current; 
        private String listStatus; 
        private Integer size; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(PopListFeatureToAvatarMaterialsRequest request) {
            super(request);
            this.current = request.current;
            this.listStatus = request.listStatus;
            this.size = request.size;
            this.tags = request.tags;
        } 

        /**
         * Current.
         */
        public Builder current(Integer current) {
            this.putBodyParameter("Current", current);
            this.current = current;
            return this;
        }

        /**
         * ListStatus.
         */
        public Builder listStatus(String listStatus) {
            this.putBodyParameter("ListStatus", listStatus);
            this.listStatus = listStatus;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public PopListFeatureToAvatarMaterialsRequest build() {
            return new PopListFeatureToAvatarMaterialsRequest(this);
        } 

    } 

}
