// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAlgorithmVersionResponseBody</p>
 */
public class GetAlgorithmVersionResponseBody extends TeaModel {
    @NameInMap("AlgorithmId")
    private String algorithmId;

    @NameInMap("AlgorithmName")
    private String algorithmName;

    @NameInMap("AlgorithmProvider")
    private String algorithmProvider;

    @NameInMap("AlgorithmSpec")
    private AlgorithmSpec algorithmSpec;

    @NameInMap("AlgorithmVersion")
    private String algorithmVersion;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("TenantId")
    private String tenantId;

    @NameInMap("UserId")
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

        /**
         * AlgorithmId.
         */
        public Builder algorithmId(String algorithmId) {
            this.algorithmId = algorithmId;
            return this;
        }

        /**
         * AlgorithmName.
         */
        public Builder algorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }

        /**
         * AlgorithmProvider.
         */
        public Builder algorithmProvider(String algorithmProvider) {
            this.algorithmProvider = algorithmProvider;
            return this;
        }

        /**
         * AlgorithmSpec.
         */
        public Builder algorithmSpec(AlgorithmSpec algorithmSpec) {
            this.algorithmSpec = algorithmSpec;
            return this;
        }

        /**
         * AlgorithmVersion.
         */
        public Builder algorithmVersion(String algorithmVersion) {
            this.algorithmVersion = algorithmVersion;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
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
