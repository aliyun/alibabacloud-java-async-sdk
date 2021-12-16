// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyAnycastEipAddressAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyAnycastEipAddressAttributeRequest</p>
 */
public class ModifyAnycastEipAddressAttributeRequest extends Request {
    @Query
    @NameInMap("AnycastId")
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

    public static final class Builder extends Request.Builder<Builder> {
        private String anycastId; 
        private String description; 
        private String name; 

        /**
         * <p>AnycastId.</p>
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Name.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        public ModifyAnycastEipAddressAttributeRequest build() {
            return new ModifyAnycastEipAddressAttributeRequest(this);
        } 

    } 

}
