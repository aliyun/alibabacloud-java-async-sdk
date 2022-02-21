// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClusterLoopRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterLoopRequest</p>
 */
public class CreateClusterLoopRequest extends Request {
    @Query
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private CreateClusterLoopRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterLoopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateClusterLoopRequest, Builder> {
        private String params; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterLoopRequest response) {
            super(response);
            this.params = response.params;
            this.title = response.title;
        } 

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public CreateClusterLoopRequest build() {
            return new CreateClusterLoopRequest(this);
        } 

    } 

}
