// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListOrganizationsRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationsRequest</p>
 */
public class ListOrganizationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessLevel")
    private Integer accessLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("minAccessLevel")
    private Integer minAccessLevel;

    private ListOrganizationsRequest(Builder builder) {
        super(builder);
        this.accessLevel = builder.accessLevel;
        this.accessToken = builder.accessToken;
        this.minAccessLevel = builder.minAccessLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLevel
     */
    public Integer getAccessLevel() {
        return this.accessLevel;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return minAccessLevel
     */
    public Integer getMinAccessLevel() {
        return this.minAccessLevel;
    }

    public static final class Builder extends Request.Builder<ListOrganizationsRequest, Builder> {
        private Integer accessLevel; 
        private String accessToken; 
        private Integer minAccessLevel; 

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationsRequest request) {
            super(request);
            this.accessLevel = request.accessLevel;
            this.accessToken = request.accessToken;
            this.minAccessLevel = request.minAccessLevel;
        } 

        /**
         * accessLevel.
         */
        public Builder accessLevel(Integer accessLevel) {
            this.putQueryParameter("accessLevel", accessLevel);
            this.accessLevel = accessLevel;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * minAccessLevel.
         */
        public Builder minAccessLevel(Integer minAccessLevel) {
            this.putQueryParameter("minAccessLevel", minAccessLevel);
            this.minAccessLevel = minAccessLevel;
            return this;
        }

        @Override
        public ListOrganizationsRequest build() {
            return new ListOrganizationsRequest(this);
        } 

    } 

}
