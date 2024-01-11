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
    private java.util.List < CheckAndRiskTypeList> checkAndRiskTypeList;

    @Query
    @NameInMap("CheckIds")
    private java.util.List < Long > checkIds;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("Source")
    private String source;

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
        this.checkIds = builder.checkIds;
        this.lang = builder.lang;
        this.reason = builder.reason;
        this.source = builder.source;
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
     * @return checkIds
     */
    public java.util.List < Long > getCheckIds() {
        return this.checkIds;
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
     * @return source
     */
    public String getSource() {
        return this.source;
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
        private java.util.List < Long > checkIds; 
        private String lang; 
        private String reason; 
        private String source; 
        private Integer type; 
        private java.util.List < String > uuidList; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreCheckItemsRequest request) {
            super(request);
            this.checkAndRiskTypeList = request.checkAndRiskTypeList;
            this.checkIds = request.checkIds;
            this.lang = request.lang;
            this.reason = request.reason;
            this.source = request.source;
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
         * The IDs of check items.
         */
        public Builder checkIds(java.util.List < Long > checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
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
         * The data source. Valid values:
         * <p>
         * 
         * *   **default**: host baseline
         * *   **agentless**: agentless baseline
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The operation that you want to perform on the risk item.Valid values:
         * <p>
         * *  **1**: adds the risk item to the whitelist
         * *  **2**: removes the risk item from the whitelist
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
         * > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
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
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The baseline type of the check item.
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
