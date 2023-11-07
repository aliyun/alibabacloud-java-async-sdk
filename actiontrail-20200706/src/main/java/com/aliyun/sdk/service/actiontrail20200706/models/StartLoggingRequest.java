// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLoggingRequest} extends {@link RequestModel}
 *
 * <p>StartLoggingRequest</p>
 */
public class StartLoggingRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private StartLoggingRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartLoggingRequest create() {
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

    public static final class Builder extends Request.Builder<StartLoggingRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(StartLoggingRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * The name of the trail that you want to enable.
         * <p>
         * 
         * The name must be 6 to 36 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (\_). It must start with a lowercase letter.
         * 
         * > The name must be unique within your Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public StartLoggingRequest build() {
            return new StartLoggingRequest(this);
        } 

    } 

}
