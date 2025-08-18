// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link StopLoggingRequest} extends {@link RequestModel}
 *
 * <p>StopLoggingRequest</p>
 */
public class StopLoggingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private StopLoggingRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopLoggingRequest create() {
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

    public static final class Builder extends Request.Builder<StopLoggingRequest, Builder> {
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(StopLoggingRequest request) {
            super(request);
            this.name = request.name;
        } 

        /**
         * <p>The name of the trail that you want to disable.</p>
         * <p>The name must be 6 to 36 characters in length, and can contain lowercase letters, digits, hyphens (-), and underscores (_). It must start with a lowercase letter.</p>
         * <blockquote>
         * <p>The name must be unique within your Alibaba Cloud account.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public StopLoggingRequest build() {
            return new StopLoggingRequest(this);
        } 

    } 

}
