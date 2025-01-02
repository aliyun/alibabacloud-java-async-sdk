// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInstanceRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRiskLevelsRequest</p>
 */
public class DescribeInstanceRiskLevelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeInstanceRiskLevelsRequest(Builder builder) {
        super(builder);
        this.instances = builder.instances;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRiskLevelsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRiskLevelsRequest, Builder> {
        private java.util.List<Instances> instances; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRiskLevelsRequest request) {
            super(request);
            this.instances = request.instances;
            this.lang = request.lang;
        } 

        /**
         * <p>The information about the instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeInstanceRiskLevelsRequest build() {
            return new DescribeInstanceRiskLevelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceRiskLevelsRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceRiskLevelsRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private java.util.List<String> internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Instances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return internetIp
         */
        public java.util.List<String> getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private java.util.List<String> internetIp; 
            private String intranetIp; 
            private String uuid; 

            /**
             * <p>The instance ID of your Cloud Firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>vipcloudfw-cn-7mz2fj8nm0u</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The public IP addresses of instances.</p>
             */
            public Builder internetIp(java.util.List<String> internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.17.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The UUID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>181ad081-e4f2-4e3e-b925-03b67f648397</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
