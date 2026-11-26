// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLJobSpec} extends {@link TeaModel}
 *
 * <p>RLJobSpec</p>
 */
public class RLJobSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Image")
    private String image;

    @com.aliyun.core.annotation.NameInMap("PodCount")
    private Integer podCount;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("ResourceConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ResourceConfig resourceConfig;

    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private RLJobSpec(Builder builder) {
        this.image = builder.image;
        this.podCount = builder.podCount;
        this.quotaId = builder.quotaId;
        this.resourceConfig = builder.resourceConfig;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLJobSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return podCount
     */
    public Integer getPodCount() {
        return this.podCount;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return resourceConfig
     */
    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String image; 
        private Integer podCount; 
        private String quotaId; 
        private ResourceConfig resourceConfig; 
        private String type; 

        private Builder() {
        } 

        private Builder(RLJobSpec model) {
            this.image = model.image;
            this.podCount = model.podCount;
            this.quotaId = model.quotaId;
            this.resourceConfig = model.resourceConfig;
            this.type = model.type;
        } 

        /**
         * <p>接受 tag 或 sha256 摘要。未指定配方且已提供所需资源池时，可省略镜像并使用平台为该资源池配置的默认镜像；无唯一默认镜像时须显式指定。</p>
         * 
         * <strong>example:</strong>
         * <p>registry.example.com/rls/verl@sha256:0123456789abcdef0123456789abcdef0123456789abcdef0123456789abcdef</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * <p>该资源条目的工作节点数量，默认 1，必须为正整数；不包括平台管理的辅助节点。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder podCount(Integer podCount) {
            this.podCount = podCount;
            return this;
        }

        /**
         * <p>资源池配额 ID；省略时使用作业级 ResourceId。不同资源池可指定不同配额；使用多个配额时每个池必须显式指定，train 池的配额为作业主配额。各配额均须已在作业工作空间授权且属于同一 VPC</p>
         * 
         * <strong>example:</strong>
         * <p>quotag2uo09dyp40</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>每个 Pod 的资源规格，所有值均为字符串。CPU、Memory 必须为正值；GPU 省略时为 CPU 资源池，提供时必须为正整数。GPUType 可省略，并可从已解析的作业或配额信息中确定；若配额存在多种 GPU 类型且尚未确定目标类型，必须显式指定。SharedMemory 可选。最终资源组合还须满足所选框架、入口与 TrainerMode 的拓扑约束。</p>
         * <p>This parameter is required.</p>
         */
        public Builder resourceConfig(ResourceConfig resourceConfig) {
            this.resourceConfig = resourceConfig;
            return this;
        }

        /**
         * <p>资源角色，必填，使用小写 train 或 rollout，在 JobSpecs 内唯一。文档中的 rollout/train 表示二选一，不是可直接提交的字面值</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public RLJobSpec build() {
            return new RLJobSpec(this);
        } 

    } 

}
