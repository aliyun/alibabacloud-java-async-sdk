// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateMmsDataSourceRequest} extends {@link RequestModel}
 *
 * <p>CreateMmsDataSourceRequest</p>
 */
public class CreateMmsDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map<String, ?> config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("networklink")
    private String networklink;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateMmsDataSourceRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.name = builder.name;
        this.networklink = builder.networklink;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsDataSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public java.util.Map<String, ?> getConfig() {
        return this.config;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networklink
     */
    public String getNetworklink() {
        return this.networklink;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMmsDataSourceRequest, Builder> {
        private java.util.Map<String, ?> config; 
        private String name; 
        private String networklink; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMmsDataSourceRequest request) {
            super(request);
            this.config = request.config;
            this.name = request.name;
            this.networklink = request.networklink;
            this.type = request.type;
        } 

        /**
         * config.
         */
        public Builder config(java.util.Map<String, ?> config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * networklink.
         */
        public Builder networklink(String networklink) {
            this.putBodyParameter("networklink", networklink);
            this.networklink = networklink;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMmsDataSourceRequest build() {
            return new CreateMmsDataSourceRequest(this);
        } 

    } 

}
