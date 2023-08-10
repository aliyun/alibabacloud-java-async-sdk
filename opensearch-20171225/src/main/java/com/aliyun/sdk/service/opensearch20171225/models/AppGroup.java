// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AppGroup} extends {@link TeaModel}
 *
 * <p>AppGroup</p>
 */
public class AppGroup extends TeaModel {
    @NameInMap("chargeType")
    private String chargeType;

    @NameInMap("chargingWay")
    private String chargingWay;

    @NameInMap("description")
    private String description;

    @NameInMap("domain")
    private String domain;

    @NameInMap("name")
    private String name;

    @NameInMap("quota")
    private Quota quota;

    @NameInMap("type")
    private String type;

    private AppGroup(Builder builder) {
        this.chargeType = builder.chargeType;
        this.chargingWay = builder.chargingWay;
        this.description = builder.description;
        this.domain = builder.domain;
        this.name = builder.name;
        this.quota = builder.quota;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppGroup create() {
        return builder().build();
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return chargingWay
     */
    public String getChargingWay() {
        return this.chargingWay;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return quota
     */
    public Quota getQuota() {
        return this.quota;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String chargeType; 
        private String chargingWay; 
        private String description; 
        private String domain; 
        private String name; 
        private Quota quota; 
        private String type; 

        /**
         * chargeType.
         */
        public Builder chargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }

        /**
         * chargingWay.
         */
        public Builder chargingWay(String chargingWay) {
            this.chargingWay = chargingWay;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
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
         * quota.
         */
        public Builder quota(Quota quota) {
            this.quota = quota;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AppGroup build() {
            return new AppGroup(this);
        } 

    } 

}
