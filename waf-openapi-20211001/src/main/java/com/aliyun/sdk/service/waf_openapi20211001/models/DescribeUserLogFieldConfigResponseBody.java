// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeUserLogFieldConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserLogFieldConfigResponseBody</p>
 */
public class DescribeUserLogFieldConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddList")
    private String addList;

    @com.aliyun.core.annotation.NameInMap("ConfigStatus")
    private String configStatus;

    @com.aliyun.core.annotation.NameInMap("DelList")
    private String delList;

    @com.aliyun.core.annotation.NameInMap("DeliveryType")
    private String deliveryType;

    @com.aliyun.core.annotation.NameInMap("ExtendConfig")
    private String extendConfig;

    @com.aliyun.core.annotation.NameInMap("FieldList")
    private String fieldList;

    @com.aliyun.core.annotation.NameInMap("LogDeliveryStrategy")
    private String logDeliveryStrategy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUserLogFieldConfigResponseBody(Builder builder) {
        this.addList = builder.addList;
        this.configStatus = builder.configStatus;
        this.delList = builder.delList;
        this.deliveryType = builder.deliveryType;
        this.extendConfig = builder.extendConfig;
        this.fieldList = builder.fieldList;
        this.logDeliveryStrategy = builder.logDeliveryStrategy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserLogFieldConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addList
     */
    public String getAddList() {
        return this.addList;
    }

    /**
     * @return configStatus
     */
    public String getConfigStatus() {
        return this.configStatus;
    }

    /**
     * @return delList
     */
    public String getDelList() {
        return this.delList;
    }

    /**
     * @return deliveryType
     */
    public String getDeliveryType() {
        return this.deliveryType;
    }

    /**
     * @return extendConfig
     */
    public String getExtendConfig() {
        return this.extendConfig;
    }

    /**
     * @return fieldList
     */
    public String getFieldList() {
        return this.fieldList;
    }

    /**
     * @return logDeliveryStrategy
     */
    public String getLogDeliveryStrategy() {
        return this.logDeliveryStrategy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String addList; 
        private String configStatus; 
        private String delList; 
        private String deliveryType; 
        private String extendConfig; 
        private String fieldList; 
        private String logDeliveryStrategy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeUserLogFieldConfigResponseBody model) {
            this.addList = model.addList;
            this.configStatus = model.configStatus;
            this.delList = model.delList;
            this.deliveryType = model.deliveryType;
            this.extendConfig = model.extendConfig;
            this.fieldList = model.fieldList;
            this.logDeliveryStrategy = model.logDeliveryStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of log fields that are configured in addition to the default log fields, in the format of &quot;a,b,c,...&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>acl_action,acl_rule_id</p>
         */
        public Builder addList(String addList) {
            this.addList = addList;
            return this;
        }

        /**
         * <p>The status of the log field configuration. Valid values:</p>
         * <ul>
         * <li><strong>initial</strong>: The configuration is in the initialization state.</li>
         * <li><strong>updating</strong>: The configuration is being updated.</li>
         * <li><strong>failed_finished</strong>: The configuration failed.</li>
         * <li><strong>success_finished</strong>: The configuration succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success_finished</p>
         */
        public Builder configStatus(String configStatus) {
            this.configStatus = configStatus;
            return this;
        }

        /**
         * <p>The list of log fields that are excluded from the default log fields, in the format of &quot;a,b,c,...&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_rule_id,waf_rule_type</p>
         */
        public Builder delList(String delList) {
            this.delList = delList;
            return this;
        }

        /**
         * <p>The delivery type. Valid values:</p>
         * <ul>
         * <li><strong>sls</strong>: Simple Log Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>sls</p>
         */
        public Builder deliveryType(String deliveryType) {
            this.deliveryType = deliveryType;
            return this;
        }

        /**
         * <p>The extended configuration for log delivery. The value is a string converted from a JSON object constructed with a series of parameters.</p>
         * <blockquote>
         * <p>For more information about the parameters, see the <strong>ExtendConfig</strong> parameter description in the <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;request_header\&quot;:\&quot;Ali-Cdn-Real-Ip\&quot;}</p>
         */
        public Builder extendConfig(String extendConfig) {
            this.extendConfig = extendConfig;
            return this;
        }

        /**
         * <p>The list of log fields to be delivered, in the format of &quot;a,b,c,...&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>account,acl_action,acl_rule_id,acl_rule_type</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The log delivery strategy. Multiple strategies are supported. The value is a string converted from a JSON array constructed with a series of parameters.</p>
         * <blockquote>
         * <p>For more information about the parameters, see the <strong>LogDeliveryStrategy</strong> parameter description in the <a href="~~ModifyUserLogFieldConfig~~">ModifyUserLogFieldConfig</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;logType\&quot;:\&quot;blockLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;normalRequestLog\&quot;,\&quot;rate\&quot;:100},{\&quot;logType\&quot;:\&quot;checkLog\&quot;,\&quot;rate\&quot;:100}]</p>
         */
        public Builder logDeliveryStrategy(String logDeliveryStrategy) {
            this.logDeliveryStrategy = logDeliveryStrategy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>653778B4-4D47-5223-855B-4E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserLogFieldConfigResponseBody build() {
            return new DescribeUserLogFieldConfigResponseBody(this);
        } 

    } 

}
