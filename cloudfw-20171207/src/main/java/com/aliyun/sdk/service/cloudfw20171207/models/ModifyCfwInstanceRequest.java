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
 * {@link ModifyCfwInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyCfwInstanceRequest</p>
 */
public class ModifyCfwInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateList")
    private java.util.List<UpdateList> updateList;

    private ModifyCfwInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.updateList = builder.updateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCfwInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return updateList
     */
    public java.util.List<UpdateList> getUpdateList() {
        return this.updateList;
    }

    public static final class Builder extends Request.Builder<ModifyCfwInstanceRequest, Builder> {
        private String instanceId; 
        private java.util.List<UpdateList> updateList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCfwInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.updateList = request.updateList;
        } 

        /**
         * <p>The ID of the Cloud Firewall instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cfw_elasticity_public_cn-zsk39m******</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>A list of instance properties to update.</p>
         */
        public Builder updateList(java.util.List<UpdateList> updateList) {
            this.putQueryParameter("UpdateList", updateList);
            this.updateList = updateList;
            return this;
        }

        @Override
        public ModifyCfwInstanceRequest build() {
            return new ModifyCfwInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyCfwInstanceRequest} extends {@link TeaModel}
     *
     * <p>ModifyCfwInstanceRequest</p>
     */
    public static class UpdateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private UpdateList(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(UpdateList model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>The code of the instance property to update.
             * The following codes are supported:</p>
             * <ul>
             * <li><p>\<code>Code\\</code>: \<code>MajorVersion\\</code>. Set \<code>Value\\</code> to \<code>2\\</code>. This is available only for pay-as-you-go 1.0 users to upgrade their instances to pay-as-you-go 2.0.</p>
             * <blockquote>
             * <p>Warning: </p>
             * </blockquote>
             * <p>Make sure you understand the billing methods and pricing of pay-as-you-go 2.0.</p>
             * <blockquote>
             * <p>Warning: </p>
             * </blockquote>
             * <p>Note that if log delivery is enabled before the upgrade, it will remain enabled after the upgrade, and logs will be delivered to a new Logstore.</p>
             * </li>
             * <li><p>\<code>Code\\</code>: \<code>ThreatIntelligence\\</code>. This is available only for pay-as-you-go 2.0 users to enable or disable the threat intelligence feature. Set \<code>Value\\</code> to \<code>1\\</code> to enable the feature or \<code>0\\</code> to disable it.</p>
             * </li>
             * <li><p>\<code>Code\\</code>: \<code>Sdl\\</code>. This is available only for pay-as-you-go 2.0 users to enable or disable the sensitive data leak detection feature. Set \<code>Value\\</code> to \<code>1\\</code> to enable the feature or \<code>0\\</code> to disable it.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Sdl</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The value for the specified \<code>Code\\</code>. For valid values, see the description of the \<code>Code\\</code> parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public UpdateList build() {
                return new UpdateList(this);
            } 

        } 

    }
}
