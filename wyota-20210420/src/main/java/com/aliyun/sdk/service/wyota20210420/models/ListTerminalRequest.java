// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTerminalRequest} extends {@link RequestModel}
 *
 * <p>ListTerminalRequest</p>
 */
public class ListTerminalRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private String buildId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InManage")
    private Boolean inManage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ipv4")
    private String ipv4;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LocationInfo")
    private String locationInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumber")
    private String serialNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListTerminalRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.buildId = builder.buildId;
        this.clientType = builder.clientType;
        this.inManage = builder.inManage;
        this.ipv4 = builder.ipv4;
        this.locationInfo = builder.locationInfo;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.nextToken = builder.nextToken;
        this.searchKeyword = builder.searchKeyword;
        this.serialNumber = builder.serialNumber;
        this.terminalGroupId = builder.terminalGroupId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return inManage
     */
    public Boolean getInManage() {
        return this.inManage;
    }

    /**
     * @return ipv4
     */
    public String getIpv4() {
        return this.ipv4;
    }

    /**
     * @return locationInfo
     */
    public String getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return serialNumber
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListTerminalRequest, Builder> {
        private String alias; 
        private String buildId; 
        private Integer clientType; 
        private Boolean inManage; 
        private String ipv4; 
        private String locationInfo; 
        private Integer maxResults; 
        private String model; 
        private String nextToken; 
        private String searchKeyword; 
        private String serialNumber; 
        private String terminalGroupId; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListTerminalRequest request) {
            super(request);
            this.alias = request.alias;
            this.buildId = request.buildId;
            this.clientType = request.clientType;
            this.inManage = request.inManage;
            this.ipv4 = request.ipv4;
            this.locationInfo = request.locationInfo;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.nextToken = request.nextToken;
            this.searchKeyword = request.searchKeyword;
            this.serialNumber = request.serialNumber;
            this.terminalGroupId = request.terminalGroupId;
            this.uuid = request.uuid;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * BuildId.
         */
        public Builder buildId(String buildId) {
            this.putBodyParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * InManage.
         */
        public Builder inManage(Boolean inManage) {
            this.putBodyParameter("InManage", inManage);
            this.inManage = inManage;
            return this;
        }

        /**
         * Ipv4.
         */
        public Builder ipv4(String ipv4) {
            this.putBodyParameter("Ipv4", ipv4);
            this.ipv4 = ipv4;
            return this;
        }

        /**
         * LocationInfo.
         */
        public Builder locationInfo(String locationInfo) {
            this.putBodyParameter("LocationInfo", locationInfo);
            this.locationInfo = locationInfo;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * SearchKeyword.
         */
        public Builder searchKeyword(String searchKeyword) {
            this.putBodyParameter("SearchKeyword", searchKeyword);
            this.searchKeyword = searchKeyword;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(String serialNumber) {
            this.putBodyParameter("SerialNumber", serialNumber);
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * TerminalGroupId.
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListTerminalRequest build() {
            return new ListTerminalRequest(this);
        } 

    } 

}
