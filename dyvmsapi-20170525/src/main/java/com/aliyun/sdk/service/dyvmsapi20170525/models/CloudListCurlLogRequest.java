// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudListCurlLogRequest} extends {@link RequestModel}
 *
 * <p>CloudListCurlLogRequest</p>
 */
public class CloudListCurlLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private String limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private Long result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Retry")
    private Long retry;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Start")
    private String start;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private Long type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    private CloudListCurlLogRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.limit = builder.limit;
        this.result = builder.result;
        this.retry = builder.retry;
        this.start = builder.start;
        this.startTime = builder.startTime;
        this.type = builder.type;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudListCurlLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return limit
     */
    public String getLimit() {
        return this.limit;
    }

    /**
     * @return result
     */
    public Long getResult() {
        return this.result;
    }

    /**
     * @return retry
     */
    public Long getRetry() {
        return this.retry;
    }

    /**
     * @return start
     */
    public String getStart() {
        return this.start;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<CloudListCurlLogRequest, Builder> {
        private String endTime; 
        private Long enterpriseId; 
        private String limit; 
        private Long result; 
        private Long retry; 
        private String start; 
        private String startTime; 
        private Long type; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(CloudListCurlLogRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.limit = request.limit;
            this.result = request.result;
            this.retry = request.retry;
            this.start = request.start;
            this.startTime = request.startTime;
            this.type = request.type;
            this.url = request.url;
        } 

        /**
         * <p>查询结束时间；格式:&quot;yyyy-MM-dd HH:mm:ss&quot;,精确到s。startTime与endTime不允许跨月，默认值取当前月份最后一天</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-23 10:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>需要取出的数据条数；大于0，最大不能超过500，默认10</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(String limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>推送结果；取值：1、成功，0、失败</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder result(Long result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        /**
         * <p>重试次数；默认-2</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder retry(Long retry) {
            this.putQueryParameter("Retry", retry);
            this.retry = retry;
            return this;
        }

        /**
         * <p>从第几条开始取；大于等于0，默认0</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder start(String start) {
            this.putQueryParameter("Start", start);
            this.start = start;
            return this;
        }

        /**
         * <p>查询开始时间；格式:&quot;yyyy-MM-dd HH:mm:ss&quot;,精确到s。startTime与endTime不允许跨月，默认值取当前月份第一天</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>推送类型；1:来电推送、2:来电响铃推送、3:外呼响铃推送、4:webcall转座席响铃推送、5:来电接通推送、6:外呼接通推送、7:来电挂机推送、8:外呼挂机推送、9:座席状态推送、10:按键推送、11:号码状态识别推送、12:录音状态推送、13:HTTP交互推送、15:ASR语音转换结果推送、14:预测式外呼任务推送、16:webcall客户侧响铃推送、17:满意度调查推送、18:预测外呼客户接听状态推送、19:NLU推送、20:预测外呼双方接听推送、21:IVR交互结束推送、22:外呼客户响铃推送、23:webcall客户接听推送、24:webcall转接响铃推送、25:webcall转接接通推送、26:主叫外呼分机响铃推送、27:主叫外呼分机接听推送、28:主叫外呼客户响铃推送、29:主叫外呼双方接通推送</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>推送的url；说明：目的URL</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public CloudListCurlLogRequest build() {
            return new CloudListCurlLogRequest(this);
        } 

    } 

}
