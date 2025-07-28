// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ListBlockSendingRequest} extends {@link RequestModel}
 *
 * <p>ListBlockSendingRequest</p>
 */
public class ListBlockSendingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BeginTime")
    private Integer beginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockEmail")
    private String blockEmail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BlockType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String blockType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Integer endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderEmail")
    private String senderEmail;

    private ListBlockSendingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.beginTime = builder.beginTime;
        this.blockEmail = builder.blockEmail;
        this.blockType = builder.blockType;
        this.endTime = builder.endTime;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.senderEmail = builder.senderEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBlockSendingRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return beginTime
     */
    public Integer getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return blockEmail
     */
    public String getBlockEmail() {
        return this.blockEmail;
    }

    /**
     * @return blockType
     */
    public String getBlockType() {
        return this.blockType;
    }

    /**
     * @return endTime
     */
    public Integer getEndTime() {
        return this.endTime;
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
     * @return senderEmail
     */
    public String getSenderEmail() {
        return this.senderEmail;
    }

    public static final class Builder extends Request.Builder<ListBlockSendingRequest, Builder> {
        private String regionId; 
        private Integer beginTime; 
        private String blockEmail; 
        private String blockType; 
        private Integer endTime; 
        private Integer maxResults; 
        private String nextToken; 
        private String senderEmail; 

        private Builder() {
            super();
        } 

        private Builder(ListBlockSendingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.beginTime = request.beginTime;
            this.blockEmail = request.blockEmail;
            this.blockType = request.blockType;
            this.endTime = request.endTime;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.senderEmail = request.senderEmail;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BeginTime.
         */
        public Builder beginTime(Integer beginTime) {
            this.putQueryParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * BlockEmail.
         */
        public Builder blockEmail(String blockEmail) {
            this.putQueryParameter("BlockEmail", blockEmail);
            this.blockEmail = blockEmail;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSUB</p>
         */
        public Builder blockType(String blockType) {
            this.putQueryParameter("BlockType", blockType);
            this.blockType = blockType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Integer endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * SenderEmail.
         */
        public Builder senderEmail(String senderEmail) {
            this.putQueryParameter("SenderEmail", senderEmail);
            this.senderEmail = senderEmail;
            return this;
        }

        @Override
        public ListBlockSendingRequest build() {
            return new ListBlockSendingRequest(this);
        } 

    } 

}
