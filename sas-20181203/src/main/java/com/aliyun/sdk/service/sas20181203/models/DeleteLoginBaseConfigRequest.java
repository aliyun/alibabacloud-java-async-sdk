// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
    @Validation(required = true)
    private String config;

    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(DeleteLoginBaseConfigRequest request) {
            super(request);
            this.config = request.config;
            this.target = request.target;
            this.type = request.type;
        } 

        /**
         * The content of the logon security settings to delete. The content varies based on the type of the logon security settings. Valid values:
         * <p>
         * 
         * *   **login\_common_ip**: approved logon IP addresses
         * 
         * Example: {"ip":"10.23.23.23"}.
         * 
         * *   **login\_common_time**: approved logon time ranges
         * 
         * Example: {"startTime":"06:00:00","endTime":"16:00:00"}.
         * 
         * *   **login\_common_account**: approved logon accounts
         * 
         * Example: {"account":"test_account\_001"}.
         * 
         * *   **login\_common_location**: approved logon locations
         * 
         * Example: {"location":"Shanghai"}.
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * The UUID of the server whose logon security settings you want to delete.
         * <p>
         * 
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * The type of the logon security settings to delete. Valid values:
         * <p>
         * 
         * *   **login\_common_ip**: approved logon IP addresses
         * *   **login\_common_time**: approved logon time ranges
         * *   **login\_common_account**: approved logon accounts
         * *   **login\_common_location**: approved logon locations
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
