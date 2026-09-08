// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link GetAlgorithmVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmVersionResponseBody</p>
 */
public class GetAlgorithmVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlgorithmId")
    private String algorithmId;

    @com.aliyun.core.annotation.NameInMap("AlgorithmName")
    private String algorithmName;

    @com.aliyun.core.annotation.NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @com.aliyun.core.annotation.NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    @com.aliyun.core.annotation.NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetAlgorithmVersionResponseBody(Builder builder) {
        this.algorithmId = builder.algorithmId;
        this.algorithmName = builder.algorithmName;
        this.algorithmProvider = builder.algorithmProvider;
        this.algorithmSpec = builder.algorithmSpec;
        this.algorithmVersion = builder.algorithmVersion;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithmId
     */
    public String getAlgorithmId() {
        return this.algorithmId;
    }

    /**
     * @return algorithmName
     */
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    /**
     * @return algorithmProvider
     */
    public String getAlgorithmProvider() {
        return this.algorithmProvider;
    }

    /**
     * @return algorithmSpec
     */
    public AlgorithmSpec getAlgorithmSpec() {
        return this.algorithmSpec;
    }

    /**
     * @return algorithmVersion
     */
    public String getAlgorithmVersion() {
        return this.algorithmVersion;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String algorithmId; 
        private String algorithmName; 
        private String algorithmProvider; 
        private AlgorithmSpec algorithmSpec; 
        private String algorithmVersion; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String tenantId; 
        private String userId; 

        private Builder() {
        } 

        private Builder(GetAlgorithmVersionResponseBody model) {
            this.algorithmId = model.algorithmId;
            this.algorithmName = model.algorithmName;
            this.algorithmProvider = model.algorithmProvider;
            this.algorithmSpec = model.algorithmSpec;
            this.algorithmVersion = model.algorithmVersion;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
        } 

        /**
         * <p>The ID of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>algo-xsldfvu1334</p>
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * <p>The name of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>llm_training</p>
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * <p>The provider of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * <p>Details about the algorithm.</p>
         */
        public Builder algorithmSpec(AlgorithmSpec algorithmSpec) {
            this.algorithmSpec = algorithmSpec;
            return this;
        }

        /**
         * <p>The version of the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>v0.0.1</p>
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        /**
         * <p>The time when the algorithm was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the algorithm was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-10T11:49:47Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The ID of the tenant who owns the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the user who owns the algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public GetAlgorithmVersionResponseBody build() {
            return new GetAlgorithmVersionResponseBody(this);
        } 

    } 

}
