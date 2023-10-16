// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @NameInMap("AbilityType")
    private String abilityType;

    @NameInMap("ApplicableOperations")
    private java.util.List < String > applicableOperations;

    @NameInMap("Concurrency")
    private Long concurrency;

    @NameInMap("Description")
    private String description;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("ModifyTime")
    private Long modifyTime;

    @NameInMap("ModifyUserName")
    private String modifyUserName;

    @NameInMap("Name")
    private String name;

    @NameInMap("NluServiceParamsJson")
    private String nluServiceParamsJson;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UnionInstanceId")
    private String unionInstanceId;

    @NameInMap("UnionSource")
    private String unionSource;

    private DescribeInstanceResponseBody(Builder builder) {
        this.abilityType = builder.abilityType;
        this.applicableOperations = builder.applicableOperations;
        this.concurrency = builder.concurrency;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.modifyTime = builder.modifyTime;
        this.modifyUserName = builder.modifyUserName;
        this.name = builder.name;
        this.nluServiceParamsJson = builder.nluServiceParamsJson;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.unionInstanceId = builder.unionInstanceId;
        this.unionSource = builder.unionSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return abilityType
     */
    public String getAbilityType() {
        return this.abilityType;
    }

    /**
     * @return applicableOperations
     */
    public java.util.List < String > getApplicableOperations() {
        return this.applicableOperations;
    }

    /**
     * @return concurrency
     */
    public Long getConcurrency() {
        return this.concurrency;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return modifyUserName
     */
    public String getModifyUserName() {
        return this.modifyUserName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nluServiceParamsJson
     */
    public String getNluServiceParamsJson() {
        return this.nluServiceParamsJson;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return unionInstanceId
     */
    public String getUnionInstanceId() {
        return this.unionInstanceId;
    }

    /**
     * @return unionSource
     */
    public String getUnionSource() {
        return this.unionSource;
    }

    public static final class Builder {
        private String abilityType; 
        private java.util.List < String > applicableOperations; 
        private Long concurrency; 
        private String description; 
        private String instanceId; 
        private Long modifyTime; 
        private String modifyUserName; 
        private String name; 
        private String nluServiceParamsJson; 
        private String requestId; 
        private String status; 
        private String unionInstanceId; 
        private String unionSource; 

        /**
         * AbilityType.
         */
        public Builder abilityType(String abilityType) {
            this.abilityType = abilityType;
            return this;
        }

        /**
         * ApplicableOperations.
         */
        public Builder applicableOperations(java.util.List < String > applicableOperations) {
            this.applicableOperations = applicableOperations;
            return this;
        }

        /**
         * Concurrency.
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ModifyTime.
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * ModifyUserName.
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * NluServiceParamsJson.
         */
        public Builder nluServiceParamsJson(String nluServiceParamsJson) {
            this.nluServiceParamsJson = nluServiceParamsJson;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UnionInstanceId.
         */
        public Builder unionInstanceId(String unionInstanceId) {
            this.unionInstanceId = unionInstanceId;
            return this;
        }

        /**
         * UnionSource.
         */
        public Builder unionSource(String unionSource) {
            this.unionSource = unionSource;
            return this;
        }

        public DescribeInstanceResponseBody build() {
            return new DescribeInstanceResponseBody(this);
        } 

    } 

}
