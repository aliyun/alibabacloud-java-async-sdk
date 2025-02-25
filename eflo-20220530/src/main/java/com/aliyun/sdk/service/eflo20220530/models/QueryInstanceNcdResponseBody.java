// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link QueryInstanceNcdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryInstanceNcdResponseBody</p>
 */
public class QueryInstanceNcdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryInstanceNcdResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceNcdResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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

    public static final class Builder {
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>You don&quot;t have the permission of this operation, action=eflo:QueryInstanceNcd, arn=acs:eflo:cn-shenzhen:1263399219805497:networkinterface/*, resourceGroup=null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>BDBCC783-84CA-5733-8EEA-645C88B9009C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryInstanceNcdResponseBody build() {
            return new QueryInstanceNcdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryInstanceNcdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryInstanceNcdResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId1")
        private String instanceId1;

        @com.aliyun.core.annotation.NameInMap("InstanceId2")
        private String instanceId2;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ncd")
        private Integer ncd;

        private Content(Builder builder) {
            this.instanceId1 = builder.instanceId1;
            this.instanceId2 = builder.instanceId2;
            this.instanceType = builder.instanceType;
            this.ncd = builder.ncd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return instanceId1
         */
        public String getInstanceId1() {
            return this.instanceId1;
        }

        /**
         * @return instanceId2
         */
        public String getInstanceId2() {
            return this.instanceId2;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ncd
         */
        public Integer getNcd() {
            return this.ncd;
        }

        public static final class Builder {
            private String instanceId1; 
            private String instanceId2; 
            private String instanceType; 
            private Integer ncd; 

            /**
             * <p>Instance 1ID</p>
             * 
             * <strong>example:</strong>
             * <p>lni-1235****</p>
             */
            public Builder instanceId1(String instanceId1) {
                this.instanceId1 = instanceId1;
                return this;
            }

            /**
             * <p>Instance 2ID</p>
             * 
             * <strong>example:</strong>
             * <p>lni-1234****</p>
             */
            public Builder instanceId2(String instanceId2) {
                this.instanceId2 = instanceId2;
                return this;
            }

            /**
             * <p>Instance Type</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>node: Lingjun node.</li>
             * <li>lni: lingjun network interface controller.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lni</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>network communication distance between instances</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ncd(Integer ncd) {
                this.ncd = ncd;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
