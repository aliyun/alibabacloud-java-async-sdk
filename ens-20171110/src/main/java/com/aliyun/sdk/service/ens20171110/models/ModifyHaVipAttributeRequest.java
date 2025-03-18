// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link ModifyHaVipAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyHaVipAttributeRequest</p>
 */
public class ModifyHaVipAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haVipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String name;

    private ModifyHaVipAttributeRequest(Builder builder) {
        super(builder);
        this.haVipId = builder.haVipId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHaVipAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyHaVipAttributeRequest, Builder> {
        private String haVipId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHaVipAttributeRequest request) {
            super(request);
            this.haVipId = request.haVipId;
            this.name = request.name;
        } 

        /**
         * <p>The ID of the HAVIP that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-52y28****</p>
         */
        public Builder haVipId(String haVipId) {
            this.putQueryParameter("HaVipId", haVipId);
            this.haVipId = haVipId;
            return this;
        }

        /**
         * <p>The name of the HAVIP. The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyHaVipAttributeRequest build() {
            return new ModifyHaVipAttributeRequest(this);
        } 

    } 

}
