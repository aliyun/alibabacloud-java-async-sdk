// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RunLibraryChatGenerationResponseBody} extends {@link TeaModel}
 *
 * <p>RunLibraryChatGenerationResponseBody</p>
 */
public class RunLibraryChatGenerationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Object data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private RunLibraryChatGenerationResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunLibraryChatGenerationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Object data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(RunLibraryChatGenerationResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * <p>The time consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>The response data (non-streaming).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;finish&quot;:true,
         *     &quot;text&quot;:&quot;是的，记名预付卡的有效期不得低于3年。&quot;,
         *     &quot;message&quot;: &quot;是的，记名预付卡的有效期不得低于3年。&quot;,
         *     &quot;queryResult&quot;:{
         *       &quot;errCode&quot;: &quot;0&quot;,	//接口协议层面的错误码，正常为0，未授权，参数错误，服务器异常时会发生变化，可以忽略不处理
         *       &quot;message&quot;: &quot;ok&quot;,	//接口协议层面的消息
         *       &quot;data&quot;:{
         *         &quot;success&quot;: true,	//有回答true 无回答false
         *         &quot;answer&quot;: null,	//大模型生成的回答结果
         *         &quot;embeddingElapsedMs&quot;: 127,
         *         &quot;vectorSearchElapsedMs&quot;: 2745,
         *         &quot;llmElapsedMs&quot;: 7911,
         *         &quot;totalElapsedMs&quot;: 10820,
         *         &quot;chunks&quot;: [	//召回的分块信息，一般为top5或top10，可联系我们调整效果
         *           {
         *             &quot;chunkId&quot;: &quot;470182177892469799&quot;,	//分块信息的编号
         *             &quot;docId&quot;: &quot;22666332&quot;,	//分块关联的文档编号
         *             &quot;chunkText&quot;: &quot;Profits plummeted in the first quarter, can\&quot;t you bear it? In fact, previous rounds of price cuts have indeed had a certain impact on Tesla\&quot;s financial data. Tesla has just released its financial report for the first quarter of this year. The data shows that in Q1 2023, Tesla achieved revenue of 23.33 billion US dollars, an increase of 24% over the previous year; Tesla delivered more than 422,000 electric vehicles worldwide in the first quarter, an increase of 36% over the previous year&quot;,	//新闻原始内容
         *             &quot;chunkMeta&quot;: {	// demo数据中的其他metadata
         *               &quot;language&quot;: &quot;en&quot;,
         *               &quot;unique_id&quot;: &quot;news_22666332_13&quot;,
         *               &quot;content_type&quot;: &quot;news&quot;,
         *               &quot;stock_id_list&quot;: []
         *             }
         *           }],
         *         &quot;documents&quot;: [{
         *           &quot;docId&quot;: &quot;1686637056086872065&quot;,	//文档编号
         *           &quot;gmtCreate&quot;: &quot;2023-08-02 15:16:25&quot;,	//文档的创建时间
         *           &quot;libraryId&quot;: &quot;a1b2c3&quot;,	//文档关联的知识库编号
         *           &quot;title&quot;: &quot;2023年工银信用卡微信、京东绑卡消费累计积分活动&quot;,	//文档标题
         *           &quot;url&quot;: null	//文档连接，如有
         *         }]	//块文本关联的文档
         *       },
         *       &quot;success&quot;: true	//接口协议层面的成功/失败状态 true就是errCode为0
         *     }
         *   }</p>
         */
        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5E3FBAF1-17AF-53B7-AF0A-CDCEEB6DE658</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public RunLibraryChatGenerationResponseBody build() {
            return new RunLibraryChatGenerationResponseBody(this);
        } 

    } 

}
