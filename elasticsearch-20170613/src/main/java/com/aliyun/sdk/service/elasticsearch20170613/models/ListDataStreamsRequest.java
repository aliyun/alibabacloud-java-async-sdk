// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataStreamsRequest} extends {@link RequestModel}
 *
 * <p>ListDataStreamsRequest</p>
 */
public class ListDataStreamsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isManaged")
    private Boolean isManaged;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ListDataStreamsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.isManaged = builder.isManaged;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataStreamsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isManaged
     */
    public Boolean getIsManaged() {
        return this.isManaged;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ListDataStreamsRequest, Builder> {
        private String instanceId; 
        private Boolean isManaged; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ListDataStreamsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.isManaged = request.isManaged;
            this.name = request.name;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-nif24adwc0082****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * isManaged.
         */
        public Builder isManaged(Boolean isManaged) {
            this.putQueryParameter("isManaged", isManaged);
            this.isManaged = isManaged;
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

        @Override
        public ListDataStreamsRequest build() {
            return new ListDataStreamsRequest(this);
        } 

    } 

}
