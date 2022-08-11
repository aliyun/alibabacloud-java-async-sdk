// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyDetailsResponseBody</p>
 */
public class DescribePolicyDetailsResponseBody extends TeaModel {
    @NameInMap("action")
    private String action;

    @NameInMap("category")
    private String category;

    @NameInMap("description")
    private String description;

    @NameInMap("is_deleted")
    private Integer isDeleted;

    @NameInMap("name")
    private String name;

    @NameInMap("no_config")
    private Integer noConfig;

    @NameInMap("severity")
    private String severity;

    @NameInMap("template")
    private String template;

    private DescribePolicyDetailsResponseBody(Builder builder) {
        this.action = builder.action;
        this.category = builder.category;
        this.description = builder.description;
        this.isDeleted = builder.isDeleted;
        this.name = builder.name;
        this.noConfig = builder.noConfig;
        this.severity = builder.severity;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return noConfig
     */
    public Integer getNoConfig() {
        return this.noConfig;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String action; 
        private String category; 
        private String description; 
        private Integer isDeleted; 
        private String name; 
        private Integer noConfig; 
        private String severity; 
        private String template; 

        /**
         * 规则治理动作 ● enforce: 拦截违规部署 ● inform：告警
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * 规则模板类型
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * 规则模板描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 软删除标志：0表示未删除 1表示删除
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * 策略治理规则名称
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * 是否需要配置策略： 0表示需要参数配置 1表示无需参数配置
         */
        public Builder noConfig(Integer noConfig) {
            this.noConfig = noConfig;
            return this;
        }

        /**
         * 规则治理等级
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * 规则模板详情
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public DescribePolicyDetailsResponseBody build() {
            return new DescribePolicyDetailsResponseBody(this);
        } 

    } 

}
