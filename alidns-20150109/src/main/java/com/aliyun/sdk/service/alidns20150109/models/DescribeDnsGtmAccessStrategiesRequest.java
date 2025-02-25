// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDnsGtmAccessStrategiesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAccessStrategiesRequest</p>
 */
public class DescribeDnsGtmAccessStrategiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrategyMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String strategyMode;

    private DescribeDnsGtmAccessStrategiesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.strategyMode = builder.strategyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAccessStrategiesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return strategyMode
     */
    public String getStrategyMode() {
        return this.strategyMode;
    }

    public static final class Builder extends Request.Builder<DescribeDnsGtmAccessStrategiesRequest, Builder> {
        private String instanceId; 
        private String lang; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String strategyMode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAccessStrategiesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.strategyMode = request.strategyMode;
        } 

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance1</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The type of the access policy. Valid values:</p>
         * <ul>
         * <li>GEO: geographical location-based</li>
         * <li>LATENCY: latency-based</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>geo</p>
         */
        public Builder strategyMode(String strategyMode) {
            this.putQueryParameter("StrategyMode", strategyMode);
            this.strategyMode = strategyMode;
            return this;
        }

        @Override
        public DescribeDnsGtmAccessStrategiesRequest build() {
            return new DescribeDnsGtmAccessStrategiesRequest(this);
        } 

    } 

}
