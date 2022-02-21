// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMixRequest} extends {@link RequestModel}
 *
 * <p>DescribeMixRequest</p>
 */
public class DescribeMixRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    private DescribeMixRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMixRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeMixRequest, Builder> {
        private String instanceId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMixRequest response) {
            super(response);
            this.instanceId = response.instanceId;
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
         * Name.
         */
        public Builder name(String name) {
            this.putPathParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeMixRequest build() {
            return new DescribeMixRequest(this);
        } 

    } 

}
