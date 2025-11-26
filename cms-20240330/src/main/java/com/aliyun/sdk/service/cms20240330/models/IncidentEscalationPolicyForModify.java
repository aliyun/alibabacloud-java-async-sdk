// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentEscalationPolicyForModify} extends {@link TeaModel}
 *
 * <p>IncidentEscalationPolicyForModify</p>
 */
public class IncidentEscalationPolicyForModify extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("enable")
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("escalationStageList")
    private java.util.List<IncidentEscalationStageForView> escalationStageList;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private IncidentEscalationPolicyForModify(Builder builder) {
        this.description = builder.description;
        this.enable = builder.enable;
        this.escalationStageList = builder.escalationStageList;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEscalationPolicyForModify create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return escalationStageList
     */
    public java.util.List<IncidentEscalationStageForView> getEscalationStageList() {
        return this.escalationStageList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String description; 
        private Boolean enable; 
        private java.util.List<IncidentEscalationStageForView> escalationStageList; 
        private String name; 

        private Builder() {
        } 

        private Builder(IncidentEscalationPolicyForModify model) {
            this.description = model.description;
            this.enable = model.enable;
            this.escalationStageList = model.escalationStageList;
            this.name = model.name;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * enable.
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * escalationStageList.
         */
        public Builder escalationStageList(java.util.List<IncidentEscalationStageForView> escalationStageList) {
            this.escalationStageList = escalationStageList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public IncidentEscalationPolicyForModify build() {
            return new IncidentEscalationPolicyForModify(this);
        } 

    } 

}
