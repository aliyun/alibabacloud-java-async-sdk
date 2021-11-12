// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private Long newRuleId; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private String uuid; 

        /**
         * <p>NewRuleId.</p>
         */
        public Builder newRuleId(Long newRuleId) {
            this.putQueryParameter("NewRuleId", newRuleId);
            this.newRuleId = newRuleId;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>Uuid.</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        public ModifyInstanceAntiBruteForceRuleRequest build() {
            return new ModifyInstanceAntiBruteForceRuleRequest(this);
        } 

    } 

}
