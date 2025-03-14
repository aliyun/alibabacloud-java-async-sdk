// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link IgnoreCheckItemsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreCheckItemsRequest</p>
 */
public class IgnoreCheckItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckAndRiskTypeList")
    private java.util.List<CheckAndRiskTypeList> checkAndRiskTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private java.util.List<Long> checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

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
    public java.util.List<CheckAndRiskTypeList> getCheckAndRiskTypeList() {
        return this.checkAndRiskTypeList;
    }

    /**
     * @return checkIds
     */
    public java.util.List<Long> getCheckIds() {
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
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<IgnoreCheckItemsRequest, Builder> {
        private java.util.List<CheckAndRiskTypeList> checkAndRiskTypeList; 
        private java.util.List<Long> checkIds; 
        private String lang; 
        private String reason; 
        private String source; 
        private Integer type; 
        private java.util.List<String> uuidList; 

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
         * <p>The information about check items.</p>
         */
        public Builder checkAndRiskTypeList(java.util.List<CheckAndRiskTypeList> checkAndRiskTypeList) {
            this.putQueryParameter("CheckAndRiskTypeList", checkAndRiskTypeList);
            this.checkAndRiskTypeList = checkAndRiskTypeList;
            return this;
        }

        /**
         * <p>The IDs of check items.</p>
         */
        public Builder checkIds(java.util.List<Long> checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The reason why you add the risk item to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>already config in another way</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The data source. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: host baseline</li>
         * <li><strong>agentless</strong>: agentless baseline</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agentless</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The operation that you want to perform on the risk item.Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: adds the risk item to the whitelist</li>
         * <li><strong>2</strong>: removes the risk item from the whitelist</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Integer type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The UUIDs of the servers.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
         * </blockquote>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public IgnoreCheckItemsRequest build() {
            return new IgnoreCheckItemsRequest(this);
        } 

    } 

    /**
     * 
     * {@link IgnoreCheckItemsRequest} extends {@link TeaModel}
     *
     * <p>IgnoreCheckItemsRequest</p>
     */
    public static class CheckAndRiskTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("RiskType")
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

            private Builder() {
            } 

            private Builder(CheckAndRiskTypeList model) {
                this.checkId = model.checkId;
                this.riskType = model.riskType;
            } 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>52</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The baseline type of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>weak_password</p>
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
