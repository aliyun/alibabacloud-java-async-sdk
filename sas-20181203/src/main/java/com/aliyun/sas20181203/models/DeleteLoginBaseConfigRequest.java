// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLoginBaseConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteLoginBaseConfigRequest</p>
 */
public class DeleteLoginBaseConfigRequest extends Request {
    @Query
    @NameInMap("Config")
    private String config;

    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("Type")
    private String type;

    private DeleteLoginBaseConfigRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.target = builder.target;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoginBaseConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DeleteLoginBaseConfigRequest, Builder> {
        private String config; 
        private String target; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLoginBaseConfigRequest response) {
            super(response);
            this.config = response.config;
            this.target = response.target;
            this.type = response.type;
        } 

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DeleteLoginBaseConfigRequest build() {
            return new DeleteLoginBaseConfigRequest(this);
        } 

    } 

}
