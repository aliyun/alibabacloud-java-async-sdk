// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListObjectGenerationProjectRequest} extends {@link RequestModel}
 *
 * <p>PopListObjectGenerationProjectRequest</p>
 */
public class PopListObjectGenerationProjectRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Size")
    private Integer size;

    private PopListObjectGenerationProjectRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListObjectGenerationProjectRequest create() {
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
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<PopListObjectGenerationProjectRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(PopListObjectGenerationProjectRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
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
         * Size.
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public PopListObjectGenerationProjectRequest build() {
            return new PopListObjectGenerationProjectRequest(this);
        } 

    } 

}
