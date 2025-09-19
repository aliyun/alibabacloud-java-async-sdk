// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListInstanceRiskLevelsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRiskLevelsRequest</p>
 */
public class ListInstanceRiskLevelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    private ListInstanceRiskLevelsRequest(Builder builder) {
        super(builder);
        this.instanceList = builder.instanceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRiskLevelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    public static final class Builder extends Request.Builder<ListInstanceRiskLevelsRequest, Builder> {
        private java.util.List<InstanceList> instanceList; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRiskLevelsRequest request) {
            super(request);
            this.instanceList = request.instanceList;
        } 

        /**
         * <p>The instances.</p>
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        @Override
        public ListInstanceRiskLevelsRequest build() {
            return new ListInstanceRiskLevelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListInstanceRiskLevelsRequest} extends {@link TeaModel}
     *
     * <p>ListInstanceRiskLevelsRequest</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private InstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String instanceId; 
            private String uuid; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.instanceId = model.instanceId;
                this.uuid = model.uuid;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5efigezp50l2cmb****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The serial number of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>f2d6e901-1004-4ca8-9dae-53ec04a9****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
