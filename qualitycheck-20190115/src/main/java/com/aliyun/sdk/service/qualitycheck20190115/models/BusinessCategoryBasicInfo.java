// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BusinessCategoryBasicInfo} extends {@link TeaModel}
 *
 * <p>BusinessCategoryBasicInfo</p>
 */
public class BusinessCategoryBasicInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bid")
    private Integer bid;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OriginalId")
    private Long originalId;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private Integer serviceType;

    private BusinessCategoryBasicInfo(Builder builder) {
        this.bid = builder.bid;
        this.name = builder.name;
        this.originalId = builder.originalId;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BusinessCategoryBasicInfo create() {
        return builder().build();
    }

    /**
     * @return bid
     */
    public Integer getBid() {
        return this.bid;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return originalId
     */
    public Long getOriginalId() {
        return this.originalId;
    }

    /**
     * @return serviceType
     */
    public Integer getServiceType() {
        return this.serviceType;
    }

    public static final class Builder {
        private Integer bid; 
        private String name; 
        private Long originalId; 
        private Integer serviceType; 

        /**
         * Bid.
         */
        public Builder bid(Integer bid) {
            this.bid = bid;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * OriginalId.
         */
        public Builder originalId(Long originalId) {
            this.originalId = originalId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(Integer serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public BusinessCategoryBasicInfo build() {
            return new BusinessCategoryBasicInfo(this);
        } 

    } 

}
