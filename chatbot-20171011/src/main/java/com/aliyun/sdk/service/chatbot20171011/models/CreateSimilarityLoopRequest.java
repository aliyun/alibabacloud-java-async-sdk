// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSimilarityLoopRequest} extends {@link RequestModel}
 *
 * <p>CreateSimilarityLoopRequest</p>
 */
public class CreateSimilarityLoopRequest extends Request {
    @Query
    @NameInMap("MultiParams")
    @Validation(required = true)
    private String multiParams;

    @Query
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    @Query
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private CreateSimilarityLoopRequest(Builder builder) {
        super(builder);
        this.multiParams = builder.multiParams;
        this.params = builder.params;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSimilarityLoopRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return multiParams
     */
    public String getMultiParams() {
        return this.multiParams;
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

    public static final class Builder extends Request.Builder<CreateSimilarityLoopRequest, Builder> {
        private String multiParams; 
        private String params; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateSimilarityLoopRequest response) {
            super(response);
            this.multiParams = response.multiParams;
            this.params = response.params;
            this.title = response.title;
        } 

        /**
         * MultiParams.
         */
        public Builder multiParams(String multiParams) {
            this.putQueryParameter("MultiParams", multiParams);
            this.multiParams = multiParams;
            return this;
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
        public CreateSimilarityLoopRequest build() {
            return new CreateSimilarityLoopRequest(this);
        } 

    } 

}
