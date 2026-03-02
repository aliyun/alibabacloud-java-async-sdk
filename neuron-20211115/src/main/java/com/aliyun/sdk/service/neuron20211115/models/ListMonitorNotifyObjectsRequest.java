// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link ListMonitorNotifyObjectsRequest} extends {@link RequestModel}
 *
 * <p>ListMonitorNotifyObjectsRequest</p>
 */
public class ListMonitorNotifyObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("webhookType")
    private String webhookType;

    private ListMonitorNotifyObjectsRequest(Builder builder) {
        super(builder);
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
        this.type = builder.type;
        this.webhookType = builder.webhookType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMonitorNotifyObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return webhookType
     */
    public String getWebhookType() {
        return this.webhookType;
    }

    public static final class Builder extends Request.Builder<ListMonitorNotifyObjectsRequest, Builder> {
        private Long enterpriseId; 
        private String name; 
        private Integer type; 
        private String webhookType; 

        private Builder() {
            super();
        } 

        private Builder(ListMonitorNotifyObjectsRequest request) {
            super(request);
            this.enterpriseId = request.enterpriseId;
            this.name = request.name;
            this.type = request.type;
            this.webhookType = request.webhookType;
        } 

        /**
         * enterpriseId.
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("enterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * type.
         */
        public Builder type(Integer type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * webhookType.
         */
        public Builder webhookType(String webhookType) {
            this.putQueryParameter("webhookType", webhookType);
            this.webhookType = webhookType;
            return this;
        }

        @Override
        public ListMonitorNotifyObjectsRequest build() {
            return new ListMonitorNotifyObjectsRequest(this);
        } 

    } 

}
