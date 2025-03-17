// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

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
 * {@link GetDocStructureResultRequest} extends {@link RequestModel}
 *
 * <p>GetDocStructureResultRequest</p>
 */
public class GetDocStructureResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageStrategy")
    private String imageStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevealMarkdown")
    private Boolean revealMarkdown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseUrlResponseBody")
    private Boolean useUrlResponseBody;

    private GetDocStructureResultRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.imageStrategy = builder.imageStrategy;
        this.revealMarkdown = builder.revealMarkdown;
        this.useUrlResponseBody = builder.useUrlResponseBody;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocStructureResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return imageStrategy
     */
    public String getImageStrategy() {
        return this.imageStrategy;
    }

    /**
     * @return revealMarkdown
     */
    public Boolean getRevealMarkdown() {
        return this.revealMarkdown;
    }

    /**
     * @return useUrlResponseBody
     */
    public Boolean getUseUrlResponseBody() {
        return this.useUrlResponseBody;
    }

    public static final class Builder extends Request.Builder<GetDocStructureResultRequest, Builder> {
        private String id; 
        private String imageStrategy; 
        private Boolean revealMarkdown; 
        private Boolean useUrlResponseBody; 

        private Builder() {
            super();
        } 

        private Builder(GetDocStructureResultRequest request) {
            super(request);
            this.id = request.id;
            this.imageStrategy = request.imageStrategy;
            this.revealMarkdown = request.revealMarkdown;
            this.useUrlResponseBody = request.useUrlResponseBody;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * ImageStrategy.
         */
        public Builder imageStrategy(String imageStrategy) {
            this.putQueryParameter("ImageStrategy", imageStrategy);
            this.imageStrategy = imageStrategy;
            return this;
        }

        /**
         * RevealMarkdown.
         */
        public Builder revealMarkdown(Boolean revealMarkdown) {
            this.putQueryParameter("RevealMarkdown", revealMarkdown);
            this.revealMarkdown = revealMarkdown;
            return this;
        }

        /**
         * UseUrlResponseBody.
         */
        public Builder useUrlResponseBody(Boolean useUrlResponseBody) {
            this.putQueryParameter("UseUrlResponseBody", useUrlResponseBody);
            this.useUrlResponseBody = useUrlResponseBody;
            return this;
        }

        @Override
        public GetDocStructureResultRequest build() {
            return new GetDocStructureResultRequest(this);
        } 

    } 

}
