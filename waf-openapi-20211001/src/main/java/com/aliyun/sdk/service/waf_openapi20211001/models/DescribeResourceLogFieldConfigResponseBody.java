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
 * {@link DescribeResourceLogFieldConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceLogFieldConfigResponseBody</p>
 */
public class DescribeResourceLogFieldConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddList")
    private String addList;

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

    private DescribeResourceLogFieldConfigResponseBody(Builder builder) {
        this.addList = builder.addList;
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

    public static DescribeResourceLogFieldConfigResponseBody create() {
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
        private String delList; 
        private String deliveryType; 
        private String extendConfig; 
        private String fieldList; 
        private String logDeliveryStrategy; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeResourceLogFieldConfigResponseBody model) {
            this.addList = model.addList;
            this.delList = model.delList;
            this.deliveryType = model.deliveryType;
            this.extendConfig = model.extendConfig;
            this.fieldList = model.fieldList;
            this.logDeliveryStrategy = model.logDeliveryStrategy;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The extra log fields that are configured in addition to the default log fields. The fields are specified as a string of comma-separated values.</p>
         * 
         * <strong>example:</strong>
         * <p>acl_test,acl_action,acl_rule_id,waf_test,acl_rule_type</p>
         */
        public Builder addList(String addList) {
            this.addList = addList;
            return this;
        }

        /**
         * <p>The log fields that are removed from the default log fields. The fields are specified as a string of comma-separated values.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_rule_id,waf_rule_type</p>
         */
        public Builder delList(String delList) {
            this.delList = delList;
            return this;
        }

        /**
         * <p>The log delivery type. Valid values:</p>
         * <ul>
         * <li><p><strong>sls</strong>: Simple Log Service.</p>
         * </li>
         * <li><p><strong>kafka</strong>: Kafka.</p>
         * </li>
         * <li><p><strong>syslog</strong>: Syslog.</p>
         * </li>
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
         * <p>The extended configuration for log delivery. The value is a string that is converted from a JSON object of parameters.</p>
         * <blockquote>
         * <p>For more information about the parameters, see the description of the <strong>ExtendConfig</strong> parameter in <a href="~~ModifyResourceLogFieldConfig~~">ModifyResourceLogFieldConfig</a>.</p>
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
         * <p>The list of delivered log fields. The fields are specified as a string of comma-separated values.</p>
         * 
         * <strong>example:</strong>
         * <p>account,acl_action,acl_rule_id,acl_rule_type,acl_test,antiscan_action,antiscan_rule_id,antiscan_rule_type,antiscan_test,body_bytes_sent,bypass_matched_ids</p>
         */
        public Builder fieldList(String fieldList) {
            this.fieldList = fieldList;
            return this;
        }

        /**
         * <p>The log delivery policies. Multiple policies are supported. The value is a string that is converted from a JSON array of parameters.</p>
         * <blockquote>
         * <p>For more information about the parameters, see the description of the <strong>LogDeliveryStrategy</strong> parameter in <a href="~~ModifyResourceLogFieldConfig~~">ModifyResourceLogFieldConfig</a>.</p>
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
         * <p>7B53B47C-D368-5344-BB5E-79******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceLogFieldConfigResponseBody build() {
            return new DescribeResourceLogFieldConfigResponseBody(this);
        } 

    } 

}
