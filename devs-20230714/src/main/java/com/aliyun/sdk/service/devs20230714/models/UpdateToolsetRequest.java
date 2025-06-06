// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link UpdateToolsetRequest} extends {@link RequestModel}
 *
 * <p>UpdateToolsetRequest</p>
 */
public class UpdateToolsetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private Toolset body;

    private UpdateToolsetRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateToolsetRequest create() {
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
    public Toolset getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateToolsetRequest, Builder> {
        private String name; 
        private Toolset body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateToolsetRequest request) {
            super(request);
            this.name = request.name;
            this.body = request.body;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * body.
         */
        public Builder body(Toolset body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateToolsetRequest build() {
            return new UpdateToolsetRequest(this);
        } 

    } 

}
