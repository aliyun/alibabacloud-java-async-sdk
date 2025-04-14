// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeWebInstanceRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebInstanceRelationsResponseBody</p>
 */
public class DescribeWebInstanceRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WebInstanceRelations")
    private java.util.List<WebInstanceRelations> webInstanceRelations;

    private DescribeWebInstanceRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webInstanceRelations = builder.webInstanceRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebInstanceRelationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webInstanceRelations
     */
    public java.util.List<WebInstanceRelations> getWebInstanceRelations() {
        return this.webInstanceRelations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<WebInstanceRelations> webInstanceRelations; 

        private Builder() {
        } 

        private Builder(DescribeWebInstanceRelationsResponseBody model) {
            this.requestId = model.requestId;
            this.webInstanceRelations = model.webInstanceRelations;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0222382B-5FE5-4FF7-BC9B-97EE31D58818</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the instances to which a website service is added.</p>
         */
        public Builder webInstanceRelations(java.util.List<WebInstanceRelations> webInstanceRelations) {
            this.webInstanceRelations = webInstanceRelations;
            return this;
        }

        public DescribeWebInstanceRelationsResponseBody build() {
            return new DescribeWebInstanceRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebInstanceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebInstanceRelationsResponseBody</p>
     */
    public static class InstanceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipList")
        private java.util.List<String> eipList;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private InstanceDetails(Builder builder) {
            this.eipList = builder.eipList;
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetails create() {
            return builder().build();
        }

        /**
         * @return eipList
         */
        public java.util.List<String> getEipList() {
            return this.eipList;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List<String> eipList; 
            private String functionVersion; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(InstanceDetails model) {
                this.eipList = model.eipList;
                this.functionVersion = model.functionVersion;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The IP addresses of the instance.</p>
             */
            public Builder eipList(java.util.List<String> eipList) {
                this.eipList = eipList;
                return this;
            }

            /**
             * <p>The function plan of the instance. Valid values:</p>
             * <ul>
             * <li><strong>default</strong>: Standard function plan</li>
             * <li><strong>enhance</strong>: Enhanced function plan</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enhance</p>
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-0pp163pd****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebInstanceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebInstanceRelationsResponseBody</p>
     */
    public static class WebInstanceRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("InstanceDetails")
        private java.util.List<InstanceDetails> instanceDetails;

        private WebInstanceRelations(Builder builder) {
            this.domain = builder.domain;
            this.instanceDetails = builder.instanceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebInstanceRelations create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return instanceDetails
         */
        public java.util.List<InstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<InstanceDetails> instanceDetails; 

            private Builder() {
            } 

            private Builder(WebInstanceRelations model) {
                this.domain = model.domain;
                this.instanceDetails = model.instanceDetails;
            } 

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The information about the instance to which a website service is added.</p>
             */
            public Builder instanceDetails(java.util.List<InstanceDetails> instanceDetails) {
                this.instanceDetails = instanceDetails;
                return this;
            }

            public WebInstanceRelations build() {
                return new WebInstanceRelations(this);
            } 

        } 

    }
}
