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
 * {@link PushingSetting} extends {@link TeaModel}
 *
 * <p>PushingSetting</p>
 */
public class PushingSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertActionIds")
    private java.util.List<String> alertActionIds;

    @com.aliyun.core.annotation.NameInMap("restoreActionIds")
    private java.util.List<String> restoreActionIds;

    @com.aliyun.core.annotation.NameInMap("templateUuid")
    private String templateUuid;

    private PushingSetting(Builder builder) {
        this.alertActionIds = builder.alertActionIds;
        this.restoreActionIds = builder.restoreActionIds;
        this.templateUuid = builder.templateUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushingSetting create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertActionIds
     */
    public java.util.List<String> getAlertActionIds() {
        return this.alertActionIds;
    }

    /**
     * @return restoreActionIds
     */
    public java.util.List<String> getRestoreActionIds() {
        return this.restoreActionIds;
    }

    /**
     * @return templateUuid
     */
    public String getTemplateUuid() {
        return this.templateUuid;
    }

    public static final class Builder {
        private java.util.List<String> alertActionIds; 
        private java.util.List<String> restoreActionIds; 
        private String templateUuid; 

        private Builder() {
        } 

        private Builder(PushingSetting model) {
            this.alertActionIds = model.alertActionIds;
            this.restoreActionIds = model.restoreActionIds;
            this.templateUuid = model.templateUuid;
        } 

        /**
         * alertActionIds.
         */
        public Builder alertActionIds(java.util.List<String> alertActionIds) {
            this.alertActionIds = alertActionIds;
            return this;
        }

        /**
         * restoreActionIds.
         */
        public Builder restoreActionIds(java.util.List<String> restoreActionIds) {
            this.restoreActionIds = restoreActionIds;
            return this;
        }

        /**
         * templateUuid.
         */
        public Builder templateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
            return this;
        }

        public PushingSetting build() {
            return new PushingSetting(this);
        } 

    } 

}
