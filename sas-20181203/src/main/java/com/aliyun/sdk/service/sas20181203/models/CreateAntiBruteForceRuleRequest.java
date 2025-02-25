// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateAntiBruteForceRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateAntiBruteForceRuleRequest</p>
 */
public class CreateAntiBruteForceRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultRule")
    private Boolean defaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FailCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer failCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForbiddenTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer forbiddenTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Span")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer span;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> uuidList;

    private CreateAntiBruteForceRuleRequest(Builder builder) {
        super(builder);
        this.defaultRule = builder.defaultRule;
        this.failCount = builder.failCount;
        this.forbiddenTime = builder.forbiddenTime;
        this.name = builder.name;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
        this.span = builder.span;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAntiBruteForceRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultRule
     */
    public Boolean getDefaultRule() {
        return this.defaultRule;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return forbiddenTime
     */
    public Integer getForbiddenTime() {
        return this.forbiddenTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return span
     */
    public Integer getSpan() {
        return this.span;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<CreateAntiBruteForceRuleRequest, Builder> {
        private Boolean defaultRule; 
        private Integer failCount; 
        private Integer forbiddenTime; 
        private String name; 
        private Long resourceOwnerId; 
        private String sourceIp; 
        private Integer span; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(CreateAntiBruteForceRuleRequest request) {
            super(request);
            this.defaultRule = request.defaultRule;
            this.failCount = request.failCount;
            this.forbiddenTime = request.forbiddenTime;
            this.name = request.name;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
            this.span = request.span;
            this.uuidList = request.uuidList;
        } 

        /**
         * <p>Specifies whether to set the defense rule as the default rule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> If no defense rule is created for a server, the default rule is applied to the server.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder defaultRule(Boolean defaultRule) {
            this.putQueryParameter("DefaultRule", defaultRule);
            this.defaultRule = defaultRule;
            return this;
        }

        /**
         * <p>The maximum number of failed logon attempts from an account. Valid values: 2, 3, 4, 5, 10, 50, 80, and 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder failCount(Integer failCount) {
            this.putQueryParameter("FailCount", failCount);
            this.failCount = failCount;
            return this;
        }

        /**
         * <p>The period of time during which logons from an account are not allowed. Unit: minutes. Valid values:</p>
         * <ul>
         * <li><strong>5</strong>: 5 minutes</li>
         * <li><strong>15</strong>: 15 minutes</li>
         * <li><strong>30</strong>: 30 minutes</li>
         * <li><strong>60</strong>: 1 hour</li>
         * <li><strong>120</strong>: 2 hours</li>
         * <li><strong>360</strong>: 6 hours</li>
         * <li><strong>720</strong>: 12 hours</li>
         * <li><strong>1440</strong>: 24 hours</li>
         * <li><strong>10080</strong>: 7 days</li>
         * <li><strong>52560000</strong>: permanent</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder forbiddenTime(Integer forbiddenTime) {
            this.putQueryParameter("ForbiddenTime", forbiddenTime);
            this.forbiddenTime = forbiddenTime;
            return this;
        }

        /**
         * <p>The name of the defense rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestAntiBruteForceRule</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The maximum period of time during which failed logon attempts from an account can occur. Unit: minutes. Valid values:</p>
         * <ul>
         * <li><strong>1</strong></li>
         * <li><strong>2</strong></li>
         * <li><strong>5</strong></li>
         * <li><strong>10</strong></li>
         * <li><strong>15</strong></li>
         * </ul>
         * <blockquote>
         * <p> To configure a defense rule, you must specify the Span, FailCount, and ForbiddenTime parameters. If the number of failed logon attempts from an account within the minutes specified by Span exceeds the value specified by FailCount, the account cannot be used for logons within the minutes specified by ForbiddenTime.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder span(Integer span) {
            this.putQueryParameter("Span", span);
            this.span = span;
            return this;
        }

        /**
         * <p>The UUIDs of the servers to which you want to apply the defense rule.</p>
         * <p>This parameter is required.</p>
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public CreateAntiBruteForceRuleRequest build() {
            return new CreateAntiBruteForceRuleRequest(this);
        } 

    } 

}
