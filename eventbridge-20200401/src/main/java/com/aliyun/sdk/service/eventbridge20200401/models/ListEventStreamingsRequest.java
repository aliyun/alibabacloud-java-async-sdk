// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListEventStreamingsRequest} extends {@link RequestModel}
 *
 * <p>ListEventStreamingsRequest</p>
 */
public class ListEventStreamingsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamePrefix")
    private String namePrefix;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SinkArn")
    private String sinkArn;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceArn")
    private String sourceArn;

    private ListEventStreamingsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.limit = builder.limit;
        this.namePrefix = builder.namePrefix;
        this.nextToken = builder.nextToken;
        this.sinkArn = builder.sinkArn;
        this.sourceArn = builder.sourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventStreamingsRequest create() {
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
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return namePrefix
     */
    public String getNamePrefix() {
        return this.namePrefix;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sinkArn
     */
    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    public static final class Builder extends Request.Builder<ListEventStreamingsRequest, Builder> {
        private String regionId; 
        private Integer limit; 
        private String namePrefix; 
        private String nextToken; 
        private String sinkArn; 
        private String sourceArn; 

        private Builder() {
            super();
        } 

        private Builder(ListEventStreamingsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.limit = request.limit;
            this.namePrefix = request.namePrefix;
            this.nextToken = request.nextToken;
            this.sinkArn = request.sinkArn;
            this.sourceArn = request.sourceArn;
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
         * <p>The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. A maximum of 100 entries can be returned in a call.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The name of the event stream that you want to query.</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        public Builder namePrefix(String namePrefix) {
            this.putBodyParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * <p>If you configure Limit and excess return values exist, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ARN of the event target.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-hangzhou:118609547428****:services/fw1.LATEST/functions/log1</p>
         */
        public Builder sinkArn(String sinkArn) {
            this.putBodyParameter("SinkArn", sinkArn);
            this.sinkArn = sinkArn;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event source.</p>
         */
        public Builder sourceArn(String sourceArn) {
            this.putBodyParameter("SourceArn", sourceArn);
            this.sourceArn = sourceArn;
            return this;
        }

        @Override
        public ListEventStreamingsRequest build() {
            return new ListEventStreamingsRequest(this);
        } 

    } 

}
