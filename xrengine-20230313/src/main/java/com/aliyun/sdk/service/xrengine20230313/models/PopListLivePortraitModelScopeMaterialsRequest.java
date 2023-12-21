// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListLivePortraitModelScopeMaterialsRequest} extends {@link RequestModel}
 *
 * <p>PopListLivePortraitModelScopeMaterialsRequest</p>
 */
public class PopListLivePortraitModelScopeMaterialsRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Types")
    private String types;

    private PopListLivePortraitModelScopeMaterialsRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.size = builder.size;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListLivePortraitModelScopeMaterialsRequest create() {
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return types
     */
    public String getTypes() {
        return this.types;
    }

    public static final class Builder extends Request.Builder<PopListLivePortraitModelScopeMaterialsRequest, Builder> {
        private Integer current; 
        private Integer size; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(PopListLivePortraitModelScopeMaterialsRequest request) {
            super(request);
            this.current = request.current;
            this.size = request.size;
            this.types = request.types;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Types.
         */
        public Builder types(String types) {
            this.putBodyParameter("Types", types);
            this.types = types;
            return this;
        }

        @Override
        public PopListLivePortraitModelScopeMaterialsRequest build() {
            return new PopListLivePortraitModelScopeMaterialsRequest(this);
        } 

    } 

}
