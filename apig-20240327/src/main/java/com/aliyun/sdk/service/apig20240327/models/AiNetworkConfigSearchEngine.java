// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiNetworkConfigSearchEngine} extends {@link TeaModel}
 *
 * <p>AiNetworkConfigSearchEngine</p>
 */
public class AiNetworkConfigSearchEngine extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("apiKey")
    private String apiKey;

    @com.aliyun.core.annotation.NameInMap("contentMode")
    private String contentMode;

    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("optionArgs")
    private java.util.Map<String, String> optionArgs;

    @com.aliyun.core.annotation.NameInMap("start")
    private Integer start;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    @com.aliyun.core.annotation.NameInMap("timeoutMillisecond")
    private Integer timeoutMillisecond;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private AiNetworkConfigSearchEngine(Builder builder) {
        this.apiKey = builder.apiKey;
        this.contentMode = builder.contentMode;
        this.count = builder.count;
        this.endpoint = builder.endpoint;
        this.industry = builder.industry;
        this.optionArgs = builder.optionArgs;
        this.start = builder.start;
        this.timeRange = builder.timeRange;
        this.timeoutMillisecond = builder.timeoutMillisecond;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiNetworkConfigSearchEngine create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return contentMode
     */
    public String getContentMode() {
        return this.contentMode;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return optionArgs
     */
    public java.util.Map<String, String> getOptionArgs() {
        return this.optionArgs;
    }

    /**
     * @return start
     */
    public Integer getStart() {
        return this.start;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    /**
     * @return timeoutMillisecond
     */
    public Integer getTimeoutMillisecond() {
        return this.timeoutMillisecond;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String apiKey; 
        private String contentMode; 
        private Integer count; 
        private String endpoint; 
        private String industry; 
        private java.util.Map<String, String> optionArgs; 
        private Integer start; 
        private String timeRange; 
        private Integer timeoutMillisecond; 
        private String type; 

        private Builder() {
        } 

        private Builder(AiNetworkConfigSearchEngine model) {
            this.apiKey = model.apiKey;
            this.contentMode = model.contentMode;
            this.count = model.count;
            this.endpoint = model.endpoint;
            this.industry = model.industry;
            this.optionArgs = model.optionArgs;
            this.start = model.start;
            this.timeRange = model.timeRange;
            this.timeoutMillisecond = model.timeoutMillisecond;
            this.type = model.type;
        } 

        /**
         * <p>The API key of the search engine.</p>
         * 
         * <strong>example:</strong>
         * <p>sk-xxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>Quark-specific: the content mode.</p>
         * 
         * <strong>example:</strong>
         * <p>summary</p>
         */
        public Builder contentMode(String contentMode) {
            this.contentMode = contentMode;
            return this;
        }

        /**
         * <p>The number of results returned per search.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The endpoint of the search engine.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cloud-iqs.aliyuncs.com">https://cloud-iqs.aliyuncs.com</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>Quark-specific: the industry filter.</p>
         * 
         * <strong>example:</strong>
         * <p>互联网</p>
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * <p>The search engine-specific parameters in key-value pair format.</p>
         */
        public Builder optionArgs(java.util.Map<String, String> optionArgs) {
            this.optionArgs = optionArgs;
            return this;
        }

        /**
         * <p>The offset of search results.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * <p>Quark-specific: the time range filter.</p>
         * 
         * <strong>example:</strong>
         * <p>7d</p>
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        /**
         * <p>The API call timeout period, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder timeoutMillisecond(Integer timeoutMillisecond) {
            this.timeoutMillisecond = timeoutMillisecond;
            return this;
        }

        /**
         * <p>The search engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunQuark</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AiNetworkConfigSearchEngine build() {
            return new AiNetworkConfigSearchEngine(this);
        } 

    } 

}
