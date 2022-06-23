// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssetsListAssetsRequest} extends {@link RequestModel}
 *
 * <p>AssetsListAssetsRequest</p>
 */
public class AssetsListAssetsRequest extends Request {
    @NameInMap("AppId")
    private String appId;

    @NameInMap("FieldMask")
    private String fieldMask;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Params")
    private String params;

    @NameInMap("Topic")
    private String topic;

    private AssetsListAssetsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.fieldMask = builder.fieldMask;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.params = builder.params;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssetsListAssetsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return fieldMask
     */
    public String getFieldMask() {
        return this.fieldMask;
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
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<AssetsListAssetsRequest, Builder> {
        private String appId; 
        private String fieldMask; 
        private Integer maxResults; 
        private String nextToken; 
        private String params; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(AssetsListAssetsRequest request) {
            super(request);
            this.appId = request.appId;
            this.fieldMask = request.fieldMask;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.params = request.params;
            this.topic = request.topic;
        } 

        /**
         * AppId
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Optional. Used to specify a subset of fields that should be
         * <p>
         * returned by a get operation or modified by an update operation.
         */
        public Builder fieldMask(String fieldMask) {
            this.fieldMask = fieldMask;
            return this;
        }

        /**
         * 每页显示个数，最大支持20，参数为空默认显示个数为10。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 分页Token Optional.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 参数
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * 订阅Topic
         */
        public Builder topic(String topic) {
            this.topic = topic;
            return this;
        }

        @Override
        public AssetsListAssetsRequest build() {
            return new AssetsListAssetsRequest(this);
        } 

    } 

}
