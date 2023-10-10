// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalyzeFileRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeFileRequest</p>
 */
public class AnalyzeFileRequest extends Request {
    @Query
    @NameInMap("keepUnreachableObjects")
    private Boolean keepUnreachableObjects;

    @Query
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("token")
    private String token;

    private AnalyzeFileRequest(Builder builder) {
        super(builder);
        this.keepUnreachableObjects = builder.keepUnreachableObjects;
        this.name = builder.name;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keepUnreachableObjects
     */
    public Boolean getKeepUnreachableObjects() {
        return this.keepUnreachableObjects;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<AnalyzeFileRequest, Builder> {
        private Boolean keepUnreachableObjects; 
        private String name; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeFileRequest request) {
            super(request);
            this.keepUnreachableObjects = request.keepUnreachableObjects;
            this.name = request.name;
            this.token = request.token;
        } 

        /**
         * keepUnreachableObjects.
         */
        public Builder keepUnreachableObjects(Boolean keepUnreachableObjects) {
            this.putQueryParameter("keepUnreachableObjects", keepUnreachableObjects);
            this.keepUnreachableObjects = keepUnreachableObjects;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * token.
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public AnalyzeFileRequest build() {
            return new AnalyzeFileRequest(this);
        } 

    } 

}
