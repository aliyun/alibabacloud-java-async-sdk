// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRiskLevelsRequest</p>
 */
public class DescribeInstanceRiskLevelsRequest extends Request {
    @Query
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @Query
    @NameInMap("Lang")
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
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRiskLevelsRequest, Builder> {
        private java.util.List < Instances> instances; 
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
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * Lang.
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

    public static class Instances extends TeaModel {
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InternetIp")
        private java.util.List < String > internetIp;

        @NameInMap("IntranetIp")
        private String intranetIp;

        @NameInMap("Uuid")
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
        public java.util.List < String > getInternetIp() {
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
            private java.util.List < String > internetIp; 
            private String intranetIp; 
            private String uuid; 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InternetIp.
             */
            public Builder internetIp(java.util.List < String > internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * IntranetIp.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * Uuid.
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
