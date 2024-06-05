// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PunishRule} extends {@link TeaModel}
 *
 * <p>PunishRule</p>
 */
public class PunishRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action_code")
    private String actionCode;

    @com.aliyun.core.annotation.NameInMap("ends_at")
    private String endsAt;

    @com.aliyun.core.annotation.NameInMap("impermanent")
    private Boolean impermanent;

    @com.aliyun.core.annotation.NameInMap("starts_at")
    private String startsAt;

    private PunishRule(Builder builder) {
        this.actionCode = builder.actionCode;
        this.endsAt = builder.endsAt;
        this.impermanent = builder.impermanent;
        this.startsAt = builder.startsAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PunishRule create() {
        return builder().build();
    }

    /**
     * @return actionCode
     */
    public String getActionCode() {
        return this.actionCode;
    }

    /**
     * @return endsAt
     */
    public String getEndsAt() {
        return this.endsAt;
    }

    /**
     * @return impermanent
     */
    public Boolean getImpermanent() {
        return this.impermanent;
    }

    /**
     * @return startsAt
     */
    public String getStartsAt() {
        return this.startsAt;
    }

    public static final class Builder {
        private String actionCode; 
        private String endsAt; 
        private Boolean impermanent; 
        private String startsAt; 

        /**
         * action_code.
         */
        public Builder actionCode(String actionCode) {
            this.actionCode = actionCode;
            return this;
        }

        /**
         * ends_at.
         */
        public Builder endsAt(String endsAt) {
            this.endsAt = endsAt;
            return this;
        }

        /**
         * impermanent.
         */
        public Builder impermanent(Boolean impermanent) {
            this.impermanent = impermanent;
            return this;
        }

        /**
         * starts_at.
         */
        public Builder startsAt(String startsAt) {
            this.startsAt = startsAt;
            return this;
        }

        public PunishRule build() {
            return new PunishRule(this);
        } 

    } 

}
