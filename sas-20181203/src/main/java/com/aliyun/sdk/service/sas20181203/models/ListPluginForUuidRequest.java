// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPluginForUuidRequest} extends {@link RequestModel}
 *
 * <p>ListPluginForUuidRequest</p>
 */
public class ListPluginForUuidRequest extends Request {
    @Query
    @NameInMap("Types")
    private java.util.List < String > types;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private ListPluginForUuidRequest(Builder builder) {
        super(builder);
        this.types = builder.types;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPluginForUuidRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return types
     */
    public java.util.List < String > getTypes() {
        return this.types;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListPluginForUuidRequest, Builder> {
        private java.util.List < String > types; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListPluginForUuidRequest request) {
            super(request);
            this.types = request.types;
            this.uuid = request.uuid;
        } 

        /**
         * Types.
         */
        public Builder types(java.util.List < String > types) {
            String typesShrink = shrink(types, "Types", "simple");
            this.putQueryParameter("Types", typesShrink);
            this.types = types;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListPluginForUuidRequest build() {
            return new ListPluginForUuidRequest(this);
        } 

    } 

}
