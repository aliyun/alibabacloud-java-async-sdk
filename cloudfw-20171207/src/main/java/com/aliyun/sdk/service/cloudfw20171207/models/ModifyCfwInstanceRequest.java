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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * UpdateList.
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Value.
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
