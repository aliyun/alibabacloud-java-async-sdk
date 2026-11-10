// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeAICallDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAICallDetailsRequest</p>
 */
public class DescribeAICallDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayRegion")
    private String gatewayRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String modelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchRequestId")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String searchRequestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WyIds")
    private java.util.List<String> wyIds;

    private DescribeAICallDetailsRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.endTime = builder.endTime;
        this.gatewayRegion = builder.gatewayRegion;
        this.modelId = builder.modelId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.searchRequestId = builder.searchRequestId;
        this.startTime = builder.startTime;
        this.wyIds = builder.wyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAICallDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return gatewayRegion
     */
    public String getGatewayRegion() {
        return this.gatewayRegion;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
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
     * @return searchRequestId
     */
    public String getSearchRequestId() {
        return this.searchRequestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return wyIds
     */
    public java.util.List<String> getWyIds() {
        return this.wyIds;
    }

    public static final class Builder extends Request.Builder<DescribeAICallDetailsRequest, Builder> {
        private String bizType; 
        private String endTime; 
        private String gatewayRegion; 
        private String modelId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String searchRequestId; 
        private String startTime; 
        private java.util.List<String> wyIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAICallDetailsRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.endTime = request.endTime;
            this.gatewayRegion = request.gatewayRegion;
            this.modelId = request.modelId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.searchRequestId = request.searchRequestId;
            this.startTime = request.startTime;
            this.wyIds = request.wyIds;
        } 

        /**
         * <p>业务版本，沿用售卖 BizType：ENTERPRISE 或 1 为企业版；BUSINESS 或 20 为商业版。未传默认企业版。</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>带时区的 ISO 8601 结束时间，整秒精度，默认当前时间；应大于开始时间且不晚于当前时间，区间左闭右开。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-06T00:00:00+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>网关日志地域：cn-shanghai（国内）、cn-hongkong（香港）、ap-southeast-1（新加坡）、us-east-1（美国）；兼容 cn-hangzhou，仅查询路由等同 cn-shanghai；杭州预发实际数据地域为 cn-hangzhou。不传时使用当前站点默认地域；预发只查询预发日志，国内映射杭州预发，美国预发未配置时返回 ServiceUnavailable。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder gatewayRegion(String gatewayRegion) {
            this.putQueryParameter("GatewayRegion", gatewayRegion);
            this.gatewayRegion = gatewayRegion;
            return this;
        }

        /**
         * <p>可选请求模型 ID；不传或空白时不筛选，非空时精确匹配 custom_log.requestedModel 或 ai_log.request_model 任一字段，与 SearchRequestId、WyIds 等条件取交集。不按 ai_log.model 筛选，不支持模糊匹配。</p>
         * 
         * <strong>example:</strong>
         * <p>example-model</p>
         */
        public Builder modelId(String modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>页码，从 1 开始；分页偏移超过查询上限时返回 InvalidParameter。</p>
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
         * <p>每页返回数量，最大 50。</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>可选请求 ID；不传或空白时不筛选，非空时精确匹配 SLS request_id，与 ModelId、WyIds 等条件取交集。不得包含控制字符或管道符。</p>
         * 
         * <strong>example:</strong>
         * <p>model-call-example-001</p>
         */
        public Builder searchRequestId(String searchRequestId) {
            this.putQueryParameter("SearchRequestId", searchRequestId);
            this.searchRequestId = searchRequestId;
            return this;
        }

        /**
         * <p>带时区的 ISO 8601 开始时间，整秒精度，默认 UTC+8 今日零点；不得早于当前时间按 UTC+8 回退 3 个自然月，区间不超过 30 天。</p>
         * 
         * <strong>example:</strong>
         * <p>2026-11-05T00:00:00+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>可选用户 ID 列表，最多 50 项；不传或空数组时不筛选。非空时精确匹配 custom_log.wyId，列表内取 OR，与租户、BizType、SearchRequestId 和 ModelId 条件取 AND。每项去除首尾空白后为 1 至 128 个字符，不允许控制字符或管道符。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;wy-example-001&quot;]</p>
         */
        public Builder wyIds(java.util.List<String> wyIds) {
            this.putQueryParameter("WyIds", wyIds);
            this.wyIds = wyIds;
            return this;
        }

        @Override
        public DescribeAICallDetailsRequest build() {
            return new DescribeAICallDetailsRequest(this);
        } 

    } 

}
