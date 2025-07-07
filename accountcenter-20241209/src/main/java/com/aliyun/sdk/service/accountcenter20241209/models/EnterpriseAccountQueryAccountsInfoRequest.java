// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountQueryAccountsInfoRequest} extends {@link RequestModel}
 *
 * <p>EnterpriseAccountQueryAccountsInfoRequest</p>
 */
public class EnterpriseAccountQueryAccountsInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptTicket")
    private String encryptTicket;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedEcId")
    private String orientedEcId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedLeId")
    private String orientedLeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrientedNbId")
    private String orientedNbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PksJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pksJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ShowCompleteInfo")
    private Boolean showCompleteInfo;

    private EnterpriseAccountQueryAccountsInfoRequest(Builder builder) {
        super(builder);
        this.encryptTicket = builder.encryptTicket;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orientedEcId = builder.orientedEcId;
        this.orientedLeId = builder.orientedLeId;
        this.orientedNbId = builder.orientedNbId;
        this.pksJson = builder.pksJson;
        this.requestId = builder.requestId;
        this.showCompleteInfo = builder.showCompleteInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountQueryAccountsInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptTicket
     */
    public String getEncryptTicket() {
        return this.encryptTicket;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return orientedEcId
     */
    public String getOrientedEcId() {
        return this.orientedEcId;
    }

    /**
     * @return orientedLeId
     */
    public String getOrientedLeId() {
        return this.orientedLeId;
    }

    /**
     * @return orientedNbId
     */
    public String getOrientedNbId() {
        return this.orientedNbId;
    }

    /**
     * @return pksJson
     */
    public String getPksJson() {
        return this.pksJson;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showCompleteInfo
     */
    public Boolean getShowCompleteInfo() {
        return this.showCompleteInfo;
    }

    public static final class Builder extends Request.Builder<EnterpriseAccountQueryAccountsInfoRequest, Builder> {
        private String encryptTicket; 
        private Integer maxResults; 
        private String nextToken; 
        private String orientedEcId; 
        private String orientedLeId; 
        private String orientedNbId; 
        private String pksJson; 
        private String requestId; 
        private Boolean showCompleteInfo; 

        private Builder() {
            super();
        } 

        private Builder(EnterpriseAccountQueryAccountsInfoRequest request) {
            super(request);
            this.encryptTicket = request.encryptTicket;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orientedEcId = request.orientedEcId;
            this.orientedLeId = request.orientedLeId;
            this.orientedNbId = request.orientedNbId;
            this.pksJson = request.pksJson;
            this.requestId = request.requestId;
            this.showCompleteInfo = request.showCompleteInfo;
        } 

        /**
         * EncryptTicket.
         */
        public Builder encryptTicket(String encryptTicket) {
            this.putQueryParameter("EncryptTicket", encryptTicket);
            this.encryptTicket = encryptTicket;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrientedEcId.
         */
        public Builder orientedEcId(String orientedEcId) {
            this.putBodyParameter("OrientedEcId", orientedEcId);
            this.orientedEcId = orientedEcId;
            return this;
        }

        /**
         * OrientedLeId.
         */
        public Builder orientedLeId(String orientedLeId) {
            this.putBodyParameter("OrientedLeId", orientedLeId);
            this.orientedLeId = orientedLeId;
            return this;
        }

        /**
         * OrientedNbId.
         */
        public Builder orientedNbId(String orientedNbId) {
            this.putBodyParameter("OrientedNbId", orientedNbId);
            this.orientedNbId = orientedNbId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pksJson(String pksJson) {
            this.putQueryParameter("PksJson", pksJson);
            this.pksJson = pksJson;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * ShowCompleteInfo.
         */
        public Builder showCompleteInfo(Boolean showCompleteInfo) {
            this.putBodyParameter("ShowCompleteInfo", showCompleteInfo);
            this.showCompleteInfo = showCompleteInfo;
            return this;
        }

        @Override
        public EnterpriseAccountQueryAccountsInfoRequest build() {
            return new EnterpriseAccountQueryAccountsInfoRequest(this);
        } 

    } 

}
