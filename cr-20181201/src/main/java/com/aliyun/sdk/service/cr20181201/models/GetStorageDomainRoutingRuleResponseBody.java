// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetStorageDomainRoutingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageDomainRoutingRuleResponseBody</p>
 */
public class GetStorageDomainRoutingRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private Long modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Routes")
    private java.util.List<RouteItem> routes;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetStorageDomainRoutingRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.createTime = builder.createTime;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.routes = builder.routes;
        this.ruleId = builder.ruleId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageDomainRoutingRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return modifyTime
     */
    public Long getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routes
     */
    public java.util.List<RouteItem> getRoutes() {
        return this.routes;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Long createTime; 
        private Long modifyTime; 
        private String requestId; 
        private java.util.List<RouteItem> routes; 
        private String ruleId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetStorageDomainRoutingRuleResponseBody model) {
            this.code = model.code;
            this.createTime = model.createTime;
            this.modifyTime = model.modifyTime;
            this.requestId = model.requestId;
            this.routes = model.routes;
            this.ruleId = model.ruleId;
            this.success = model.success;
        } 

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926439000</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>1571926439000</p>
         */
        public Builder modifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D4978DCC-ECBD-40B0-A714-EE695******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The routing list.</p>
         */
        public Builder routes(java.util.List<RouteItem> routes) {
            this.routes = routes;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crsdr-luq6qiegzvx****</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetStorageDomainRoutingRuleResponseBody build() {
            return new GetStorageDomainRoutingRuleResponseBody(this);
        } 

    } 

}
