// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Query
    @NameInMap("Develop")
    private String develop;

    @Query
    @NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @Body
    @NameInMap("body")
    private String body;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.develop = builder.develop;
        this.labels = builder.labels;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return develop
     */
    public String getDevelop() {
        return this.develop;
    }

    /**
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String develop; 
        private java.util.Map < String, String > labels; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.develop = request.develop;
            this.labels = request.labels;
            this.body = request.body;
        } 

        /**
         * 是否进入开发模式。
         */
        public Builder develop(String develop) {
            this.putQueryParameter("Develop", develop);
            this.develop = develop;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.Map < String, String > labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

}
