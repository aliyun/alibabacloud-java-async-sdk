// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetWafRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetWafRuleResponseBody</p>
 */
public class GetWafRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private WafRuleConfig config;

    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Phase")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phase;

    @com.aliyun.core.annotation.NameInMap("Position")
    private Long position;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetWafRuleResponseBody(Builder builder) {
        this.config = builder.config;
        this.id = builder.id;
        this.name = builder.name;
        this.phase = builder.phase;
        this.position = builder.position;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public WafRuleConfig getConfig() {
        return this.config;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return position
     */
    public Long getPosition() {
        return this.position;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private WafRuleConfig config; 
        private Long id; 
        private String name; 
        private String phase; 
        private Long position; 
        private String requestId; 
        private String status; 
        private String updateTime; 

        /**
         * Config.
         */
        public Builder config(WafRuleConfig config) {
            this.config = config;
            return this;
        }

        /**
         * <p>自定义响应页面ID</p>
         * 
         * <strong>example:</strong>
         * <p>2000001</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * <p>自定义响应页面名称</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>自定义响应页面内容类型</p>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * Position.
         */
        public Builder position(Long position) {
            this.position = position;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetWafRuleResponseBody build() {
            return new GetWafRuleResponseBody(this);
        } 

    } 

}
