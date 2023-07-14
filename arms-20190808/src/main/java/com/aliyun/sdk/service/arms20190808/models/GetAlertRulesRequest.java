// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>GetAlertRulesRequest</p>
 */
public class GetAlertRulesRequest extends Request {
    @Query
    @NameInMap("AlertIds")
    private String alertIds;

    @Query
    @NameInMap("AlertNames")
    private String alertNames;

    @Query
    @NameInMap("AlertStatus")
    private String alertStatus;

    @Query
    @NameInMap("AlertType")
    @Validation(required = true)
    private String alertType;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    private GetAlertRulesRequest(Builder builder) {
        super(builder);
        this.alertIds = builder.alertIds;
        this.alertNames = builder.alertNames;
        this.alertStatus = builder.alertStatus;
        this.alertType = builder.alertType;
        this.clusterId = builder.clusterId;
        this.page = builder.page;
        this.productCode = builder.productCode;
        this.regionId = builder.regionId;
        this.size = builder.size;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertIds
     */
    public String getAlertIds() {
        return this.alertIds;
    }

    /**
     * @return alertNames
     */
    public String getAlertNames() {
        return this.alertNames;
    }

    /**
     * @return alertStatus
     */
    public String getAlertStatus() {
        return this.alertStatus;
    }

    /**
     * @return alertType
     */
    public String getAlertType() {
        return this.alertType;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<GetAlertRulesRequest, Builder> {
        private String alertIds; 
        private String alertNames; 
        private String alertStatus; 
        private String alertType; 
        private String clusterId; 
        private Long page; 
        private String productCode; 
        private String regionId; 
        private Long size; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(GetAlertRulesRequest request) {
            super(request);
            this.alertIds = request.alertIds;
            this.alertNames = request.alertNames;
            this.alertStatus = request.alertStatus;
            this.alertType = request.alertType;
            this.clusterId = request.clusterId;
            this.page = request.page;
            this.productCode = request.productCode;
            this.regionId = request.regionId;
            this.size = request.size;
            this.tags = request.tags;
        } 

        /**
         * AlertIds.
         */
        public Builder alertIds(String alertIds) {
            this.putQueryParameter("AlertIds", alertIds);
            this.alertIds = alertIds;
            return this;
        }

        /**
         * AlertNames.
         */
        public Builder alertNames(String alertNames) {
            this.putQueryParameter("AlertNames", alertNames);
            this.alertNames = alertNames;
            return this;
        }

        /**
         * AlertStatus.
         */
        public Builder alertStatus(String alertStatus) {
            this.putQueryParameter("AlertStatus", alertStatus);
            this.alertStatus = alertStatus;
            return this;
        }

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putQueryParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public GetAlertRulesRequest build() {
            return new GetAlertRulesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
