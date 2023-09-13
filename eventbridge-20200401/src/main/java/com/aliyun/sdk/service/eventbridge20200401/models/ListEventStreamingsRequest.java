// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * {@link ListEventStreamingsRequest} extends {@link RequestModel}
 *
 * <p>ListEventStreamingsRequest</p>
 */
public class ListEventStreamingsRequest extends Request {
    @Body
    @NameInMap("Limit")
    private Integer limit;

    @Body
    @NameInMap("NamePrefix")
    private String namePrefix;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("SinkArn")
    private String sinkArn;

    @Body
    @NameInMap("SourceArn")
    private String sourceArn;

    private ListEventStreamingsRequest(Builder builder) {
        super(builder);
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
            this.limit = request.limit;
            this.namePrefix = request.namePrefix;
            this.nextToken = request.nextToken;
            this.sinkArn = request.sinkArn;
            this.sourceArn = request.sourceArn;
        } 

        /**
         * The maximum number of entries to be returned in a call. You can use this parameter and NextToken to implement paging. A maximum of 100 entries can be returned in a call.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The name of the event stream that you want to query.
         */
        public Builder namePrefix(String namePrefix) {
            this.putBodyParameter("NamePrefix", namePrefix);
            this.namePrefix = namePrefix;
            return this;
        }

        /**
         * If you configure Limit and excess return values exist, this parameter is returned.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ARN of the event target.
         */
        public Builder sinkArn(String sinkArn) {
            this.putBodyParameter("SinkArn", sinkArn);
            this.sinkArn = sinkArn;
            return this;
        }

        /**
         * The Alibaba Cloud Resource Name (ARN) of the event source.
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
