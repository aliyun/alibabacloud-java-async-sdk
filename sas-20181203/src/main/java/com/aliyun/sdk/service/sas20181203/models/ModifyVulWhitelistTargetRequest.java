// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVulWhitelistTargetRequest} extends {@link RequestModel}
 *
 * <p>ModifyVulWhitelistTargetRequest</p>
 */
public class ModifyVulWhitelistTargetRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private Long id;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TargetInfo")
    private String targetInfo;

    private ModifyVulWhitelistTargetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.reason = builder.reason;
        this.sourceIp = builder.sourceIp;
        this.targetInfo = builder.targetInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVulWhitelistTargetRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return targetInfo
     */
    public String getTargetInfo() {
        return this.targetInfo;
    }

    public static final class Builder extends Request.Builder<ModifyVulWhitelistTargetRequest, Builder> {
        private Long id; 
        private String reason; 
        private String sourceIp; 
        private String targetInfo; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVulWhitelistTargetRequest request) {
            super(request);
            this.id = request.id;
            this.reason = request.reason;
            this.sourceIp = request.sourceIp;
            this.targetInfo = request.targetInfo;
        } 

        /**
         * The ID of the whitelist.
         * <p>
         * 
         * >  You can call the [DescribeVulWhitelist](~~DescribeVulWhitelist~~) operation to query the IDs of whitelists.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The reason why you add the server to the whitelist.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The applicable scope of the whitelist. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **type**: the type of the applicable scope. Valid values:
         * 
         *     *   **GroupId**: the ID of a server group
         *     *   **Uuid**: the UUID of a server
         * 
         * *   **uuids**: the UUIDs of servers
         * 
         * *   **groupIds**: the IDs of server groups
         * 
         * >  If you leave this parameter empty, all servers are added to the whitelist. If you set the **type** field to **GroupId**, you must also specify the **groupIds** field. If you set the **type** field to **Uuid**, you must also specify the **uuids** field.
         */
        public Builder targetInfo(String targetInfo) {
            this.putQueryParameter("TargetInfo", targetInfo);
            this.targetInfo = targetInfo;
            return this;
        }

        @Override
        public ModifyVulWhitelistTargetRequest build() {
            return new ModifyVulWhitelistTargetRequest(this);
        } 

    } 

}
