// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CreateClusterInspectConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateClusterInspectConfigRequest</p>
 */
public class CreateClusterInspectConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("disabledCheckItems")
    private java.util.List<String> disabledCheckItems;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recurrence")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recurrence;

    private CreateClusterInspectConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.disabledCheckItems = builder.disabledCheckItems;
        this.enabled = builder.enabled;
        this.recurrence = builder.recurrence;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClusterInspectConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return disabledCheckItems
     */
    public java.util.List<String> getDisabledCheckItems() {
        return this.disabledCheckItems;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return recurrence
     */
    public String getRecurrence() {
        return this.recurrence;
    }

    public static final class Builder extends Request.Builder<CreateClusterInspectConfigRequest, Builder> {
        private String clusterId; 
        private java.util.List<String> disabledCheckItems; 
        private Boolean enabled; 
        private String recurrence; 

        private Builder() {
            super();
        } 

        private Builder(CreateClusterInspectConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.disabledCheckItems = request.disabledCheckItems;
            this.enabled = request.enabled;
            this.recurrence = request.recurrence;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c82e6987e2961451182edacd74faf****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * disabledCheckItems.
         */
        public Builder disabledCheckItems(java.util.List<String> disabledCheckItems) {
            this.putBodyParameter("disabledCheckItems", disabledCheckItems);
            this.disabledCheckItems = disabledCheckItems;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>FREQ=DAILY;BYHOUR=10;BYMINUTE=15</p>
         */
        public Builder recurrence(String recurrence) {
            this.putBodyParameter("recurrence", recurrence);
            this.recurrence = recurrence;
            return this;
        }

        @Override
        public CreateClusterInspectConfigRequest build() {
            return new CreateClusterInspectConfigRequest(this);
        } 

    } 

}
