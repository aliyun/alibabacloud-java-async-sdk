// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyApplicationServerlessConfRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationServerlessConfRequest</p>
 */
public class ModifyApplicationServerlessConfRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ServerlessConfList> serverlessConfList;

    private ModifyApplicationServerlessConfRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.serverlessConfList = builder.serverlessConfList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationServerlessConfRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return serverlessConfList
     */
    public java.util.List<ServerlessConfList> getServerlessConfList() {
        return this.serverlessConfList;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationServerlessConfRequest, Builder> {
        private String applicationId; 
        private java.util.List<ServerlessConfList> serverlessConfList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationServerlessConfRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.serverlessConfList = request.serverlessConfList;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The list of Serverless configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder serverlessConfList(java.util.List<ServerlessConfList> serverlessConfList) {
            this.putQueryParameter("ServerlessConfList", serverlessConfList);
            this.serverlessConfList = serverlessConfList;
            return this;
        }

        @Override
        public ModifyApplicationServerlessConfRequest build() {
            return new ModifyApplicationServerlessConfRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyApplicationServerlessConfRequest} extends {@link TeaModel}
     *
     * <p>ModifyApplicationServerlessConfRequest</p>
     */
    public static class ServerlessConfList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private String scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private String scaleMin;

        private ServerlessConfList(Builder builder) {
            this.componentType = builder.componentType;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfList create() {
            return builder().build();
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        /**
         * @return scaleMax
         */
        public String getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public String getScaleMin() {
            return this.scaleMin;
        }

        public static final class Builder {
            private String componentType; 
            private String scaleMax; 
            private String scaleMin; 

            private Builder() {
            } 

            private Builder(ServerlessConfList model) {
                this.componentType = model.componentType;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
            } 

            /**
             * <p>The type of the application sub-component.</p>
             * <p>For Supabase, valid values are:</p>
             * <ul>
             * <li><p>gateway</p>
             * </li>
             * <li><p>backend</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>gateway</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The maximum number of PCUs for a single node. Valid values: 0 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum number of PolarDB Capacity Units (PCUs) for a single node. Valid values: 0 to 16.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            public ServerlessConfList build() {
                return new ServerlessConfList(this);
            } 

        } 

    }
}
