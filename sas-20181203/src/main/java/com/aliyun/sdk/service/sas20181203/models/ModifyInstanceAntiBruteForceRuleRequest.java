// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAntiBruteForceRuleRequest</p>
 */
public class ModifyInstanceAntiBruteForceRuleRequest extends Request {
    @Query
    @NameInMap("NewRuleId")
    @Validation(required = true)
    private Long newRuleId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private ModifyInstanceAntiBruteForceRuleRequest(Builder builder) {
        super(builder);
        this.newRuleId = builder.newRuleId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAntiBruteForceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return newRuleId
     */
    public Long getNewRuleId() {
        return this.newRuleId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceAntiBruteForceRuleRequest, Builder> {
        private Long newRuleId; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAntiBruteForceRuleRequest request) {
            super(request);
            this.newRuleId = request.newRuleId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.uuid = request.uuid;
        } 

        /**
         * The ID of the defense rule.
         */
        public Builder newRuleId(Long newRuleId) {
            this.putQueryParameter("NewRuleId", newRuleId);
            this.newRuleId = newRuleId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
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
         * The UUID of the server for which you want to modify the defense rule. You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ModifyInstanceAntiBruteForceRuleRequest build() {
            return new ModifyInstanceAntiBruteForceRuleRequest(this);
        } 

    } 

}
