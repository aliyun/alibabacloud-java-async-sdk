// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreCheckItemsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreCheckItemsRequest</p>
 */
public class IgnoreCheckItemsRequest extends Request {
    @Query
    @NameInMap("CheckAndRiskTypeList")
    @Validation(required = true)
    private java.util.List < CheckAndRiskTypeList> checkAndRiskTypeList;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    @Query
    @NameInMap("UuidList")
    private java.util.List < String > uuidList;

    private IgnoreCheckItemsRequest(Builder builder) {
        super(builder);
        this.checkAndRiskTypeList = builder.checkAndRiskTypeList;
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.type = builder.type;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreCheckItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkAndRiskTypeList
     */
    public java.util.List < CheckAndRiskTypeList> getCheckAndRiskTypeList() {
        return this.checkAndRiskTypeList;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uuidList
     */
    public java.util.List < String > getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<IgnoreCheckItemsRequest, Builder> {
        private java.util.List < CheckAndRiskTypeList> checkAndRiskTypeList; 
        private String lang; 
        private String reason; 
        private Integer type; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreCheckItemsRequest request) {
            super(request);
            this.checkAndRiskTypeList = request.checkAndRiskTypeList;
            this.lang = request.lang;
            this.reason = request.reason;
            this.type = request.type;
            this.uuidList = request.uuidList;
        } 

        /**
         * The risk items.
         */
        public Builder checkAndRiskTypeList(java.util.List < CheckAndRiskTypeList> checkAndRiskTypeList) {
            this.putQueryParameter("CheckAndRiskTypeList", checkAndRiskTypeList);
            this.checkAndRiskTypeList = checkAndRiskTypeList;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The reason why you add the risk item to the whitelist.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The operation that you want to perform on the risk item. Valid values:
         * <p>
         * 
         * *   **1**: ignores a risk item
         * *   **2**: cancels ignoring a risk item
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * The UUIDs of the servers.
         * <p>
         * 
         * >  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
         */
        public Builder uuidList(java.util.List < String > uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public IgnoreCheckItemsRequest build() {
            return new IgnoreCheckItemsRequest(this);
        } 

    } 

    public static class CheckAndRiskTypeList extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("RiskType")
        private String riskType;

        private CheckAndRiskTypeList(Builder builder) {
            this.checkId = builder.checkId;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckAndRiskTypeList create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private Long checkId; 
            private String riskType; 

            /**
             * The IDs of the check items.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The baseline type of the risk item.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public CheckAndRiskTypeList build() {
                return new CheckAndRiskTypeList(this);
            } 

        } 

    }
}
