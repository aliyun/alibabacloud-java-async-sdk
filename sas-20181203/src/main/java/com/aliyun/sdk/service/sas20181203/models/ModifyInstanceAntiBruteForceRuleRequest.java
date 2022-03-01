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
    private Long newRuleId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("Uuid")
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

        private Builder(ModifyInstanceAntiBruteForceRuleRequest response) {
            super(response);
            this.newRuleId = response.newRuleId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sourceIp = response.sourceIp;
            this.uuid = response.uuid;
        } 

        /**
         * NewRuleId.
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
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
        public ModifyInstanceAntiBruteForceRuleRequest build() {
            return new ModifyInstanceAntiBruteForceRuleRequest(this);
        } 

    } 

}
