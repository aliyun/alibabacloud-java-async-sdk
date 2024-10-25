// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHybridMonitorSLSGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateHybridMonitorSLSGroupRequest</p>
 */
public class CreateHybridMonitorSLSGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSGroupConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SLSGroupConfig> SLSGroupConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSGroupDescription")
    private String SLSGroupDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SLSGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SLSGroupName;

    private CreateHybridMonitorSLSGroupRequest(Builder builder) {
        super(builder);
        this.SLSGroupConfig = builder.SLSGroupConfig;
        this.SLSGroupDescription = builder.SLSGroupDescription;
        this.SLSGroupName = builder.SLSGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHybridMonitorSLSGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return SLSGroupConfig
     */
    public java.util.List < SLSGroupConfig> getSLSGroupConfig() {
        return this.SLSGroupConfig;
    }

    /**
     * @return SLSGroupDescription
     */
    public String getSLSGroupDescription() {
        return this.SLSGroupDescription;
    }

    /**
     * @return SLSGroupName
     */
    public String getSLSGroupName() {
        return this.SLSGroupName;
    }

    public static final class Builder extends Request.Builder<CreateHybridMonitorSLSGroupRequest, Builder> {
        private java.util.List < SLSGroupConfig> SLSGroupConfig; 
        private String SLSGroupDescription; 
        private String SLSGroupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateHybridMonitorSLSGroupRequest request) {
            super(request);
            this.SLSGroupConfig = request.SLSGroupConfig;
            this.SLSGroupDescription = request.SLSGroupDescription;
            this.SLSGroupName = request.SLSGroupName;
        } 

        /**
         * <p>The configurations of the Logstore group.</p>
         * <p>Valid values of N: 1 to 25.</p>
         * <p>This parameter is required.</p>
         */
        public Builder SLSGroupConfig(java.util.List < SLSGroupConfig> SLSGroupConfig) {
            this.putQueryParameter("SLSGroupConfig", SLSGroupConfig);
            this.SLSGroupConfig = SLSGroupConfig;
            return this;
        }

        /**
         * <p>The description of the Logstore group.</p>
         */
        public Builder SLSGroupDescription(String SLSGroupDescription) {
            this.putQueryParameter("SLSGroupDescription", SLSGroupDescription);
            this.SLSGroupDescription = SLSGroupDescription;
            return this;
        }

        /**
         * <p>The name of the Logstore group.</p>
         * <p>The name must be 2 to 32 characters in length and can contain uppercase letters, lowercase letters, digits, and underscores (_). The name must start with a letter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Logstore_test</p>
         */
        public Builder SLSGroupName(String SLSGroupName) {
            this.putQueryParameter("SLSGroupName", SLSGroupName);
            this.SLSGroupName = SLSGroupName;
            return this;
        }

        @Override
        public CreateHybridMonitorSLSGroupRequest build() {
            return new CreateHybridMonitorSLSGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateHybridMonitorSLSGroupRequest} extends {@link TeaModel}
     *
     * <p>CreateHybridMonitorSLSGroupRequest</p>
     */
    public static class SLSGroupConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SLSLogstore")
        @com.aliyun.core.annotation.Validation(required = true)
        private String SLSLogstore;

        @com.aliyun.core.annotation.NameInMap("SLSProject")
        @com.aliyun.core.annotation.Validation(required = true)
        private String SLSProject;

        @com.aliyun.core.annotation.NameInMap("SLSRegion")
        @com.aliyun.core.annotation.Validation(required = true)
        private String SLSRegion;

        @com.aliyun.core.annotation.NameInMap("SLSUserId")
        private String SLSUserId;

        private SLSGroupConfig(Builder builder) {
            this.SLSLogstore = builder.SLSLogstore;
            this.SLSProject = builder.SLSProject;
            this.SLSRegion = builder.SLSRegion;
            this.SLSUserId = builder.SLSUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SLSGroupConfig create() {
            return builder().build();
        }

        /**
         * @return SLSLogstore
         */
        public String getSLSLogstore() {
            return this.SLSLogstore;
        }

        /**
         * @return SLSProject
         */
        public String getSLSProject() {
            return this.SLSProject;
        }

        /**
         * @return SLSRegion
         */
        public String getSLSRegion() {
            return this.SLSRegion;
        }

        /**
         * @return SLSUserId
         */
        public String getSLSUserId() {
            return this.SLSUserId;
        }

        public static final class Builder {
            private String SLSLogstore; 
            private String SLSProject; 
            private String SLSRegion; 
            private String SLSUserId; 

            /**
             * <p>The Logstore.</p>
             * <p>Valid values of N: 1 to 25.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Logstore-ECS</p>
             */
            public Builder SLSLogstore(String SLSLogstore) {
                this.SLSLogstore = SLSLogstore;
                return this;
            }

            /**
             * <p>The Simple Log Service project.</p>
             * <p>Valid values of N: 1 to 25.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-project</p>
             */
            public Builder SLSProject(String SLSProject) {
                this.SLSProject = SLSProject;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <p>Valid values of N: 1 to 25.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder SLSRegion(String SLSRegion) {
                this.SLSRegion = SLSRegion;
                return this;
            }

            /**
             * <p>The member ID.</p>
             * <p>Valid values of N: 1 to 25.</p>
             * <p>If you call this operation by using the management account of a resource directory, you can connect the Alibaba Cloud services that are activated for all members in the resource directory to Hybrid Cloud Monitoring. You can use the resource directory to monitor Alibaba Cloud services across enterprise accounts.</p>
             * <blockquote>
             * <p>If a member uses CloudMonitor for the first time, you must make sure that the service-linked role AliyunServiceRoleForCloudMonitor is attached to the member. For more information, see <a href="https://help.aliyun.com/document_detail/170423.html">Manage the service-linked role for CloudMonitor</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>120886317861****</p>
             */
            public Builder SLSUserId(String SLSUserId) {
                this.SLSUserId = SLSUserId;
                return this;
            }

            public SLSGroupConfig build() {
                return new SLSGroupConfig(this);
            } 

        } 

    }
}
