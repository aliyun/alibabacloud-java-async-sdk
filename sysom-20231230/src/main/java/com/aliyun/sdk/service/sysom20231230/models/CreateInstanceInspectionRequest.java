// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link CreateInstanceInspectionRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceInspectionRequest</p>
 */
public class CreateInstanceInspectionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<String> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    private CreateInstanceInspectionRequest(Builder builder) {
        super(builder);
        this.instance = builder.instance;
        this.items = builder.items;
        this.region = builder.region;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceInspectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public String getInstance() {
        return this.instance;
    }

    /**
     * @return items
     */
    public java.util.List<String> getItems() {
        return this.items;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateInstanceInspectionRequest, Builder> {
        private String instance; 
        private java.util.List<String> items; 
        private String region; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceInspectionRequest request) {
            super(request);
            this.instance = request.instance;
            this.items = request.items;
            this.region = request.region;
            this.source = request.source;
        } 

        /**
         * instance.
         */
        public Builder instance(String instance) {
            this.putBodyParameter("instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * items.
         */
        public Builder items(java.util.List<String> items) {
            this.putBodyParameter("items", items);
            this.items = items;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.putBodyParameter("source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateInstanceInspectionRequest build() {
            return new CreateInstanceInspectionRequest(this);
        } 

    } 

}
