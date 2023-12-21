// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopListTextToAvatarProjectRequest} extends {@link RequestModel}
 *
 * <p>PopListTextToAvatarProjectRequest</p>
 */
public class PopListTextToAvatarProjectRequest extends Request {
    @Body
    @NameInMap("Current")
    private Integer current;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("Status")
    private String status;

    @Body
    @NameInMap("Title")
    private String title;

    private PopListTextToAvatarProjectRequest(Builder builder) {
        super(builder);
        this.current = builder.current;
        this.jwtToken = builder.jwtToken;
        this.size = builder.size;
        this.sortField = builder.sortField;
        this.status = builder.status;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopListTextToAvatarProjectRequest create() {
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

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<PopListTextToAvatarProjectRequest, Builder> {
        private Integer current; 
        private String jwtToken; 
        private Integer size; 
        private String sortField; 
        private String status; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(PopListTextToAvatarProjectRequest request) {
            super(request);
            this.current = request.current;
            this.jwtToken = request.jwtToken;
            this.size = request.size;
            this.sortField = request.sortField;
            this.status = request.status;
            this.title = request.title;
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

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public PopListTextToAvatarProjectRequest build() {
            return new PopListTextToAvatarProjectRequest(this);
        } 

    } 

}
