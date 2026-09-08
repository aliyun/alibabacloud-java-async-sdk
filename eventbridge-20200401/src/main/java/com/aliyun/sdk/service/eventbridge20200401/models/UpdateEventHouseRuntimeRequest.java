// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link UpdateEventHouseRuntimeRequest} extends {@link RequestModel}
 *
 * <p>UpdateEventHouseRuntimeRequest</p>
 */
public class UpdateEventHouseRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer cu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 127)
    private String name;

    private UpdateEventHouseRuntimeRequest(Builder builder) {
        super(builder);
        this.cu = builder.cu;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEventHouseRuntimeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<UpdateEventHouseRuntimeRequest, Builder> {
        private Integer cu; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEventHouseRuntimeRequest request) {
            super(request);
            this.cu = request.cu;
            this.name = request.name;
        } 

        /**
         * <p>The number of CUs for the EventHouse Runtime. The value must be greater than 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder cu(Integer cu) {
            this.putQueryParameter("Cu", cu);
            this.cu = cu;
            return this;
        }

        /**
         * <p>The name of the EventHouse Runtime. If this parameter is not specified, the default Runtime is used. In most cases, you do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public UpdateEventHouseRuntimeRequest build() {
            return new UpdateEventHouseRuntimeRequest(this);
        } 

    } 

}
