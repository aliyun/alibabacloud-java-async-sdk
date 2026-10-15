// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link PublicTemplateStatus} extends {@link TeaModel}
 *
 * <p>PublicTemplateStatus</p>
 */
public class PublicTemplateStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private String finishedAt;

    @com.aliyun.core.annotation.NameInMap("reason")
    private PublicTemplateStatusReason reason;

    @com.aliyun.core.annotation.NameInMap("state")
    private String state;

    private PublicTemplateStatus(Builder builder) {
        this.finishedAt = builder.finishedAt;
        this.reason = builder.reason;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublicTemplateStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finishedAt
     */
    public String getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return reason
     */
    public PublicTemplateStatusReason getReason() {
        return this.reason;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String finishedAt; 
        private PublicTemplateStatusReason reason; 
        private String state; 

        private Builder() {
        } 

        private Builder(PublicTemplateStatus model) {
            this.finishedAt = model.finishedAt;
            this.reason = model.reason;
            this.state = model.state;
        } 

        /**
         * <p>The time when the template reached the current desired state, in UTC and RFC 3339 format. This parameter is empty when the template is still being built or updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-20T08:35:12Z</p>
         */
        public Builder finishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * <p>The reason why the template entered a failure state. This parameter is returned only when state is error or updateFailed.</p>
         */
        public Builder reason(PublicTemplateStatusReason reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>building: The template is being built.</li>
         * <li>ready: The template is active.</li>
         * <li>updating: The template is being updated.</li>
         * <li>updateFailed: The template failed to be updated.</li>
         * <li>error: The template failed to be built.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ready</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public PublicTemplateStatus build() {
            return new PublicTemplateStatus(this);
        } 

    } 

}
