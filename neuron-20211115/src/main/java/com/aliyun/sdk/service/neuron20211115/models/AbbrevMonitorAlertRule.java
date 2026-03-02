// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link AbbrevMonitorAlertRule} extends {@link TeaModel}
 *
 * <p>AbbrevMonitorAlertRule</p>
 */
public class AbbrevMonitorAlertRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("triggerContent")
    private String triggerContent;

    @com.aliyun.core.annotation.NameInMap("triggerRule")
    private String triggerRule;

    private AbbrevMonitorAlertRule(Builder builder) {
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.name = builder.name;
        this.triggerContent = builder.triggerContent;
        this.triggerRule = builder.triggerRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbbrevMonitorAlertRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return triggerContent
     */
    public String getTriggerContent() {
        return this.triggerContent;
    }

    /**
     * @return triggerRule
     */
    public String getTriggerRule() {
        return this.triggerRule;
    }

    public static final class Builder {
        private String createTime; 
        private Long id; 
        private String name; 
        private String triggerContent; 
        private String triggerRule; 

        private Builder() {
        } 

        private Builder(AbbrevMonitorAlertRule model) {
            this.createTime = model.createTime;
            this.id = model.id;
            this.name = model.name;
            this.triggerContent = model.triggerContent;
            this.triggerRule = model.triggerRule;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * triggerContent.
         */
        public Builder triggerContent(String triggerContent) {
            this.triggerContent = triggerContent;
            return this;
        }

        /**
         * triggerRule.
         */
        public Builder triggerRule(String triggerRule) {
            this.triggerRule = triggerRule;
            return this;
        }

        public AbbrevMonitorAlertRule build() {
            return new AbbrevMonitorAlertRule(this);
        } 

    } 

}
