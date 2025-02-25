// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTerminalsRequest} extends {@link RequestModel}
 *
 * <p>ListTerminalsRequest</p>
 */
public class ListTerminalsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InManage")
    private Boolean inManage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PasswordFreeLoginUser")
    private String passwordFreeLoginUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchKeyword")
    private String searchKeyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNumbers")
    private java.util.List < String > serialNumbers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuids")
    private java.util.List < String > uuids;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithBindUser")
    private Boolean withBindUser;

    private ListTerminalsRequest(Builder builder) {
        super(builder);
        this.inManage = builder.inManage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.passwordFreeLoginUser = builder.passwordFreeLoginUser;
        this.searchKeyword = builder.searchKeyword;
        this.serialNumbers = builder.serialNumbers;
        this.terminalGroupId = builder.terminalGroupId;
        this.uuids = builder.uuids;
        this.withBindUser = builder.withBindUser;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTerminalsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inManage
     */
    public Boolean getInManage() {
        return this.inManage;
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
     * @return passwordFreeLoginUser
     */
    public String getPasswordFreeLoginUser() {
        return this.passwordFreeLoginUser;
    }

    /**
     * @return searchKeyword
     */
    public String getSearchKeyword() {
        return this.searchKeyword;
    }

    /**
     * @return serialNumbers
     */
    public java.util.List < String > getSerialNumbers() {
        return this.serialNumbers;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return uuids
     */
    public java.util.List < String > getUuids() {
        return this.uuids;
    }

    /**
     * @return withBindUser
     */
    public Boolean getWithBindUser() {
        return this.withBindUser;
    }

    public static final class Builder extends Request.Builder<ListTerminalsRequest, Builder> {
        private Boolean inManage; 
        private Integer maxResults; 
        private String nextToken; 
        private String passwordFreeLoginUser; 
        private String searchKeyword; 
        private java.util.List < String > serialNumbers; 
        private String terminalGroupId; 
        private java.util.List < String > uuids; 
        private Boolean withBindUser; 

        private Builder() {
            super();
        } 

        private Builder(ListTerminalsRequest request) {
            super(request);
            this.inManage = request.inManage;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.passwordFreeLoginUser = request.passwordFreeLoginUser;
            this.searchKeyword = request.searchKeyword;
            this.serialNumbers = request.serialNumbers;
            this.terminalGroupId = request.terminalGroupId;
            this.uuids = request.uuids;
            this.withBindUser = request.withBindUser;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
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
         * PasswordFreeLoginUser.
         */
        public Builder passwordFreeLoginUser(String passwordFreeLoginUser) {
            this.putBodyParameter("PasswordFreeLoginUser", passwordFreeLoginUser);
            this.passwordFreeLoginUser = passwordFreeLoginUser;
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
         * SerialNumbers.
         */
        public Builder serialNumbers(java.util.List < String > serialNumbers) {
            this.putBodyParameter("SerialNumbers", serialNumbers);
            this.serialNumbers = serialNumbers;
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
         * Uuids.
         */
        public Builder uuids(java.util.List < String > uuids) {
            this.putBodyParameter("Uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        /**
         * WithBindUser.
         */
        public Builder withBindUser(Boolean withBindUser) {
            this.putBodyParameter("WithBindUser", withBindUser);
            this.withBindUser = withBindUser;
            return this;
        }

        @Override
        public ListTerminalsRequest build() {
            return new ListTerminalsRequest(this);
        } 

    } 

}
