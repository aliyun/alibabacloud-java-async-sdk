// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataStreamsRequest} extends {@link RequestModel}
 *
 * <p>ListDataStreamsRequest</p>
 */
public class ListDataStreamsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("isManaged")
    private Boolean isManaged;

    @Query
    @NameInMap("name")
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

        private Builder(ListDataStreamsRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.isManaged = response.isManaged;
            this.name = response.name;
        } 

        /**
         * InstanceId.
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
