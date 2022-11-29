// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutTemplateRequest} extends {@link RequestModel}
 *
 * <p>PutTemplateRequest</p>
 */
public class PutTemplateRequest extends Request {
    @Path
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("body")
    @Validation(required = true)
    private Template body;

    @Query
    @NameInMap("version")
    private Integer version;

    private PutTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return body
     */
    public Template getBody() {
        return this.body;
    }

    /**
     * @return version
     */
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<PutTemplateRequest, Builder> {
        private String name; 
        private Template body; 
        private Integer version; 

        private Builder() {
            super();
        } 

        private Builder(PutTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
            this.version = request.version;
        } 

        /**
         * The name of the template
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * A custom template
         */
        public Builder body(Template body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        /**
         * The major version of the template. "1" by default.
         */
        public Builder version(Integer version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public PutTemplateRequest build() {
            return new PutTemplateRequest(this);
        } 

    } 

}
