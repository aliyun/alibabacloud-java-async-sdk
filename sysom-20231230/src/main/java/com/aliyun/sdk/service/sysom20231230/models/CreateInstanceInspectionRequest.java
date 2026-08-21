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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instance")
    private String instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<String> items;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metricSource")
    private String metricSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private CreateInstanceInspectionRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.instance = builder.instance;
        this.items = builder.items;
        this.metricSource = builder.metricSource;
        this.region = builder.region;
        this.source = builder.source;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
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
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
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
     * @return metricSource
     */
    public String getMetricSource() {
        return this.metricSource;
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

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<CreateInstanceInspectionRequest, Builder> {
        private String xDebugId; 
        private String instance; 
        private java.util.List<String> items; 
        private String metricSource; 
        private String region; 
        private String source; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceInspectionRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.instance = request.instance;
            this.items = request.items;
            this.metricSource = request.metricSource;
            this.region = request.region;
            this.source = request.source;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
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
         * metricSource.
         */
        public Builder metricSource(String metricSource) {
            this.putBodyParameter("metricSource", metricSource);
            this.metricSource = metricSource;
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

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public CreateInstanceInspectionRequest build() {
            return new CreateInstanceInspectionRequest(this);
        } 

    } 

}
