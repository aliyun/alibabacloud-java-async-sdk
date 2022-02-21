// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSceneDefenseObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSceneDefenseObjectsResponseBody</p>
 */
public class DescribeSceneDefenseObjectsResponseBody extends TeaModel {
    @NameInMap("Objects")
    private java.util.List < Objects> objects;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
    public java.util.List < Objects> getObjects() {
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
        private java.util.List < Objects> objects; 
        private String requestId; 
        private Boolean success; 

        /**
         * Objects.
         */
        public Builder objects(java.util.List < Objects> objects) {
            this.objects = objects;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSceneDefenseObjectsResponseBody build() {
            return new DescribeSceneDefenseObjectsResponseBody(this);
        } 

    } 

    public static class Objects extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("PolicyId")
        private String policyId;

        @NameInMap("Vip")
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * Vip.
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
