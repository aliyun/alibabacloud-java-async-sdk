// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAnycastEipAddressAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnycastEipAddressAttributeRequest</p>
 */
public class ModifyAnycastEipAddressAttributeRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Name")
    private String name;

    private ModifyAnycastEipAddressAttributeRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.description = builder.description;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAnycastEipAddressAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<ModifyAnycastEipAddressAttributeRequest, Builder> {
        private String anycastId; 
        private String description; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAnycastEipAddressAttributeRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.description = request.description;
            this.name = request.name;
        } 

        /**
         * The ID of the Anycast EIP.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The description of the Anycast EIP.
         * <p>
         * 
         * The description must be 0 to 256 characters in length and cannot start with `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the Anycast EIP.
         * <p>
         * 
         * The name must be 0 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public ModifyAnycastEipAddressAttributeRequest build() {
            return new ModifyAnycastEipAddressAttributeRequest(this);
        } 

    } 

}
