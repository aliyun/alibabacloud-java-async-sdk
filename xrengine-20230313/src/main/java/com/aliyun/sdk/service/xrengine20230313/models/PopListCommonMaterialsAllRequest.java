// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListCommonMaterialsAllRequest} extends {@link RequestModel}
 *
 * <p>PopListCommonMaterialsAllRequest</p>
 */
public class PopListCommonMaterialsAllRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Query
    @NameInMap("ListStatus")
    private String listStatus;

    @Query
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Type")
    private String type;

    private PopListCommonMaterialsAllRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.listStatus = builder.listStatus;
        this.name = builder.name;
        this.size = builder.size;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListCommonMaterialsAllRequest create() {
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
     * @return listStatus
     */
    public String getListStatus() {
        return this.listStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<PopListCommonMaterialsAllRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private String listStatus; 
        private String name; 
        private Integer size; 
        private String tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(PopListCommonMaterialsAllRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.listStatus = request.listStatus;
            this.name = request.name;
            this.size = request.size;
            this.tags = request.tags;
            this.type = request.type;
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
         * ListStatus.
         */
        public Builder listStatus(String listStatus) {
            this.putQueryParameter("ListStatus", listStatus);
            this.listStatus = listStatus;
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
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public PopListCommonMaterialsAllRequest build() {
            return new PopListCommonMaterialsAllRequest(this);
        } 

    } 

}
