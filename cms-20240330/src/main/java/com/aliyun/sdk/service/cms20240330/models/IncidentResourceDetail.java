// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentResourceDetail} extends {@link TeaModel}
 *
 * <p>IncidentResourceDetail</p>
 */
public class IncidentResourceDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("extraId")
    private String extraId;

    @com.aliyun.core.annotation.NameInMap("resourceId")
    private java.util.Map<String, ?> resourceId;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private IncidentResourceDetail(Builder builder) {
        this.extraId = builder.extraId;
        this.resourceId = builder.resourceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentResourceDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraId
     */
    public String getExtraId() {
        return this.extraId;
    }

    /**
     * @return resourceId
     */
    public java.util.Map<String, ?> getResourceId() {
        return this.resourceId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String extraId; 
        private java.util.Map<String, ?> resourceId; 
        private String type; 

        private Builder() {
        } 

        private Builder(IncidentResourceDetail model) {
            this.extraId = model.extraId;
            this.resourceId = model.resourceId;
            this.type = model.type;
        } 

        /**
         * extraId.
         */
        public Builder extraId(String extraId) {
            this.extraId = extraId;
            return this;
        }

        /**
         * resourceId.
         */
        public Builder resourceId(java.util.Map<String, ?> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public IncidentResourceDetail build() {
            return new IncidentResourceDetail(this);
        } 

    } 

}
