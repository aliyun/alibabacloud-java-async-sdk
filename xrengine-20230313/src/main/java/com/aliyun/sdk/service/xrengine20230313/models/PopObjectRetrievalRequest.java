// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PopObjectRetrievalRequest} extends {@link RequestModel}
 *
 * <p>PopObjectRetrievalRequest</p>
 */
public class PopObjectRetrievalRequest extends Request {
    @Body
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    @Body
    @NameInMap("TopK")
    private Integer topK;

    private PopObjectRetrievalRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.jwtToken = builder.jwtToken;
        this.sourceType = builder.sourceType;
        this.topK = builder.topK;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PopObjectRetrievalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    public static final class Builder extends Request.Builder<PopObjectRetrievalRequest, Builder> {
        private String content; 
        private String jwtToken; 
        private String sourceType; 
        private Integer topK; 

        private Builder() {
            super();
        } 

        private Builder(PopObjectRetrievalRequest request) {
            super(request);
            this.content = request.content;
            this.jwtToken = request.jwtToken;
            this.sourceType = request.sourceType;
            this.topK = request.topK;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
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
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putBodyParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        @Override
        public PopObjectRetrievalRequest build() {
            return new PopObjectRetrievalRequest(this);
        } 

    } 

}
