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
 * {@link DescribeSceneDefenseObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneDefenseObjectsResponseBody</p>
 */
public class DescribeSceneDefenseObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Objects")
    private java.util.List<Objects> objects;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeSceneDefenseObjectsResponseBody(Builder builder) {
        this.objects = builder.objects;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSceneDefenseObjectsResponseBody create() {
        return builder().build();
    }

    /**
     * @return objects
     */
    public java.util.List<Objects> getObjects() {
        return this.objects;
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
        private java.util.List<Objects> objects; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The information about the protected assets.</p>
         */
        public Builder objects(java.util.List<Objects> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE07E73F-F19E-4A51-B62F-AC59E3B962D8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSceneDefenseObjectsResponseBody build() {
            return new DescribeSceneDefenseObjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSceneDefenseObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSceneDefenseObjectsResponseBody</p>
     */
    public static class Objects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private String policyId;

        @com.aliyun.core.annotation.NameInMap("Vip")
        private String vip;

        private Objects(Builder builder) {
            this.domain = builder.domain;
            this.policyId = builder.policyId;
            this.vip = builder.vip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Objects create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        /**
         * @return vip
         */
        public String getVip() {
            return this.vip;
        }

        public static final class Builder {
            private String domain; 
            private String policyId; 
            private String vip; 

            /**
             * <p>The domain name that is protected by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>47e07ebd-0ba5-4afc-957b-59d15b90****</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * <p>The IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance that is protected by the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>203.XX.XX.119</p>
             */
            public Builder vip(String vip) {
                this.vip = vip;
                return this;
            }

            public Objects build() {
                return new Objects(this);
            } 

        } 

    }
}
