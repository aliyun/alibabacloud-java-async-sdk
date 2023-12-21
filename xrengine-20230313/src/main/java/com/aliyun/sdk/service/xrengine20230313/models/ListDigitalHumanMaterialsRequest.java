// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDigitalHumanMaterialsRequest} extends {@link RequestModel}
 *
 * <p>ListDigitalHumanMaterialsRequest</p>
 */
public class ListDigitalHumanMaterialsRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("OnlyPersonalMaterials")
    private Boolean onlyPersonalMaterials;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Types")
    private String types;

    private ListDigitalHumanMaterialsRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.onlyPersonalMaterials = builder.onlyPersonalMaterials;
        this.size = builder.size;
        this.types = builder.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDigitalHumanMaterialsRequest create() {
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
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return onlyPersonalMaterials
     */
    public Boolean getOnlyPersonalMaterials() {
        return this.onlyPersonalMaterials;
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

    public static final class Builder extends Request.Builder<ListDigitalHumanMaterialsRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private Boolean onlyPersonalMaterials; 
        private Integer size; 
        private String types; 

        private Builder() {
            super();
        } 

        private Builder(ListDigitalHumanMaterialsRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.onlyPersonalMaterials = request.onlyPersonalMaterials;
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
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * OnlyPersonalMaterials.
         */
        public Builder onlyPersonalMaterials(Boolean onlyPersonalMaterials) {
            this.putBodyParameter("OnlyPersonalMaterials", onlyPersonalMaterials);
            this.onlyPersonalMaterials = onlyPersonalMaterials;
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
        public ListDigitalHumanMaterialsRequest build() {
            return new ListDigitalHumanMaterialsRequest(this);
        } 

    } 

}
