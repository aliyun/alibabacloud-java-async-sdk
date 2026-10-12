// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceResponseBody</p>
 */
public class DescribeInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbilityType")
    private String abilityType;

    @com.aliyun.core.annotation.NameInMap("ApplicableOperations")
    private java.util.List<String> applicableOperations;

    @com.aliyun.core.annotation.NameInMap("Concurrency")
    private Long concurrency;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("ModifyUserName")
    private String modifyUserName;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NluServiceParamsJson")
    private String nluServiceParamsJson;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnionInstanceId")
    private String unionInstanceId;

    @com.aliyun.core.annotation.NameInMap("UnionSource")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<String> getApplicableOperations() {
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
        private java.util.List<String> applicableOperations; 
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

        private Builder() {
        } 

        private Builder(DescribeInstanceResponseBody model) {
            this.abilityType = model.abilityType;
            this.applicableOperations = model.applicableOperations;
            this.concurrency = model.concurrency;
            this.description = model.description;
            this.instanceId = model.instanceId;
            this.modifyTime = model.modifyTime;
            this.modifyUserName = model.modifyUserName;
            this.name = model.name;
            this.nluServiceParamsJson = model.nluServiceParamsJson;
            this.requestId = model.requestId;
            this.status = model.status;
            this.unionInstanceId = model.unionInstanceId;
            this.unionSource = model.unionSource;
        } 

        /**
         * <p>The instance ability type.<br>
         * DEFAULT: full abilities.<br>
         * VOICE_ONLY: only voice abilities, without dialog intervention.</p>
         * 
         * <strong>example:</strong>
         * <p>VOICE_ONLY</p>
         */
        public Builder abilityType(String abilityType) {
            this.abilityType = abilityType;
            return this;
        }

        /**
         * <p>The list of applicable operations.</p>
         */
        public Builder applicableOperations(java.util.List<String> applicableOperations) {
            this.applicableOperations = applicableOperations;
            return this;
        }

        /**
         * <p>The instance concurrency.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder concurrency(Long concurrency) {
            this.concurrency = concurrency;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>导航测试实例描述信息</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cd6fc91bc13445c2af7f2e3e31418520</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1683216000000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The user who last updated the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2508711*******</p>
         */
        public Builder modifyUserName(String modifyUserName) {
            this.modifyUserName = modifyUserName;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>导航测试实例</p>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>790B5EA3-D251-1666-B1E0-4D1F4B33A592</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status.</p>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
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
