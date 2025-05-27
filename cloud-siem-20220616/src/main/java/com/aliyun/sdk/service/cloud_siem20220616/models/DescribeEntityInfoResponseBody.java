// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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
 * {@link DescribeEntityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEntityInfoResponseBody</p>
 */
public class DescribeEntityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeEntityInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEntityInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeEntityInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeEntityInfoResponseBody build() {
            return new DescribeEntityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEntityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEntityInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("EntityInfo")
        private java.util.Map<String, ?> entityInfo;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("TipInfo")
        private java.util.Map<String, ?> tipInfo;

        private Data(Builder builder) {
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.entityType = builder.entityType;
            this.tipInfo = builder.tipInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityInfo
         */
        public java.util.Map<String, ?> getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return tipInfo
         */
        public java.util.Map<String, ?> getTipInfo() {
            return this.tipInfo;
        }

        public static final class Builder {
            private Long entityId; 
            private java.util.Map<String, ?> entityInfo; 
            private String entityType; 
            private java.util.Map<String, ?> tipInfo; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.entityId = model.entityId;
                this.entityInfo = model.entityInfo;
                this.entityType = model.entityType;
                this.tipInfo = model.tipInfo;
            } 

            /**
             * <p>The logical ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The information about the entry.</p>
             * 
             * <strong>example:</strong>
             * <p>{ location: &quot;xian&quot;, net_connect_dir: &quot;in&quot;, malware_type: &quot;${aliyun.siem.sas.alert_tag.login_unusual_account}&quot; }</p>
             */
            public Builder entityInfo(java.util.Map<String, ?> entityInfo) {
                this.entityInfo = entityInfo;
                return this;
            }

            /**
             * <p>The type of the entity. Valid values:</p>
             * <ul>
             * <li>ip</li>
             * <li>domain</li>
             * <li>url</li>
             * <li>process</li>
             * <li>file</li>
             * <li>host</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The information about the risk Intelligence.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;Ip&quot;: {
             *             &quot;queryHot&quot;: &quot;0&quot;,
             *             &quot;country&quot;: &quot;China&quot;,
             *             &quot;province&quot;: &quot;shanxi&quot;,
             *             &quot;ip&quot;: &quot;221.11.XX.XXX&quot;,
             *             &quot;asn&quot;: &quot;4837&quot;,
             *             &quot;asn_label&quot;: &quot;CHINAXXX-Backbone - CHINA UNICOM ChinaXXX Backbone, CN&quot;
             *       }
             * }</p>
             */
            public Builder tipInfo(java.util.Map<String, ?> tipInfo) {
                this.tipInfo = tipInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
