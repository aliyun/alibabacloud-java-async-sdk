// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListConfigRequest} extends {@link RequestModel}
 *
 * <p>ListConfigRequest</p>
 */
public class ListConfigRequest extends Request {
    @Query
    @NameInMap("ConfigItem")
    private java.util.List < String > configItem;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private ListConfigRequest(Builder builder) {
        super(builder);
        this.configItem = builder.configItem;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configItem
     */
    public java.util.List < String > getConfigItem() {
        return this.configItem;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ListConfigRequest, Builder> {
        private java.util.List < String > configItem; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ListConfigRequest response) {
            super(response);
            this.configItem = response.configItem;
            this.instanceId = response.instanceId;
        } 

        /**
         * ConfigItem.
         */
        public Builder configItem(java.util.List < String > configItem) {
            this.putQueryParameter("ConfigItem", configItem);
            this.configItem = configItem;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ListConfigRequest build() {
            return new ListConfigRequest(this);
        } 

    } 

}
