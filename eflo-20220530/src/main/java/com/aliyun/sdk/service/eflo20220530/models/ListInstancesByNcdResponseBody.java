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
 * {@link ListInstancesByNcdResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesByNcdResponseBody</p>
 */
public class ListInstancesByNcdResponseBody extends TeaModel {
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

    private ListInstancesByNcdResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesByNcdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListInstancesByNcdResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
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
         * <p>You don&quot;t have the permission of this operation, action=eflo:ListInstancesByNcd, arn=acs:eflo:cn-heyuan:1263399219805497:networkinterface/*, resourceGroup=null</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID of the current request</p>
         * 
         * <strong>example:</strong>
         * <p>AC8C713A-A9F4-5984-A5E1-76496DF35153</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancesByNcdResponseBody build() {
            return new ListInstancesByNcdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesByNcdResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesByNcdResponseBody</p>
     */
    public static class InstanceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ncd")
        private Integer ncd;

        private InstanceInfos(Builder builder) {
            this.instanceId = builder.instanceId;
            this.ncd = builder.ncd;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceInfos create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ncd
         */
        public Integer getNcd() {
            return this.ncd;
        }

        public static final class Builder {
            private String instanceId; 
            private Integer ncd; 

            private Builder() {
            } 

            private Builder(InstanceInfos model) {
                this.instanceId = model.instanceId;
                this.ncd = model.ncd;
            } 

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lni-1235****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>network communication distance</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder ncd(Integer ncd) {
                this.ncd = ncd;
                return this;
            }

            public InstanceInfos build() {
                return new InstanceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInstancesByNcdResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesByNcdResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceInfos")
        private java.util.List<InstanceInfos> instanceInfos;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxNcd")
        private Integer maxNcd;

        @com.aliyun.core.annotation.NameInMap("SourceInstanceId")
        private String sourceInstanceId;

        private Content(Builder builder) {
            this.instanceInfos = builder.instanceInfos;
            this.instanceType = builder.instanceType;
            this.maxNcd = builder.maxNcd;
            this.sourceInstanceId = builder.sourceInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return instanceInfos
         */
        public java.util.List<InstanceInfos> getInstanceInfos() {
            return this.instanceInfos;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxNcd
         */
        public Integer getMaxNcd() {
            return this.maxNcd;
        }

        /**
         * @return sourceInstanceId
         */
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public static final class Builder {
            private java.util.List<InstanceInfos> instanceInfos; 
            private String instanceType; 
            private Integer maxNcd; 
            private String sourceInstanceId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.instanceInfos = model.instanceInfos;
                this.instanceType = model.instanceType;
                this.maxNcd = model.maxNcd;
                this.sourceInstanceId = model.sourceInstanceId;
            } 

            /**
             * <p>A collection of instances whose network communication distance from the source instance ID does not exceed maxNcd</p>
             */
            public Builder instanceInfos(java.util.List<InstanceInfos> instanceInfos) {
                this.instanceInfos = instanceInfos;
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
             * <p>Maximum communication distance between nodes</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxNcd(Integer maxNcd) {
                this.maxNcd = maxNcd;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lni-1234****</p>
             */
            public Builder sourceInstanceId(String sourceInstanceId) {
                this.sourceInstanceId = sourceInstanceId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
